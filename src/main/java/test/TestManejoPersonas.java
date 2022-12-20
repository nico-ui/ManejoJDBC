package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        
        Persona personaNueva = new Persona("Ruso", "Vegetales", "rv@gmail.com", "1234567890");
        personaDao.insertar(personaNueva);
        
        List<Persona> listaPersonas = personaDao.seleccionar();
//        for (Persona persona : listaPersonas) {
//            System.out.println("persona = " + persona);
//        }
        listaPersonas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
        
    }
}
