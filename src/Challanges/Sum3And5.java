package Challanges;

public class Sum3And5 {

    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                sum += i;
                count++;
                System.out.print(i + " ");
            }
            if (count == 5) {
                break;
            }
        }

        System.out.println("\nSum of first 5 numbers divisible by 3 and 5 = " + sum);
    }
}
