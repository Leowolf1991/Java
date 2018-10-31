import java.util.Scanner;
public class SortInsert {

    private long[] massive;
    private int index;

    //Constructor
    public SortInsert(int size){
        if((size<0)||(size==0)) {
            System.out.println("Warning wrong size of array");
            System.exit(0);
        }
        massive = new long[size];
        index =0;
    }
    /************************************************/

    //Filling array
    public void fillingArray(long value){
        massive[index] = value;
        index++;
    }
    /*************************************************/

    //Printing Array
    public void printArray(){
        for(int i=0; i<index; i++)
            System.out.print(massive[i] + " ");
    }
    /**************************************************/

    //Sorting Insert method
    public void sortInsert(){
        long buffer =0;
        for(int i=1;i<index;i++) {
            for (int j = i; j > 0 && massive[j - 1] > massive[j]; j--) {
                buffer = massive[j - 1];
                massive[j - 1] = massive[j];
                massive[j] = buffer;
            }
        }
    }
    /***************************************************/

    //Main method
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size =0, counter =0;
        System.out.println("Please insert elements of array: ");
        size = scanner.nextInt();
        SortInsert array = new SortInsert(size);
        for(int i=0;i<size;i++)
        array.fillingArray((int)(Math.random()*10));
        System.out.println("Array before sorting: ");
        array.printArray();
        System.out.println("");
        array.sortInsert();
        System.out.println("Array after sorting algorithm");
        array.printArray();
    }
}
