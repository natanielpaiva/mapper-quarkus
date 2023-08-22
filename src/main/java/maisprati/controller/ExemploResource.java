package maisprati.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import maisprati.domain.UsuarioRequest;
import maisprati.domain.UsuarioResponse;
import maisprati.mapper.UsuarioRequestMapper;
import maisprati.mapper.UsuarioResponseMapper;
import maisprati.repository.UsuarioRepository;

@Path("/exemplo")

public class ExemploResource {

    @Inject
    UsuarioRequestMapper usuarioRequestMapper;

    @Inject
    UsuarioRepository usuarioRepository;

    @Inject
    UsuarioResponseMapper usuarioResponseMapper;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public UsuarioResponse cadastraUsuario(UsuarioRequest usuarioRequest){
        var usuario = usuarioRequestMapper.usuarioRequestToUsuario(usuarioRequest);
        var usuarioCadastro = usuarioRepository.cadastroUsuario(usuario);
        return usuarioResponseMapper.usuarioToUsuarioResponse(usuarioCadastro);
    }
}
