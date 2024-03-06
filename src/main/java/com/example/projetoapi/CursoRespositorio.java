package com.example.projetoapi;

import com.example.projetoapi.modelo.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRespositorio extends JpaRepository<Curso, Long> {
}
