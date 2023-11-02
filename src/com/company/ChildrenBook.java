package com.company;

public class ChildrenBook extends Book{

    private int age;

    double orPrice = super.getPrice();

    ChildrenBook(String title,int availables,int age, double price){
        super(title,availables,price);
        this.age=0;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
