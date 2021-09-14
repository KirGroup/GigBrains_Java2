package ru.gb.java2.lesson4.app.example.controller.validators;

import javafx.scene.control.TextField;
import ru.gb.java2.lesson4.app.example.util.DateUtil;

import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class PersonValidator implements Validator {

    private final TextField firstNameField;
    private final TextField lastNameField;
    private final TextField streetField;
    private final TextField postalCodeField;
    private final TextField cityField;
    private final TextField birthdayField;

    public PersonValidator(TextField firstNameField, TextField lastNameField, TextField streetField,
                           TextField postalCodeField, TextField cityField, TextField birthdayField) {
        this.firstNameField = firstNameField;
        this.lastNameField = lastNameField;
        this.streetField = streetField;
        this.postalCodeField = postalCodeField;
        this.cityField = cityField;
        this.birthdayField = birthdayField;
    }

    @Override
    public List<String> validate() {
        List<String> messages = new ArrayList<>();

        if (firstNameField.getText() == null || firstNameField.getText().isBlank()) {
            messages.add("No valid first name!");
        }
        if (lastNameField.getText() == null || lastNameField.getText().isBlank()) {
            messages.add("No valid last name!");
        }
        if (streetField.getText() == null || streetField.getText().isBlank()) {
            messages.add("No valid street!");
        }

        if (postalCodeField.getText() == null || postalCodeField.getText().isBlank()) {
            messages.add("No valid postal code!");
        } else {
            try {
                Integer.parseInt(postalCodeField.getText());
            } catch (NumberFormatException e) {
                messages.add("No valid postal code (must be an integer)!");
            }
        }

        if (cityField.getText() == null || cityField.getText().isBlank()) {
            messages.add("No valid city!");
        }

        if (birthdayField.getText() == null || birthdayField.getText().isBlank()) {
            messages.add("No valid birthday!");
        } else {
            try {
                DateUtil.parseDate(birthdayField.getText());
            } catch (DateTimeParseException e) {
                messages.add(String.format("No valid birthday. Use the format %s!\n", DateUtil.DATE_FORMAT));
            }
        }

        return messages;
    }
}
