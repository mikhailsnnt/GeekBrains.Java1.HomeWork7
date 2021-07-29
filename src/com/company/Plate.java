package com.company;

public class Plate {
    private int foodAmount;
    public Plate(int foodAmount)
    {
        this.foodAmount = foodAmount;
    }
    public Boolean decreaseFoodAmount(int amount) //True - success
    {
        if (foodAmount>=amount)
        {
            foodAmount-=amount;
            return true;
        }
        return false;
    }
    public void addFoodAmount(int amount )
    {
        foodAmount += amount;
    }
}
