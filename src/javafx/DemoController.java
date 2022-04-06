package javafx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class DemoController {
    public Text result;
    public TextField fullName;
    public TextField email;
    public TextField age;
    public Text errMsg;
    public Person person;

    public void setData(Person person){
        this.person = person;

        fullName.setText(person.getFullName());
        email.setText(person.getEmail());
        age.setText(person.getAge().toString());
    }

    public void submit() {
//            String s = "\n---------------";
//            s+="\n" + fullName.getText();
//            s+="\n" + email.getText();
//            s+="\n" + age.getText();
        try {
            Person p = new Person(fullName.getText(), email.getText(), Integer.parseInt(age.getText()));

            if(this.person == null){
                Main.personList.add(p);
            }else{
                int i = Main.personList.indexOf(this.person);
                Main.personList.set(i,p);
            }
//            Main.personList.add(p);
//            renderList();
            Parent root = FXMLLoader.load(getClass().getResource("list.fxml"));
            Main.rootStage.setScene(new Scene(root,800,600));

            errMsg.setVisible(false);
        } catch (Exception e) {
            errMsg.setVisible(true);
            errMsg.setText(e.getMessage());
        }

    }

    private void renderList() {
        String txt = "Information\n";
        for (Person p : Main.personList) {
            txt += p.toString();
        }
        result.setText(txt);
        fullName.setText("");
        email.setText("");
        age.setText("");
    }
}