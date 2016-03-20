import java.util.Arrays;

public class InsertionSort {

	public static int[] insertSort(int[] a)
	{
		int swap = 0;
		if(a == null || a.length == 0 || a.length == 1)
		{
			System.out.println("Number of swaps:"+swap);
			return a;
		}
		else
		{
			for(int i=1;i<a.length;i++){
				int key = a[i];
				int j = i-1;
				while(j>=0 && a[j]>key)
				{
					swap++;
					a[j+1] = a[j];
					j--;
				}
				a[j+1] = key;
			}
		}
		System.out.println("Number of swaps:"+swap);
		return a;
	}
	
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6};
		a = insertSort(a);
		System.out.println(Arrays.toString(a));
		
		int[] b = {6,5,4,3,2,1};
		b = insertSort(b);
		System.out.println(Arrays.toString(b));
		
		int[] c = {6,6,4,4,2,2};
		c = insertSort(c);
		System.out.println(Arrays.toString(c));
		
		int[] d = {};
		d = insertSort(d);
		System.out.println(Arrays.toString(d));
		
		int[] e = {3};
		e = insertSort(e);
		System.out.println(Arrays.toString(e));
		
		int[] f = null;
		f = insertSort(f);
		System.out.println(Arrays.toString(f));
		
	}
}
