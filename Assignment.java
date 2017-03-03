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
	    int arr_cp[] = new int[ N ];
	
	    /* Accept elements */
	    System.out.println("\nEnter "+ N +" integer elements");
	    for (i = 0; i < N; i++)
	    {
	    	int rNum =  1 + random.nextInt(10*N);
	        arr_cp[i] = arr[i] = rNum;
	    }
	
	    /* Call method sort */
	    Sort sort = new Sort(arr);
	    scan.close();
	    
	}    
}
