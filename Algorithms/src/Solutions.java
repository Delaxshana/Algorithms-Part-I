
public class Solutions {
	public static void main(String[] args) {
		/* Find the particular number from the data set */
		int [] array = {1,3,4,5,13,20,25,42,44,53};
		System.out.println(binarySearchRecursive(array,13));
		System.out.println(binarySearchRecursive(array,21));
	}	
	public static boolean binarySearchRecursive(int[] array, int x, int left, int right) {
		if(left > right) {
			return false;
		}
		int mid= (left + right )/2;
		if(array[mid] == x) {
			return true;
		}
		else if (x< array[mid]) {
			return binarySearchRecursive(array, x, left, mid-1) ;
		}
		else {
			return binarySearchRecursive(array, x, mid+1, right) ;
		}
	}
	public static boolean binarySearchRecursive(int[] array, int x) {
		int left=0;
		int right=array.length -1;
		while(left<=right) {
			if(left > right) {
				return false;
			}
			int mid= (left + right )/2;
			if(array[mid] == x) {
				return true;
			}
			else if (x< array[mid]) {
				//return binarySearchRecursive(array, x, left, mid-1) ;
				right=mid-1;
			}
			else {
				left = mid+1;
				//return binarySearchRecursive(array, x, mid+1, right) ;
			}
		}
		return false;
	}
}
