import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Admin.HP on 1/12/2015.
 */
public class Sorting {
    public static void main(String[] args) throws Exception {
        System.out.println("1.Bubble Sort\n2.Selection Sort1");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String option=br.readLine();

        String data = br.readLine();
        String[] arrayOfData = data.split(" ");
        int[] intArray = new int[arrayOfData.length];
        for (int iterator = 0; iterator < arrayOfData.length; iterator++) {
            intArray[iterator] = Integer.parseInt(arrayOfData[iterator]);
        }
        for (int iterator = 0; iterator < arrayOfData.length; iterator++)
            System.out.print("" + intArray[iterator] + " ");
        System.out.print("\nSorted Array");
        int sortedIntArray[]=new int[arrayOfData.length];
        if(option.equalsIgnoreCase("bubble")) {
            sortedIntArray = bubbleSort(intArray);
        }
        else
            sortedIntArray = selectionSort(intArray);
        for (int iterator = 0; iterator < arrayOfData.length; iterator++)
            System.out.print(" " + (sortedIntArray[iterator]));

    }

    public static int[] bubbleSort(int[] array) {
        Arrays.sort(array);
        return array;
    }

    public static int[] selectionSort(int[] array) {
        Arrays.sort(array);
        return array;
    }
}
