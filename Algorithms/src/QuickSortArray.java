import java.util.*;

public class QuickSortArray {
		 
	    public static void main(String[] args) {
	        int[] arr = {30, 80, 5, 50, 40 , 90, 70 ,60, 100, 20};
	        quickSortArray(arr, 0, arr.length-1);
	        System.out.println(Arrays.toString(arr));
	    }
	 
	    public static void quickSortArray(int[] arr, int first, int last){
	 
	        int part = part(arr, first, last);
	 
	        if(part-1>first) {
	            quickSortArray(arr, first, part - 1);
	        }
	        if(part+1<last) {
	            quickSortArray(arr, part + 1, last);
	        }
	    }
	 
	    public static int part(int[] arr, int first, int last){
	        int no = arr[last];
	 
	        for(int i=first; i<last; i++){
	            if(arr[i]<no){
	                int temp= arr[first];
	                arr[first]=arr[i];
	                arr[i]=temp;
	                first++;
	            }
	        }
	 
	        int temp = arr[first];
	        arr[first] = no;
	        arr[last] = temp;
	 
	        return first;
	    }
	

}
