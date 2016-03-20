
public class LinearSearch {
	
	public static void linearSearching(int[] a, int x){
		if(a == null) 
		{
			System.out.println("Null array provided.");
			return;
		}
		else
		{
			boolean b = false;
			for(int i=0;i<a.length;i++){
				if(a[i] == x)
				{
					System.out.println("Element Found:"+x);
					b= true;
					break;
				}
			}
			if(!b)
			{
				System.out.println("Element Not Found:"+x);
			}
		}
	}
	
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6};
		
		linearSearching(a,1);
		linearSearching(a,3);
		linearSearching(a,6);
		linearSearching(a,7);
		
		int[] b = null;
		
		linearSearching(b,7);
	}
}
