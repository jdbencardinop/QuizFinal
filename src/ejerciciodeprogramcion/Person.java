package ejerciciodeprogramcion;

/**
 *
 * @author Bencardino Perdomo
 */
public abstract class Person {
    protected String nombre, apellido;
    protected int SALARIO;

    public Person(String nombre, String apellido, int SALARIO) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.SALARIO = SALARIO;
        System.out.println("Persona creada");
    }
    
    public void DecodeParameters() {
        this.setNombre(this.DecodeString(this.nombre));
        this.setApellido(this.DecodeString(this.apellido));
    }
    
    public void CodeParameters() {
        this.setNombre(this.CodeString(this.nombre));
        this.setApellido(this.CodeString(this.apellido));
    }
    
    public char DecodeChar(char a) {
        int c = ((int) a);
        if (c >= 97 && c <= 122) {
            if (c >= 97 && c <= 99) {
                c = (c - 100) % 26 + 97 + 26;
            } else {
                c = (c - 100) % 26 + 97;
            }
        } else if (c >= 65 && c <= 90) {
            if (c >= 65 && c <= 67) {
                c = (c - 68) % 26 + 65 + 26;
            } else {
                c = (c - 68) % 26 + 65;
            }
        }
        return (char) c;
    }

    public char CodeChar(char a) {
        int p = ((int) a);
        if (p >= 97 && p <= 122) {
            p = (p - 94) % 26 + 97;
        } else if (p >= 65 && p <= 90) {
            p = (p - 62) % 26 + 65;
        }
        return (char) p;
    }

    public String DecodeString(String s) {
        String c = "";
        for (int i = 0; i < s.length(); i++) {
            if (((int) s.charAt(i) >= 97 && (int) s.charAt(i) <= 123) ||
                    ((int) s.charAt(i) >= 65 && (int) s.charAt(i) <= 90)){
                c += this.DecodeChar(s.charAt(i));
            } else {
                c += s.charAt(i);
            }
        }
        return c;
    }

    public String CodeString(String s) {
        String p = "";
        for (int i = 0; i < s.length(); i++) {
            if (((int) s.charAt(i) >= 97 && (int) s.charAt(i) <= 123) ||
                    ((int) s.charAt(i) >= 65 && (int) s.charAt(i) <= 90)){
                p += this.CodeChar(s.charAt(i));
            } else {
                p += s.charAt(i);
            }
        }
        return p;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSALARIO() {
        return SALARIO;
    }

    public void setSALARIO(int SALARIO) {
        this.SALARIO = SALARIO;
    }

    @Override
    public String toString() {
        return nombre + "," + apellido + "," + SALARIO + ",";
    }    
    
}
