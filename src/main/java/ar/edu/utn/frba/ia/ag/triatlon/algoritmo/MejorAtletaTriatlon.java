package main.java.ar.edu.utn.frba.ia.ag.triatlon.algoritmo;

import main.java.ar.edu.utn.frba.ia.ag.AlgoritmoGenetico;
import main.java.ar.edu.utn.frba.ia.ag.triatlon.atleta.Atleta;

import java.util.Locale;
import java.util.logging.Logger;

public class MejorAtletaTriatlon {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("es","AR"));
        AlgoritmoGenetico mejorAtletaTriatlon = new AlgoritmoGenetico(new ConfiguracionTriatlon(), Atleta.class);
        Atleta mejorAtleta = (Atleta) mejorAtletaTriatlon.ejecutar();
        Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).severe("Individuo final: " + mejorAtleta.toString());
        System.out.println("------------------------------------------------------------------------");
    }

}
