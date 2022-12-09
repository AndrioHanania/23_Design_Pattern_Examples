package Design_Patterns.Creational.Builder;

import Design_Patterns.Creational.Builder.Items.Burgers.Burger;
import Design_Patterns.Creational.Builder.Items.ColdDrinks.ColdDrink;
import Design_Patterns.Creational.Builder.Items.Item;

import java.util.ArrayList;

public class Meal { //Product
    private Item coldDrink;
    private Item burger;
    private ArrayList<Item> items = new ArrayList<>();
    private String type;

    public  void setType(String typeMeal){
        this.type = typeMeal;
    }

    public void addBurger(Burger burger){
        if(this.burger != null)
            items.remove(this.burger);
        this.burger = burger;
        items.add(burger);

    }

    public void addColdDrink(ColdDrink coldDrink){
        if(this.coldDrink != null)
            items.remove(this.coldDrink);
        this.coldDrink = coldDrink;
        items.add(coldDrink);
    }

    public double getCost()
    {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }
    public void showItems(){
        System.out.println("items: ");
        for (Item item:items)
            item.print();
    }

    public void printMeal(){
        System.out.println(type + " Meal: ");
        showItems();
        System.out.println("total price: " + getCost());
        System.out.println();
    }
}
