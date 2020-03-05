package Lesson_7;

public class Plate {

    private int food;
    public Plate (int food){
        this.food = food;
    }

//    public void info(){
//
//    }

    public void decreasFood (int eatAmount){

        if((food -= eatAmount) < 0){
            System.out.println("No more food in plate!");
        }else {

            System.out.println("Food: " + food);
        }

    }
    public int getFood() {
        return food;
    }

    public void addInPlate(int food) {
        this.food = food;
    }
}
