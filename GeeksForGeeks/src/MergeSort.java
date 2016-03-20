import java.util.Arrays;

public class MergeSort {

	public static int[] merge(int[] a,int l,int m,int h)
	{
		int n1 = m - l + 1;	
		int[] left = new int[n1];
		int n2 = h-m;
		int[] right = new int[n2];
		for(int i=0;i<n1;i++)
		{
			left[i] = a[l+i];
		}
		for(int i=0;i<n2;i++)
		{
			right[i] = a[m+1+i];
		}
		int k=l;
		int i = 0;
		int j = 0;
		while(i<n1 && j<n2)
		{
			if(left[i] <= right[j])
			{
				a[k] = left[i];
				i++;
			}
			else if(left[i] > right[j])
			{
				a[k] = right[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			a[k] = left[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			a[k] = right[j];
			j++;
			k++;
		}
		return a;
	}
	
	public static int[] merSort(int[] a,int l,int r)
	{
		if(l<r)
		{
			int m = l+(r-l)/2;
			merSort(a, l, m);
	        merSort(a, m+1, r);
	        a = merge(a, l, m, r);
		}
		return a;
	}
	
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6};
		a = merSort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
		
		int[] b = {6,5,4,3,2,1};
		b = merSort(b,0,b.length-1);
		System.out.println(Arrays.toString(b));
		
		int[] c = {6,6,4,4,2,2};
		c = merSort(c,0,c.length-1);
		System.out.println(Arrays.toString(c));
		
		int[] d = {};
		d = merSort(d,0,d.length-1);
		System.out.println(Arrays.toString(d));
		
		int[] e = {3};
		e = merSort(e,0,e.length-1);
		System.out.println(Arrays.toString(e));
		
	}
}
