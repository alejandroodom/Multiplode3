import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 1;
        while (numero % 3 != 0) {
            System.out.print("Escriba un múltiplo de 3: \n");
            numero = sc.nextInt();
            if (numero % 3 != 0) {
                System.out.println("Error " + numero + " no es un múltiplo de 3");
            }
        }
        System.out.println("Ok: " + numero + " es un múltiplo de 3");
    }
}