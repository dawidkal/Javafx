package odc17.properties;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
// na typach prostych ponizej bedzie na propertisach
//	private String name = "Jon";// do wyboru
//	private String name2 = "Alan";
//
//	public String getName2() {
//		return name2;
//	}
//
//	public void setName2(String nam2) {
//		this.name2 = nam2;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void getName(String name) {
//		this.name = name;
//
//	}
	
	private StringProperty propertyTextField = new SimpleStringProperty(this,"namePropert","John Snow");

	public StringProperty getPropertyTextField() {
		return propertyTextField;
	}

	public void setPropertyTextField(StringProperty propertyTextField) {
		this.propertyTextField = propertyTextField;
	}
	
	
	

}
