package Lesson_2;

public class lesson_2 {

    public static void main(String[] args) {

// Задание 1
        int[] arr1 = {0, 1, 0, 1, 0, 0, 0, 1, 1, 1};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else {
                arr1[i] = 0;
            }
            System.out.print(arr1[i] + " ");
        }

        System.out.println();
//Задание 2

        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
// Задание 3

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int o : arr3) {
            if (o < 6) {
                o = o * 2;
                System.out.print(o + " ");
            }

        }
        System.out.println();
//Задание 4

        int[][] arr4 = new int[5][5];
        int change = 1;
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                if (i == j) {
                    arr4[i][j] = change;
                }
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
//Задание 5

        int[] arr5 = {3, 4, 5, 6, 7, 1, 2, 4, 8, 9};
        int max = 0;
        for (int i = 0; i < arr5.length; i++) {
            if (max < arr5[i]) {
                max = arr5[i];
            }
        }
        System.out.println(max);


    System.out.println();
//Задание 6
        int[] arr6 = {2,3,4,5,6,7,2,3,4};
        System.out.println(getArr(arr6));
    }
        static boolean getArr(int [] arr){
            for (int i = 0; i < arr.length ; i++) {
                int arrSumm1 = 0;
                int arrSumm2 = 0;
                for(int j = 0; j < i; j++){
                     arrSumm1 += arr[j];
                  }
                for(int j = i; j < arr.length; j++){
                    arrSumm2 += arr [j];
                }
                if(arrSumm1 == arrSumm2)
                return true;
            }
            return false;
        }









}


    

