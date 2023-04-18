package arrays;

public class ArrayExample2 {

		void arrayLength(int arr[]) {
			System.out.print("length of array is = " + arr.length);
		}

		void displayElements(int ar[]) {
			for (int i = 0; i < ar.length; i++) {
				System.out.print(ar[i] + " ");
			}
		}

		void EvenElement(int ar[]) {
			for (int i = 0; i < ar.length; i++) {
				if (ar[i] % 2 == 0) {
					System.out.print(ar[i] + " ");
				}
			}
		}

		void EvenElementIndex(int ar[]) {
			for (int i = 0; i < ar.length; i+=3) {
//				if (i % 2 == 0) {
					System.out.print(ar[i] + " ");
//				}
			}
		}

		public static void main(String[] args) {
			int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

			ArrayExample obj = new ArrayExample();
			obj.arrayLength(arr);
			
			System.out.println();
			obj.displayElements(arr);
			
			System.out.println();
			obj.EvenElement(arr);
			
			System.out.println();
			obj.EvenElementIndex(arr);
		}
	}



