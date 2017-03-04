import java.util.Locale;
import java.util.Random;
import java.util.Scanner;


public class Assignment {
	final static int N = 100;
	final static int MAXVALUE = 10*N;
	final static int AVERAGEOVER = 1000000 / N;
	public static void main(String[] args) 
	{
//	    Scanner scan = new Scanner( System.in );        
	    Random random = new Random();
	
	    /* Make array of n elements */
	    int arr[] = new int[ N ];
	    int arrCp[] = new int[ N ];
	
	 /* Call method sort */
	    Sort sort = new Sort();
/*	    sort.fastsort(arr);
	    printArray(arr);
	    sort.slowsort(arrCp);
	    printArray(arrCp);
	    scan.close();*/
	    
	    /* STEP 2: Profiling */
	    long start, estFastSum, estSlowSum;
	    estFastSum = 0;
	    estSlowSum = 0;
	    // Calculate avg time to srot an array of size N with each algorithm
	    for (int i = 0; i < AVERAGEOVER; i++)
	    {
	    	/* Generate* elements */
	    	for (int j = 0; j < N; j++)
	    	{
	    		int rNum =  1 + random.nextInt(MAXVALUE);
	    		arrCp[j] = arr[j] = rNum;
	    	}
	    	start = System.nanoTime();
	    	sort.fastsort(arr);
	    	estFastSum += System.nanoTime() - start;
	    	
	    	start = System.nanoTime();
	    	sort.slowsort(arrCp);
	    	estSlowSum += System.nanoTime() - start;
	    }
	    
	    // Obtain average of both algorithms
	    float avgSlow = estSlowSum / AVERAGEOVER;
	    float avgFast = estFastSum / AVERAGEOVER;
	    
	    System.out.printf("%f\t%f\n", avgSlow, avgFast);
	}    
	
	public static void printArray(int arr[]){
	    for (int i = 0; i < arr.length; i++)
	        System.out.print(arr[i]+" ");            
	        System.out.println("\n");
	}
}
