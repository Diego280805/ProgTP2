public class App {
    public static void main(String[] args) throws Exception {

        Estudiante estudiante1 = new Estudiante();
        System.out.println("Datos del estudiante1:");
        estudiante1.setNombre("Juan");
        estudiante1.setApellido("Perez");
        estudiante1.setEdad(20);
        estudiante1.setDocumento("123456789");
        estudiante1.setCarrera("Ingenieria en Sistemas");
        estudiante1.setPromedio(8.5);
        estudiante1.setMateria("Programacion");
        System.out.println(estudiante1.toString());

        System.out.println("-----------------------");


        Estudiante estudiante2 = new Estudiante();
        System.out.println("Datos del estudiante2:");
        estudiante2.setNombre("aaaa");
        estudiante2.setApellido("aaaa");
        estudiante2.setEdad(22);
        estudiante2.setDocumento("222222222");
        estudiante2.setCarrera("Ingenieria en Sistemas");
        estudiante2.setPromedio(8.5);
        estudiante2.setMateria("Matematicas");
        System.out.println(estudiante2.toString());

        System.out.println("-----------------------");

        Profesor profesor1 = new Profesor();
        System.out.println("Datos del profesor:");
        profesor1.setNombre("Maria");
        profesor1.setApellido("Gomez");
        profesor1.setEdad(35);
        profesor1.setDocumento("987654321");
        profesor1.setEspecialidad("Matematicas");
        profesor1.setAñosExperiencia(10);
        profesor1.setMateriasAsignadas(5);
        System.out.println(profesor1.toString());

        System.out.println("-----------------------");

        Profesor profesor2 = new Profesor();
        System.out.println("Datos del profesor2:");
        profesor2.setNombre("Mati");
        profesor2.setApellido("Lopez");
        profesor2.setEdad(50);
        profesor2.setDocumento("100000000");
        profesor2.setEspecialidad("Lengua");
        profesor2.setAñosExperiencia(100);
        profesor2.setMateriasAsignadas(1);
        System.out.println(profesor2.toString());

        System.out.println("-----------------------");


        Materia matematicas = new Materia();
        System.out.println("Datos de la Materia:");
        matematicas.setNombre("Matematicas");
        matematicas.setCodigo("MAT101");
        matematicas.setCreditos(3);
        matematicas.setProfesor(profesor2);
        System.out.println(matematicas.toString());


        System.out.println("-----------------------");

        Personal personal1 = new Personal();
        System.out.println("Datos del Personal:");
        personal1.setNombre("Carlitos");
        personal1.setApellido("Perez");
        personal1.setEdad(30);
        personal1.setDocumento("123456789");
        personal1.setDepartamento("Ingenieria");
        personal1.setPuesto("Profesor");
        personal1.setFechaIngreso("2020-01-01");
        System.out.println(personal1.toString());
        
        System.out.println("-----------------------");


    }
}
