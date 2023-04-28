
package servicio;

import entidad.Cadena;
import java.util.Scanner;

public class CadenaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cadena palabra = new Cadena();
    
    public Cadena insertarFrase (){
        System.out.println("ingrse una frase o palabra: ");
        palabra.setFrase(leer.nextLine());
        palabra.setLonguitud(palabra.getFrase().length());
        return palabra;
    }
    
    public int mostraVocales(Cadena palabra){
        int cont = 0;     
        for (int i = 0; i < palabra.getLonguitud(); i++) {
            switch (palabra.getFrase().charAt(i)){
                case 'a':
                    cont ++;
                    break;
                case 'e':
                    cont ++;
                    break;
                case 'i':
                    cont ++;
                    break;
                case 'o':
                    cont ++;
                    break;
                case 'u':
                    cont ++;
                    break;
                default:
                    
            }
        }
        System.out.println("La cantidad de vocales que tiene la palabra es de: "+cont);
        return cont;
    }
    
    public String InvertirFrase(Cadena palabra){
        String fraseInvertida="";
        
        for (int i = palabra.getLonguitud()-1; i >= 0; i--) {
            fraseInvertida += palabra.getFrase().charAt(i);
        }
        System.out.println("La frase invertida es: "+ fraseInvertida);
        return fraseInvertida;
    }
    
    public int vecesRepetido(Cadena palabra){
        String letra ;
        int cont =0;
        System.out.println("ingrese la letra a buscar en la frase: ");
        letra = leer.nextLine();
        for (int i = 1; i < palabra.getLonguitud(); i++) {
            if (letra.equals(palabra.getFrase().substring(i-1,i))) {
                cont++;
            }
        }
        System.out.println("la cantidad de veces que se repite la letra: " + letra);
        System.out.println("es de: "+cont+ " veces.");       
        return cont;
    }
    
    public int copararLonguitud(Cadena palabra){
        String frase;
        System.out.println("Ingrese una frase:");
        frase = leer.nextLine();
        int longuitud = frase.length() - palabra.getFrase().length();
        System.out.println("La diferencia de longuitud es de: "+longuitud);
        return longuitud;
    }
    
    public String unirFrase (Cadena palabra ){
        String frase ;
        System.out.println("Ingrese el caracter a concatenear");
        frase = leer.nextLine();
        
        frase = palabra.getFrase().concat(" "+ frase);
        System.out.println("La nueva frase es:" + frase);
        return frase;
    }
    
    public String remplazarLetra (Cadena palabra ){
        
        String fraseFinal,letra; 
        System.out.println("selecione que letra desea remplazar:");
        letra = leer.next();
        fraseFinal = palabra.getFrase().replace("a",letra);
        System.out.println(" su nueva frase es: "+ fraseFinal);
        return fraseFinal;
    }
    
     public void contiene(Cadena palabra) {
        System.out.println("Escriba la letra que desea saber si se encuentra en la frase");
        String letra = leer.next();
        System.out.println(palabra.getFrase().contains(letra));
    }
}
