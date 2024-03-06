package com.example.projetoapi.erros;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MensagemErro {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String campo;
    private String mensagem;
}
