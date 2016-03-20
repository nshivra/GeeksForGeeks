import java.util.Arrays;

public class SelectionSort {

	public static int[] selectSort(int[] a)
	{
		int swap = 0;
		if(a == null || a.length == 0 || a.length == 1)
		{
			System.out.println("Number of swaps:"+swap);
			return a;
		}
		else
		{
			for(int i=0;i<a.length;i++){
				int min = i;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[j] < a[min])
					{
						min = j;
					}
				}
				if(i!=min)
				{
					swap++;
					int temp = a[i];
					a[i] = a[min];
					a[min] = temp;
				}
			}
		}
		System.out.println("Number of swaps:"+swap);
		return a;
	}
	
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6};
		a = selectSort(a);
		System.out.println(Arrays.toString(a));
		
		int[] b = {6,5,4,3,2,1};
		b = selectSort(b);
		System.out.println(Arrays.toString(b));
		
		int[] c = {6,6,4,4,2,2};
		c = selectSort(c);
		System.out.println(Arrays.toString(c));
		
		int[] d = {};
		d = selectSort(d);
		System.out.println(Arrays.toString(d));
		
		int[] e = {3};
		e = selectSort(e);
		System.out.println(Arrays.toString(e));
		
		int[] f = null;
		f = selectSort(f);
		System.out.println(Arrays.toString(f));
		
	}
}
