package Array;

public class readingBook {
    public static int maxPoint(int k, int[] arr1, int[] arr2) {
        // code
        int maxPoints = 0;
        int n = arr1.length;
        for(int i = 0 ; i < n ;i++){
            int times = k/arr1[i];
            int pointsEarned = times * arr2[i];
            if(pointsEarned > maxPoints){
                maxPoints = pointsEarned;
            }
        }

        return maxPoints;
    }

    public static void main(String[] args) {
        int k = 10;
        int[] arr1 = {3, 4, 5};
        int[] arr2 = {4, 4, 5};

        int res = maxPoint(k , arr1 , arr2);
        System.out.println(res);
    }
}
