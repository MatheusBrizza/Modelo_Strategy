package model;

import lombok.Builder;
import lombok.Data;
import lombok.Value;
import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder
@Value

public class Usuario extends Pessoa {

    private String login;
    private String senha;
    private List<Evento> eventos;


}
