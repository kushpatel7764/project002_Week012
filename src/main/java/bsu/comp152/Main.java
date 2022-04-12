package bsu.comp152;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String output = "";
        Random rand = new Random();
        double[] a1 = new double[10];
        for (int i = 0; i < a1.length; i++){
            a1[i] = rand.nextInt(10) + 1;
        }
        for(int i = 0; i < a1.length; i++){
            output += a1[i] + " ";
        }
        System.out.println(output);
        System.out.println(selectionSort(a1));
    }

    public static String selectionSort(double[] sortArray){
        int smallIndex = 0;
        String output = "";
        for(int i = 0; i < sortArray.length; i++){
            double minval = sortArray[i];
            for(int j = 0; j < sortArray.length; j++){
                if (minval > sortArray[j]){
                    minval = sortArray[j];
                    smallIndex = j;
                }
            }
        double holder = sortArray[i];
            sortArray[i] = minval;
            sortArray[smallIndex] = holder;
        }
        for(int i = 0; i < sortArray.length; i++){
            output += sortArray[i] + " ";
        }
        return output;
    }


}

