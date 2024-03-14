package com.example.somewhere;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public   Button button,button1,button2;
    private Stage stage1;
    private Label label;
    private  HBox hBox,hBox1;
    private Group root;
    private int index =0;
    private VBox vBox;
    private Line line;
    public  String css = getClass().getResource("style.css").toExternalForm().toString();
    String[] photos = {getClass().getResource("a.jpg").toExternalForm().toString(),getClass().getResource("b.jpeg").toExternalForm().toString(),getClass().getResource("c.jpeg").toExternalForm().toString(),getClass().getResource("d.jpeg").toExternalForm().toString(),
                        getClass().getResource("e.jpeg").toExternalForm().toString(),getClass().getResource("f.jpeg").toExternalForm().toString(),getClass().getResource("g.jpeg").toExternalForm().toString(),getClass().getResource("h.jpeg").toExternalForm().toString()};
    @Override
    public void start(Stage stage) throws IOException {
        String str = "Gallery of Tropical Images";
        Text text = new Text(20.0, 80.0, str);
        //Setting the font
        action obj = new action();
        line = new Line();
        line.setTranslateX(200);
        line.setStartX(20);
        line.setEndX(850);
        line.setStrokeWidth(5);
        line.setStroke(Color.MEDIUMPURPLE);
        Font font = Font.font("Brush Script MT", FontWeight.BOLD, FontPosture.REGULAR, 84);
        text.setFont(font);
        //Setting the color of the text
        text.setFill(Color.BROWN);
        //Setting the width and color of the stroke
        text.setStrokeWidth(2);
        text.setStroke(Color.BLUE);
        //Setting the deep shadow effect to the text
        DropShadow shadow = new DropShadow();
        text.setEffect(shadow);
        //Setting the stage
        root = new Group(text);

        Button button1 = new Button("Next");
        Image[] images = new Image[photos.length];
        for (int i = 0; i < images.length; i++)
        {
            images[i]= new Image(photos[i]);

        }
        ImageView imageViewToNav = new ImageView(images[index]);
        imageViewToNav.setX(1300);
        imageViewToNav.setY(700);
        imageViewToNav.setFitWidth(300);
        imageViewToNav.setFitHeight(300);

        Label labelNav =  new Label();
        labelNav.setText("Navigate");
        labelNav.getStyleClass().add("navStyle");

        VBox vBoxNav = new VBox(16);

        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                index++;
                if(index >=images.length)
                {
                    index =0;

                }
                imageViewToNav.setImage(images[index]);


            }
        });
        Button button2 = new Button("previous");
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                index--;
                if (index < 0) {
                    index = images.length - 1; // Wrap around to last image

                }
                imageViewToNav.setImage(images[index]);


            }
        });


        BorderPane borderPane = new BorderPane();
        vBoxNav.getChildren().addAll(labelNav,imageViewToNav);
        vBoxNav.setPadding(new Insets(200,0,0,120));
        borderPane.setRight(vBoxNav);


        Image iamge = new Image(photos[0]);
        Image iamge1 = new Image(photos[1]);
        Image iamge2 = new Image(photos[2]);
        Image iamge3 = new Image(photos[3]);
        Image iamge4 = new Image(photos[4]);
        Image iamge5 = new Image(photos[5]);
        Image iamge6 = new Image(photos[6]);
        Image iamge7 = new Image(photos[7]);

        ImageView imageView = new ImageView(iamge);
        ImageView imageView1 = new ImageView(iamge1);
        ImageView imageView2 = new ImageView(iamge2);
        ImageView imageView3 = new ImageView(iamge3);
        ImageView imageView4 = new ImageView(iamge4);
        ImageView imageView5 = new ImageView(iamge5);
        ImageView imageView6 = new ImageView(iamge6);
        ImageView imageView7 = new ImageView(iamge7);

        imageView.setFitHeight(300);
        imageView1.setFitHeight(300);
        imageView2.setFitHeight(300);
        imageView3.setFitHeight(300);
        imageView4.setFitHeight(300);
        imageView5.setFitHeight(300);
        imageView6.setFitHeight(300);
        imageView7.setFitHeight(300);

        imageView.setFitWidth(300);
        imageView1.setFitWidth(300);
        imageView2.setFitWidth(300);
        imageView3.setFitWidth(300);
        imageView4.setFitWidth(300);
        imageView5.setFitWidth(300);
        imageView6.setFitWidth(300);
        imageView7.setFitWidth(300);

        imageView.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                label = new Label();

                label.setText("TipTip Beach");
                obj.displayImage(iamge,label);
                stage.close();
            }
        });
        imageView1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                label = new Label();

                label.setText("Trimbus Beach");
                obj.displayImage(iamge1,label);
                stage.close();
            }
        }); imageView2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                label = new Label();

                label.setText("Cumfus Beach");
                obj.displayImage(iamge2,label);
                stage.close();
            }
        }); imageView3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                label = new Label();

                label.setText("Pistol Beach");
                obj.displayImage(iamge3,label);
                stage.close();
            }
        }); imageView4.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                label = new Label();

                label.setText("Joyce Beach");
                obj.displayImage(iamge4,label);
                stage.close();
            }
        }); imageView5.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                label = new Label();

                label.setText("Urgut Beach");
                obj.displayImage(iamge5,label);
                stage.close();
            }
        }); imageView6.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                label = new Label();

                label.setText("Loftus Beach");
                obj.displayImage(iamge6,label);
                stage.close();
            }
        });
        imageView7.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                label = new Label();

                label.setText("Bunny Beach");
                obj.displayImage(iamge7,label);
                stage.close();
            }
        });

        HBox hBox = new HBox(20);
        hBox.getChildren().addAll(imageView,imageView1,imageView2,imageView6);

        HBox hBox1 = new HBox(20);
        hBox1.getChildren().addAll(imageView3,imageView4,imageView5,imageView7);

        VBox vBox = new VBox(20);
        vBox.getChildren().addAll(root,line,hBox,hBox1);

        borderPane.setCenter(vBox);
        obj.stage1 = new Stage();
        obj.button = new Button();
        obj.button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                obj.stage1.close();
                stage.show();
            }
        });
        Label label5 = new Label("Choose the theme");
        label5.getStyleClass().add("lbse");
        String theme1 = "Dark theme";
        String theme2 = "light theme";
        String theme3 = "clone theme";
        ObservableList <String> themes = FXCollections.observableArrayList(
                theme1,
                theme2,
                theme3
        );


        Button button3 = new Button("exit");

        button1.getStyleClass().add("bton");
        button2.getStyleClass().add("bton");
        button3.getStyleClass().add("exitBton");

        //some actions

        ComboBox<String> comboBox = new ComboBox<>(themes);

        comboBox.setOnAction(event -> {
            String themmes = comboBox.getValue();

            if (themmes.equals(theme1)) {

                borderPane.setBackground(new Background(new BackgroundFill(Color.BLACK,null,null)));

            } else if (themmes.equals(theme2)) {
                borderPane.setBackground(new Background(new BackgroundFill(Color.WHITE,null,null)));

            } else {
                borderPane.setBackground(new Background(new BackgroundFill(Color.GOLDENROD,null,null)));
                borderPane.setOpacity(0.7);
            }
        });
        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage.close();
            }
        });
        System.out.println(comboBox.getStyleClass());
        HBox hBox2 = new HBox();
        hBox2.getChildren().addAll(label5,comboBox);
        HBox hBox3 = new HBox(175);
        HBox hBox4 = new HBox(5);
        hBox3.getChildren().addAll(button3,button2,button1);
        hBox3.getChildren().addAll(hBox4,hBox2);
        hBox3.getStyleClass().add("h3");
        borderPane.setBottom(hBox3);
        Scene scene = new Scene(borderPane, 1760, 900);
        scene.getStylesheets().add(css);
        stage.setTitle("Hello!");
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}