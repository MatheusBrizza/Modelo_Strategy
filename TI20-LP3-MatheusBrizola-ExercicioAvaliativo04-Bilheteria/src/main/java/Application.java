import enums.TipoIngresso;
import model.Evento;
import model.Ingresso;
import model.Usuario;
import service.IngressoService;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {


        Usuario usuario = Usuario.builder()
                .nome("João da Silva")
                .documento("123.456.789-10")
                .dataNascimento(LocalDate.of(2000,10,10))
                .isEstudante(false)
                .login("joaozin")
                .senha("joao1234")
                .build();

        Evento evento = Evento.builder()
                .nome("Show")
                .data(LocalDateTime.of(2022,10,10,21,30))
                .capacidade(500)
                .build();

        Ingresso ingresso = Ingresso.builder()
                .id(1)
                .evento(evento)
                .usuario(usuario)
                .tipoIngresso(TipoIngresso.CADEIRA_INFERIOR)
                .build();

        IngressoService ingressoService = new IngressoService();
        System.out.println("O valor do Ingresso " + ingresso.getTipoIngresso() + " é: R$" + ingressoService.calcularvalorIngresso(ingresso));

    }
}
