public class Persona{

    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String documento;
    
    //constructor

    public Persona(){}

    public Persona(String nombre, String apellido,int edad, String documento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public String getDocumento(){
        return documento;
    }
    public void setDocumento(String documento){
        this.documento = documento;
    }
    
    //metodos

    /**
     * Sobrescribe el método toString() para representar el objeto Persona como una cadena de texto.
     * @return Una cadena con los detalles de la persona.
     */
    @Override
    public String toString(){
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\nDocumento: " + documento;
    }

    /**
     * Compara esta Persona con otra basándose en su número de documento.
     * @param otraPersona El otro objeto Persona con el que comparar.
     * @return true si los documentos son iguales, false en caso contrario.
     */
    public boolean compararDNI(Persona otraPersona){
        if (otraPersona == null) {
            return false;
        }
        return this.documento.equals(otraPersona.getDocumento());
    }

    // La forma estándar en Java para comparar objetos es sobrescribir equals() y hashCode().
    @Override
    public boolean equals(Object obj) {
        // 1. Comprobar si es la misma referencia de memoria
        if (this == obj) return true;
        // 2. Comprobar si el objeto es nulo o de una clase diferente
        if (obj == null || getClass() != obj.getClass()) return false;
        // 3. Convertir el objeto y comparar los campos (en este caso, el documento)
        Persona persona = (Persona) obj;
        return documento.equals(persona.documento);
    }

    @Override
    public int hashCode() {
        // Cuando sobrescribes equals, también debes sobrescribir hashCode.
        // Se basa en los mismos campos que usaste en equals.
        return documento.hashCode();
    }
}
