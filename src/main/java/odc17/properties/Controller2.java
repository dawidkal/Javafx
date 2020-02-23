package odc17.properties;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller2 { // jest wersja dla typow prostych (podpiecie Controller) i propertisow
							// Controller2

	@FXML // kazda kontrolka musi byc osobno
	private Button button;
	@FXML
	private TextField textField;
	@FXML
	private Label label;
	@FXML
	private Label label2;

	private Person person = new Person();// obiekt klasy Person

	@FXML
	public void initialize() {
		textField.textProperty().bindBidirectional(person.getPropertyTextField());
		label.textProperty().bind(person.getPropertyTextField());
		// label2.textProperty().bind(person.getPropertyTextField());
	}

	@FXML
	public void write() {
		// label2.textProperty().bind(person.getPropertyTextField());
		label2.setText(textField.getText());
	}
}