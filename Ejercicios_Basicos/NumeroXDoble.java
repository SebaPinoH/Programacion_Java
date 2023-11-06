//Ingresar numero por pantalla y este muestra el doble y el triple del numero
import java.util.*;

public class NumeroXDoble {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un número entero:");
        numero = sc.nextInt();
        System.out.println("Número introducido: " + numero);
        System.out.println("Doble de " + numero + " -> "+ 2*numero);
        System.out.println("Triple de " + numero + " -> "+ 3*numero);                              
       
    }

}




