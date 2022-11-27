package model;

import enums.TipoIngresso;

import java.math.BigDecimal;

public class Ingresso {

    private final int id;
    private final Evento evento;
    private final Usuario usuario;
    //private final BigDecimal valor;
    private final TipoIngresso tipoIngresso;

   /* public BigDecimal getValor() {
        return valor;
    }*/

    public Usuario getUsuario() {
        return usuario;
    }

    public TipoIngresso getTipoIngresso() {
        return tipoIngresso;
    }

    public Ingresso(IngressoBuilder builder) {
        id = builder.id;
        evento = builder.evento;
        usuario = builder.usuario;
    //    valor = builder.valor;
        tipoIngresso = builder.tipoIngresso;
    }

    public static IngressoBuilder builder() { return new IngressoBuilder();}

    public static class IngressoBuilder {

        private int id;
        private Evento evento;
        private Usuario usuario;
    //    private BigDecimal valor;
        private TipoIngresso tipoIngresso;

        private IngressoBuilder() {
        }

        public IngressoBuilder id(int id) {
            this.id = id;
            return this;
        }

        public IngressoBuilder evento(Evento evento) {
            this.evento = evento;
            return this;
        }

        public IngressoBuilder usuario(Usuario usuario) {
            this.usuario = usuario;
            return this;
        }

      /*  public IngressoBuilder valor(BigDecimal valor) {
            this.valor = valor;
            return this;
        }*/

        public IngressoBuilder tipoIngresso(TipoIngresso tipoIngresso) {
            this.tipoIngresso = tipoIngresso;
            return this;
        }

        public Ingresso build() { return new Ingresso(this);}

    };
}