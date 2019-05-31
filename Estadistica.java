
/**
 * Esta clase, está hecha únicamente para realizar las operaciones de estadistica sobre los datos del archivo seleccionado
 * se pueden realizar operaciones de contar datos, mayor medida y promedio por medida para cada tipo de atributo (Precipitacion, temperatura promedio,
 * temperatura máxima, temperatura mínima)
 */
import java.util.Scanner;
import java.util.ArrayList;
 
public class Estadistica{
    /** Este método recibe un ArrayList como párametro y retorna el número de datos que hay en el ArrayList */
    public int contarDatos(ArrayList<Dato> al){
        return al.size();
    }
    /** Este método recibe un ArrayList como párametro y retorna el número mayor de las precipitaciones del ArrayList recibido */
    public double  mayorPrcp(ArrayList<Dato> al){
        double numeroMayor = -100;
        for(Dato dato : al){
             if(dato.precipitacion > numeroMayor){
                 numeroMayor = dato.precipitacion ;
           
             }
        }
        return numeroMayor;
    }
    /** Este método recibe un ArrayList como párametro y retorna el número mayor de la temperatura promedio del ArrayList recibido */
    public double mayorTavg(ArrayList<Dato> al){
        double numeroMayor = -100;
        for(Dato dato : al){
            if(dato.temPromedio > numeroMayor){
                numeroMayor = dato.temPromedio;
            }
        }
        return numeroMayor;
    }
    /** Este metodo recibe un ArrayList como párametro y retorna el número mayor de temperatura máxima del ArrayList recibido */
    public double mayorTmax(ArrayList<Dato> al){
        double numeroMayor = -100;
        for(Dato dato : al){
            if(dato.tempMax > numeroMayor){
                numeroMayor = dato.tempMax;
            }
        }
        return numeroMayor;
    }
    /** Este método recibe un ArrayList como párametro y retorna el número mayor de temperatura mínima del ArrayList recibido */
    public double mayorTmin(ArrayList<Dato> al){
        double numeroMayor = -100;
        for(Dato dato : al){
            if(dato.tempMin > numeroMayor){
                numeroMayor = dato.tempMin;
            }
        }
        return numeroMayor;
    }
    /** Este método recibe un ArrayList como párametro y retorna el promedio de precipitación del ArrayList recibido */
    public double promedioPrcp(ArrayList<Dato> al){
        double suma = 0.0;  
        double promedio = 0.0;
        double contador = 0.0;
        for(Dato dato : al){
            if(dato.precipitacion >= 0){
             suma = suma + dato.precipitacion;
             contador++;
            }
        }
        promedio = suma / contador;
        return promedio;
    }
    /** Este método recibe un ArrayList como párametro y retorna el promedio de temperatura promedio del ArrayList recibido */
    public double promedioTavg(ArrayList<Dato> al){
        double suma = 0.0;  
        double promedio = 0.0;
        double contador = 0.0;
        for(Dato dato : al){
            if(dato.temPromedio >= 0){
             suma = suma + dato.temPromedio;
             contador++;
            }
        }
        promedio = suma / contador;
        return promedio;
    }
    /** Este método recibe un ArrayList como párametro y retorna el promedio de temperatura máxima del ArrayList recibido */
    public double promedioTmax(ArrayList<Dato> al){
        double suma = 0.0;  
        double promedio = 0.0;
        double contador = 0.0;
        for(Dato dato : al){
            if(dato.tempMax >= 0){
             suma = suma + dato.tempMax;
             contador++;
            }
        }
        promedio = suma / contador;
        return promedio;
    }
    /** Este método recibe un ArrayList como párametro y retorna el promedio de temperatura mínima del ArrayList recibido */
    public double promedioTmin(ArrayList<Dato> al){
        double suma = 0.0;  
        double promedio = 0.0;
        double contador = 0.0;
        for(Dato dato : al){
            if(dato.tempMin >= 0){
             suma = suma + dato.tempMin;
             contador++;
            }
        }
        promedio = suma / contador;
        return promedio;
    }
}