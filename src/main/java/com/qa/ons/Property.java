import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Property {
	
	private String type;
	private String reference;
	private String name;

	public Property() {

	}

	public Property(String type, String reference, String name) {
		super();
		this.type = type;
		this.reference = reference;
		this.name = name;
	}

	@XmlAttribute
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@XmlElement
	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	@XmlElement
	public String getName() {
		return name;
	}

	public void setAnswers(String name) {
		this.name = name;
	}

}