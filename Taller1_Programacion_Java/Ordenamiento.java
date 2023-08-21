package Taller1_Programacion_Java;
import java.util.Arrays;
import java.util.Scanner;
public class Ordenamiento {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese el primer numero: ");
            int n1 = sc.nextInt();

            System.out.println("Ingrese el segundo numero: ");
            int n2 = sc.nextInt();

            System.out.println("Ingrese el tercer numero: ");
            int n3 = sc.nextInt();

            System.out.println("Ingrese el cuarto numero: ");
            int n4 = sc.nextInt();
            int[] numeros = {n1, n2, n3, n4};

            Arrays.sort(numeros);

            System.out.println("Los nmeros ordenados de menor a mayor:");
            for (int numero : numeros) {
                System.out.println(numero);
            }
        }
    }

