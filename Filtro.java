
/**
 * Esta clase contiene todos los métodos de operación de filtro para un archivo.
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Filtro{
    /** Este método recibe un ArrayList y un número double como párametro e imprime todas las precippitaciones menores al número recibido   */
    public void menorQuePrcp(ArrayList<Dato> al, double n){
        for(Dato dato : al){
            if(dato.precipitacion >= 0){
                if(dato.precipitacion < n){
                    System.out.println(dato.precipitacion);
                }
            }
        }
    }
    /** Este método recibe un ArrayList y un número double como párametro e imprime todas las temperaturas promedio menores al número recibido*/
    public void menorQueTavg(ArrayList<Dato>al, double n){
        for(Dato dato : al){
            if(dato.temPromedio >= 0){
                if(dato.temPromedio < n){
                    System.out.println(dato.temPromedio);
                }
            }
        }
    }
    /** Este método recibe un ArrayList y un número double como párametro e imprime todas las temperaturas máximas menores al número recibido*/
    public void menorQueTmax(ArrayList<Dato>al, double n){
        for(Dato dato : al){
            if(dato.tempMax >= 0){
                if(dato.tempMax < n){
                    System.out.println(dato.tempMax);
                }
            }
        }
    }
    /** Este método recibe un ArrayList y un número double como párametro e imprime todas las temperaturas mínimas menores al número recibido*/
    public void menorQueTmin(ArrayList<Dato> al, double n){
        for(Dato dato : al){
            if(dato.tempMin >= 0){
                if(dato.tempMin < n){
                    System.out.println(dato.tempMin);
                }
            }
        }
    }
    /** Este método recibe un ArrayList y un número double como párametro e imprime todas las precippitaciones mayores al número recibido*/
    public void mayorQuePrcp(ArrayList<Dato> al, double n){
        for(Dato dato : al){
            if(dato.precipitacion >= 0){
                if(dato.precipitacion > n){
                    System.out.println(dato.precipitacion);
                }
            }
        }
    }
    /** Este método recibe un ArrayList y un número double como párametro e imprime todas las temperaturas promedio mayores al número recibido */
    public void mayorQueTavg(ArrayList<Dato> al, double n){
        for(Dato dato : al){
            if(dato.temPromedio >= 0){
                if(dato.temPromedio > n){
                    System.out.println(dato.temPromedio);
                }
            }
        }
    }
    /** Este método recibe un ArrayList y un número double como párametro e imprime todas las temperaturas máximas mayores al número recibido */
    public void mayorQueTmax(ArrayList<Dato> al, double n){
        for(Dato dato : al){
            if(dato.tempMax >= 0){
                if(dato.tempMax > n){
                    System.out.println(dato.tempMax);
                }
            }
        }
    }
    /** Este método recibe un ArrayList y un número double como párametro e imprime todas las temperaturas mínimas mayores al número recibido */
    public void mayorQueTmin(ArrayList<Dato> al, double n){
        for(Dato dato : al){
            if(dato.tempMin >= 0){
                if(dato.tempMin > n){
                    System.out.println(dato.tempMin);
                }
            }
        }
    }
    /** Este método recibe un ArrayList y un número double como párametro e imprime todas las precipitaciones iguales al número recibido*/
    public void igualPrcp(ArrayList<Dato> al, double n){
        for(Dato dato : al){
            if(dato.precipitacion >= 0){
                if(dato.precipitacion == n){
                    System.out.println(dato.precipitacion);
                }
            }
        }
    }
    /** Este método recibe un ArrayList y un número double como párametro e imprime todas las temperaturas promedio iguales al número recibido */
    public void igualTavg(ArrayList<Dato> al, double n){
        for(Dato dato : al){
            if(dato.temPromedio >= 0){
                if(dato.temPromedio == n){
                    System.out.println(dato.temPromedio);
                }
            }
        }
    }
    /** Este método recibe un ArrayList y un número double como párametro e imprime todas las temperaturas máximas iguales al número recibido*/
    public void igualTmax(ArrayList<Dato> al, double n){
        for(Dato dato : al){
            if(dato.tempMax >= 0){
                if(dato.tempMax == n){
                    System.out.println(dato.tempMax);
                }
            }
        }
    }
    /** Este método recibe un ArrayList y un número double como párametro e imprime todas las temperaturas mínimas iguales al número recibido */
    public void igualTmin(ArrayList<Dato> al, double n){
        for(Dato dato : al){
            if(dato.tempMin >= 0){
                if(dato.tempMin == n){
                    System.out.println(dato.tempMin);
                }
            }
        }
    }
}
