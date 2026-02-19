import java.util.Scanner;

public class math{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        int gcd = findGCD(a, b);
        
        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd);
        sc.close();
    }

    public static int findGCD(int n1, int n2) {
        int gcd = 1;
    
        int limit = Math.min(n1, n2);

        for (int i = 1; i <= limit; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i; 
            }
        }
        
        return gcd;
    }
}
