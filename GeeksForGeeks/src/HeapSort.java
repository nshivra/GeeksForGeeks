import java.util.Arrays;

public class HeapSort {
	
	public static void heapify(int[] a,int n,int i)
	{
		int largest = i;
		int left = 2*i+1;
		int right = 2*i+2;
		if(left<n && a[left]>a[largest])
		{
			largest = left;
		}
		if(right<n && a[right]>a[largest])
		{
			largest = right;
		}
		if(largest !=i)
		{
			int temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;
			heapify(a,n,largest);
		}
	}
	
	public static int[] heapSort(int[] a)
	{
		int n = a.length;
		for(int i=n/2 - 1;i>=0;i--)
			heapify(a,n,i);
		for(int i=n-1;i>=0;i--)
		{
			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;
			heapify(a,i,0);
		}
		return a;
	}
	
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6};
		a = heapSort(a);
		System.out.println(Arrays.toString(a));
		
		int[] b = {6,5,4,3,2,1};
		b = heapSort(b);
		System.out.println(Arrays.toString(b));
		
		int[] c = {6,6,4,4,2,2};
		c = heapSort(c);
		System.out.println(Arrays.toString(c));
		
		int[] d = {};
		d = heapSort(d);
		System.out.println(Arrays.toString(d));
		
		int[] e = {3};
		e = heapSort(e);
		System.out.println(Arrays.toString(e));
		
	}
}
