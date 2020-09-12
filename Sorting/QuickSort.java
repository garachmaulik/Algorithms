public class QuickSort
{
	public static void main(String args[])
	{
		int array[] = { 7,2,3,9,-4,1,0,5,-9 };
		// Sorted = -9,-4,0,1,2,3,5,7,9
		int beg = 0;
		int end = array.length-1;
		System.out.println("Array before Quick Sort");
		for(int i : array)
			System.out.print(i + " ");
		System.out.print("\n");
		quickSort(array,beg,end);
		System.out.println("Array after Quick Sort");
		for(int i : array)
			System.out.print(i + " ");
	}	

	public static void quickSort(int A[], int beg, int end)
	{
		if(beg < end)
		{
			int pivotIndex = Partition(A, beg, end);
			quickSort(A, beg, pivotIndex - 1);
			quickSort(A, pivotIndex + 1,end);
		}
	}

	public static int Partition(int A[], int beg, int end)
	{
		int pivot = A[end];
		int i = beg - 1;
		for(int j = beg; j < end; j++)
		{
			if (A[j] <=pivot) 
			{
				i++;
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
		int a = A[i+1];
		A[i+1] = A[end];
		A[end] = a;
		return i+1;
	}
}