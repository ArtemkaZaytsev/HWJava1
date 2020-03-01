package Lesson_6.Animals;

import Lesson_6.Lesson_6;

public abstract class Animals {

    String name;
    String color;
    int age;
    int maxRun;
    float maxJump;
    int maxSwim;

    public Animals(String name,String color, int age, int maxRun, float maxJump, int maxSwim){
        this.name = name;
        this.color = color;
        this.age = age;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.maxSwim = maxSwim;
    }
    public abstract void run(int r);
    public abstract void jump(float j);
    public abstract void swim(int s);
}
