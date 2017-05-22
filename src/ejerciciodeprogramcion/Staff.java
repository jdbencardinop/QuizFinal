package ejerciciodeprogramcion;

/**
 *
 * @author Bencardino Perdomo
 */
public class Staff extends Employee {
    private String titulo;

    public Staff(String titulo, int oficina, String contratacion, String nombre, String apellido, int SALARIO) {
        super(oficina, contratacion, nombre, apellido, SALARIO);
        this.titulo = titulo;
        this.DecodeParameters();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }    

    @Override
    public String toString() {
        return "STAFF," + titulo + "," + super.toString();
    }

    @Override
    public final void DecodeParameters() {
        super.DecodeParameters();
        this.setTitulo(this.DecodeString(this.titulo));
    }
    
}
