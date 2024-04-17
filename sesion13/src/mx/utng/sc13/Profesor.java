package mx.utng.sc13;

public class Profesor extends Persona {
    private String idProfesor;

    public Profesor(String nombre, String apellidos, String idProfesor){
        super(nombre, apellidos);
        this.idProfesor = idProfesor;

    }

    public String getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    @Override
    public String getNombre() {
        // TODO Auto-generated method stub
        return super.getNombre();
    }

  
   
}
