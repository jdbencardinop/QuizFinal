package ejerciciodeprogramcion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Bencardino Perdomo
 */
public class Universidad {

    private String nombre;
    private String path;
    private Scanner entrada;
    private ArrayList<Person> personas;

    public Universidad(String nombre, String path) throws StatusInputException {
        this.nombre = nombre;
        this.path = path;
        try {
            this.entrada = new Scanner(new File(path));
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Foud");
        }
        this.personas = new ArrayList<>();
        this.PopulatePersonas();
    }

    private void PopulatePersonas() throws StatusInputException {
        this.entrada.useDelimiter(",");
        int i = 0;
        while (entrada.hasNextLine()) {
            String sig = entrada.next();
            if (sig.equalsIgnoreCase("STUDENT")) {
                this.AddPerson(new Student(entrada.next(), entrada.next(), entrada.next().charAt(0), entrada.nextInt()));
            } else if (sig.equalsIgnoreCase("FACULTY")) {
                this.AddPerson(new Faculty(entrada.next().charAt(0), entrada.nextInt(), entrada.next(), entrada.next(), entrada.next(), entrada.nextInt()));
            } else if (sig.equalsIgnoreCase("STAFF")) {
                this.AddPerson(new Staff(entrada.next(), entrada.nextInt(), entrada.next(), entrada.next(), entrada.next(), entrada.nextInt()));
            } 
            entrada.nextLine();
        } 
    }

    public int SalarioGerentes() {
        int total = 0;
        total = personas.stream().filter((persona)
                -> (persona instanceof Staff)).map((persona)
                -> (Staff) persona).filter((p)
                -> (p.getTitulo().equalsIgnoreCase("Gerente"))).map((p)
                -> p.getSALARIO()).reduce(total, Integer::sum);
        return total;
    }

    public int SalarioEmpleados() {
        int total = 0;
        total = personas.stream().filter((persona)
                -> (persona instanceof Employee)).map((persona)
                -> persona.getSALARIO()).reduce(total, Integer::sum);
        return total;
    }

    public String ListarTodos() {
        String s = "";
        for (Person persona : personas) {
            if (persona instanceof Student) {
                s += ((Student) persona).toString() + "\n";
            } else if (persona instanceof Faculty) {
                s += ((Faculty) persona).toString() + "\n";
            } else {
                s += ((Staff) persona).toString() + "\n";
            }
        }
        return s;
    }

    public void HacerTodo(PrintStream ps) {
        ps.println(this.nombre + "\n\na) Todas las Personas:\n");
        ps.println(this.getPersonas().size() + "\n");
        ps.println(this.ListarTodos() + "\n");
        ps.println("Salario total de todos los Staff cuyo Titulo es Gerente:\n");
        ps.println("" + this.SalarioGerentes() + "\n");
        ps.println("Salario totald e todos los empleados:\n");
        ps.println("" + this.SalarioEmpleados() + "\n");
        ps.println("Quiz resuelto por Juan Diego Bencardino Perdomo");
    }

    public void EncriptarTodo() {
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i) instanceof Student) {
                ((Student) personas.get(i)).CodeParameters();
            } else if (personas.get(i) instanceof Faculty) {
                ((Faculty) personas.get(i)).CodeParameters();
            } else {
                ((Staff) personas.get(i)).CodeParameters();
            }
        }
    }

    public void DecodificarTodo() {
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i) instanceof Student) {
                ((Student) personas.get(i)).DecodeParameters();
            } else if (personas.get(i) instanceof Faculty) {
                ((Faculty) personas.get(i)).DecodeParameters();
            } else {
                ((Staff) personas.get(i)).DecodeParameters();
            }
        }
    }

    public void AddPerson(Person p) {
        this.personas.add(p);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public ArrayList<Person> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Person> personas) {
        this.personas = personas;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
