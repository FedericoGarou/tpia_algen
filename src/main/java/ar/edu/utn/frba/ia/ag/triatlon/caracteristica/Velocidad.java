package main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica;

import static main.java.ar.edu.utn.frba.ia.ag.triatlon.algoritmo.ParametrosValoracion.COSTO_VELOCIDAD;
import static main.java.ar.edu.utn.frba.ia.ag.triatlon.algoritmo.ParametrosValoracion.PONDERACION_VELODIDAD;

//Velocidad medida en KM/H
public class Velocidad extends Caracteristica {

    public Velocidad() {
        super(PONDERACION_VELODIDAD, COSTO_VELOCIDAD);
    }

    private static final Double LIMITE_SUPERIOR = 45.0D; //Record actual
    private static final Double LIMITE_INFERIOR = 1.0D;

    public static Velocidad randomOf() {
        Velocidad velocidad = new Velocidad();
        velocidad.setValorEntre(LIMITE_INFERIOR,LIMITE_SUPERIOR);
        return velocidad;
    }

    @Override
    public String toString() {
        String descripcion = "Velocidad: %3.2f km/h";
        return String.format(descripcion,super.valor);
    }

    public static Double limiteSuperior() {
        return LIMITE_SUPERIOR;
    }
}
