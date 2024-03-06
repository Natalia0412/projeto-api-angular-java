package com.example.projetoapi;

import com.example.projetoapi.erros.RecursoNaoEncontrado;
import com.example.projetoapi.modelo.Curso;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class CursoServico {
    private final CursoRespositorio cursoRespositorio;

    private final CursoMapeamento cursoMapeamento;

    public CursoServico(CursoRespositorio cursoRespositorio, CursoMapeamento cursoMapeamento) {
        this.cursoRespositorio = cursoRespositorio;
        this.cursoMapeamento = cursoMapeamento;
    }

    public  Curso criarCurso (CursoDTO cursoDto){
        return cursoRespositorio.save(cursoMapeamento.cursoDTOToCurso(cursoDto));
    }

    public List<Curso> listarCursos(){
        return cursoRespositorio.findAll();
    }

    public Optional<Curso> retornarCurso(Long id) {
        return cursoRespositorio.findById(id);
    }

    public Curso alterCurso(Long id, CursoDTO dto) {
        Curso cursoExistente = this.retornarCurso(id).orElseThrow(()-> new RecursoNaoEncontrado("Curso não encontrado"));
        Curso curso = cursoMapeamento.cursoDTOToCurso(dto);
        curso.setIdCurso(id);
        return cursoRespositorio.save(curso);
    }

    public void deletarCurso(Long id){
        cursoRespositorio.deleteById(id);
    }
}
