package Strategy;

import Strategy.clases.AnalisisCompleto;
import Strategy.clases.AnalisisRapido;
import Strategy.clases.Antivirus;
import java.util.Scanner;

public class main {
    
    public static void main(String[] args){
        
        Antivirus antivirus = new Antivirus();
        
        
        System.out.println("#1 : Analisis rapido");
        System.out.println("#2 : Analisis completo");
        Scanner entrada = new Scanner(System.in);   
        
        int opcion = entrada.nextInt();
        
        switch(opcion){
           
            case 1: 
                antivirus.setAnalisis(new AnalisisRapido () );
                break;
            case 2: 
                antivirus.setAnalisis(new AnalisisCompleto () ); 
                break;
        }
        antivirus.AnalizarPc();
    }
    
}
