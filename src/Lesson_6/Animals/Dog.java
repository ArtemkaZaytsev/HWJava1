package Lesson_6.Animals;

public class Dog extends Animals {

    public Dog (String name,String color, int age, int maxRun, float maxJump, int maxSwim){
        super(name, color, age, maxRun, maxJump, maxSwim);
    }

    @Override
    public void run(int r){
        if(r >0 && r <= maxRun) {
            System.out.println(name + " run: " + r + " m");
        }
    }

    @Override
    public void jump(float j){
        if(j >0 && j <= maxJump){
            System.out.println(name + " jump: " + j + " m");
        }
    }

    @Override
    public void swim(int s){
        if(s >0 && s <= maxSwim) {
            System.out.println(name + " swim " + " m");
        }
    }
}
