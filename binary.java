import java.util.Scanner;
class converstDecimal {
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 int decimal = in.nextInt();
 String binary = Integer.toBinaryString(decimal);
 System.out.println("BINARY IS " + binary);
 System.out.print("OCTAL IS ");
 System.out.println(Integer.toOctalString(decimal));
 }
}