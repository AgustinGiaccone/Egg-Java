package entidad;

import java.util.Scanner;























public class Curso {
    
   private String nombreCurso;
   private int cantidadHorasPorDia;
   private int cantidadDiasPorSemana;
   private String turno;
   private int precioPorHora;
   private String[] alumnos= new String[5];
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Curso() {
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, int precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso + ", cantidadHorasPorDia=" + cantidadHorasPorDia + ", cantidadDiasPorSemana=" + cantidadDiasPorSemana + ", turno=" + turno + ", precioPorHora=" + precioPorHora + ", alumnos=" + alumnos + '}';
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   
    
    public void cargarAlumnos(String[] alumnos){
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el nombre del alumno n°"+(i+1)+":");
            this.alumnos[i] = leer.nextLine();
        }
    }
    
    
    public void crearCurso(){
        System.out.println("Ingrese el nombre del curso: ");
        this.nombreCurso = leer.nextLine();
        this.cargarAlumnos(alumnos);
    }
    
    public double calcularGananciaSemnal(){
        double gananciaSemanal;
        
        System.out.println("ingrese la cantidad de horas por dia: ");
        this.cantidadHorasPorDia = leer.nextInt();
        System.out.println("Ingrese el precio por hora: ");
        this.precioPorHora = leer.nextInt();
        System.out.println("Ingrese la cantidad de deias que trabajo por semana: ");
        this.cantidadDiasPorSemana = leer.nextInt();
        gananciaSemanal = this.cantidadHorasPorDia * this.precioPorHora*5*5;
        System.out.println("Su ganancia semanal es de: $"+gananciaSemanal);
        return gananciaSemanal;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
