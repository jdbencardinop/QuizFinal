package ejerciciodeprogramcion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;


/**
 *
 * @author Bencardino Perdomo
 */
public class MainEjercicioQuiz {
    public static void main(String[] args) throws StatusInputException {
        Universidad u = new Universidad("Universidad S.A.", "datos.txt");
        try {
            u.HacerTodo(new PrintStream(new File("SalidaDatos.txt")));
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
        }
        u.HacerTodo(System.out);        
    }
}
