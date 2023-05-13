import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;

public class CheckBoxExample extends Application{
    private CheckBox box1;
    private CheckBox box2;
    private CheckBox box3;
    private Button orderBtn;
    private Button cancelBtn;
    private TextArea displayItems;
    
    @Override
    public void start(Stage primaryStage){
        box1 = new CheckBox("Pizza");
        box2 = new CheckBox("Ice Cream");
        box3 = new CheckBox("Orange Juice");
        orderBtn = new Button("Submit");
        cancelBtn = new Button("Cancel");
        displayItems = new TextArea();
        Label titleLabel = new Label("Menu");
        displayItems.setEditable(false);
        
        HBox buttons = new HBox(10);
        buttons.getChildren().addAll(orderBtn, cancelBtn);
        
        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(titleLabel, box1, box2, box3, buttons, displayItems);
        StackPane root = new StackPane();
        root.getChildren().add(vBox);
        
        
        // 
        orderBtn.setOnAction(e -> orderBtnHander());
        cancelBtn.setOnAction(e -> cancelBtnHandler());
        
        Scene scene = new Scene(root);
        
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Check Box");
        primaryStage.show();
    }
    
    private void orderBtnHander(){
        if(box1.isSelected()){
            displayItems.appendText("Pizza \n");
        }
        
        if(box2.isSelected()){
            displayItems.appendText("Ice Cream \n");
        }
        
        if(box3.isSelected()){
            displayItems.appendText("Orange Juice \n");
        }
    }
    
    private void cancelBtnHandler(){
        displayItems.setText(" ");
    }
}