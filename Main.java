public class Main {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante();

        estudiante.setNombre("Juan");
        estudiante.setEdad("20");
        estudiante.setMatricula("12345");
        estudiante.setCarrera("Ingenieria");

        System.out.println("DATOS DEL ESTUDIANTE");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Matricula: " + estudiante.getMatricula());
        System.out.println("Carrera " + estudiante.getCarrera());

        System.out.println();

        Docente docente = new Docente();

        docente.setNombre("Carlos");
        docente.setEdad("40");
        docente.setMateria("Programacion");

        System.out.println("DATOS DEL DOCENTE");
        System.out.println("Nombre: " + docente.getNombre());
        System.out.println("Edad: " + docente.getEdad());
        System.out.println("Materia: " + docente.getMateria());
    }
    
}
