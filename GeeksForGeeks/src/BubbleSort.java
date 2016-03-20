import java.util.Arrays;

public class BubbleSort {

	public static int[] bubSort(int[] a)
	{
		int swap = 0;
		boolean b = true;
		if(a == null || a.length == 0 || a.length == 1)
		{
			System.out.println("Number of swaps:"+swap);
			return a;
		}
		else
		{
			for(int i=a.length-1;i>=0;i--){
				for(int j=0;j<i;j++){
					if(a[j] > a[j+1])
					{
						swap++;
						b = false;
						int temp = a[j+1];
						a[j+1] = a[j];
						a[j] = temp;
					}
				}
				if(b)
				{
					System.out.println("Number of swaps in early break:"+swap);
					return a;
				}
			}
		}
		System.out.println("Number of swaps:"+swap);
		return a;
	}
	
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6};
		a = bubSort(a);
		System.out.println(Arrays.toString(a));
		
		int[] b = {6,5,4,3,2,1};
		b = bubSort(b);
		System.out.println(Arrays.toString(b));
		
		int[] c = {6,6,4,4,2,2};
		c = bubSort(c);
		System.out.println(Arrays.toString(c));
		
		int[] d = {};
		d = bubSort(d);
		System.out.println(Arrays.toString(d));
		
		int[] e = {3};
		e = bubSort(e);
		System.out.println(Arrays.toString(e));
		
		int[] f = null;
		f = bubSort(f);
		System.out.println(Arrays.toString(f));
		
	}
}
