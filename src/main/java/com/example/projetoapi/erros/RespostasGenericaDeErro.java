package com.example.projetoapi.erros;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RespostasGenericaDeErro {
    private Integer status;
    private List<MensagemErro> erros;
    private String url;
}
