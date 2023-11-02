package com.company;

public class ComicBook extends Book{

    private String characterName;



    ComicBook(String title,int availables, String characterName){
        super(title,availables);
        this.characterName = "";
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

}
