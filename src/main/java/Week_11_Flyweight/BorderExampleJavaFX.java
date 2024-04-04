package Week_11_Flyweight;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class BorderExampleJavaFX extends Application {
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        // Luodaan StackPane-olioita, joilla on sama reunus
        StackPane leftPane = createStackPaneWithBorder(200, 200);
        StackPane rightPane = createStackPaneWithBorder(100, 100);

        // Asetetaan StackPane-oliot BorderPaneen
        root.setLeft(leftPane);
        root.setRight(rightPane);

        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.setTitle("Border Example JavaFX");
        primaryStage.show();
    }

    // Apumetodi StackPane-olion luomiseksi, jossa on reunus
    private StackPane createStackPaneWithBorder(double width, double height) {
        StackPane pane = new StackPane();
        Rectangle rectangle = new Rectangle(width, height, Color.TRANSPARENT);
        rectangle.setStroke(Color.BLACK);
        pane.getChildren().add(rectangle);
        return pane;
    }

    public static void main(String[] args) {
        launch(args);
    }
}

