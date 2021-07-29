package com.company;

public class Cat {
    private int appetite;
    private String name;
    private Boolean hungry = true;
    public Cat (String name , int appetite)
    {
        this.name = name;
        this.appetite = appetite;
    }
    public void Eat (Plate plate) {
        if (!hungry)
            return;
        hungry = !plate.decreaseFoodAmount(appetite); //If ate successfully -> hungry = false else hungry = true;
    }
    public Boolean isHungry(){
        return hungry;
    }
    public String getName() {
        return name;
    }
}
