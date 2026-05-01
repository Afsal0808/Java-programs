import java.util.*;

class MissingPositive{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0 || arr[i] > n)
                arr[i] = n + 1;
        }
        for (int i = 0; i < n; i++) {
            int val = Math.abs(arr[i]);
            if (val <= n) {
                arr[val - 1] = -Math.abs(arr[val - 1]);
            }
        }
        int answer = n + 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                answer = i + 1;
                break;
            }
        }
        System.out.println("Small Missing Pos: " + answer);
    }
}