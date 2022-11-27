package model;

import java.time.LocalDateTime;

public class Evento {

    private String nome;
    private LocalDateTime data;
    private int capacidade;

    public Evento(EventoBuilder builder) {
        nome = builder.nome;
        data = builder.data;
        capacidade = builder.capacidade;
    }

    public static EventoBuilder builder() {return new EventoBuilder();}

    public static class EventoBuilder {

        private String nome;
        private LocalDateTime data;
        private int capacidade;

        private EventoBuilder() {
        }

        public EventoBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public EventoBuilder data(LocalDateTime data) {
            this.data = data;
            return this;
        }

        public EventoBuilder capacidade(int capacidade) {
            this.capacidade = capacidade;
            return this;
        }

        public Evento build() {return new Evento(this);}

    }
}
