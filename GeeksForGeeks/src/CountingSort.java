import java.util.Arrays;

public class CountingSort {
	
	public static int[] countingSort(int[] a,int range)
	{
		int[] b = new int[range];
		int[] c = new int[a.length];
		
		for(int i=0;i<a.length;i++){
			int count = b[a[i]];
			b[a[i]] = count + 1;
		}
		
		for(int i=1;i<b.length;i++){
			b[i] = b[i] + b[i-1];
		}
		
		for(int i=a.length-1;i>=0;i--){
			c[b[a[i]]-1] = a[i];
			b[a[i]] = b[a[i]] - 1;
		}
		return c;
	}

	public static void main(String[] args){
		int[] a = {2,0,1,0,1,2,1,0};
		a = countingSort(a,3);
		System.out.println(Arrays.toString(a));
		
		int[] b = {0,1,0};
		b = countingSort(b,2);
		System.out.println(Arrays.toString(b));
		
		int[] c = {0};
		c = countingSort(c,1);
		System.out.println(Arrays.toString(c));
		
	}
	
}
