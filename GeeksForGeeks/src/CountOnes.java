
public class CountOnes {
	
	public static int binarySearch(int[] a, int x, int low, int high){
		int index = 0;
		if(low<=high)
		{
			int mid = (low+high)/2;
			if(low == high)
			{
				return low;
			}
			if(x <= a[mid]){
				index = binarySearch(a,x,0,mid);
			}
			else
			{
				index = binarySearch(a,x,mid+1,high);
			}
		}
		return index;
	}
	
	public static void main(String[] args){
		int[] a = {0,0,1,1,1,1,1,1,1};
		int firstOcc = binarySearch(a,1,0,a.length-1);
		System.out.println(a.length-firstOcc);
	}
}
