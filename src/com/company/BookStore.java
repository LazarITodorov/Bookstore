package com.company;
import java.util.ArrayList;
import java.util.List;
public class BookStore {

    List<Book>books = new ArrayList<>();
    private int n;

    sell(Book b){
        n=b.getAvailables();
        b.setAvailables(n-1);



    }

}
