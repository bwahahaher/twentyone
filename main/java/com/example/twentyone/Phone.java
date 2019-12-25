package com.example.twentyone;

public class Phone {

    private String name;
    private String company;
    private String description;
    private int image;

    public Phone(String name, String company, int image, String description){

        this.name=name;
        this.company = company;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return this.name;
    }
    public String getDescription() {
        return this.description;
    }


    public String getCompany() {
        return this.company;
    }



    public int getImage() {
        return this.image;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setName(String name) {
        this.name = name;
    }

}