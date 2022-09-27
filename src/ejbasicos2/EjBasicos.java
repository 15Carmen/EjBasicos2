package ejbasicos2;

import java.util.Scanner;

public class EjBasicos {
    public static void main(String[] args) {

        //Creo el Scanner para leer por teclado
        Scanner sc = new Scanner (System.in);

        //Le pedimos la edad al usuario
        System.out.println("Introduzca su edad:");

        //Declaro la variable edad donde se guarda la edad introducida y la guardo
        int edad=sc.nextInt();

        //Declaro la variable edadViejo donde le añado un año a la edad introducida
        int edadViejo= edad+1;

        //Muestro edadViejo por consola
        System.out.println("El año que viene tendrás:"+edadViejo);

    }
}
