
package javaguia5;

public class teorico13 {

    public static void main(String[] args) {
        int cantidadCompaneros=5;
        //vector
        String[] equipo = new String[cantidadCompaneros];
        //asignandle el nombre a cada uno de los compañeros
        equipo[0] = "Juan";
        equipo[1] = "María";
        equipo[2] = "Pedro";
        equipo[3] = "Juan";
        equipo[4] = "María";
        
        //imprimimos
        System.out.println("los compañeros son: ");
        //for(inicializacion(0);condicion(i<cantidadCompeneros);incremento para
        //recorrer el vector.
        for (int i=0; i<cantidadCompaneros; i++){
            System.out.println("#"+(i+1)+equipo[i]);
        }
    }
    
}
