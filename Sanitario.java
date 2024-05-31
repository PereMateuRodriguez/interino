package Personas;

public class Sanitario extends Persona {
    private String Especialidad;
    private int DiasTrabjado;

    public Sanitario(int ID, String Nombre, String Apellido1, String Apellido2, String Especialidad, int DiasTrabajado) {
        super(ID, Nombre, Apellido1, Apellido2);
        this.Especialidad = Especialidad;
        this.DiasTrabjado = DiasTrabajado;
    }

    public int getDiasTrabjado(){
        return DiasTrabjado;
    }
    @Override
    public void Muestra(){
        System.out.println("Nombre: " + this.getNombre() + "\nApellidos:" + this.getApellido1() + " " + this.getApellido2() + "\nDias cotizados: " + DiasTrabjado);
    }
}
