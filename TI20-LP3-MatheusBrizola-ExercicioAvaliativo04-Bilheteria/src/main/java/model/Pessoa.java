package model;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;

@SuperBuilder
@Data
public abstract class Pessoa {

    private String nome;
    private String documento;
    private LocalDate dataNascimento;
    private Boolean isEstudante;


    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Boolean getEstudante() {
        return isEstudante;
    }

}



