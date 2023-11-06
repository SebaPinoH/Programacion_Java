//Introduce numero por teclado y los muestra en pantalla

import java.util.*;

 public class Leer_Numero {

    public static void main(String[] args){

        //declaración de variables
        int n1, n2;
        Scanner sc = new Scanner(System.in);

        //leer el primer número
        System.out.println("Introduce el primero número: ");
        n1 = sc.nextInt();      //lee un entero por teclado

        //leer el segundo número
        System.out.println("Introduce el segundo número: ");
        n2 = sc.nextInt();      //lee un entero por teclado
        
        //mostrar resultado
        System.out.println("Ha introducido los números: " + n1 + " y " + n2);                      

    }
}