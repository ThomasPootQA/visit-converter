package com.qa.ons.csv_uploader;

import com.consiliumtechnologies.schemas.mobile._2009._03.visitsmessages.UpdateVisitHeaderRequest;
import com.consiliumtechnologies.schemas.services.mobile._2009._03.messaging.SendUpdateVisitHeaderRequestMessage;
import com.consiliumtechnologies.schemas.services.mobile._2009._03.messaging.SendUpdateVisitHeaderRequestMessageResponse;
import com.qa.ons.totalmobile_stub.MessageQueue;

import org.w3c.dom.Document;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.*;

public class VisitSubmitter {
    private static String url = "http://localhost:9090/live/Services/taskmobileserver/v20/messaging/messagequeuews.asmx";
    private static String action = "MessageQueue";

    public static Document toDocument(UpdateVisitHeaderRequest request) throws javax.xml.bind.JAXBException, javax.xml.parsers.ParserConfigurationException {
        // Create the message
        SendUpdateVisitHeaderRequestMessage requestMessage = new SendUpdateVisitHeaderRequestMessage();
        requestMessage.setUpdateVisitHeaderRequest(request);

        // Create the JAXBContext
        JAXBContext jc = JAXBContext.newInstance(SendUpdateVisitHeaderRequestMessage.class);

        // Create the Document
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.newDocument();

        // Marshal the Object to a Document
        Marshaller marshaller = jc.createMarshaller();
        marshaller.marshal(requestMessage, document);

        return document;
    }

    public static SOAPMessage soapConstruct(Document document) throws javax.xml.soap.SOAPException, java.io.IOException {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();

        SOAPPart soapPart = soapMessage.getSOAPPart();

        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        // envelope.addNamespaceDeclaration(myNamespace, myNamespaceURI);

        // SOAP Body
        SOAPBody soapBody = envelope.getBody();
        soapBody.addDocument(document);

        // SOAP Headers
        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", action);

        // Finalize
        soapMessage.saveChanges();

        /* Print the request message, just for debugging purposes */
        if(MessageQueue.printDebugging) {
	        System.out.println("Request SOAP Message:");
	        soapMessage.writeTo(System.out);
	        System.out.println("\n");
        }

        return soapMessage;
    }

    public static SendUpdateVisitHeaderRequestMessageResponse soapResponseUnmarshal(SOAPMessage response) throws javax.xml.bind.JAXBException, javax.xml.soap.SOAPException {
        Unmarshaller unmarshaller = JAXBContext.newInstance(SendUpdateVisitHeaderRequestMessageResponse.class).createUnmarshaller();
        SendUpdateVisitHeaderRequestMessageResponse messageResponse = (SendUpdateVisitHeaderRequestMessageResponse) unmarshaller.unmarshal(response.getSOAPBody().extractContentAsDocument());
        return messageResponse;
    }

    private static SendUpdateVisitHeaderRequestMessageResponse soapSend(SOAPMessage message) {
        try {
            // Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            // Send SOAP Message to SOAP Server
            SOAPMessage soapResponse = soapConnection.call(message, url);

            // Print the SOAP Response
            if(MessageQueue.printDebugging) {
	            System.out.println("Response SOAP Message:");
	            soapResponse.writeTo(System.out);
	            System.out.println();
            }

            soapConnection.close();

            return soapResponseUnmarshal(soapResponse);
        } catch (Exception e) {
            System.err.println("\nError occurred while sending SOAP request to Server!\nMake sure you have the correct endpoint URL and SOAPAction!\n");
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }

    // public static SendMessageResponse sendAll(List<UpdateVisitHeaderRequest> request) {

    // }

    public static SendUpdateVisitHeaderRequestMessageResponse send(UpdateVisitHeaderRequest request) throws javax.xml.bind.JAXBException, javax.xml.soap.SOAPException, javax.xml.parsers.ParserConfigurationException, java.io.IOException {
        Document document = toDocument(request);
        SOAPMessage soap = soapConstruct(document);
        SendUpdateVisitHeaderRequestMessageResponse response = soapSend(soap);
        return response;
    }
}
