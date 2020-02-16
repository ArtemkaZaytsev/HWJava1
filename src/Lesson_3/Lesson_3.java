package Lesson_3;

import java.util.Random;
import java.util.Scanner;

public class Lesson_3 {

    public static Scanner sc = new Scanner(System.in);

    public static void main (String[] args){
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("У Вас три попытки, что-бы угадать загаданное число от 0 до 9");

        for(int i = 1; i <= 3; i++){

            int userNumber = getNuberFromScanner ("Введите число: ", 0, 9);

            if (userNumber < randomNumber){
                System.out.println("Ваше число меньшего загаданного!");

            }else if (userNumber > randomNumber){
                System.out.println("Ваше число больше загаданного!");

            }else if (userNumber == randomNumber){
                System.out.println("Вы угадали!");
                break;
            }

        }
        System.out.println("Вы потратили все попытки!");

        int repeatGame = getNuberFromScanner("Повторить игру еще раз? 1 – да / 0 – нет: ", 0, 1);
            if (repeatGame == 1){
                main(args);
            }else{
             System.out.println("Спасибо за игру. До новых встреч!");
            }
    }

    static public int getNuberFromScanner (String message, int min, int max){
        int x;
        do {
            System.out.print(message);
            x = sc.nextInt();
        }while (x<min || x>max);
        return x;
    }
}
