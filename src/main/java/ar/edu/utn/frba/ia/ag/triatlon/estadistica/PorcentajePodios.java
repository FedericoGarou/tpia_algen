package main.java.ar.edu.utn.frba.ia.ag.triatlon.estadistica;

public class PorcentajePodios extends Estadistica {

    private static final Integer PONDERACION_PORCENTAJE_PODIOS = 95;
    private static final Integer COSTO_PORCENTAJE_PODIOS = 76;

    public PorcentajePodios(){
        super(PONDERACION_PORCENTAJE_PODIOS,COSTO_PORCENTAJE_PODIOS);
    }

    private static final Double LIMITE_SUPERIOR = 80.0D;
    private static final Double LIMITE_INFERIOR = 0.0D;

    public static PorcentajePodios randomOf() {
        PorcentajePodios porcentajePodios = new PorcentajePodios();
        porcentajePodios.setValorEntre(LIMITE_INFERIOR,LIMITE_SUPERIOR);
        return porcentajePodios;
    }

}
