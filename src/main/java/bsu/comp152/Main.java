package bsu.comp152;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String output1 = "";
        String output2 = "";
        Random rand = new Random();
        int[] a1 = new int[10];
        for (int i = 0; i < a1.length; i++){
            a1[i] = rand.nextInt(10) + 1;
        }
        for(int i = 0; i < a1.length; i++){
            output1 += a1[i] + " ";
        }
        System.out.println(output1);
        selectionSort(a1);
        for(int i = 0; i < a1.length; i++){
            output2 += a1[i] + " ";
        }
        System.out.println(output2);
    }

    public static int[] selectionSort(int[] sortArray){
        int smallIndex;
        int smallValue;
        String output = "";
        for(int i = 0; i < (sortArray.length -1); i++){
            // Initialization of values
            smallIndex = i;
            smallValue = sortArray[i];
            // The initialized values get compared throughout the rest of the array
            for(int j = i + 1; j < sortArray.length; j++){
                if (sortArray[j] < smallValue){
                    smallValue = sortArray[j];
                    smallIndex = j;
                }
            }
            //Swap happens here
            sortArray[smallIndex] = sortArray[i];
            sortArray[i] = smallValue;
        }
        // Final array is returned 
        return sortArray;
    }


}


