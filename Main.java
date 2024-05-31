import Personas.Docente;
import Personas.Persona;
import Personas.Sanitario;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Docente Profe1 = new Docente(2, "PEPE", "Mateu", "Rodriguez" , "Informatico", 5.1);
        Docente Profe2 = new Docente(2, "PEPE", "Mateu", "Rodriguez" , "Informatico", 5.1);
        Sanitario Sani1 = new Sanitario(2, "Pere", "Doc", "a", "Manos", 3);
        Sanitario Sani2 = new Sanitario(3, "Pe3re", "Do3c", "3a", "Ma3nos", 34);

        ArrayList <Persona> ListaPersona = new ArrayList<>();
        ListaPersona.add(Profe1);
        ListaPersona.add(Profe2);
        ListaPersona.add(Sani1);
        ListaPersona.add(Sani2);


        Plazas p1 = new Plazas("D", 2);
        Plazas p2 = new Plazas("D", 1);
        Plazas p3 = new Plazas("D", 3);
        Plazas p4 = new Plazas("S", 4);
        Plazas p5 = new Plazas("S", 5);
                          

        ArrayList <Plazas> ListaPlazas = new ArrayList<>();



    }
}