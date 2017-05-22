package ejerciciodeprogramcion;

/**
 *
 * @author Bencardino Perdomo
 */
public class Faculty extends Employee{
    private char rango;

    public Faculty(char rango, int oficina, String contratacion, String nombre, String apellido, int SALARIO) {
        super(oficina, contratacion, nombre, apellido, SALARIO);
        this.rango = rango;
        this.DecodeParameters();
    }

    public char getRango() {
        return rango;
    }

    public void setRango(char rango) {
        this.rango = rango;
    }    

    @Override
    public String toString() {
        return "FACULTY," + rango + "," + super.toString();
    }

    @Override
    public final void DecodeParameters() {
        super.DecodeParameters();
        this.setRango(this.DecodeChar(this.rango));
    }  
        
}
