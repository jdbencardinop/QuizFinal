
package punto3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Bencardino Perdomo
 */
public class VerdaderoFalso extends ClaseA{
    public void m1(String[] args) {
        System.out.println(i);
        m();
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
        
        salida.println(texto);
        salida.println("Punto 3 b)\n");
        System.out.println("Punto 3b)\n");
        salida.println("a) Verdadero\n");
        salida.println("b) Falso\n");
        salida.println("c) Verdadero\n");
        
        salida.close();
    }
}
