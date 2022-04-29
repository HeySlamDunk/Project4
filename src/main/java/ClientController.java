import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;


public class ClientController implements Initializable {

    @FXML

    private BorderPane root;


    @FXML
    private TextField ClientTxt;

    @FXML

    private TextField AddTxt;


    @FXML
    private Button sendButton;

    @FXML

    private Button AddButton;

    @FXML
    private ListView clientView;


    Client clientConnection;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub

    }

    public void sendHandle (ActionEvent e) {

        clientConnection.send(ClientTxt.getText()); ClientTxt.clear();
    }









}
