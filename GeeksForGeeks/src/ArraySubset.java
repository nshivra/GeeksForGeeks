
public class ArraySubset {

	public static void main(String[] args){
		int arr1[] = {11, 1, 13, 21, 3, 7};
		int arr2[] = {11, 3, 7, 1};
		isSubset(arr1,arr2);
		
		int arr3[] = {1, 2, 3, 4, 5, 6};
		int arr4[] = {1, 2, 4};
		isSubset(arr3,arr4);
		
		int arr5[] = {10, 5, 2, 23, 19};
		int arr6[] = {19, 5, 3};
		isSubset(arr5,arr6);
	}
}
