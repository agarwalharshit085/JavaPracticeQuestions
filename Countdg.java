import java.util.*;

class Count {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER A NUMBER");
        int n = sc.nextInt();
        int d = 0, c = 0;
        int temp = n;
        for (int i = temp; i > 0 || i < 0; i = i / 10) {
            d = i % 10;
            if (d == 0) {
                continue;
            } else if (n % d == 0) {
                c++;
            }
        }
        System.out.println("NUMBER OF DIGITS WHICH DIVIDES NUMBER N :  " + c);
        sc.close();
    }

}