package clasearchivo;

import java.util.Date;
import java.util.GregorianCalendar;

public class ClaseArchivo {
    
    private String nombre;
    private String tipo;
    private Date fechaCreacion;
    private String contenido;
    
    public ClaseArchivo(String nombre, int dia, int mes, int año){
        this.nombre=nombre;
        GregorianCalendar  calendario = new GregorianCalendar (dia, mes-1, año);
        fechaCreacion=calendario.getTime();
    }
    
    public ClaseArchivo(String nombre, String tipo, int dia, int mes, int año){
        this.nombre=nombre;
        this.tipo=tipo;
        GregorianCalendar  calendario = new GregorianCalendar (dia, mes-1, año);
        fechaCreacion=calendario.getTime();
    }
    
    public ClaseArchivo(String nombre, String tipo, int dia, int mes, int año, String contenido){
        this.nombre=nombre;
        this.tipo=tipo;
        GregorianCalendar  calendario = new GregorianCalendar (dia, mes-1, año);
        fechaCreacion=calendario.getTime();
        this.contenido=contenido;
    }
    
    public String getNombre(){
		return "Nombre del archivo: "+nombre;
	}
    public String getTipo(){
		return "Tipo de archivo: "+tipo;
	}
    
    public String getFechaCreacion(){
        return "Fecha de creacion: "+fechaCreacion;
    }
    
    public void setContenido(String contenido){
        this.contenido=contenido;
    }
    public String getContenido(){
		return "Contenido: "+contenido;
	}

    public static void main(String[] args) {
        ClaseArchivo objeto1 = new ClaseArchivo("Practica",07,05,2018);
        System.out.println("A Continuacion presentamos ClaseArchivo");
        System.out.println("\n");
        
        System.out.println("Objeto Nº 1");
        System.out.println();
        System.out.println(objeto1.getNombre());
        System.out.println(objeto1.getFechaCreacion());
        System.out.println("\n");
        
        ClaseArchivo objeto2 = new ClaseArchivo("Repaso Clase_05",".pdf",27,02,2005);
        System.out.println("Objeto Nº 2");
        System.out.println();
        System.out.println(objeto2.getNombre());
        System.out.println(objeto2.getTipo());
        System.out.println(objeto2.getFechaCreacion());
        
        System.out.println("\n");
        ClaseArchivo objeto3 = new ClaseArchivo("Deber_02",".java",20,05,2017,"Vacio");
        System.out.println("Objeto Nº 3");
        System.out.println();
        objeto3.setContenido("Mauricio Rodriguez");
        System.out.println(objeto3.getNombre());
        System.out.println(objeto3.getTipo());
        System.out.println(objeto3.getContenido());
        System.out.println(objeto3.getFechaCreacion());
        
    }
    
}
