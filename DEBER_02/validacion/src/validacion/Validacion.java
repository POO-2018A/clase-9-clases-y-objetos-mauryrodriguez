/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacion;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
public class Validacion {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int cedula[]=new int [9];
        int condicion[]=new int [9];
        int resultado[]=new int [9];
        int i,suma;
        
        //System.out.println("Ingrese el limite del arreglo");
        //lim=lector.nextInt();
        System.out.println("A continuacion validaremos su cedula ¡¡");
        System.out.println("\n");
        System.out.println("¡¡PORFAVOR DIGITE SUS NUMEROS DE UNO EN UNO¡¡");
        System.out.println();
        for(i=0; i<9; i++){
            System.out.print("Digito ["+(i+1)+"]= ");
            cedula[i]=lector.nextInt();
        }
        
        for(i =0; i<9; i++){
            System.out.print("Digito ["+(i+1)+"] multiplicado X: ");
            condicion[i]=lector.nextInt();
            resultado[i]=cedula[i]*condicion[i];
        }
        System.out.println("\n");
        System.out.print("Su cedula es: ");
        for(i=0; i<9; i++){
            System.out.print(cedula[i]+"  ");
        }
        System.out.println();
        System.out.print("             ");
        for (i=0; i<9; i++){
            System.out.print(" ");
            System.out.print("x ");
        }
        
        System.out.println();
        System.out.print("              ");
        for(i=0; i<9; i++){
            System.out.print(condicion[i]+"  ");
        }
        
        System.out.println();
        System.out.print("              ");
        for (i=0; i<9; i++){
            System.out.print("---");
        }
        System.out.println(); 
        System.out.print("Resultado:    ");
        for(i=0; i<9; i++){
            System.out.print(resultado[i]+"  ");
        }
        System.out.println();
        System.out.println("SI cualquier numero es mayor a 10 se le restara 9");
        System.out.println();
        System.out.println("Por tanto ¡¡ ");
        
        System.out.println("\n");
        System.out.print("Los nuevos Resultados son:  ");
        for(i=0; i<9; i++){
		System.out.print(resultado[i]+"  ");
		if(resultado[0]>10){
			resultado[0]=resultado[0]-9;	
		}else{
		}
		if(resultado[1]>10){
			resultado[1]=resultado[1]-9;
		}else{
		}
		if(resultado[2]>10){
			resultado[2]=resultado[2]-9;
		}else{
		}
		if(resultado[3]>10){
			resultado[3]=resultado[3]-9;
		}else{
		}
		if(resultado[4]>10){
			resultado[4]=resultado[4]-9;
		}else{
		}
		if(resultado[5]>10){
			resultado[5]=resultado[5]-9;
		}else{
		}
		if(resultado[6]>10){
			resultado[6]=resultado[6]-9;
		}else{
		}
		if(resultado[7]>10){
			resultado[7]=resultado[7]-9;
		}else{
		}
		if(resultado[8]>10){
			resultado[8]=resultado[8]-9;
		}else{
		}
	}
        System.out.println();
        suma = resultado[0]+resultado[1]+resultado[2]+resultado[3]+
                resultado[4]+resultado[5]+resultado[6]+resultado[7]+
                resultado[8];
        System.out.println("La suma de los resultados es: "+suma);
        System.out.println();
        
    }
    
}
