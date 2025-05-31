import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Random;

public class MainApp extends Application {
    private TextArea textArea;
    private double greenHue = new Random().nextDouble(); // Fixed random hue for session

    @Override
    public void start(Stage primaryStage) {
        // Create main layout
        BorderPane root = new BorderPane();
        
        // Create menu bar
        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("Options");
        
        // Create menu items
        MenuItem showDateTime = new MenuItem("Show Date and Time");
        MenuItem saveToFile = new MenuItem("Save to File");
        MenuItem changeColor = new MenuItem("Change Background Color");
        MenuItem exit = new MenuItem("Exit");
        
        // Add menu items to menu
        menu.getItems().addAll(showDateTime, saveToFile, changeColor, exit);
        menuBar.getMenus().add(menu);
        
        // Create text area
        textArea = new TextArea();
        textArea.setEditable(false);
        
        // Set menu bar and text area to layout
        root.setTop(menuBar);
        root.setCenter(textArea);
        
        // Create scene
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Menu Application");
        primaryStage.show();
        
        // Menu item actions
        showDateTime.setOnAction(e -> {
            textArea.setText(LocalDateTime.now().toString());
        });
        
        // Save to text file
        saveToFile.setOnAction(e -> {
            try (FileWriter writer = new FileWriter("log.txt")) {
                writer.write(textArea.getText());
            } catch (IOException ex) {
                textArea.setText("Error writing to file");
            }
        });
        
        // Random hue selection
        changeColor.setOnAction(e -> {

            // Use fixed hue with full saturation and brightness
            root.setStyle("-fx-background-color: hsb(" + (greenHue * 360) + ", 100%, 100%);");
        });
        
        // Exit application
        exit.setOnAction(e -> {
            primaryStage.close();
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}