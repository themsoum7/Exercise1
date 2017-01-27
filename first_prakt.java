import java.util.Scanner;
public class first_prakt {
    public static void main(String[] args) {
        int smallest;
        int large = 0;
        int num = 0;
        System.out.println("Enter the amount of numbers: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        smallest = num;
        for (int i = 0; i < n; i++) {
            num = input.nextInt();
            if (num > large) {
                large = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println("The largest number is: " + large);
        System.out.println("And the smallest one is : " + smallest);
    }
}