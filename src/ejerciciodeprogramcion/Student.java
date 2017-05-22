package ejerciciodeprogramcion;

/**
 *
 * @author Bencardino Perdomo
 */
public class Student extends Person{
    
    private char status;

    public Student(String nombre, String apellido, char status, int SALARIO) throws StatusInputException {
        super(nombre, apellido, SALARIO);
        this.status = status;
        this.DecodeParameters();
        String test = "FSJfsj";
        if (!test.contains("" + this.status)) {
            throw new StatusInputException();
        }
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }    

    @Override
    public final void DecodeParameters() {
        super.DecodeParameters();
        this.setStatus(this.DecodeChar(this.status));
    }    

    @Override
    public void CodeParameters() {
        super.CodeParameters();
        this.setStatus(this.CodeChar(this.status));
    }

    @Override
    public String toString() {
        return "STUDENT," + nombre + "," + apellido + "," + status + "," + SALARIO + ",";
    }
    
}
