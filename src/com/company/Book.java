package com.company;

public class Book {

     private String title;

     private int availables;

     private double price;

     Author author = new Author();
     Book(){

     }
     BookType type = new BookType();

     Book(String title,int availables, double price){
          this.title = "";
          this.availables = 0;
          this.price = 0.0;
     }



     public String getTitle() {
          return title;
     }

     public void setTitle(String title) {
          this.title = title;
     }

     public int getAvailables() {
          return availables;
     }

     public void setAvailables(int availables) {
          this.availables = availables;
     }

     public double getPrice() {
          System.out.println(title + "is on sale 70%");
          return 7/10 * price;
     }

     public void setPrice(double price) {
          this.price = price;
     }
}
