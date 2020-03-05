package Lesson_6;

import Lesson_6.Animals.Cat;
import Lesson_6.Animals.Dog;

public class Lesson_6 {

       public static void main(String[] args){


           Cat cat1 = new Cat("Murka", "red", 5, 200, 2, 5);
           cat1.swim(5);
           cat1.jump(300);

           Dog[] arrayDog = new Dog[]{

                    new Dog("Tuzik", "black", 5, 500, 0.5f,10),
                    new Dog("Muhtar", "white", 3,400, 1.5f, 15),
                    new Dog("Dzhek", "red", 4, 600, 2, 6)
           };

           arrayDog[0].run(250);


    }
}
