import java.util.Scanner;

public class Sort 
{    

    private static int N;

    // Constructor (DO NOT REMOVE)
    public Sort(){

    }
	// Heap sort
	public void fastsort(int arr[])
	{
	    heapify(arr);        
	    for (int i = N; i > 0; i--)
	    {
	        swap(arr,0, i);
	        N = N-1;
	        maxheap(arr, 0);
	    }
		
	}
	// Insertion Sort
	public void slowsort(int arr[])
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
	}
    /* Function to build a heap */   
	public void heapify(int arr[])
	{
		N = arr.length-1;
		for (int i = N/2; i >= 0; i--)
        maxheap(arr, i);        
	}

	/* Function to swap largest element in heap */        
    public void maxheap(int arr[], int i)
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
	public void swap(int arr[], int i, int j)
	{
	
	    int tmp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = tmp; 
	
	}    
}