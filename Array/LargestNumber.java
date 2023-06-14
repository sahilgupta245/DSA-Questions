import java.util.Scanner;

public class LargestNumber{
    Scanner sc = new Scanner(System.in);
    int size;
    int[] arr;

    public void largestNum(){
        System.out.print("\nEnter the size of an array : ");
        size = sc.nextInt();
        System.out.println("Size: " + size);
        sc.close();
    }

    public void array(){
        arr = new int[size];
        System.out.print("\nEnter the elements of an array : ");
        for(int i=0; i<size; i++)
            arr[i] = sc.nextInt();
        System.out.print("\nElement in your array : ");
        for(int i=0; i<size; i++)
            System.out.print(arr[i] + " ");
    }

    public void largestElement(int[] arr, int size) {
        int largest = arr[0];
        for(int i=0; i<size; i++){
            if(arr[i] > largest)
                largest = arr[i];
        }
        System.out.print("\n\nLargest element in the array : " + largest);
    }

    public static void main(String[] args) {
        LargestNumber ln = new LargestNumber();
        ln.largestNum();
        ln.array();
        ln.largestElement(ln.arr, ln.size);
    }
}
// TC :- O(n), SC :- O(1)
// Output:
// Enter the size of an array : 5
// Size: 5
// Enter the elements of an array : -1 10 28 39  100  
// Element in your array : -1 10 28 39 100
// Largest element in the array : 100