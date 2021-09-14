import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
            int y = x.nextInt();
            System.out.print("What is the exchange rate? ");
            double z = x.nextDouble();
            double ans = y * z;
            System.out.printf("%d euros at an exchange rate of %f is\n%.2f U.S. dollars.\n", y, z, ans);
        }
}
