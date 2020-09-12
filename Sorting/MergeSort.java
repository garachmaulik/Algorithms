public class MergeSort
{
	public static void main(String args[])
	{
		int array[] = { 7,3,5,6,2,3,1,9 };
		// Sorted = 1,2,3,3,5,6,7,9
		int beg,end;
		beg = 0;
		end = array.length-1;
		System.out.println("Array before Merge Sort");
		for(int i : array)
		{
			System.out.print(i + " ");
		}	
		mergeSort(array,beg,end);
		System.out.print("\n");
		System.out.println("Array after Merge Sort");
		for(int i : array)
		{
			System.out.print(i + " ");
		}
	}

	public static void mergeSort(int A[], int beg, int end)
	{
		if(beg < end)
		{
			int mid = (beg+end)/2;
			mergeSort(A,beg,mid);
			mergeSort(A,mid+1,end);
			merge(A,beg,mid,end);
		}
	}

	public static void merge(int A[],int beg, int mid, int end)
	{
		int left_array_size = mid-beg+1;
		int right_array_size = end-mid;
		int LeftArray[] = new int[left_array_size];
		int RightArray[] = new int[right_array_size];
		for(int i = 0; i < left_array_size; i++)
			LeftArray[i] = A[beg+i];
		for(int j = 0; j < right_array_size; j++)
			RightArray[j] = A[mid+1+j];
		int i = 0,j = 0;
		int k = beg;
		while(i < left_array_size && j < right_array_size)
		{
			if(LeftArray[i]<=RightArray[j])
				A[k++] = LeftArray[i++];
			else
				A[k++] = RightArray[j++];
		}
		while(i < left_array_size)
			A[k++] = LeftArray[i++];
		while(j < right_array_size)
			A[k++] = RightArray[j++];
	}
}