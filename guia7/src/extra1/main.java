
package extra1;

public class main {

    public static void main(String[] args) {
       Cancion c1 =new Cancion();
       Cancion c2 = new Cancion("anoche","wis y yandel");
       
       c1.setAutor("chebrolet");
       c1.setTitulo("RENAULT 12");
        System.out.println("CANCION: "+ c1.getTitulo()+ "      AUTOR: "+ c1.getAutor());
        System.out.println("===================");
        System.out.println("CANCION: "+ c2.getTitulo()+ "      AUTOR: "+ c2.getAutor());
    }
    
}
