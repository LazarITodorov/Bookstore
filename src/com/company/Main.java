package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
             int n = sc.nextInt();

             for(int i=1;i<=n;i++){
                 Book book;
                 switch(type){
                     case CHILDREN_BOOK: book = new ChildrenBook();break;
                     case COMIC_BOOK: book = new ComicBook();break;

                 }




             }





             sc.close();


    }
}
