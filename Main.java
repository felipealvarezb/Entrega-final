
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class Main{
    public static void main(String []args){
        MarcoDeDatos mdd = new MarcoDeDatos();
        Estadistica est = new Estadistica();
        Filtro fil = new Filtro(); 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Proyecto final, Fundamentos de progrmación");
        System.out.println("Hecho por: Feipe Álvarez Benítez, EAFIT-201901");
        System.out.println("A continución, encontrará algunas opciones que deberá escoger para poder utilizar el programa");
        System.out.println("Tan sólo deberá presionar el número correspondiente a la opción deseada y ya");
        System.out.println("Presione \"0\" para salir del programa");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Ingrese el nombre del archivo que desea leer y operar sobre el"); 
        
        
       while(true){
          try{
              
              String nombreArchivo = input.next();
              mdd.leerDatos(nombreArchivo);
              System.out.println("El archivo se ha leído correctamente");
            
              System.out.println("Ahora procederemos a escoger el atributo con el que vamos a trabajar: ");
              System.out.println("1. Precipitacion ");
              System.out.println("2. Temperatura promedio");
              System.out.println("3. Temperatura máxima");
              System.out.println("4. Temperatura mínima");
            String inpt = input.next();
            switch(inpt){
              case "1":
              System.out.println("Ha escogido la precipitación, ahora indique que operación desea realizar en precipitación");
              System.out.println("1. Precipitacion mayor");
              System.out.println("2. Promedio de precipitación");
              System.out.println("3. Precipitaciones mayores que");
              System.out.println("4. Prepictaciones menor que");
              System.out.println("5. Precipitaciones iguales a");
              String inp = input.next();
                switch(inp){
                    case "1":
                    System.out.println("La precipitación mayor es: "+ est.mayorPrcp(mdd.al));
                    break;
                    case "2":
                    System.out.println("El promedio de precipitación es: "+est.promedioPrcp(mdd.al));
                    break;
                    case "3":
                    double numero = input.nextDouble();
                    System.out.println("Estos son las precipitaciones mayores");
                    fil.mayorQuePrcp(mdd.al, numero);
                    break;
                    case "4":
                    numero = input.nextDouble();
                    System.out.println("Estos son las precipitaciones menores");
                    fil.menorQuePrcp(mdd.al, numero);
                    break;
                    case "5":
                    numero = input.nextDouble();
                    System.out.println("Estos son las precipitaciones iguales");
                    fil.igualPrcp(mdd.al, numero);
                        break;
                }
                    break;
                    
              case "2":
              System.out.println("Ha escogido la temperatura promedio, ahora indique que operación desea realizar en temperatura promedio");
              System.out.println("1. Temperatura promedio mayor");
              System.out.println("2. Promedio de temperatura promedio");
              System.out.println("3. Temperatura promedio mayores que");
              System.out.println("4. Temperatura promedio menores que");
              System.out.println("5. Temperatura promedio iguales a");
              inp = input.next();
                switch(inp){
                    case "1":
                    System.out.println("La temperatura promedio mayor es: "+ est.mayorTavg(mdd.al));
                        break;
                    case "2":
                    System.out.println("El promedio de temperatura promedio es: "+est.promedioTavg(mdd.al));
                        break;
                    case "3":
                    double numero = input.nextDouble();
                    System.out.println("Estos son las temperaturas promedio mayores");
                    fil.mayorQueTavg(mdd.al, numero);
                        break;
                    case "4":
                    numero = input.nextDouble();
                    System.out.println("Estos son las temperaturas promedio menores");
                    fil.menorQueTavg(mdd.al, numero);
                        break;
                    case "5":
                    numero = input.nextDouble();
                    System.out.println("Estos son las temperaturas promedio iguales");
                    fil.igualTavg(mdd.al, numero);
                        break;
                }
                    break;

              case "3":
              System.out.println("Ha escogido la temperatura máxima, ahora indique que operación desea realizar en temperatura máxima");
              System.out.println("1. temperatura máxima mayor");
              System.out.println("2. Promedio de temperatura máxima");
              System.out.println("3. Temperatura máxima mayores que");
              System.out.println("4. Temperatura máxima menores que");
              System.out.println("5. Temperatura máxima iguales a");
               inp = input.next();
              switch(inp){
                    case "1":
                    System.out.println("La temperatura máxima mayor es: "+ est.mayorTmax(mdd.al));
                      break;
                    case "2":
                    System.out.println("El promedio de temperatura máxima es: "+est.promedioTmax(mdd.al));
                      break;
                    case "3":
                    double numero = input.nextDouble();
                    System.out.println("Estos son las temperaturas máxima mayores");
                    fil.mayorQueTmax(mdd.al, numero);
                      break;
                    case "4":
                    numero = input.nextDouble();
                    System.out.println("Estos son las temperaturas máxima menores");
                    fil.menorQueTmax(mdd.al, numero);
                      break;
                    case "5":
                    numero = input.nextDouble();
                    System.out.println("Estos son las temperatura máxima iguales");
                    fil.igualTmax(mdd.al, numero);
                      break;
                }
                    break;
           
                    
              case "4":
              System.out.println("Ha escogido la temperatura mínima, ahora indique que operación desea realizar en temperatura mínima");
              System.out.println("1. Temperatura mínima mayor");
              System.out.println("2. Promedio de temperatura mínima");
              System.out.println("3. Temperatura mínima mayores que");
              System.out.println("4. Temperatura mínima menores que");
              System.out.println("5. Temperatura mínima iguales a");
               inp = input.next();
              switch(inp){
                    case "1":
                    System.out.println("La temperatura mínima mayor es: "+ est.mayorTmin(mdd.al));
                      break;
                    case "2":
                    System.out.println("El promedio de temperatura mínima es: "+est.promedioTmin(mdd.al));
                      break;
                    case "3":
                    double numero = input.nextDouble();
                    System.out.println("Estos son las temperaturas mínima mayores");
                    fil.mayorQueTmin(mdd.al, numero);
                      break;
                    case "4":
                    numero = input.nextDouble();
                    System.out.println("Estos son las temperaturas mínima menores");
                    fil.menorQueTmin(mdd.al, numero);
                      break;
                    case "5":
                    numero = input.nextDouble();
                    System.out.println("Estos son las temperaturas mínima iguales");
                    fil.igualTmin(mdd.al, numero);
                      break;
                }
                    break;
                case "exit":
                System.exit(0);
            }
              break;
          }
          catch (Exception e){
              System.out.println("No se pudo encontrar el archivo, por favor vuelva a intentar");
          }
        }
    }
}
