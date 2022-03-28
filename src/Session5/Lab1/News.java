package Session5.Lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class News implements INews{
    //khai báo các thuộc tính
    int ID;
    String title;
    String publishDate;
    String author;
    String content;
    float avarageRate;
    //khai báo mảng RateList
    int[] rateList = new int[3];

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAvarageRate() {
        return avarageRate;
    }

    @Override
    public void display() {
        System.out.println("Title: " +getTitle());
        System.out.println("Publish date: "+ getPublishDate());
        System.out.println("Author: "+ getAuthor());
        System.out.println("Content: "+ getContent());
        System.out.println("Average Rate: "+getAvarageRate());
    }

    public void calculate(){
        float total = 0;
        System.out.println("Nhập vào 3 phần tử của mảng: ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++){
            System.out.printf("RateList[%d] = ", i);
            rateList[i] = sc.nextInt();
            total = total + rateList[i];
        }
        avarageRate = (total)/3;
        System.out.println("Average rate = " +avarageRate);
        return;
    }
}
