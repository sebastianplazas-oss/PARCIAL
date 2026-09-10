public class Persona {
     private String nombre
     private int edad;

     public personal () {
     }
    
     public void setNombre (String nombre) {
        this.nombre = nombre; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(String edad) {
        this.edad = Integer.parseInt(edad);
    }

    public int getEdad() {
        return edad;
    }
}

