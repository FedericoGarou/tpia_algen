package main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica;

public abstract class Caracteristica {

    protected Double valor;

    private Integer ponderacion;

    private Integer costoBase;

    public Caracteristica(Integer ponderacion, Integer costoBase) {
        this.ponderacion = ponderacion;
        this.costoBase = costoBase;
    }

    public Double aptitud(){
        return this.valor * this.ponderacion;
    }

    public Double costo(){
        return this.valor * this.costoBase;
    }

    protected void setValorEntre(Double limiteInferior, Double limiteSuperior){
        this.valor = Math.random() * (limiteSuperior - limiteInferior) + limiteInferior;
    }

    @Override
    public String toString() {
        String descripcion = "%s: %3.2f";
        return String.format(descripcion,this.getClass().getSimpleName(),valor);
    }

}
