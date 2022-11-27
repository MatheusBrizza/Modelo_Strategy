package enums;

import strategy.*;

public enum TipoIngresso {

    PISTA(new PistaStrategy()),
    PISTA_PREMIUM(new PistaPremiumStrategy()),
    CAMAROTE(new CamaroteStrategy()),
    CADEIRA_INFERIOR(new CadeiraInferiorStrategy()),
    CADEIRA_SUPERIOR(new CadeiraSuperiorStrategy());

    private final IngressoStrategy strategy;
    private TipoIngresso(IngressoStrategy strategy) {this.strategy = strategy;}

    public IngressoStrategy getStrategy() {return strategy;}
}
