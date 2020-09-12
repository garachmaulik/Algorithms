public class SelectionSort
{
	public static void main(String args[])
	{
		int array[] = { -3,5,7,2,9,-6,4,6 };
		//Sorted = -6,-3,2,4,5,7,6,9
		System.out.println("Array before Selection Sort:");
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		SelectionSort(array);
		System.out.println("Array after Selecion Sort:");
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
	
	public static void SelectionSort(int A[])
	{	
		int i,j,temp;
		for(i = 0; i < A.length - 1; i++)
		{
			for(j = i+1; j < A.length; j++)
			{
				if(A[j] < A[i])
				{
					temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}  
	}
}