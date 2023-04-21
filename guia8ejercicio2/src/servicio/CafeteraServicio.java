/*
-Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
-Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe 
el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada.
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
-Método vaciarCafetera(): pone la cantidad de café actual en cero. 
-Método agregarCafe(int): se le pide al usuario una cantidad de café, el método 
lo recibe y se añade a la cafetera la cantidad de café indicada.

*/
package servicio;
import entidad.Cafetera;
import java.util.Scanner;
public class CafeteraServicio {
    Cafetera cafetera = new Cafetera();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public  void capacidaMaxima(){
        System.out.println("ingrese  la cantidad maxima");       
        cafetera.setCapacidadMaxima(leer.nextInt()); 
        System.out.println("la cantida maxima es: "+cafetera.getCapacidadMaxima());
        System.out.println("la cantidad actual que tiene la cafetera es: "+ cafetera.getCantidadActual());
        System.out.println(" ");
    }
    
    public void llenarCafetera(){
        /*
        System.out.println("ingrese  la cantidad maxima");       
        cafetera.setCapacidadMaxima(leer.nextInt()); 
        System.out.println("la cantida maxima es: "+cafetera.getCapacidadMaxima());
        System.out.println("la cantidad actual que tiene la cafetera es: "+ cafetera.getCantidadActual());*/
        if (cafetera.getCantidadActual()< cafetera.getCapacidadMaxima()*0.01){
            System.out.println("la cafetera bajo un 20% llenandola nuevamente");
            System.out.println("");
            System.out.println(""+cafetera.getCantidadActual());
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
            System.out.println("la cafetera esta llena "+ cafetera.getCapacidadMaxima());
        } else {
            //System.out.println("la cafetera tiene9 "+ cafetera.getCapacidadMaxima());
        }
}
    public void servirTaza(){
        float taza;
        System.out.println("capacidad de la taza");
        taza = leer.nextFloat();
        if (cafetera.getCantidadActual()<taza) {
            System.out.println("no se puede agregar el cafe");
            System.out.println("desea llenar la cafetera?(S/N)");
            String respuesta=leer.next();
            if (respuesta.equalsIgnoreCase("S")) {
                llenarCafetera();
            }else{
                System.out.println("el porcentaje de cafe es bajo");
            }
            
        }else{
            cafetera.setCantidadActual(cafetera.getCantidadActual()-taza);
            System.out.println("la cafetera tiene232 "+cafetera.getCantidadActual());
        }
        System.out.println("listo");
    }
    
    public void vaciarCafetera (){
        System.out.println("la cafetera se esta vaciando");
        cafetera.setCantidadActual(0);
        System.out.println("la cafetera tiene "+ cafetera.getCantidadActual());
    }
    
    public void agregarCafe(){
        System.out.println("cual es la cantida que desea agregar a la cafetera");
        int agregar = leer.nextInt();
        System.out.println("LA CAFETERA TIENE "+ cafetera.getCantidadActual());
        cafetera.setCantidadActual(cafetera.getCantidadActual()+agregar);
        System.out.println("TIENE "+ cafetera.getCantidadActual());
    }
}
