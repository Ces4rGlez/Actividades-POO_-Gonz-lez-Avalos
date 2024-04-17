package mx.utng.sc08;
//Código Creado Por González César

public class Alumno {

    private String curso;
    private byte sesion;
    private String objetivo;

    {
        curso= "Programación Orienta a Objetos";
        sesion=8;
        objetivo="Aprender el Paradigma Orientado a Objetos";
    }
    {
        curso="Como Pintar uñas";
        objetivo="Ganar dinero";
    }
    
    public String getCurso() {
        return curso;
    }
    public byte getSesion() {
        return sesion;
    }
    public String getObjetivo() {
        return objetivo;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setSesion(byte sesion) {
        this.sesion = sesion;
    }
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
    
   



}
