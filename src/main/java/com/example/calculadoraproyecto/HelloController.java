package com.example.calculadoraproyecto;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable{


    @FXML
    private AnchorPane root;

    @FXML
    public ImageView bgImage;

    @FXML
    private TextField usuario ;
    @FXML
    private PasswordField contrasenya;

    // Datos del formulario
    /*@FXML
    private ChoiceBox<String> choiceBoxCiudad = new ChoiceBox<>();
    private String[] ciudad = {"Alcoy", "Valencia", "Alicante"};
    */

    @FXML
    private  ComboBox cmbCiudad = new ComboBox();

    @FXML
    private  ComboBox sistemaOperativo = new ComboBox();

    @FXML
    private DatePicker fechaRealizar;

    @FXML
    private Spinner<Integer> horas = new Spinner<>();


    @FXML
    private RadioButton rmujer ;

    @FXML
    private RadioButton rhombre;




   // int currentValue;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
       // choiceBoxCiudad.getItems().addAll(ciudad);
       // choiceBoxCiudad.setOnAction(this::getCiudad);
        List<String> listC = new ArrayList<String>();
        listC.add("Alcoy");
        listC.add("Valencia");
        listC.add("Alicante");
        ObservableList obList1 = FXCollections.observableList(listC);
        cmbCiudad.setItems(obList1);


        List<String> list = new ArrayList<String>();
        list.add("iOS");
        list.add("Linux");
        list.add("Windows");
        ObservableList obList = FXCollections.observableList(list);
        sistemaOperativo.setItems(obList);


        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 24);

        valueFactory.setValue(1);
        horas.setValueFactory(valueFactory);

        final ToggleGroup genero = new ToggleGroup();

        // Radio 1: Male
        rhombre= new RadioButton("Hombre");
        rhombre.setToggleGroup(genero);
        rhombre.setSelected(true);

        // Radio 3: Female.
        rmujer = new RadioButton("Mujer");
        rmujer.setToggleGroup(genero);



    }













   /*
    public void getCiudad(ActionEvent event) {
    *
        String myCiudad = choiceBoxCiudad.getValue();

    }*/


        @FXML
        void Login(ActionEvent event) throws IOException {
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LoginPantalla.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 297, 502);
            stage.setTitle("Login");
            stage.setScene(scene);
            stage.show();
        }





    @FXML
    void Cancelar(ActionEvent event) {
         usuario.setText("");
         contrasenya.setText("");
    }

    @FXML
    void Iniciar(ActionEvent event) {
        String name = usuario.getText();
        String pwd = contrasenya.getText();
        if (name.isEmpty() || pwd.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Please fill all required");
            alert.showAndWait();
        } else {
            if (name.equals(usuario) && pwd.equals(contrasenya)) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setContentText("Succesfully logged in");
                alert.showAndWait();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setContentText("The credentials entered aren't correct!");
                alert.showAndWait();
            }


        }
    }

    public void Calculadora(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Calculatrice.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 619, 445 );
        stage.setTitle("Calculadora");
        stage.setScene(scene);
        stage.show();
    }

    public void Formulario(ActionEvent event) throws IOException{
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Formulario.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 623, 588);
        stage.setTitle("Formulario");
        stage.setScene(scene);
        stage.show();
    }



}



    /*
    *
    * pantalla2Controller = v2pantalla2controller = (pantalla2controller) fxmlLoader.getController();
    * v2pantalla2Controller.label2.setText(txtfield.getText());
    *
    * */












