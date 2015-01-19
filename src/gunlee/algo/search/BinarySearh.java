package gunlee.algo.search;

public class BinarySearh {
	public static int search(int[] arr, int findData) {
		int left = 0;
		int right = arr.length -1;
		int mid = (left + right) / 2;
		boolean find = true;
		
		while(findData != arr[mid]) {
			if(left == right) {
				find = false;
				break;
			}
			if(findData > mid) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
			mid = (left + right) / 2;
		}
		if(!find) { mid = -1; }
		return mid;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 21, 24, 26, 27, 28};
		int result = search(arr, 17);
		System.out.println(result);
	}
}
