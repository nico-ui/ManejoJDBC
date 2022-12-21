package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

public class TestManejoUsuarios {
    public static void main(String[] args) {
        
        
        UsuarioDAO personaDao = new UsuarioDAO();
        
        Usuario usuarioNueva = new Usuario("Nico", "1234");
        personaDao.insertar(usuarioNueva);
        
//        Persona personaNueva2 = new Persona(4, "BotRuso", "Frutas", "brf@gmail.com", "9876543210");
//        personaDao.actualizar(personaNueva2);

//        Persona personaNueva3 = new Persona(4);
//        personaDao.borrar(personaNueva3);
        
//       
//
        List<Usuario> listaUsuarios = UsuarioDAO.seleccionar();
        for (Usuario usuario : listaUsuarios) {
            System.out.println("usuario = " + usuario);
        }
//        listaUsuarios.forEach(persona -> {
//            System.out.println("persona = " + persona);
//        });
        
    }
}
