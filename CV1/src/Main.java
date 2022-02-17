import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        int start = 1;
        System.out.println("Do you want write a number ? \ntrue = 0 or false");
        Scanner sc = new Scanner(System.in);
        boolean isNumber = sc.hasNextInt();     // test pro cisla jestli je to cislo a ne znak
        start = sc.nextInt();
        System.out.printf("User input is: %d\n", start);
        if(isNumber){
            if(start == 0){
                core();
            }
            else {
                System.out.println("\nProgram ending...");
                System.out.println("\nEND");
            }
        }
    }

    private static void core() {
        System.out.println("Please write a number");
        boolean isPrime = true;                     // isPrime - je prvocislo promenna
        try (Scanner sc = new Scanner(System.in)){
            boolean isNumber = sc.hasNextInt();     // test pro cisla jestli je to cislo a ne znak
            if(isNumber){
                int number = sc.nextInt();
                System.out.printf("User input is: %d\n", number);
                for(int i = 2; i < number; i++) {
                    if(number %i == 0) {
                        System.out.println("The number is divided by " + i);
                        isPrime = false;
                    }
                }
                if(isPrime == false){
                    System.out.println("Number " + number +  " isn´t prime number");
                }
                else {
                    System.out.println("Number " + number +  " is prime number");
                }
            }
        }
    }
}
