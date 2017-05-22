package punto2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Bencardino Perdomo
 */
public class Salidas {
    
    public void a(PrintStream out) {
        for (int i = 0; i < 2; i++) {
            out.print(i + " ");
            System.out.print(i + " ");
            try{
                out.println(1 / 0);
                System.out.println(1 / 0);
            } catch (Exception e){                
            }
        }
    }
    
    public void b(PrintStream out) {
        try {
            for (int i = 0; i < 2; i++) {
                out.print(i + " ");
                System.out.print(i + " ");
                out.println(1 / 0);
                System.out.println(1 / 0);
            }
        } catch (Exception e) {
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner entrada;
        entrada = new Scanner(new File("RespuestasQuizFinal.txt"));
        
        String texto = "";
        
        while(entrada.hasNextLine()){
            texto += entrada.nextLine() + "\n";            
        }
        System.out.println(texto);
        entrada.close();
        
        PrintStream salida;
        salida = new PrintStream(new File("RespuestasQuizFinal.txt"));
        
        Salidas s = new Salidas();
        
        salida.println(texto);
        salida.println("Punto 2 a)");
        System.out.println("Punto 2a)\n");
        salida.print("a) ");
        System.out.println("a) \n");
        s.a(salida);
        salida.print(".");
        salida.print("\nb) ");
        System.out.println("\n\nb) \n");
        s.b(salida);
        salida.print(".");
        
        salida.close();
    }
}
