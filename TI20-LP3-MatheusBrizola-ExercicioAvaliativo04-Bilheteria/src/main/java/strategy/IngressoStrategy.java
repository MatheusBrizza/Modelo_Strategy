package strategy;

import model.Ingresso;
import model.Usuario;

import java.math.BigDecimal;

public interface IngressoStrategy {

    BigDecimal calcularDesconto(Ingresso ingresso);

}
