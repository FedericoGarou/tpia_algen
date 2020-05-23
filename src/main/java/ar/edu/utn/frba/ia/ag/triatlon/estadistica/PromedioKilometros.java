package main.java.ar.edu.utn.frba.ia.ag.triatlon.estadistica;

public class PromedioKilometros extends Estadistica {
    
    private static final Integer PONDERACION_PROMEDIO_KILOMETROS = 1;
    private static final Integer COSTO_PROMEDIO_KILOMETROS = 1;

    public PromedioKilometros(){
        super(PONDERACION_PROMEDIO_KILOMETROS, COSTO_PROMEDIO_KILOMETROS);
    }

    private static final Double LIMITE_SUPERIOR = 1.0D;
    private static final Double LIMITE_INFERIOR = 1.0D;

    public static PromedioKilometros randomOf() {
        PromedioKilometros promedioKilometros = new PromedioKilometros();
        promedioKilometros.setValorEntre(LIMITE_INFERIOR,LIMITE_SUPERIOR);
        return promedioKilometros;
    }

}
