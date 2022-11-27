package strategy;

import model.Ingresso;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PistaPremiumStrategy implements IngressoStrategy {

    @Override
    public BigDecimal calcularDesconto(Ingresso ingresso) {
        BigDecimal valorIngresso = BigDecimal.valueOf(400);
        double desconto = 0.5;
        int idade = LocalDate.now().getYear() - ingresso.getUsuario().getDataNascimento().getYear();

        if(ingresso.getUsuario().getIsEstudante() == true || idade >= 60) {
            BigDecimal valorDescontado = valorIngresso.multiply(BigDecimal.valueOf(desconto));
            return valorDescontado;
        } else {
            return valorIngresso;
        }
    }
}
