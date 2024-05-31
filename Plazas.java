import Personas.Docente;
import Personas.Persona;
import Personas.Sanitario;

import java.util.ArrayList;

public class Plazas {
    private int id;
    private String Tipo;
    private boolean Adjudica = false;
    private Persona p;

    public Plazas(String Tipo, int id){
        this.id = id;
        this.Tipo = Tipo;
        this.Adjudica = false;
    }
    public Plazas (String Tipo, int id, Persona p ){
        // Si es TRUE == Docente y FALSE == Sanitario
        this.Tipo = TipoPersona();
        this.id = id;
        this.p = p;
    }

    // Miramos el Tipo de la persona
    public String TipoPersona(){
        if (p instanceof Docente){
            return "D";
        }
        else{
            return "S";
        }
    }

    //Adjuantamos la plaza a Persona
    public void AdjusntarPlaza(ArrayList<Persona> ListaPersona, ArrayList<Plazas> ListaPlazas){
        for (int h = 0 ; h < ListaPlazas.size(); h++){
            for(int i = 0; i < ListaPersona.size();i++){

                // Profesors
                if (ListaPersona.get(i) instanceof Docente){
                    int valorEliminadr = -1;
                    //Buscamos al Docente mejor
                    Docente p1 = (Docente) ListaPersona.get(i);
                    for (int j =0; j < ListaPersona.size(); j++ ){
                        if (ListaPersona.get(i) instanceof Docente && p1.getPuntuacion() < ListaPersona.get(j).getContador() ){
                            p1 = (Docente) ListaPersona.get(j);
                            valorEliminadr = j;
                        }
                    }
                    //Metemos al Mejor Docente en su Plaza
                    ListaPlazas.get(h).p = p1;
                    if (valorEliminadr >= 0){
                        ListaPersona.remove(ListaPersona.get(valorEliminadr));

                    }
                }
                // Sanitario
                else {
                    int valorEliminadr = -1;
                    Sanitario s1 = (Sanitario) ListaPersona.get(i);
                    for (int j =0; j < ListaPersona.size(); j++ ) {
                        Sanitario s2 = (Sanitario) ListaPersona.get(j);
                        if (ListaPersona.get(i) instanceof Sanitario && s1.getDiasTrabjado() <  s2.getDiasTrabjado()) {
                            s1 = (Sanitario) ListaPersona.get(j);
                            valorEliminadr = j;
                        }
                    }
                    ListaPlazas.get(h).p = s1;
                    if (valorEliminadr >= 0){
                        ListaPersona.remove(ListaPersona.get(valorEliminadr));
                    }
                }

            }

        }

    }
    public void Muestras(){
        System.out.println("Tipo: " + Tipo + "\n ID: " + id + "Persona:" );
        p.Muestra();
    }
    public void mostrarAdjuncaciones(ArrayList <Plazas> ListaPlazas){
        for(int i = 0; i < ListaPlazas.size(); i++){
            if (ListaPlazas.get(i).p instanceof Sanitario){
                ListaPlazas.get(i).Muestras();
            }
        }
        for (int i  = 0 ; i < ListaPlazas.size();i++){
            if (ListaPlazas.get(i).p instanceof Docente){
                ListaPlazas.get(i).Muestras();
            }
        }

    }

}
