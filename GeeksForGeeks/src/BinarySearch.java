
public class BinarySearch {
	
	public static void binarySearching(int[] a, int x, int low, int high){
		if(low<=high)
		{
			int mid = (low+high)/2;
			if(x == a[mid]){
				System.out.println("Element Found:"+x);
			}
			else if(x > a[mid]){
				binarySearching(a,x,mid+1,high);
			}
			else
			{
				binarySearching(a,x,0,mid-1);
			}
		}
		else
		{
			System.out.println("Element Not Found:"+x);
		}
	}
	
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6};
		
		binarySearching(a,1,0,a.length-1);
		binarySearching(a,3,0,a.length-1);
		binarySearching(a,6,0,a.length-1);
		binarySearching(a,7,0,a.length-1);
	}
}
