package Taller1_Programacion_Java;
import java.util.Scanner;
public class Annobisiesto {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese un año: ");
            int anno = sc.nextInt();

            if (anno % 4 == 0 && anno % 100 != 0 || anno % 400 == 0) {
                System.out.println(anno + " Es un año bisiesto.");
            } else {
                System.out.println(anno + " No es un año bisiesto.");
            }
        }
    }


