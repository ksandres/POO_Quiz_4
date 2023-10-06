
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Main {
    /**
     * Método inicial que es ejecutado
     * @param args
     * Complejidad temporal: O(1) Tiempo constante
     */
    public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
        /**
         * Ingreso de los datos solicitados del estudiante
         */
    System.out.println("Ingrese el nommbre del estudiante");
    String nombre = x.next();
    System.out.print("Ingrese el dia de su nacimiento");
    int DD = x.nextInt();
    System.out.print("Ingrese el mes de su nacimiento");
    int MM = x.nextInt();
    System.out.print("Ingrese el año de su nacimiento");
    int AAAA = x.nextInt();
    System.out.println("Ingrese la nota de la primera materia");
    double nota1 = x.nextInt();
    System.out.println("Ingrese la nota de la segunda materia");
    double nota2 = x.nextInt();
    System.out.println("Ingrese la nota de la tercera materia");
    double nota3 = x.nextInt();

    LocalDate fecha = LocalDate.of(AAAA,MM,DD);

    Estudiante andres= new Estudiante(nombre,fecha);

        andres.setNota1(nota1);
        andres.setNota2(nota2);
        andres.setNota3(nota3);

        System.out.println("Nombre" + andres.getNombre());
        System.out.println("Edad" + andres.getEdad());
        System.out.println("El promedio de " + andres.getNombre() + " es " + andres.getPromedio());


    }
}