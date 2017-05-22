package punto2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Bencardino Perdomo
 */
public class Excepciones {
    
    public void a(PrintStream p) {
        try{
            System.out.println(1 / 0);
        } catch (RuntimeException e){
            p.println("a throws RuntimeException.");
            System.out.println("a throws RuntimeException.");
        }
    }
    
    public void b(PrintStream  p) {
        try{
            int[] list;
            list = new int[5];
            System.out.println(list[5]);
        } catch (RuntimeException e) {
            p.println("b throws RuntimeExpection.");
            System.out.println("b throws RuntimeExpection.");
        }
    }
    
    public void c(PrintStream p) {
        try {
            String s = "abc";
            System.out.println(s.charAt(3));
        } catch (RuntimeException e) {
            p.println("c throws RuntimeException.");
            System.out.println("c throws RuntimeException.");
        }
    }
    
    public void d(PrintStream p) {
        try {
            Object o = new Object();
            String d = (String) o;
        } catch (RuntimeException e) {
            p.println("d throws RuntimeExcpetion.");
            System.out.println("d throws RuntimeExcpetion.");
        }
        
    }
    
    public void e(PrintStream p) {
        try {
            Object o = null;
            System.out.println(o.toString());
        } catch (RuntimeException e) {
            p.println("e throws RuntimeException.");
            System.out.println("e throws RuntimeException.");
        }
    }
    
    public void f(PrintStream p) {
        try {
            System.out.println(1.0 / 0);
        } catch (RuntimeException e) {
            p.println("f throws RuntimeException.");
            System.out.println("f throws RuntimeException.");
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
        
        Excepciones e = new Excepciones();
        
        salida.println(texto);
        salida.println("Punto 2 b)");
        System.out.println("Punto 2b)\n");
        salida.println("varios de los codigos presentados presentan la Excepcion RuntimeException\n");
        e.a(salida);
        e.b(salida);
        e.c(salida);
        e.d(salida);
        e.e(salida);
        e.f(salida);
        
        salida.close();
    }
}
