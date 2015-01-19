package gunlee.algo.sort;

//한글 주석
public class InsertionSort {

	public static void main(String[] args) {
		sort2();
	}

	static void sort2() {
		int arr[] = { 5, 3, 21, 28, 44, 29, 1, 41 };
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int aux = i-1;
			
			while(aux >=0 && arr[aux]>temp) {
				arr[aux+1] = arr[aux];
				aux--;
			}
			arr[aux+1] = temp;
		}

		System.out.println(java.util.Arrays.toString(arr));
	}

	static void sort1() {
		int arr[] = { 5, 3, 21, 28, 44, 29, 1, 41 };
		for (int i = 0; i < arr.length - 1; i++) {
			int r = arr[i + 1];

			if (r < arr[i]) {
				arr[i + 1] = arr[i];
				arr[i] = r;
				for (int j = i - 1; j >= 0; j--) {
					if (arr[j] > r) {
						arr[j + 1] = arr[j];
						arr[j] = r;
					} else {
						arr[j + 1] = r;
						break;
					}
				}
			}
		}

		System.out.println(java.util.Arrays.toString(arr));
	}

}
