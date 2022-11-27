package service;

import enums.TipoIngresso;
import model.Ingresso;
import model.Usuario;

import java.math.BigDecimal;

public class IngressoService {

    public BigDecimal calcularvalorIngresso(Ingresso ingresso) {
        return ingresso.getTipoIngresso().getStrategy().calcularDesconto(ingresso);
    }

}
