
package Main;
import Entidad.Ahorcado;
import Servicio.AhorcadoServicio;

public class Main {

    public static void main(String[] args) {
        Ahorcado juego1 = new Ahorcado();
        AhorcadoServicio js = new AhorcadoServicio();

        js.juego(juego1);
        System.out.println(juego1.toString());

    }
}