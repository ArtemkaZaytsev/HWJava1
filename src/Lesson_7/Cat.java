package Lesson_7;

public class Cat {
    private String name;
    private int eatAmount;
    private boolean satiety;


    public Cat (String name, int eatAmount, boolean satiety){
        this.name = name;
        this.eatAmount = eatAmount;
        this.satiety = satiety;
    }

    public void eat(Plate plate){
        if(plate.getFood() >= eatAmount) {
            satiety = true;
            System.out.println("Cat " + name + " eat... "+"\n" + name + " is full!" + satiety);
            plate.decreasFood(eatAmount);

        }else {
            satiety = false;
            System.out.println("Need more FOOOD >_< !");
            System.out.println(name + "is hangry!" + satiety);

        }

    }
}
