package com.example.projetoapi;

import com.example.projetoapi.modelo.Curso;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CursoMapeamento {

    Curso cursoDTOToCurso(CursoDTO cursoDTO);
    CursoDTO cursoToCursoDTO(Curso curso);
}
