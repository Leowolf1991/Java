
/**
 * Write a description of class MergeSort here.
 * 
 * @author (Leo) 
 * @version (1.0.0)
 */
import java.util.Scanner;
public class Sort_Selections
{
    private int index;
    private long [] massive;
    /**
     * Constructor for objects of class MergeSort
     */
    public Sort_Selections(int size)
    {
        if((size<0)||(size==0))
        {
            System.out.println("Error of size array");
            System.exit(0);
        }
        massive = new long[size];
    }
    /*****************************************************/
    
    //Filling array method
    public void fillingArray(long value)
    {
        massive[index]=value;
        index++;
    }
    /*****************************************************/
    
    //Print array method
    public void printArray()
    {
       for(int i=0; i<massive.length;i++)
       System.out.print(massive[i] + " ");
    }
    /*****************************************************/
    
    //Sorting Selection Algorithm
    public void sortSelect()
    {
       long min =0;
       int buffer =0;
       
       for(int i=0;i<massive.length;i++)
       {
           buffer =i;
           min = massive[i];
           for(int j=i+1; j<massive.length; j++)
           
                if(massive[j]<min)
                {
                    min = massive[j];
                    buffer = j;
                   
                }
                
            
            massive[buffer]=massive[i];
            massive[i] = min;
        }
    }
    /****************************************************/
    
    //Main method
    public static void main(String [] args)
    {
        int size =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input size of array: ");
        size = scanner.nextInt();
        Sort_Selections array = new Sort_Selections(size);
        for(int i=0;i<array.massive.length; i++)
        array.fillingArray((long)(Math.random()*10));
        System.out.println("Array before sorting: ");
        array.printArray();
        System.out.println("");
        System.out.println("Array after sorting: ");
        array.sortSelect();
        array.printArray();
    }
}
