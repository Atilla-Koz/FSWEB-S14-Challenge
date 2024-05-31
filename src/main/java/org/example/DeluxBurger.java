package org.example;

public class DeluxBurger extends Hamburger{

    private  String chips;
    private  String drink;

    public DeluxBurger(){

        super("Delux Burger","Double",19.10,"Double Sandwich");
        this.chips = "Curvy";
        this.drink = "Coke";
    }

    public  String getChips(){
        return chips;
    }

    public  String getDrink(){
        return drink;
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }



}
