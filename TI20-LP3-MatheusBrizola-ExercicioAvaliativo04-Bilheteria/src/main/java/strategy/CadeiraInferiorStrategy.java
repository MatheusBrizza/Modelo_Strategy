package strategy;

import model.Ingresso;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CadeiraInferiorStrategy implements IngressoStrategy {

    @Override
    public BigDecimal calcularDesconto(Ingresso ingresso) {
        BigDecimal valorIngresso = BigDecimal.valueOf(200);
        double descontoEstudante = 0.5;
        double descontoIdoso = 0.4;
        int idade = LocalDate.now().getYear() - ingresso.getUsuario().getDataNascimento().getYear();


        if (idade >= 60) {
            BigDecimal valorDescontado = valorIngresso.multiply(BigDecimal.valueOf(descontoIdoso));
            return valorDescontado;
        } else if (ingresso.getUsuario().getIsEstudante() == true) {
            BigDecimal valorDescontado = valorIngresso.multiply(BigDecimal.valueOf(descontoEstudante));
            return valorDescontado;
        } else {
            return valorIngresso;
        }
    }
}
