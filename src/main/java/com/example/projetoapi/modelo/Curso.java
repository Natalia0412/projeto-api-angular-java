package com.example.projetoapi.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="Cursos")
@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCurso;
    @Column(nullable = false)
    private String nomeCurso;
    @Column(nullable = false)
    private double valorCurso;
}
