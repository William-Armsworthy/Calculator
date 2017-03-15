import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.ConditionalFeature.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author billy
 */
public class CalculatorViewController implements Initializable {

    @FXML private Button oneButton;
    @FXML private Button twoButton;
    @FXML private Button threeButton;
    @FXML private Button fourButton;
    @FXML private Button fiveButton;
    @FXML private Button sixButton;
    @FXML private Button sevenButton;
    @FXML private Button eightButton;
    @FXML private Button nineButton;
    @FXML private Button zeroButton;
    @FXML private Button decimialButton;
    @FXML private Button multiplyButton;
    @FXML private Button devideButton;
    @FXML private Button addButton;
    @FXML private Button subtractButton;
    @FXML private Button equalButton;
    @FXML private TextField display;
    
    public void numberButtonPushed(ActionEvent event){
        
    }
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        display.setText("0");
        
    }    
    
}
