package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

public class TestManejoUsuarios {
    public static void main(String[] args) {
        
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
//        Usuario usuarioNueva = new Usuario("Nico", "1234");
//        usuarioDAO.insertar(usuarioNueva);
        
        Usuario usuario2 = new Usuario(2, "BotRuso", "Frutas");
        usuarioDAO.actualizar(usuario2);

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
