package com.company;

public class ComicBook extends Book{

    private String characterName;

    double orPrice = super.getPrice();

    ComicBook(String title,int availables, String characterName, double price){
        super(title,availables,price);
        this.characterName = "";
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }


}
