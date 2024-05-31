package Personas;

public class Docente extends Persona {
    private String Titulacion;
    private double Puntuacion;

    public Docente(int ID, String Nombre, String Apellido1, String Apellido2, String Titulacion, double Puntuacion) {
        super(ID, Nombre, Apellido1, Apellido2);
        this.Puntuacion = Puntuacion;
        this.Titulacion = Titulacion;
    }


    public double getPuntuacion(){
        return Puntuacion;
    }
    @Override
    public void Muestra(){
        System.out.println("Nombre: " + this.getNombre() + "\nApellidos:" + this.getApellido1() + " " + this.getApellido2() + "\nPuntuacion: " + Puntuacion);

    }

}
