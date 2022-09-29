class Main {
public static void main(String[] args) {
        int number1 = 10;
        int number2 = 50;
        boolean found = false;
        int perfectNumber = 0;
        int multiplier = 0;
        for(int i = number1; i<=number2 && !found;i++){
            if(i%2==0){
                int somDivisors = lookSomeDivisors(i);
                if(somDivisors%i==0){
                    perfectNumber = i;
                    multiplier = somDivisors/i;
                    found=true;
                }
            }
        }
        System.out.println("Number1: " + number1 + " Number2: " + number2);
        System.out.println("PerfectNumber: " + perfectNumber + " Multiplier: " + multiplier);
    }

    private static int lookSomeDivisors(int number) {
        int som = 0;
        for(int i=1;i<=number;i++){
            if(number%i==0){
                som+= i;
            }
        }return som;
    }
}

