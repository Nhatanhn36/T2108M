package Session9.Lab1;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;



public class ContactControlller {
    public TextField name;
    public TextArea phoneNumber;
    public Text result;
    public Text errMsg;
    public Contact contact;

    public void setData(Contact contact){
        this.contact = contact;

        name.setText(contact.getName());
        phoneNumber.setText(contact.getPhoneNumber());
    }
    public void addContact(){
        try{
            Contact c = new Contact(name.getText(), phoneNumber.getText());

            if(this.contact == null){
                Main.contactList.add(c);
            }else {
                int i = Main.contactList.indexOf(this.contact);
                Main.contactList.set(i, c);
            }
            Parent root = FXMLLoader.load(getClass().getResource("phonebook.fxml"));
            Main.rootStage.setScene(new Scene(root, 1000, 700));

            errMsg.setVisible(false);
        }catch(Exception e){
            errMsg.setVisible(true);
            errMsg.setText("Please enter name or phone number!");
        }
    }

    private void renderList(){
        String txt = "Information\n";
        for(Contact c : Main.contactList){
            txt += c.toString();
        }
        result.setText(txt);
        name.setText("");
        phoneNumber.setText("");
    }
    public void viewPhonebook() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("phonebook.fxml"));
        Main.rootStage.setScene(new Scene(root, 1000, 700));
    }
}
