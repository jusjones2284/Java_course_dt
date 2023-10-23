public class PrimeNumberMethod {
    public static void main(String[] args) {
//    final  int NUMBER_OF_PRIMES_PER_LINE= 0;
    m(1234);
//    printPrimeNumbers(50);


    }

//    public static void printPrimeNumbers(int numberOfPrimes){
//        final int NUMBER_OF_PRIMES_PER_LINE = 10;
//        int count = 0;
//        int number = 2;
//
//        while (count < numberOfPrimes){
//            if(isPrime(number)){
//                count++;
//            }
//            if(count % numberOfPrimes == 0){
//                System.out.printf("%-5d\n", number);
//            }
//            else System.out.printf("%-5d", number);
//        }
//        number++;
//    }
//    public static boolean isPrime(int number){
//        for(int divisor = 2; divisor <= number /2; divisor++){
//            if(number % divisor == 0){
//                return false;
//            }
//
//        }
//        return true;
//    }

    public static void m(int n){
        while (n != 0){
            System.out.print(n % 10);
            n = n/10;
        }
    }

    public static void m(String s){
        for(int i = s.length() - 1; i >= 0; i--){
            System.out.println(s.charAt(i));
        }
    }

}
