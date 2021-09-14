package ru.gb.java2.lesson4.app.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import ru.gb.java2.lesson4.app.example.controller.validators.PersonValidator;
import ru.gb.java2.lesson4.app.example.controller.validators.Validator;
import ru.gb.java2.lesson4.app.example.model.Person;
import ru.gb.java2.lesson4.app.example.util.DateUtil;

import java.util.List;

public class PersonEditDialogController {

    private Validator validator;

    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField streetField;
    @FXML
    private TextField postalCodeField;
    @FXML
    private TextField cityField;
    @FXML
    private TextField birthdayField;


    private Stage dialogStage;
    private Person person;
    private boolean okClicked = false;

    @FXML
    private void initialize() {
        this.validator = new PersonValidator(firstNameField, lastNameField, streetField,
                postalCodeField, cityField, birthdayField);
    }

    @FXML
    public void handleOk(ActionEvent actionEvent) {
        List<String> errorMessages = validator.validate();
        if (errorMessages.isEmpty()) {
            fillPerson();
            okClicked = true;
            dialogStage.close();
        }
        else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.initOwner(dialogStage);
            alert.setTitle("Invalid Fields");
            alert.setHeaderText("Please correct invalid fields");
            alert.setContentText(String.join("\n", errorMessages));

            alert.showAndWait();
        }
    }

    private void fillPerson() {
        person.setFirstName(firstNameField.getText());
        person.setLastName(lastNameField.getText());
        person.setStreet(streetField.getText());
        person.setPostalCode(Integer.parseInt(postalCodeField.getText()));
        person.setCity(cityField.getText());
        person.setBirthday(DateUtil.parseDate(birthdayField.getText()));
    }

    @FXML
    public void handleCancel(ActionEvent actionEvent) {
        dialogStage.close();
    }

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    /**
     * Задаёт адресата, информацию о котором будем менять.
     *
     * @param person
     */
    public void setPerson(Person person) {
        this.person = person;

        firstNameField.setText(person.getFirstName());
        lastNameField.setText(person.getLastName());
        streetField.setText(person.getStreet());
        postalCodeField.setText(Integer.toString(person.getPostalCode()));
        cityField.setText(person.getCity());
        birthdayField.setText(DateUtil.formatDate(person.getBirthday()));
        birthdayField.setPromptText(DateUtil.DATE_FORMAT);
    }

    public boolean isOkClicked() {
        return okClicked;
    }


}
