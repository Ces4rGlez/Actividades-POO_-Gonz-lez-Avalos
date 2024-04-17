package mx.utng.ret;

public class DBA {
    //Codigo Creado Por César González

    private final String HERRAMIENTASCONSULTA;
    public DBA(String herramientasconsulta){
        this.HERRAMIENTASCONSULTA = herramientasconsulta;

    }
    public String getHERRAMIENTASCONSULTA() {
        return HERRAMIENTASCONSULTA;
    }
    public void mostrarDBA(){
        System.out.println("¬ El Administrador de Base de Datos es | "+HERRAMIENTASCONSULTA);
    }

}
