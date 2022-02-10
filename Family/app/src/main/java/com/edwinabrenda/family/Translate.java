package com.edwinabrenda.family;

public class Translate

{
    private String englishWord, kiswahiliWord;
    private int image;

    public Translate()
    {
    }

    public Translate(String englishWord, String kiswahiliWord, int image)
    {
        this.englishWord = englishWord;
        this.kiswahiliWord = kiswahiliWord;
        this.image = image;
    }

    public String getEnglishWord()
    {
        return englishWord;
    }

    public void setEnglishWord(String englishWord)
    {
        this.englishWord = englishWord;
    }

    public String getKiswahiliWord()
    {
        return kiswahiliWord;
    }

    public void setKiswahiliWord(String kiswahiliWord)
    {
        this.kiswahiliWord = kiswahiliWord;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image)
    {
        this.image = image;
    }
}
