package javafx;

import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class DemoController {
    public Text result;
    public TextField fullName;
    public TextField email;
    public TextField age;
    public Text errMsg;

    public void submit(){
//            String s = "\n---------------";
//            s+="\n" + fullName.getText();
//            s+="\n" + email.getText();
//            s+="\n" + age.getText();
        try{
            Person p = new Person(fullName.getText(),email.getText(),Integer.parseInt(age.getText()));

            result.setText(result.getText()+"\n"+p.toString());

            fullName.setText("");
            email.setText("");
            age.setText("");

            errMsg.setVisible(false);
        }catch (Exception e){
            errMsg.setVisible(true);
            errMsg.setText(e.getMessage());
        }
    }
}
