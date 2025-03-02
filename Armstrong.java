// Question Armstrong number

import java.util.Scanner;

class Armstrong {
    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check whether it is an Armstrong number or not:");
        int num = sc.nextInt();

        int count = countDigits(num); 
        int temp = num; 
        int required = 0;

        // Calculate the Armstrong sum
        while (temp > 0) {
            int d = temp % 10; 
            required += Math.pow(d, count); 
            temp /= 10; 
        }

        if (required == num) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }

        sc.close(); 
    }
}
