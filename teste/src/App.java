import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1 = 0 , n2 = 0;
        
        System.out.print("Entre com o primeiro valor: ");
        n1 = sc.nextDouble();
        System.out.print("Entre com o segundo valor: ");
        n2 = sc.nextDouble();
        double sum = n1 + n2;
        System.out.print("A soma é: " + String.format("%.2f", sum));

    }
  }