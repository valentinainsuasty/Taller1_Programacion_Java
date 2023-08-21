package Taller1_Programacion_Java;
import java.util.Scanner;
public class Letraonumero {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Ingrese un caracter: ");
            char caracter = sc.next().charAt(0);

            if (Character.isLetter(caracter)) {
                if (Character.isUpperCase(caracter)) {
                    System.out.println("Es una letra mayuscula.");
                } else {
                    System.out.println("Es una letra minuscula.");
                }
            } else if (Character.isDigit(caracter)) {
                System.out.println("Es un numero.");
            } else {
                System.out.println("No es ni una letra ni un numero.");
            }
        }
    }

