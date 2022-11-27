package strategy;

import model.Ingresso;

import java.math.BigDecimal;

public class CamaroteStrategy implements IngressoStrategy {


    @Override
    public BigDecimal calcularDesconto(Ingresso ingresso) {
        BigDecimal valorIngresso = BigDecimal.valueOf(750);
            return valorIngresso;
    }
}
