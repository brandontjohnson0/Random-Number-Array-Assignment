// Array -- creates a list of random numbers from 1 to 100
//CSIS 312-D01

import java.util.Random;

public class Array {

    public static void main(String[] args) {

        System.out.println("Brandon Johnson - Assignment 6");

        Random random = new Random();

        int[] printArray = new int[100]; //sets size to 100

        for(int i=0; i<printArray.length;i++){ //for loop that creates numbers 1 - 100 at a size of 100 numbers
            printArray[i] = random.nextInt(101);

        }

        printArray(printArray,0);
    }

    public static void printArray(int[] printArray, int i) {
        if (i == printArray.length)
            return;
        System.out.print(printArray[i]+" "); //creates space between numbers

        printArray(printArray,i+1); //recursive, makes sure there are 100 numbers printed out

    }


}

