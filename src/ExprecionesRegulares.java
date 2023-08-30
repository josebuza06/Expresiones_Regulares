 // 1.- el punto numero nos pide escribir una expresion regular: Hola mundo

 //2.- Escribir una expresion regular para buscar la frase hola mundo en cualquier combinacion de
 //    letras mayuscular "Hola mundo":  (?!)hola mundo

 //3.- Escribir una expresión regular para buscar cualquiera de las palabras de la siguiente lista:
 // Java, Python, Go, Pascal,Perl.  Java|Python|Go|Pascal|Perl

 // 4.- Escribir una expresión regular para validar un correo de la Universidad de Sonora: @unison.mx o @uson.mx
 //     @[uU]?[nN]?[iI]?[sS]?[oO]?[nN]\.mx
 //
// Escribir una expresión regular para validar que el nombre de un archivo inicie con el prefijo ISI, después 4
// dígitos para representar el año, seguido de 1 digito, que puede ser 1 o 2, y que tenga como extensión .txt o .csv
// (e.g. ISI2022-2.csv)        ISI\d{4}-[12]\.(csv|txt)

 import java.util.regex.*;

 public class ExprecionesRegulares {
     public static void main(String[] args) {
         if (args.length != 2) {
             return;
         }

         String regular = args[0];
         String entrada = args[1];

         if (validador_de_entrada(regular,entrada)) {
             System.out.println("coincide la expresion regular.");
         } else {
             System.out.println("No coinciden la expresion regular.");
         }
     }

     public static boolean validador_de_entrada(String regular, String entrada) {
         return Pattern.matches(regular, entrada);
     }
 }

