public class Materia {
    private String nombre;
    private String codigo;
    private int creditos;
    private Profesor profesor;

    //constructor
    public Materia() {
    }


    public Materia(String nombre, String codigo, int creditos, Profesor profesor) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.profesor = profesor;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Profesor getProfesor() {
        return profesor;
    }
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    //metodos
    /**
     * Sobrescribe el método toString() para representar el objeto Materia como una cadena de texto.
     * @return Una cadena con los detalles de la materia.
     */
    @Override
    public String toString() {
        return "Materia: " + nombre + "\nCodigo: " + codigo + "\nCreditos: " + creditos + "\nProfesor: " + (profesor != null ? profesor.getNombre() + " " + profesor.getApellido() : "No asignado");
    }
    

}
