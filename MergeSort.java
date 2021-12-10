package MergeSort;

public class MergeSort {

	void sort(int arr[], int l, int r)
	{
		if(l<r)
		{
			int mid = (l+r)/2;
			sort(arr, l, mid);
			sort(arr, mid+1, r);
			merge(arr, l, mid, r);
		}
	}
	void merge(int arr[], int l, int mid, int r)
	{
		int nl = mid - l + 1;
		int nr = r - mid;
		
		int LeftArray[] = new int [nl];
		int RightArray[] = new int [nr];
		
		for (int i=0; i<nl; ++i)
			LeftArray[i] = arr[l + i];
		
		for (int j=0; j<nr; ++j)
			RightArray[j] = arr[mid + 1 + j];
		
		int i = 0, j = 0;
		int k = l;
		while (i<nl&&j<nr)
		{
			if (LeftArray[i] <= RightArray[j])
			{
				arr[k] = LeftArray[i];
				i++;
			}
			else
			{
				arr[k] = RightArray[j];
				j++;
			}
			k++;
		}
		while (i<nl)
		{
			arr[k] = LeftArray[i];
			i++;
			k++;
		}
	}
	public static void main(String args[])
	{
		int arr[] = {90, 34, 120, 48, 69, 20, 61, 80, 30, 15};
		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length-1);
		System.out.println("\nSorted Array");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}
