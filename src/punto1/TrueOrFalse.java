package punto1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *
 * @author Bencardino Perdomo
 */
public class TrueOrFalse {
    
    private final boolean[] respuestas;    
    
    public TrueOrFalse() {
        
        this.respuestas = new boolean[13];
        
        this.respuestas[0]  = true;
        this.respuestas[1]  = false;
        this.respuestas[2]  = true;
        this.respuestas[3]  = true;        
        this.respuestas[4]  = false;
        this.respuestas[5]  = false;
        this.respuestas[6]  = false;
        this.respuestas[7]  = true;
        this.respuestas[8]  = false;
        this.respuestas[9]  = true;
        this.respuestas[10] = true;
        this.respuestas[11] = false;
        this.respuestas[12] = false;        
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        
        PrintStream salida;
        salida = new PrintStream(new File("RespuestasQuizFinal.txt"));
        TrueOrFalse tof = new TrueOrFalse();
        
        salida.println("\nJuan Diego Bencardino Perdomo\n\tQuiz Final POO\n");
        salida.println("Punto 1\n");     
        
        for (int i = 0; i < tof.respuestas.length; i++) {
            System.out.println((char)(97 + i) + ") " + tof.respuestas[i]);
            salida.println((char)(97 + i) + ") " + tof.respuestas[i] + ".");
        }
        
        salida.close();
    }
}
