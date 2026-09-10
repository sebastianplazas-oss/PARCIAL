public class Docente extends persona {

    private String materia;

    public Docente () {
    }

    public void serMateria(String materia) {
        this.materia = materia;
    }
    
    public String getMateria() {
        return materia;
    }
}
