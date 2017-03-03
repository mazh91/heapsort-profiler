import java.util.Scanner;

public class Sort 
{    

    private static int N;

    /* Sort Function */
	public Sort(int arr[])
	{       
		int copy[] = arr;
	    
		fastsort(arr);     
	    slowsort(copy);
	}     
	public static void fastsort(int arr[])
	{
	    heapify(arr);        
	    for (int i = N; i > 0; i--)
	    {
	        swap(arr,0, i);
	        N = N-1;
	        maxheap(arr, 0);
	    }
	    /* Print sorted Array */
	    System.out.println("\nElements after sorting with fastsort ");        
	    for (int i = 0; i < arr.length; i++)
	        System.out.print(arr[i]+" ");            
	        System.out.println("\n");            
		
	}
	public static void slowsort(int arr[])
	{
		  int temp;
	        for (int i = 1; i < arr.length; i++) {
	            for(int j = i ; j > 0 ; j--){
	                if(arr[j] < arr[j-1]){
	                    temp = arr[j];
	                    arr[j] = arr[j-1];
	                    arr[j-1] = temp;
	                }
	            }
	        }
	    System.out.println("\nElements after sorting with slowsort ");        
	    for (int i = 0; i < arr.length; i++)
        System.out.print(arr[i]+" ");            
        System.out.println(); 
	}
    /* Function to build a heap */   
	public static void heapify(int arr[])
	{
		N = arr.length-1;
		for (int i = N/2; i >= 0; i--)
        maxheap(arr, i);        
	}

	/* Function to swap largest element in heap */        
    public static void maxheap(int arr[], int i)
    { 

        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;

        if (left <= N && arr[left] > arr[i])
            max = left;

        if (right <= N && arr[right] > arr[max])        
            max = right;

        if (max != i)
        {
            swap(arr, i, max);
            maxheap(arr, max);
        }
    }    

	/* Function to swap two numbers in an array */
	public static void swap(int arr[], int i, int j)
	{
	
	    int tmp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = tmp; 
	
	}    

	/* Main method */
/*	public static void main(String[] args) 
	{
		int N, i; 
	    Scanner scan = new Scanner( System.in );        
	
	     Accept number of elements 
	    System.out.println("Enter number of integer elements ");
	    N = scan.nextInt();    
	
	     Make array of n elements 
	    int arr[] = new int[ N ];
	
	     Accept elements 
	    System.out.println("\nEnter "+ N +" integer elements");
	    for (i = 0; i < N; i++)
	        arr[i] = scan.nextInt();
	
	     Call method sort 
	    Sort(arr);
	    scan.close();
	    
	}*/    

}