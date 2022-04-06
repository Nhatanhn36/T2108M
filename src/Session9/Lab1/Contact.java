package Session9.Lab1;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public final class Contact {
    public String name;
    public String phoneNumber;
    public Button edit;
    public Button delete;

    public Contact(){

    }

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.edit = new Button("Edit");
        this.edit.setOnAction(event -> {
            try{
                FXMLLoader loader = new FXMLLoader(getClass().getResource("contact.fxml"));
                Parent root = loader.load();
                ContactControlller cc = loader.getController();
                cc.setData(this);
                Main.rootStage.setScene(new Scene(root, 600, 500));
            }catch (Exception e){

            }
        });
        this.delete = new Button("Delete");
        this.delete.setOnAction(event -> {
            Main.contactList.remove(this);
        });
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Button getEdit() {
        return edit;
    }

    public void setEdit(Button edit) {
        this.edit = edit;
    }

    public Button getDelete() {
        return delete;
    }

    public void setDelete(Button delete) {
        this.delete = delete;
    }

    public String toString(){
        String s = "";
        s +="\n" + getName();
        s +="\n" + getPhoneNumber();
        return s;
    }
}
