package Lesson_5;

/**
 * Created by z26 on 26.02.20.
 */
public class Personal {

    String name;
    String post;
    String email;
    String phone;
    int money;
    int age;     //ФИО, должность, email, телефон, зарплата, возраст


    public Personal(){

    }
    public Personal(String name, String post, String email, String phone, int money, int age){

        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.money = money;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    //метод, который выводит информацию об объекте в консоль
    public void info (){
        System.out.println(name + " - " + post + " - " + email + " - " + phone + " - " + money + " руб." + " - " + age);

    }






    @Override

    public String toString() {

        return String.format(name + " - " + post + " - " + email + " - " + phone + " - " + money + " руб." + " - " + age +"\n");

    }



}
