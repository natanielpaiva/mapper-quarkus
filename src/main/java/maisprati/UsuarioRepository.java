package maisprati;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;


@ApplicationScoped
public class UsuarioRepository {

    public static List<Usuario> LISTA_USUARIOS = new ArrayList<>();

    public Usuario cadastroUsuario(Usuario usuario){
        LISTA_USUARIOS.add(usuario);
        return usuario;
    }

}
