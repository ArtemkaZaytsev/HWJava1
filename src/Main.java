public class Main {

    public static void main (String[] args){
//Задание 2
      int a = 1;
        byte a1 = 32;
        short a2 = 28000;
        long b = 600000000000000000L;
        boolean c;
        float d = 12.34f;
        double i = 534.688;
        char f = '\u2112';
        System.out.println("Задание 3: " + (hw3(5.4f, 5.2f, 6.7f,4.1f)));
        System.out.println("Задание 4: " + (hw4(5, 8)));
        hw5(125);
        System.out.println("Задание 6: " + (hw6(-5)));
        hw7("Артем");
        hw8(1200);

    }
// Задание 3
   public static float hw3 (float a, float b, float c, float d){

      return a * (b + (c / d));
   }
// Задание 4
    public static boolean hw4 (int a, int b){

        return (a + b) >= 10 && (a + b) <= 20;
    }
//Задание5
    public static void hw5 (int a){
        if(a >= 0){
            System.out.println("Число " + a + " положительное");
        }else {
            System.out.println("Число " + a + " отрицательное");
        }
    }

//Задание 6

    public static boolean hw6 (int a) {

        return a < 0;

    }
//Задание 7
    public static void hw7 (String a){
        System.out.println("Привет " + a + "!");
    }

//Задание 8
    public static void hw8 (int year){
        if (year %4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - это високосный год");
        }else {
            System.out.println(year + " - это не високосный год");
        }
    }


}
