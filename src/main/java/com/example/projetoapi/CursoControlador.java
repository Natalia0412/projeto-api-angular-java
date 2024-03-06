package com.example.projetoapi;

import com.example.projetoapi.erros.RecursoNaoEncontrado;
import com.example.projetoapi.modelo.Curso;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")

public class CursoControlador {
    private final CursoServico cursoServico;

    public CursoControlador(CursoServico cursoServico){
        this.cursoServico = cursoServico;
    }

    @PostMapping()
    public ResponseEntity<Curso> criarCurso(@RequestBody CursoDTO cursoDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(cursoServico.criarCurso(cursoDTO));
    }

    @GetMapping()
    public ResponseEntity<List<Curso>> listarTodosCursos(){
        return ResponseEntity.ok(cursoServico.listarCursos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curso> mostrarCurso(@PathVariable Long id){
        Curso curso = cursoServico.retornarCurso(id).orElseThrow(()-> new RecursoNaoEncontrado("Curso não encontrado"));
        return ResponseEntity.ok(curso);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Curso> alterarCurso(@PathVariable Long id, @RequestBody CursoDTO cursoDTO){
        return ResponseEntity.ok(cursoServico.alterCurso(id, cursoDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCurso(@PathVariable Long id){
        cursoServico.deletarCurso(id);
        return ResponseEntity.noContent().build();
    }

}
