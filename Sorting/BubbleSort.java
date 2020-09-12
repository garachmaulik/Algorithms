public class BubbleSort
{
	public static void main(String args[])
	{
		int array[] = { 4,2,9,3,6,1,8,0 };
		// Sorted = 0,1,2,3,4,6,8,9
		System.out.println("Array before Bubble Sort:");
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		BubbleSort(array);
		System.out.println("Array after Bubble Sort:");
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}

	public static void BubbleSort(int A[])
	{
		for(int pass = A.length -1; pass >= 0; pass--)
		{
			for(int i = 0; i <= pass-1; i++)
			{
				if(A[i]>A[i+1])
				{
					int temp = A[i];
					A[i] = A[i+1];
					A[i+1] = temp;
				}
			}
		}	
	}
}