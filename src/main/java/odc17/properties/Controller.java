package odc17.properties;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller { //
	
	@FXML//kazda kontrolka musi byc osobno
	private Button button;
	@FXML
	private TextField textField;
	@FXML
	private Label label;
	


	private Person person = new Person();//obiekt klasy Person
	
	
	@FXML
	public void initialize() {
		textField.setText(person.getName2());
		label.setText(person.getName2());
		
	}
		
		@FXML
		private void write() {// metoda od button wypisz 
		label.setText(textField.getText());	
	}
	
}
