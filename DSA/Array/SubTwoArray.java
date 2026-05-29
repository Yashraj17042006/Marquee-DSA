package Array;

public class SubTwoArray {
        public static void main(String[] args) {
            int[] arr1 = {10,20,30};
            int[] arr2 = {2, 4, 6};
            int[] result = new int[arr1.length];

            for(int i =0;i<arr1.length;i++){
                result[i] = arr1[i] - arr2[i];
            }

            for(int i =0;i<result.length;i++){
                System.out.print(result[i] + " ");
            }
        }

    }
