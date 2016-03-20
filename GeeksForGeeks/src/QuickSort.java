import java.util.Arrays;

public class QuickSort {

	public static int partition(int[] a,int l, int r)
	{
		int pivot  = a[r];
		int i = l - 1; 
		for(int j=l;j<r;j++)
		{
			if(a[j] <= pivot)
			{
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp = a[r];
		a[r] = a[i+1];
		a[i+1] = temp;
		return i+1;
	}
	
	public static int[] quickSort(int[] a,int l,int r)
	{
		if(l<r)
		{
			int pi = partition(a,l,r);
			quickSort(a, l, pi-1);
	        quickSort(a, pi+1, r);
		}
		return a;
	}
	
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6};
		a = quickSort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
		
		int[] b = {6,5,4,3,2,1};
		b = quickSort(b,0,b.length-1);
		System.out.println(Arrays.toString(b));
		
		int[] c = {6,6,4,4,2,2};
		c = quickSort(c,0,c.length-1);
		System.out.println(Arrays.toString(c));
		
		int[] d = {};
		d = quickSort(d,0,d.length-1);
		System.out.println(Arrays.toString(d));
		
		int[] e = {3};
		e = quickSort(e,0,e.length-1);
		System.out.println(Arrays.toString(e));
		
	}
}
