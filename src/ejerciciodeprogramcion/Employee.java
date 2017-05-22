package ejerciciodeprogramcion;

/**
 *
 * @author Bencardino Perdomo
 */
public abstract class Employee extends Person{
    protected int oficina;
    protected String contratacion;

    public Employee(int oficina, String contratacion, String nombre, String apellido, int SALARIO) {
        super(nombre, apellido, SALARIO);
        this.oficina = oficina;
        this.contratacion = contratacion;
    }

    public int getOficina() {
        return oficina;
    }

    public void setOficina(int oficina) {
        this.oficina = oficina;
    }

    public String getContratacion() {
        return contratacion;
    }

    public void setContratacion(String contratacion) {
        this.contratacion = contratacion;
    }

    @Override
    public String toString() {
        return oficina + "," + contratacion + "," + super.toString();
    }   
    
}
