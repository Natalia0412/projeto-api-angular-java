package com.example.projetoapi;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CursoDTO {
    private String nomeCurso;
    private double valorCurso;
}
