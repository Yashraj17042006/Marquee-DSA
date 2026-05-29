package Array;

public class AddTwoArray {
        public static void main(String[] args) {

            int[] arr1 = {1, 2, 3, 4};
            int[] arr2 = {4, 3, 2, 1};
            int[] result = new int[arr1.length];

            for (int i = 0; i < arr1.length; i++) {
                result[i] = arr1[i] + arr2[i];
            }
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
        }
    }

