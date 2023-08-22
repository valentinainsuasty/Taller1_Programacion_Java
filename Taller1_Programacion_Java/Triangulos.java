package Taller1_Programacion_Java;
import java.util.Scanner;
public class Triangulos {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese la medida del primer lado: ");
            double l1 = sc.nextDouble();
            System.out.println("Ingrese la medida del segundo lado: ");
            double l2 = sc.nextDouble();
            System.out.println("Ingrese la medida del tercer lado: ");
            double l3 = sc.nextDouble();

            if (l1<(l2+l3) && l2<(l1+l3) && l3<(l2+l1)) {
                System.out.println("Es un triangulo valido");
                if (l1 == l2 && l2 == l3) {
                    System.out.println("Triangulo equilatero.");
                } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                    System.out.println("Triangulo isosceles.");
                } else {
                    System.out.println("Triangulo escaleno.");
                }
            } else {
                System.out.println("No es un triangulo valido.");
            }
        }
    }
