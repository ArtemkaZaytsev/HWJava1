package Lesson_7;

import Lesson_6.Animals.Dog;

public class Main {

    public static void main (String[] args) {


        Cat[] arrayCat = new Cat[]{
                new Cat("Murzik", 40, false),
                new Cat("Kotik", 65, false),
                new Cat("Kisa", 30, false),
                new Cat("Massa", 35, false)
        };

        Plate plate = new Plate(100);

        arrayCat[0].eat(plate);

        plate.addInPlate(50); // Добавляем сеттером еды в тарелку

        arrayCat[1].eat(plate);

        arrayCat[2].eat(plate);

        arrayCat[3].eat(plate);



    }
}
