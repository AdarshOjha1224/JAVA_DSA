package Arrays;

public class duplicateElement {
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,4,2}; // 1 to 5
        int n = arr.length;

        // APPROACH 1 (Brute force) ->>>>
        // No of operations = 5 + 4 + 3 + 2 = 14
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element : " +  arr[i]);
                    break;
                }
            }
        }

        // APPROACH 2 (Marking in another array) ->>>>
        boolean[] flag = new boolean[n];
        for (int i = 0; i < n; i++){
            if (flag[arr[i]] == true) {
                System.out.println("Duplicate element : " + arr[i]);
                break;
            }
            else flag[arr[i]] = true;
        }

        // APPROACH 3 (must Optimized) ->>>>
        int sum = (n-1)*n/2;
        int arraySum = 0;
        for (int i = 0; i < n; i++){
            arraySum += arr[i];
        }
        System.out.println("Duplicate element : " + (arraySum-sum));
    }
}
