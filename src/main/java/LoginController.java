package com.example.knk;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {


    @FXML
    private Button cancelButton;
    @FXML
    private Button loginButton;

    @FXML
    private Label loginMessageLabel;
    @FXML
    public ImageView brandingImageView;
    @FXML
    public ImageView lockImageView;
    @FXML
    private TextField userNameTextFiled;
    @FXML
    private PasswordField userNamePasswordFiled;

    @Override
    public  void initialize(URL url, ResourceBundle resourceBundle){
//        File brandingFile = new File("imgs/cart1.jpg");
//        Image brandingImage = new Image(brandingFile.toURI().toString());
//        System.out.println(brandingImage);
//        brandingImageView.setImage(brandingImage);

        File lockFile = new File("imgs/lock.jpg");
        Image lockImage = new Image(lockFile.toURI().toString());
        System.out.println(lockImage);
        lockImageView.setImage(lockImage);
    }