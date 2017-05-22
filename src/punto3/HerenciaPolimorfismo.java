package punto3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Bencardino Perdomo
 */
public class HerenciaPolimorfismo {
    public static void main(String[] args) throws FileNotFoundException {
        B b = new B();
        
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
        salida.println("Punto 3 a)\n");
        System.out.println("Punto 3a)\n");
        salida.println("La salida de ejecutar C de (a) es: \"A´s no-arg constructor is invoked\".\n");
        salida.println("El problema de compilacion presentado en (b) es que:\nEl constructor de A pide un argumento que nunca se le pasa\nporque ningun constructor de B le pasa ese argumento\n");
        
        salida.close();
    }
}

class A {
    public A(){
        System.out.println(
                "A´s no-arg constructor is invoked");
    }
}

class B extends A{    
}