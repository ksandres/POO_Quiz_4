import java.time.Period;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Estudiante {
    private String nombre;
    private LocalDate fecha;
    private double nota1;
    private double nota2;
    private double nota3;
    /****************************************************************************************************/
    /******************************************* CONSTRUCTORES ******************************************/
    /****************************************************************************************************/



    /**
     * Método constuctor para inicializar los atributos de la clase
     * @param nombre Nombre del estudiante
     * @param fecha Fecha de nacimiento del estudiante
     * Complejidad temporal: O(1) Tiempo constante
     */

    public Estudiante(String nombre,LocalDate fecha){
        this.nombre=nombre;
        this.fecha=fecha;
        this.nota1=0.0;
        this.nota2=0.0;
        this.nota3=0.0;
    }

    /**
     * Metodo que permite colocar el nombre
     * @param nombre
     * Complejidad temporal: O(1) Tiempo constante
     */


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que permite colocar la fecha
     * @param fecha
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Metodo que permite colocar la nota 1 del estudiante
     * @param nota1
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    /**
     * Metodo que permite colocar la nota 2 del estudiante
     * @param nota2
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    /**
     * Metodo que permite colocar la nota 3 del estudiante
     * @param nota3
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public int getEdad() {

        LocalDate fechaActual = LocalDate.now();
        Period diferencia = Period.between(fecha,fechaActual);
        int edad = diferencia.getYears();

        return edad;
    }

    public double getPromedio() {
        return (nota1 + nota2 + nota3) / 3.0;
    }

}
