package Array;

public class reverseArray{
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        reverse(numbers);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

