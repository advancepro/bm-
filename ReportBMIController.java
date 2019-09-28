package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

public class ReportBMIController {


    @FXML private Label weight_id;
    @FXML private TextField weighText;
    @FXML private Label height_id;
    @FXML private Label avarage_id;
    @FXML private Button calculate_id;
    @FXML private TextField heightText;
    @FXML private ImageView ph_id;
    @FXML private Label inf_id;
    @FXML private Font x1;
    @FXML private Color x2;
    @FXML private Font x3;
    @FXML private Color x4;

    @FXML
    void calculateButtonPressed(ActionEvent event) {
        try {
            Double weight = Double.parseDouble(weighText.getText());
            Double height = Double.parseDouble(heightText.getText());
            Double bmi =(weight)/(Math.pow(height, 2));
            weighText.clear();
            heightText.clear();
            //setResult(bmi);
        }catch (Exception e) {
            // TODO: handle exception
        }

      }
      void  setResult(Double bmi) {
        avarage_id.setText(bmi.toString());
        if(bmi <= 18.5) {
            inf_id.setText("Underweight");
            ph_id.setImage(new Image("C:\\Users\\User\\IdeaProjects\\ex1\\src\\sample\\bmi"));
        }else if(18.6 <= bmi && bmi <= 24.9){
            inf_id.setText("Normal");
        }else if(25 <= bmi && bmi <= 29.9) {
            inf_id.setText("OverWeight");
        }else {
            inf_id.setText("Obese");
        }
  }
}

