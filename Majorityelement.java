import java.util.*;

class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0, 
        candidate = 0;
        //for each loop is easy to give an 
        for (int num : arr) {
            if (count == 0)
                candidate = num;
            if (num == candidate)
                count++;
            else
                count--;
        }

        count = 0;
        // for each loop is nothing we check the  element is n/2 times or give the ouput is -1
        for (int num : arr) { 
            if (num == candidate)
                count++;
        }
        if (count > n / 2)
            System.out.println("Majority Element: " + candidate);
        else
            System.out.println("-1 (No Majority Element)");
        sc.close();
    }
}