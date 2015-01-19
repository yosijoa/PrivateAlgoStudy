package gunlee.algo.sort;


public class QuickSort {
	
	static int partition(int[] arr, int left, int right) {
		int pv = arr[left];
		int orgLeft = left;
		while(left < right) {
			while(arr[left] <= pv && left < right) {
				left++;
			}
			while(arr[right] >= pv && right >= left) {
				right--;
			}
			if(left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			} 
		}
		arr[orgLeft] = arr[right];
		arr[right] = pv;
		return right;
	}
	
	static void quickSort(int[] arr, int left, int right) {
		if(left >= right) return;
		int pv = partition(arr, left, right);
		quickSort(arr, left, pv-1);
		quickSort(arr, pv+1, right);
	}
	
	public static void main(String[] args) {
		System.out.println("start");
		//int[] arr = {5, 3, 21, 28, 44, 29, 1, 41};
		int[] arr = {10, 20, 30, 40, 50, 60, 55, 45, 5, 4, 3, 9};
		
		quickSort(arr, 0, arr.length-1);
		System.out.println("arr->" + java.util.Arrays.toString(arr));
	}

}
