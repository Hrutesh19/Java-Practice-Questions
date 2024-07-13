package Collections;
import java.util.*;
public class EvenSumCalculator {
    public static int calculateEvenSum(int num1) {
        int sum = 0;
        int cnt=0;
        while(num1>0){
            int rem=num1%10;
            cnt++;
            num1/=10;
        }
        for (int i=1;i<=cnt;i++) {
            if (i%2 == 0) {
                sum +=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // Example usage
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input:");
        int numbers=sc.nextInt();
        int evenSum = calculateEvenSum(numbers);
        System.out.println("Sum of even numbers: " + evenSum); // Output: Sum of even numbers: 12
    }
}

