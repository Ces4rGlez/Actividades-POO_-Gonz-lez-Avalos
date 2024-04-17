package mx.utng.ret;
//Codigo Creado Por César González

public class Empleado {
    private final float SALARIO;

    public Empleado(float salario){
        this.SALARIO = salario;

    }

    public float getSALARIO() {
        return SALARIO;
    }
    public void mostrarSalario(){
        System.out.println("¬ Salario del Empleado: $"+SALARIO);
    }


}
