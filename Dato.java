
/**
 * Write a description of class Dato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Date;
public class Dato{
   
    String numeroEstacion;
    String nombreEstacion;
    Date fecha;
    double precipitacion;
    double temPromedio;
    double tempMax;
    double tempMin;
    /** Este es el método constructor de la clase Dato*/
    public Dato (String numeroEstacion, String nombreEstacion, Date fecha, double precipitacion, double temPromedio, double tempMax, double tempMin){
        this.numeroEstacion = numeroEstacion;
        this.nombreEstacion = nombreEstacion;
        this.fecha = fecha;
        this.precipitacion = precipitacion;
        this.temPromedio = temPromedio;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
    }
    
}