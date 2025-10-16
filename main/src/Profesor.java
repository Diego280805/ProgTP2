public class Profesor extends Persona {
    private String especialidad;
    private int añosExperiencia;
    private int materiasAsignadas;


    public Profesor(){
        super();
    }

    public Profesor(String nombre, String apellido, int edad, String documento, String especialidad, int añosExperiencia, int materiasAsignadas){
        super(nombre, apellido, edad, documento);
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
        this.materiasAsignadas = materiasAsignadas;      
    }

    public String getEspecilidad(){
        return especialidad;
    }

    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }

    public int getAñosExperiencia(){
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia){
        this.añosExperiencia = añosExperiencia;
    }

    public int getMateriasAsignadas(){
        return materiasAsignadas;
    }

    public void setMateriasAsignadas(int materiasAsignadas){
        this.materiasAsignadas = materiasAsignadas;
    }

    //metodos
    public void asignarMaterias(Materia materia){
    }

    /**
     * Sobrescribe el método toString() para incluir los detalles del profesor.
     * @return Una cadena con los detalles de la persona y del profesor.
     */
    @Override
    public String toString() {
        return super.toString() + "\nEspecialidad: " + especialidad + "\nAños de Experiencia: " + añosExperiencia + "\nMaterias Asignadas: " + materiasAsignadas;
    }

}
