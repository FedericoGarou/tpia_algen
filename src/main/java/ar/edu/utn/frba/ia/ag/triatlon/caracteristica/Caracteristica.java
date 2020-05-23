package main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica;

public class Característica {

    private Double valor;

    private Integer ponderacion;

    private Integer costoBase;

    public Característica(Double valor){
        this();
        this.valor = valor;
    }

    public Característica(Integer ponderacion, Integer costoBase) {
        this.ponderacion = ponderacion;
        this.costoBase = costoBase;
    }

    public Double aptitud(){
        return this.valor * this.ponderacion;
    }

    public Double costo(){
        return this.valor * this.costoBase;
    }

}
