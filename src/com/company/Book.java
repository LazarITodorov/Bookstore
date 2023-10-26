package com.company;

public class Book {

     private String title;

     private int availables;


     Author author = new Author();



     private double price;

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
          return price;
     }

     public void setPrice(double price) {
          this.price = price;
     }
}
