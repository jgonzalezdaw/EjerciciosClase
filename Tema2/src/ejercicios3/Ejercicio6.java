package ejercicios3;
import java.util.Scanner;

public class Ejercicio6 {

public static void main(String[] args) {
// Añade al programa anterior una comprobación del número introducido, de manera que si el
// usuario escribe "1", el programa le responda "No seas tonto" y vuelva a empezar el bucle, sin
// mostrar la tabla. Utiliza la palabra clave continue.

Scanner entrada = new Scanner (System.in);

int i = 0;
int num;
do {
System.out.println("Dime un número para multiplicarlo");
num = entrada.nextInt();
if (num == 1){
System.out.println("No seas tonto");
continue;
}
for (i = 1; i <= 10; i++){

System.out.println(i + " * " + num + " = " + (i*num));

}



} while (num !=0);
System.out.println("Programa finalizado");
}

}