import java.util.Arrays;

public class RadixSort {

    public static int[] countSort(int[] a, int n, int bit)
    {
    	int[] b = new int[10];
		int[] c = new int[a.length];
		
		for(int i=0;i<a.length;i++){
			int count = b[(a[i]/bit)%10];
			b[(a[i]/bit)%10] = count + 1;
		}
		for(int i=1;i<b.length;i++){
			b[i] = b[i] + b[i-1];
		}
		
		for(int i=a.length-1;i>=0;i--){
			c[b[(a[i]/bit)%10]-1] = a[i];
			b[(a[i]/bit)%10] = b[(a[i]/bit)%10] - 1;
		}
		return c;
    }
	
	public static int getMax(int[] a)
	{
		int max = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max = a[i];
			}
		}
		return max;
	}
	
	public static int[] radixSort(int[] a)
	{
		int max = getMax(a);
		for (int bit = 1; max/bit > 0; bit *= 10)
		{
            a = countSort(a, a.length, bit);
		}
		return a;
	}
		
	public static void main(String[] args){
		int a[] = {170, 45, 75, 90, 802, 24, 2, 66};
    	a = radixSort(a);
    	System.out.println(Arrays.toString(a));
	}
	
}
