package maisprati.mapper;


import maisprati.domain.Usuario;
import maisprati.domain.UsuarioRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "jakarta",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UsuarioRequestMapper {

    UsuarioRequestMapper INSTANCE = Mappers.getMapper(UsuarioRequestMapper.class);

    @Mapping(source = "name", target = "nome")
    @Mapping(source = "lastName", target = "sobreNome")
    Usuario usuarioRequestToUsuario(UsuarioRequest usuarioRequest);

}
