import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese cantidad de términos: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int contador = 0;
        while (contador < n) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
            contador++;
        }
        sc.close();
    }
}