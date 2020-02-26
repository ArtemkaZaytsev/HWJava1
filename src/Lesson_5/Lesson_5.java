package Lesson_5;

import java.util.Arrays;

/**
 * Created by z26 on 26.02.20.
 */
public class Lesson_5 {

    public static void main (String[] agrs) {


        Personal[] persArray = new Personal[]{

           new Personal("Иванов Федор Павлович", "Директор", "ivivan@mailbox.com", "892312312", 60000, 42),
           new Personal("Иванова Федора Павловна", "Бухгалтер", "ivivan@mail.ru", "892312312", 50000, 35),
           new Personal("Корякин Эдуард Викторович", "Гл.инжинер", "koriakin@mailbox.com", "892312312", 50000, 36),
           new Personal("Полянцев Федор Николаевич", "Нач ОМТС", "polan@mailbox.com", "892312312", 30000, 25),
           new Personal("Петров Василий", "Дворник", "dvor@mail.ru", "892312312", 25000, 55)
        };

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() >= 40){
                System.out.println(persArray[i]);

        }
        }
        }

}

/*
\/Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
Создать массив из 5 сотрудников.
Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
*/