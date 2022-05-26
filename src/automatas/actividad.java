package automatas;
import java.util.Scanner;
 
 
public class actividad {
 
    static char [] caracteres;
    boolean aceptacion;
    int contador;
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        actividad automata = new actividad();
        
        System.out.println("Ingrese La cadena");
 
        String cad;
 
        cad = sc.nextLine();
        caracteres = cad.toCharArray();
        automata.Inicial();
        
        if(automata.aceptacion){
            System.out.println("\n");
            System.out.println("La Cadena es Valida");
        }else{
            System.out.println("\n");
            System.out.println("La Cadena es Invalida");
        }
    }
 
 
 
    public void Inicial() {
        contador = 0; //Declaramos en 0 para empezar las transiciones
        q0();
    }
 
 
    public void q0() {
        aceptacion = false;
        if(contador<caracteres.length){
            if(caracteres[contador]== '0'){
                System.out.println("Estado q0");
                contador++;
                q0(); 
 
            }else if (caracteres[contador]=='1'){
                contador++;
                System.out.println("Estado q0");
                q1();
            }
        }
    }
    public void q1() {
        aceptacion = false;
        if(contador<caracteres.length){
            if(caracteres[contador]== '1'){
                System.out.println("Estado q1");
                contador++;
                q1(); 
 
            }else if (caracteres[contador]=='0'){
                contador++;
                System.out.println("Estado q1");
                q2();
            }
        }
    }
    
    public void q2() {
        aceptacion = false;
        if(contador<caracteres.length){
            if(caracteres[contador]== '1'){
                System.out.println("Estado q2");
                contador++;
                q3(); 
 
            }else if (caracteres[contador]=='0'){
                contador++;
                System.out.println("Estado q2");
                q2();
            }
        }
    }
    public void q3(){
        aceptacion = false;
        if(contador<caracteres.length){
            if(caracteres[contador]== '0'){
                System.out.println("Estado q3");
                contador++;
                q4(); 
 
            }else if (caracteres[contador]=='1'){
                contador++;
                System.out.println("Estado q3");
                q3();
            }
        }
    }
    
    
    
    
    public void q4() {
        if(contador<caracteres.length){
            if(caracteres[contador]== '0'){
                System.out.println("Estado q4");
                contador++;
                q4(); 
            }
        }
        else if(contador==caracteres.length){
            aceptacion = true;
            System.out.println("Estado q4 de aceptación"); 
        }else if(contador<caracteres.length){
            for(int i=2; i<=caracteres.length;i++){
                if(caracteres[i]==1){
                    aceptacion = false;
                }
            }           
        }
    }
}

        