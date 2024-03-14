package com.example.somewhere;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class action {
    public Button button;
    public Stage stage1;
    public void displayImage(Image image, Label label)
    {
        HelloApplication helloApplication = new HelloApplication();


        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(800);
        imageView.setFitHeight(500);
        BorderPane borderpane = new BorderPane();
        borderpane.setCenter(imageView);
        borderpane.setBackground(new Background(new BackgroundFill(Color.PURPLE,null,null)));
        Scene scene = new Scene(borderpane, 1570, 900);
        scene.getStylesheets().add(helloApplication.css);
        button.setText("Return Back");
        button.setPadding(new Insets(20,20,20,20));
        button.setPrefSize(200,40);
        button.setTextFill(Color.WHITE);
        button.setBackground(new Background(new BackgroundFill(Color.YELLOW,null,null)));
        button.setStyle("-fx-font-weight:bold;-fx-background-radius:13px;");
        System.out.println(label.getStyleClass());
        label.setTextFill(Color.WHITE);
        label.setStyle("-fx-font-weight:bold");

        label.setFont(Font.font(40));
        label.setPadding(new Insets(50,100,0,700));
        borderpane.setTop(label);
        button.setId("btn");
        button.setBackground(new Background(new BackgroundFill(Color.RED,null,null)));
        System.out.println(button.getId());
        borderpane.setBottom(button);
        stage1 = new Stage();
        stage1.setTitle("Image");
        stage1.setScene(scene);

        stage1.show();
    }
}
