import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int SIZE = 100;
        int [] dataPoint = new int[SIZE];
        int sum = 0;
        int ave = 0;
        int num = 0;
        int min = 0;
        int max = 0;
        boolean foundNum = false;
        double average = 0;

        for (int i = 0; i < dataPoint.length; i++){
            dataPoint[i] = rnd.nextInt(100) + 1; // range of 1-100
        }
        for (int i = 0; i < dataPoint.length; i++){
            System.out.print(dataPoint[i] + " | ");
        }
        for (int i = 0; i < dataPoint.length; i++){
            sum += dataPoint[i];
            System.out.println("\nThe sum of this array is " + sum);
        }
        ave = sum/ dataPoint.length;
        System.out.println("\nThe average of this array is " + ave);

        num = SafeInput.getRangedInt(in, "Enter an integer ", 1, 100 );

        for (int i = 0; i < dataPoint.length; i++){
            if (dataPoint[i] == num){
                foundNum = true;
                System.out.println("Your number " + num + " was found in location " + i);
            }
        }
        if (!foundNum){
            System.out.println("Your number " + num + " was not found.");
        }
        for (int i = 0; i < dataPoint.length; i++){
            if (dataPoint[i] == num){
                foundNum = true;
                System.out.println("\n\nYour number " + num + " was found in location " + i);
                break;
            }
        }
        if (!foundNum){
            System.out.println("Your number " + num + " was not found.");
        }

        for (int i = 0; i < dataPoint.length; i++){
            if (min > dataPoint[i]){
                min = dataPoint[i];
            }
        }
        System.out.println("\nThe minimum value for this array is " + min);
        for (int i = 0; i < dataPoint.length; i++){
            if (max < dataPoint[i]){
                max = dataPoint[i];
            }
        }
        System.out.println("\nThe maximum value for this array is " + max);

        System.out.println("Average of dataPoints is: " + getAverage(dataPoint));


    }
    public static double getAverage(int [] values){
        double average = 0;
        int total = 0;

        for(int i=0; i < values.length; i++)

        {

            total += values[i]; //total = total + values[i]

        }
        average = (double)total / values.length;

        return average;
    }

}


