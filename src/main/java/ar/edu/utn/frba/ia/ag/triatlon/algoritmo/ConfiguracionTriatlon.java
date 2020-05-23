package main.java.ar.edu.utn.frba.ia.ag.triatlon.algoritmo;

import main.java.ar.edu.utn.frba.ia.ag.Configuracion;
import main.java.ar.edu.utn.frba.ia.ag.cruzamiento.BinomialAzar;
import main.java.ar.edu.utn.frba.ia.ag.mutacion.MutacionSimple;
import main.java.ar.edu.utn.frba.ia.ag.paro.CantidadDeCiclos;
import main.java.ar.edu.utn.frba.ia.ag.seleccion.Ruleta;

public class ConfiguracionTriatlon extends Configuracion {

    public ConfiguracionTriatlon() {
        super(
            new CantidadDeCiclos(15L), // 15 iteraciones
            999, // 999 individuos iniciales
            new Ruleta(), // seleccion
            new BinomialAzar(), // cruzamiento
            new MutacionSimple(0.2)); // mutacion
    }

}
