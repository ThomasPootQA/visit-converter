package com.qa.ons.totalmobile_stub;

import com.consiliumtechnologies.schemas.services.mobile._2009._03.messaging.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.bind.JAXBElement;

@Endpoint
public class MessageQueue {
    private static final String NAMESPACE_URI = "http://schemas.consiliumtechnologies.com/services/mobile/2009/03/messaging";
    
    public static int incrementer = 0;
    public static boolean printDebugging = true;
    
    @Autowired
    public MessageQueue() {
    }

    public void stub(String messageType) {
    		incrementer++;
    		
//    		Message print out
    		if(printDebugging) {
    			System.out.println("Found a " + messageType + " number: "+incrementer);
    		}
    }

    // generated with:
    // awk '{print "
    //     @PayloadRoot(namespace = NAMESPACE_URI, localPart = \"" $1 "\")
    //     @ResponsePayload
    //     public " $1 "Response " tolower(substr($1, 1, 1)) substr($1, 2) "(@RequestPayload " $1 " request) {
    //         stub(\"" $1 "\");
    //         " $1 "Response response = new " $1 "Response();
    //         return response;
    //     }
    // "}'

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SendMessageRequest")
    @ResponsePayload
    public JAXBElement<SendMessageResponse> sendMessageRequest(@RequestPayload JAXBElement<SendMessageRequest> request) {
        stub("SendMessage");
        SendMessageResponse response = new SendMessageResponse();
        ObjectFactory objectFactory = new ObjectFactory();
        return objectFactory.createSendMessageResponse(response);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "TransformAndSendRequest")
    @ResponsePayload
    public JAXBElement<TransformAndSendResponse> transformAndSendMessageRequest(@RequestPayload JAXBElement<TransformAndSendRequest> request) {
        stub("TransformAndSendMessage");
        TransformAndSendResponse response = new TransformAndSendResponse();
        ObjectFactory objectFactory = new ObjectFactory();
        return objectFactory.createTransformAndSendResponse(response);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "QueryMessageRequest")
    @ResponsePayload
    public JAXBElement<QueryMessagesResponse> queryMessageRequest(@RequestPayload JAXBElement<QueryMessagesRequest> request) {
        stub("Query.xml");
        QueryMessagesResponse response = new QueryMessagesResponse();
        ObjectFactory objectFactory = new ObjectFactory();
        return objectFactory.createQueryMessagesResponse(response);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetMessageRequest")
    @ResponsePayload
    public JAXBElement<GetMessageResponse> getMessageRequest(@RequestPayload JAXBElement<GetMessageRequest> request) {
        stub("Get");
        GetMessageResponse response = new GetMessageResponse();
        ObjectFactory objectFactory = new ObjectFactory();
        return objectFactory.createGetMessageResponse(response);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "DeleteMessageRequest")
    @ResponsePayload
    public JAXBElement<DeleteMessageResponse> deleteMessageRequest(@RequestPayload JAXBElement<DeleteMessageRequest> request) {
        stub("Delete.xml");
        DeleteMessageResponse response = new DeleteMessageResponse();
        ObjectFactory objectFactory = new ObjectFactory();
        return objectFactory.createDeleteMessageResponse(response);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "RetryMessageRequest")
    @ResponsePayload
    public JAXBElement<RetryMessageResponse> retryMessageRequest(@RequestPayload JAXBElement<RetryMessageRequest> request) {
        stub("Retry");
        RetryMessageResponse response = new RetryMessageResponse();
        ObjectFactory objectFactory = new ObjectFactory();
        return objectFactory.createRetryMessageResponse(response);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ResetMessageRequest")
    @ResponsePayload
    public JAXBElement<ResetMessageResponse> resetMessageRequest(@RequestPayload JAXBElement<ResetMessageRequest> request) {
        stub("Reset");
        ResetMessageResponse response = new ResetMessageResponse();
        ObjectFactory objectFactory = new ObjectFactory();
        return objectFactory.createResetMessageResponse(response);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SendCreateVisitRequestMessage")
    @ResponsePayload
    public SendCreateVisitRequestMessageResponse sendCreateVisitRequestMessage(@RequestPayload SendCreateVisitRequestMessage request) {
        stub("SendCreateVisitRequestMessage");
        SendCreateVisitRequestMessageResponse response = new SendCreateVisitRequestMessageResponse();
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SendForceRecallVisitRequestMessage")
    @ResponsePayload
    public SendForceRecallVisitRequestMessageResponse sendForceRecallVisitRequestMessage(@RequestPayload SendForceRecallVisitRequestMessage request) {
        stub("SendForceRecallVisitRequestMessage");
        SendForceRecallVisitRequestMessageResponse response = new SendForceRecallVisitRequestMessageResponse();
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SendAddVisitTasksRequestMessage")
    @ResponsePayload
    public SendAddVisitTasksRequestMessageResponse sendAddVisitTasksRequestMessage(@RequestPayload SendAddVisitTasksRequestMessage request) {
        stub("SendAddVisitTasksRequestMessage");
        SendAddVisitTasksRequestMessageResponse response = new SendAddVisitTasksRequestMessageResponse();
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SendUpdateVisitScheduleRequestMessage")
    @ResponsePayload
    public SendUpdateVisitScheduleRequestMessageResponse sendUpdateVisitScheduleRequestMessage(@RequestPayload SendUpdateVisitScheduleRequestMessage request) {
        stub("SendUpdateVisitScheduleRequestMessage");
        SendUpdateVisitScheduleRequestMessageResponse response = new SendUpdateVisitScheduleRequestMessageResponse();
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SendUpdateVisitHeaderRequestMessage")
    @ResponsePayload
    public SendUpdateVisitHeaderRequestMessageResponse sendUpdateVisitHeaderRequestMessage(@RequestPayload SendUpdateVisitHeaderRequestMessage request) {
        stub("SendUpdateVisitHeaderRequestMessage");
        // System.out.println("SOAP Object Recieved: " + request.getUpdateVisitHeaderRequest().getProperty().getAddress().getPostCode());
        SendUpdateVisitHeaderRequestMessageResponse response = new SendUpdateVisitHeaderRequestMessageResponse();
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SendCreateBulletinRequestMessage")
    @ResponsePayload
    public SendCreateBulletinRequestMessageResponse sendCreateBulletinRequestMessage(@RequestPayload SendCreateBulletinRequestMessage request) {
        stub("SendCreateBulletinRequestMessage");
        SendCreateBulletinRequestMessageResponse response = new SendCreateBulletinRequestMessageResponse();
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SendDeleteBulletinRequestMessage")
    @ResponsePayload
    public SendDeleteBulletinRequestMessageResponse sendDeleteBulletinRequestMessage(@RequestPayload SendDeleteBulletinRequestMessage request) {
        stub("SendDeleteBulletinRequestMessage");
        SendDeleteBulletinRequestMessageResponse response = new SendDeleteBulletinRequestMessageResponse();
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SendGenerateFolioContentRequestMessage")
    @ResponsePayload
    public SendGenerateFolioContentRequestMessageResponse sendGenerateFolioContentRequestMessage(@RequestPayload SendGenerateFolioContentRequestMessage request) {
        stub("SendGenerateFolioContentRequestMessage");
        SendGenerateFolioContentRequestMessageResponse response = new SendGenerateFolioContentRequestMessageResponse();
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SendAddFolioContentRequestMessage")
    @ResponsePayload
    public SendAddFolioContentRequestMessageResponse sendAddFolioContentRequestMessage(@RequestPayload SendAddFolioContentRequestMessage request) {
        stub("SendAddFolioContentRequestMessage");
        SendAddFolioContentRequestMessageResponse response = new SendAddFolioContentRequestMessageResponse();
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SendCreateReferralRequestMessage")
    @ResponsePayload
    public SendCreateReferralRequestMessageResponse sendCreateReferralRequestMessage(@RequestPayload SendCreateReferralRequestMessage request) {
        stub("SendCreateReferralRequestMessage");
        SendCreateReferralRequestMessageResponse response = new SendCreateReferralRequestMessageResponse();
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SendCreatePatientRequestMessage")
    @ResponsePayload
    public SendCreatePatientRequestMessageResponse sendCreatePatientRequestMessage(@RequestPayload SendCreatePatientRequestMessage request) {
        stub("SendCreatePatientRequestMessage");
        SendCreatePatientRequestMessageResponse response = new SendCreatePatientRequestMessageResponse();
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SendUpdateReferralRequestMessage")
    @ResponsePayload
    public SendUpdateReferralRequestMessageResponse sendUpdateReferralRequestMessage(@RequestPayload SendUpdateReferralRequestMessage request) {
        stub("SendUpdateReferralRequestMessage");
        SendUpdateReferralRequestMessageResponse response = new SendUpdateReferralRequestMessageResponse();
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SendCreateAppointmentRequestMessage")
    @ResponsePayload
    public SendCreateAppointmentRequestMessageResponse sendCreateAppointmentRequestMessage(@RequestPayload SendCreateAppointmentRequestMessage request) {
        stub("SendCreateAppointmentRequestMessage");
        SendCreateAppointmentRequestMessageResponse response = new SendCreateAppointmentRequestMessageResponse();
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SendDischargeReferralRequestMessage")
    @ResponsePayload
    public SendDischargeReferralRequestMessageResponse sendDischargeReferralRequestMessage(@RequestPayload SendDischargeReferralRequestMessage request) {
        stub("SendDischargeReferralRequestMessage");
        SendDischargeReferralRequestMessageResponse response = new SendDischargeReferralRequestMessageResponse();
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SendCreateJobRequestMessage")
    @ResponsePayload
    public SendCreateJobRequestMessageResponse sendCreateJobRequestMessage(@RequestPayload SendCreateJobRequestMessage request) {
        stub("SendCreateJobRequestMessage");
        SendCreateJobRequestMessageResponse response = new SendCreateJobRequestMessageResponse();
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SendDeleteJobRequestMessage")
    @ResponsePayload
    public SendDeleteJobRequestMessageResponse sendDeleteJobRequestMessage(@RequestPayload SendDeleteJobRequestMessage request) {
        stub("SendDeleteJobRequestMessage");
        SendDeleteJobRequestMessageResponse response = new SendDeleteJobRequestMessageResponse();
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SendAddJobTasksRequestMessage")
    @ResponsePayload
    public SendAddJobTasksRequestMessageResponse sendAddJobTasksRequestMessage(@RequestPayload SendAddJobTasksRequestMessage request) {
        stub("SendAddJobTasksRequestMessage");
        SendAddJobTasksRequestMessageResponse response = new SendAddJobTasksRequestMessageResponse();
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SendSaveAvailabilityRequestMessage")
    @ResponsePayload
    public SendSaveAvailabilityRequestMessageResponse sendSaveAvailabilityRequestMessage(@RequestPayload SendSaveAvailabilityRequestMessage request) {
        stub("SendSaveAvailabilityRequestMessage");
        SendSaveAvailabilityRequestMessageResponse response = new SendSaveAvailabilityRequestMessageResponse();
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SendUpdateJobHeaderRequestMessage")
    @ResponsePayload
    public SendUpdateJobHeaderRequestMessageResponse sendUpdateJobHeaderRequestMessage(@RequestPayload SendUpdateJobHeaderRequestMessage request) {
        stub("SendUpdateJobHeaderRequestMessage");
        SendUpdateJobHeaderRequestMessageResponse response = new SendUpdateJobHeaderRequestMessageResponse();
        return response;
    }

}
