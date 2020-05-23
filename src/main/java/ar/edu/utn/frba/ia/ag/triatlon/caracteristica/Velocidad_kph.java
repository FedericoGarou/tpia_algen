package main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica;

public class Velocidad_kph extends Caracteristica {

    private static final Integer PONDERACION_VELODIDAD = 1;
    private static final Integer COSTO_VELOCIDAD = 1;

    public Velocidad_kph() {
        super(PONDERACION_VELODIDAD, COSTO_VELOCIDAD);
    }

    private static final Double LIMITE_SUPERIOR = 45.0D;
    private static final Double LIMITE_INFERIOR = 1.0D;

    public static Velocidad_kph randomOf() {
        Velocidad_kph velocidad = new Velocidad_kph();
        velocidad.setValorEntre(LIMITE_INFERIOR,LIMITE_SUPERIOR);
        return velocidad;
    }

}
