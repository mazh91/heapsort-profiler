import java.util.Random;
import java.util.Scanner;


public class Assignment {
	public static void main(String[] args) 
	{
		int i, N; 
	    Scanner scan = new Scanner( System.in );        
	    Random random = new Random();
	
	    /* Accept number of elements */
	    System.out.println("Enter number of integer elements ");
	    N = scan.nextInt();    
	
	    /* Make array of n elements */
	    int arr[] = new int[ N ];
	    int arrCp[] = new int[ N ];
	
	    /* Accept elements */
	    for (i = 0; i < N; i++)
	    {
	    	int rNum =  1 + random.nextInt(10*N);
	        arrCp[i] = arr[i] = rNum;
	    }
	
	    /* Call method sort */
	    Sort sort = new Sort();
	    sort.fastsort(arr);
	    System.out.println("\nElements after sorting with fast sort ");        
	    printArray(arr);
	    sort.slowsort(arrCp);
	    System.out.println("\nElements after sorting with slow sort ");      
	    printArray(arrCp);
	    scan.close();
	    
	}    
	
	public static void printArray(int arr[]){
	    for (int i = 0; i < arr.length; i++)
	        System.out.print(arr[i]+" ");            
	        System.out.println("\n");
	}
}
