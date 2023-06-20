import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class App extends Application {

    Stage window;
    Scene scene1,scene2;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
    window = primaryStage;

    // click a button to go to scene 1

    Label label1 = new Label("Welcome to the first scene");
    Button button1 = new Button("Go to scene 2");
    button1.setOnAction(e->window.setScene(scene2));

   //Layout 1 , lay out everything in vertical cols
   VBox layout1 = new VBox(20); // stacks items veritcally in column and spaces by 20 pixels
   // remember, layouts is a container of that has everything we want inside
   layout1.getChildren().addAll(label1,button1); 
   scene1 = new Scene(layout1,200,200);
    

   Button button2 = new Button("This scene sucks, go back to scene 1");
   button2.setOnAction(e->window.setScene(scene1));

   //Layout 1 , lay out everything in vertical cols
   StackPane layout2 = new StackPane(); // stacks items veritcally in column and spaces by 20 pixels
   // remember, layouts is a container of that has everything we want inside
   layout2.getChildren().addAll(button2); 
   scene2 = new Scene(layout2,200,200);

   window.setScene(scene1);
   window.setTitle("Some title");
   window.show();
}
}
