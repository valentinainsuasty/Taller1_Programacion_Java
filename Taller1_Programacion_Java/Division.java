package Taller1_Programacion_Java;
import java.util.Scanner;

public class Division {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Ingrese el primer numero entero: ");
            int n1 = sc.nextInt();

            System.out.print("Ingrese el segundo numero entero: ");
            int n2 = sc.nextInt();

            if (n2 != 0) {
                int cociente = n1 / n2;
                int residuo = n1 % n2;

                System.out.println("Resultado de la division: " + cociente);

                if (residuo == 0) {
                    System.out.println("La division es exacta.");
                } else {
                    System.out.println("La division no es exacta. El resto es: " + residuo);
                }
            } else {
                System.out.println("No se puede dividir por cero.");
            }
        }
    }

