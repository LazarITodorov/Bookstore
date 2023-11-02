package com.company;

public class Book {

     private String title;

     private int availables;

     private double price;

     private Author author;

     private BookType type;

     Book(){
          author = new Author();
          type = BookType.BOOK;
          title = "";
          availables = 0;
          price = 0.0;
     }


     Book(String title,int availables, double price, Author author, BookType type){
          this.title = title;
          this.availables = availables;
          this.price = price;
          this.type = BookType.BOOK;
          this.author = author;
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
