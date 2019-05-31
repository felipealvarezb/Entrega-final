
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;
public class MarcoDeDatos{
    ArrayList<Dato> al = new ArrayList<>();
    /** Este método recibe un archivo como parametro y los datos del archivo los convierte a un mismo dato Dato y los coloca en un ArrayList de tipo Dato */
    public void leerDatos(String nombre)throws Exception {
        Scanner scan = new Scanner(new File("1715906.csv"));
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        // move to next line
        scan.nextLine();
        String linea = null;
        while(scan.hasNextLine()){
            linea = scan.nextLine();
            linea = normalizarLinea(linea);
            String [] arr = linea.split(",");
            String numeroEstacion = arr[0];
            String nombreEstacion = arr[1];
            Date fecha = format.parse(arr[2]);
            String prcp = arr[3];
            double precipitacion = -100.0;
            if(!arr[3].isEmpty()){
                precipitacion = Double.parseDouble(arr[3]);
            }
            String tavg = arr[4];
            double temPromedio = -100.0;
            if(!arr[4].isEmpty()){
                temPromedio = Double.parseDouble(arr[4]);
            }
            double tempMax = -100.0;
            if(arr.length >= 6){
               String tmax = arr[5];
               if(!arr[5].isEmpty()){
                 tempMax = Double.parseDouble(arr[5]);
               }
            }
            double tempMin = -100.0;
            if(arr.length == 7){
                String tmin = arr[6];
                if(!arr[6].isEmpty()){
                    tempMin = Double.parseDouble(arr[6]);
                }
            }
            Dato dato = new Dato (numeroEstacion, nombreEstacion, fecha, precipitacion, temPromedio, tempMax, tempMin);
            al.add(dato);
        }
    }
    /** Este método modifica la linea que está leyendo el Scanner para que se puedan manejar los datos de una mejor manera*/
    private String normalizarLinea(String linea){
        return linea.replaceAll("\"", "").replaceAll(", ",".");
    }
    /** Este método escribe el contenido del ArrayList hecho en el método anterior y lo coloca en un archivo ".txt" */
    public void grabarDatos() {
        // Crear el archivo
        try{
            PrintStream ps = new PrintStream(new File("archivo.txt"));
            for(Dato dato: al) {
                ps.println(dato.numeroEstacion + " " + dato.nombreEstacion + " " + dato.precipitacion+" "+dato.temPromedio+" "+dato.tempMax+" "+dato.tempMin);
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("No puedo abrir el archivo de salida");
        }
    }
}