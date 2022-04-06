package javafx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public final class Person {
    public String fullName;
    public String email;
    public Integer age;
    public Button edit;
    public Button delete;


    public Person(){

    }

    public Person(String fullName, String email, Integer age) {
        this.fullName = fullName;
        this.email = email;
        this.age = age;
        this.edit = new Button("Edit");
        this.edit.setOnAction(event->{
            try{
                FXMLLoader loader = new FXMLLoader(getClass().getResource("form.fxml"));
                Parent root = loader.load();
                DemoController d = loader.getController();
                d.setData(this);
//                Parent root = FXMLLoader.load(getClass().getResource("form.fxml"));
                Main.rootStage.setScene(new Scene(root, 800, 600));
            }catch(Exception e){

            }
        });
        this.delete = new Button("Delete");
        this.delete.setOnAction(event -> {
            Main.personList.remove(this);
        });
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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
        String s = "\n---------------";
        s+="\n" + getFullName();
        s+="\n" + getEmail();
        s+="\n" + getAge();
        return s;
    }
}
