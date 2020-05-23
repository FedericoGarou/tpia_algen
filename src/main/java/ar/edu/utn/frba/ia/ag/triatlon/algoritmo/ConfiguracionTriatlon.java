package main.java.ar.edu.utn.frba.ia.ag.triatlon;

import main.java.ar.edu.utn.frba.ia.ag.Configuracion;
import main.java.ar.edu.utn.frba.ia.ag.cruzamiento.Simple;
import main.java.ar.edu.utn.frba.ia.ag.mutacion.MutacionSimple;
import main.java.ar.edu.utn.frba.ia.ag.paro.TiempoTranscurrido;
import main.java.ar.edu.utn.frba.ia.ag.seleccion.Torneo;

public class ConfiguracionTriatlon extends Configuracion {

    public ConfiguracionTriatlon() {
        super(
            new TiempoTranscurrido(0, 5, 0), // cada corrida completa dura 5 minutos
            999, // cantIndividuosIniciales
            new Torneo(), // seleccion
            new Simple(), // cruzamiento
            new MutacionSimple(0.2)); // mutacion
    }

}
