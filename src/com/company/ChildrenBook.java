package com.company;

public class ChildrenBook extends Book{

    private int age;


    ChildrenBook(String title,int availables,int age){
        super(title,availables);
        this.age=0;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
