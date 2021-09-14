package ru.gb.java2.lesson4.app.example;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import ru.gb.java2.lesson4.app.example.controller.PersonEditDialogController;
import ru.gb.java2.lesson4.app.example.controller.PersonOverviewController;
import ru.gb.java2.lesson4.app.example.model.Person;
import ru.gb.java2.lesson4.app.example.repository.PersonRepository;
import ru.gb.java2.lesson4.app.example.repository.impl.TestPersonRepository;

import java.io.IOException;

public class Main extends Application {

    private static final String PERSON_OVERVIEW_FXML = "view/PersonOverview.fxml";
    private static final String PERSON_EDIT_DIALOG_FXML = "view/PersonEditDialog.fxml";
    private final ObservableList<Person> personData;
    private Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    public Main() {
        PersonRepository personRepository = new TestPersonRepository();
        this.personData = FXCollections.observableArrayList(personRepository.getAllData());
    }

    public ObservableList<Person> getPersonData() {
        return personData;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource(PERSON_OVERVIEW_FXML));

        Parent root = loader.load();

        PersonOverviewController controller = loader.getController();
        controller.setMainApp(this);

        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public Window getPrimaryStage() {
        return primaryStage;
    }

    public boolean showPersonEditDialog(Person selectedPerson) {
        try {
            // Загружаем fxml-файл и создаём новую сцену
            // для всплывающего диалогового окна.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource(PERSON_EDIT_DIALOG_FXML));
            Parent page = loader.load();

            // Создаём диалоговое окно Stage.
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Edit Person");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);

            // Передаём адресата в контроллер.
            PersonEditDialogController controller = loader.getController();
            controller.setDialogStage(dialogStage);
            controller.setPerson(selectedPerson);

            // Отображаем диалоговое окно и ждём, пока пользователь его не закроет
            dialogStage.showAndWait();

            return controller.isOkClicked();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
