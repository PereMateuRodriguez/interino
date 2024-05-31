package Personas;

public abstract class Persona {
    private int ID;
    private String Nombre;
    private String Apellido1;
    private String Apellido2;
    private static int Contador;


    public Persona(int ID,  String Nombre, String Apellido1, String Apellido2){
        this.ID = ID;
        this.Nombre = Nombre;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.Contador = this.Augmentarcontador() ;
    }

    public static int Augmentarcontador(){
        int numero = Contador + 1;
        return numero;
    }

    public String getNombre(){
        return Nombre;
    }
    public String getApellido1(){
        return Apellido1;
    }
    public String getApellido2(){
        return Apellido2;
    }
    public int getContador(){
        return Contador;
    }
    public abstract void Muestra();
}
