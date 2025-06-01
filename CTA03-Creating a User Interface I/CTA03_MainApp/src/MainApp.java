import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * A JavaFX application with a menu-driven interface that displays date/time,
 * saves text to a file, changes the background to a random green hue, and exits.
 * @author Jeremy Carney
 * @version 1.0
 */
public class MainApp extends Application {
    /** Text area for displaying date/time or error messages. */
    private TextArea textArea;
    /** Random number generator for green hue variations. */
    private final Random random = new Random();
    /** Scene for applying background color changes. */
    private Scene scene;

    /**
     * Starts the JavaFX application, setting up the UI and menu actions.
     * @param primaryStage the primary stage for this application
     */
    @Override
    public void start(Stage primaryStage) {
        // Create main layout
        BorderPane root = new BorderPane();
        root.setStyle("-fx-background-color: transparent;");
        
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
        textArea.setStyle("-fx-background-color: transparent; -fx-control-inner-background: transparent; -fx-opacity: 0.5; -fx-text-fill: black;");
        
        // Set menu bar and text area to layout
        root.setTop(menuBar);
        root.setCenter(textArea);
        
        // Create scene
        scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Menu Application");
        primaryStage.show();
        
        // Menu item actions
        showDateTime.setOnAction(_ -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
            textArea.setText(LocalDateTime.now().format(formatter));
        });
        
        saveToFile.setOnAction(_ -> {
            try (FileWriter writer = new FileWriter("log.txt")) {
                writer.write(textArea.getText());
            } catch (IOException ex) {
                textArea.setText("Error writing to file");
            }
        });
        
        changeColor.setOnAction(_ -> {
            // Generate random hue in green range (60° to 180°)
            double greenHue = 60 + random.nextDouble() * 120;
            Color color = Color.hsb(greenHue, 1.0, 1.0);
            scene.setFill(color);
            System.out.println("Applying color: HSB(" + greenHue + ", 100%, 100%)");
        });
        
        exit.setOnAction(_ -> {
            primaryStage.close();
        });
    }

    /**
     * Main entry point for the JavaFX application.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}