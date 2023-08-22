package maisprati;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "jakarta",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, imports = ConverterMaiorIdade.class)
public interface UsuarioResponseMapper {

    @Mapping(source = "nome", target = "name")
    @Mapping(source = "sobreNome", target = "lastName")
    @Mapping(source = "idade", target = "age")
    @Mapping(expression = "java(ConverterMaiorIdade.converter(usuario.getMaiorIdade()))", target = "fullAge")
    UsuarioResponse usuarioToUsuarioResponse(Usuario usuario);

}
