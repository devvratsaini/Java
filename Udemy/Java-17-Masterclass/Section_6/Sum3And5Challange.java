package Section_6;

public class Sum3And5Challange {

    public static void main(String[] args) {

        int count = 0, sum = 0;

        System.out.println("List of numbers divisible by both 3 and 5:");
        for (int i = 1; count < 5 && i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                sum += i;
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("Sum = " + sum);
    }
}
