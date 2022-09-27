package ejbasicos2;

import java.util.Scanner;

public class EjBasicos {
    public static void main(String[] args) {

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Declaramos las variables edad y edadViejo
        int edad, edadViejo;

        //Le pedimos al usuario que introduzca su edad y guardamos la respuesta en la
        //variable homónima previamente declarada
        System.out.println("Introduzca su edad:");
        edad = sc.nextInt();

        //Calculamos cuantos años tendrá el proximo año sumándole 1 a su edad actual
        edadViejo = edad + 1;

        //Mostramos por consola la edad del usuario el próximo año
        System.out.println("El año que viene tendrás:" + edadViejo);

    }
}
