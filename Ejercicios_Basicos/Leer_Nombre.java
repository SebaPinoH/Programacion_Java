//Introduce nombre por pantalla, y lo muestra en pantalla

import java.util.*;

public class Leer_Nombre {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.println("Introduce un nombre: ");
        cadena = sc.nextLine();
        System.out.println("Buenos Días " + cadena);                                               
    }
}