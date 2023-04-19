
package entidad;

import java.util.Scanner;

public class libro {
   public int ISBN;
   public String titulo;
   public String autor;
   public int numeroPaginas;
   
   
    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    //alt+insert enter enter
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public libro() {
    }

    
    //alt+insert enter tab espacio enter
    public libro(int ISBN, String titulo, String autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
   
   public void cargarLibro(){
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       System.out.println("Ingrese el ISBN del libro");
       this.ISBN=leer.nextInt();
       System.out.println("Ingrese el titulo del libro");
       this.titulo=leer.next();
       System.out.println("Ingrese el autor del libro");
       this.autor=leer.next();
       System.out.println("Ingrese el numero de pagina del libro");
       this.numeroPaginas=leer.nextInt();
       
   

   }
   public void mostrarLibro(){
       System.out.println("ISBN: "+ this.ISBN);
       System.out.println("titulo: "+ this.titulo);
       System.out.println("autor: "+ this.autor);
       System.out.println("paginas: "+ this.numeroPaginas);
   }
 
}
