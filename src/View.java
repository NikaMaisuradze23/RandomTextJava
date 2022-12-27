import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.Random;

public class View {

    public TextArea textArea;

    @FXML
    protected void ButtonClick() {


        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqqrstuvwxz";


        StringBuilder sb = new StringBuilder();

        Random random = new Random();

        int length = 10;

        for(int i = 0; i < length; i++) {

            int index = random.nextInt(alphabet.length());

            char randomChar = alphabet.charAt(index);

            sb.append(randomChar);
        }
        String randomString = sb.toString();
        textArea.setText(randomString);

        }

    }


