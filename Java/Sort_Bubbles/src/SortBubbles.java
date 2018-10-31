
/**
 * Write a description of class SortBubbles here.
 * 
 * @author Leo
 * @version 1.0.0
 */
import java.util.Scanner;
public class SortBubbles
{
    // instance variables - replace the example below with your own
    private long[] massive;
    private int index;
    /**
     * Constructor for objects of class SortBubbles
     */
    public SortBubbles(int size)
    {
        // initialise instance variables
        massive = new long[size];
        index =0;
    }

    //method for fill array
    public void fillingArray(long value)
    {
        massive[index] = value;
        index ++;
    }
    /*******************************************************************************************/

    //method for print array
    public void printArray()
    {
        for(int i=0;i<index;i++)
        System.out.print(massive[i] + " ");
    }
    /*******************************************************************************************/

    //method for bubbles sort algorithm
    public int sortingArray()
    {
        int count =0;
        for(int out=index-1;out>=1;out--) //outside cyrcle
        for(int in = 0; in<out; in++) //inside cyrcle
        {
            count ++;
            if (massive[in] > massive[in + 1]) {
                long buffer = massive[in];
                massive[in] = massive[in + 1];
                massive[in + 1] = buffer;
            }
        }
        return count;
    }
    /*******************************************************************************************/

    //Main method
    public static void main(String[] args)
    {
        int size =0, counter =0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input size of array: ");
        size = scan.nextInt(); //input size of array
        SortBubbles array = new SortBubbles(size); //create new object array for class SortBubbles
        for(int i=0; i<size; i++)
        array.fillingArray((int)(Math.random()*10)); // here we using method for fill array random values from 0 .. to .. 10
        System.out.println("Array before bubble sort");
        array.printArray();
        System.out.println();
        System.out.println("Array after bubble sort");
        counter = array.sortingArray(); // it's our method bubbles sort array
        array.printArray();
        System.out.println("");
        System.out.println("Quantity of replace:");
        System.out.println(counter);
    }
}
