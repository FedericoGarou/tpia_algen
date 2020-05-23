package main.java.ar.edu.utn.frba.ia.ag.triatlon.estadistica;

import static main.java.ar.edu.utn.frba.ia.ag.triatlon.algoritmo.ParametrosValoracion.COSTO_PROMEDIO_KILOMETROS;
import static main.java.ar.edu.utn.frba.ia.ag.triatlon.algoritmo.ParametrosValoracion.PONDERACION_PROMEDIO_KILOMETROS;

public class PromedioKilometros extends Estadistica {

    public PromedioKilometros(){
        super(PONDERACION_PROMEDIO_KILOMETROS, COSTO_PROMEDIO_KILOMETROS);
    }

    private static final Double LIMITE_SUPERIOR = 250.0D;
    private static final Double LIMITE_INFERIOR = 1.0D;

    public static PromedioKilometros randomOf() {
        PromedioKilometros promedioKilometros = new PromedioKilometros();
        promedioKilometros.setValorEntre(LIMITE_INFERIOR,LIMITE_SUPERIOR);
        return promedioKilometros;
    }

    @Override
    public String toString() {
        String descripcion = "Km promedio: %3.2f Km";
        return String.format(descripcion,super.valor);
    }

    public static Double limiteSuperior() {
        return LIMITE_SUPERIOR;
    }
}
