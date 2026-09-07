class PrimeNumber {
    public static void main(String[] args) {
        int[] numbers = {23, 65, 11, 87, 7, 46};

        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }

    static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int div = 2; div * div <= number; div++) {
            if (number % div == 0) {
                return false;
            }
        }

        return true;
    }
}