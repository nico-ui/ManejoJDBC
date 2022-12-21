package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

public class TestManejoUsuarios {
    public static void main(String[] args) {
        
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        Usuario usuarioNueva = new Usuario("David", "contra");
        usuarioDAO.insertar(usuarioNueva);
        
//        Usuario usuario2 = new Usuario(2, "BotRuso", "Frutas");
//        usuarioDAO.actualizar(usuario2);

//        Usuario usuarioBorrar =  new Usuario(2);
//        usuarioDAO.borrar(usuarioBorrar);
//       
//
        List<Usuario> listaUsuarios = usuarioDAO.seleccionar();
        for (Usuario usuario : listaUsuarios) {
            System.out.println("usuario = " + usuario);
        }
//        listaUsuarios.forEach(persona -> {
//            System.out.println("persona = " + persona);
//        });
        
    }
}
