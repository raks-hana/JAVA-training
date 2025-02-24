package task1;

public class Task1 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int[] altarr = new int[(arr.length+1)/2];
		
		 for (int i = 0, j = 0; i < arr.length; i += 2, j++) {
	            altarr[j] = arr[i];
	        }
		for(int i=0;i<altarr.length;i++) {
			System.out.print(altarr[i]+" ");
		}
	}
}
