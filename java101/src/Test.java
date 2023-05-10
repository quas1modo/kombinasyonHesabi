import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double combination, a, number, number2, total = 1, total2= 1, total3 = 1;

        System.out.println("Kombinasyon giriniz: ");
        number = input.nextInt();
        number2 = input.nextInt();

        for (int i = 1; i <= number; i++) {
            total *= i;
        }
        for (int j = 1; j <= number2; j++) {
            total2 *= j;
        }
        a = (number - number2);
        for (int k = 1; k <= a; k++) {
            total3 *= k;
        }
        combination = total / (total2 * total3);
        System.out.println("Kombinasyon hesabı: " + combination);
    }
}

