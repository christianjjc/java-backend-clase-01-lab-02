package edu.pe.cibertec.beans;
import org.springframework.beans.factory.annotation.Value;


public class HolaMundo {

    @Value("Alumnos desde Anotaciones")
    private String nombre;

    @Value("30")
    private int edad;

    public void saludar(){
        System.out.println("Saludando desde spring a : " + getNombre() + " quien tiene " + getEdad()  + " años.");
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
