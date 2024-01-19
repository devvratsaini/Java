package Section_6;

public class PrimeNumberChallange {
    
    public static void main(String[] args) {

        int primeCounter = 0, start = 10, stop = 40;

        System.out.println("List of prime numbers:");
        for (int num = start; primeCounter < 3 && num <= stop; num++) {
            if(isPrime(num)) {
                System.out.print(num + " ");
                primeCounter++;
            }
        }
        System.out.println();

        System.out.println("Prime number count: " + primeCounter);
    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if(wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
