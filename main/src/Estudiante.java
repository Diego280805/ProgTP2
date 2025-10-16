public class Estudiante extends Persona{
    private String carrera;
    private double promedio;
    private String materias;

    //constructores
    public Estudiante(){
        super();
    }
    public Estudiante(String carrera,double promedio ,String materias, String nombre, String apellido, int edad, String documento){
        super(nombre, apellido, edad, documento);
        this.carrera = carrera;
        this.promedio = promedio;
        this.materias = materias;
    }

    //getters y setters
    public String getCarrera(){
        return carrera;
    }
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }

    public double getPromedio(){
        return promedio;
    }
    public void setPromedio(double promedio){
        this.promedio = promedio;
    }

    public String getMateria(){
        return materias;
    }
    public void setMateria(String materias){
        this.materias = materias;
    }

    //metodos
    /**
     * Sobrescribe el método toString() para incluir los detalles del estudiante.
     * @return Una cadena con los detalles de la persona y del estudiante.
     */
    @Override
    public String toString() {
        return super.toString() + "\nCarrera: " + carrera + "\nPromedio: " + promedio + "\nMateria: " + materias;
    }
}
