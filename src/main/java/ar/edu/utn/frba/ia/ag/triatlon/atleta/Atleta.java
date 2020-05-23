package main.java.ar.edu.utn.frba.ia.ag.triatlon.atleta;

import main.java.ar.edu.utn.frba.ia.ag.Individuo;
import main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica.CapacidadCarreraPie;
import main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica.CapacidadCiclismo;
import main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica.CapacidadNatacion;
import main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica.Caracteristica;
import main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica.Experiencia;
import main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica.Mentalidad;
import main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica.Resistencia;
import main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica.Velocidad;
import main.java.ar.edu.utn.frba.ia.ag.triatlon.estadistica.Estadistica;
import main.java.ar.edu.utn.frba.ia.ag.triatlon.estadistica.PorcentajeAsistencia;
import main.java.ar.edu.utn.frba.ia.ag.triatlon.estadistica.PorcentajeCarreraCompleta;
import main.java.ar.edu.utn.frba.ia.ag.triatlon.estadistica.PorcentajePodios;
import main.java.ar.edu.utn.frba.ia.ag.triatlon.estadistica.PromedioKilometros;

import java.util.ArrayList;
import java.util.List;

public class Atleta<main> extends Individuo {

    private List<Caracteristica> características = new ArrayList<Caracteristica>();

    private List<Estadistica> estadisticas = new ArrayList<Estadistica>();

    public Atleta() {}

    @Override
    public String toString() {
        String descripcion = "\nAptitud: %,6.2f\nCaracteristicas: %s\nEstadisticas: %s\nCosto: U$S %,6.2f anuales";
        return String.format(descripcion,aptitud(),descripcionCaracterísticas(),descripcionEstadisticas(), sueldoAnualEnDolares());
    }

    @Override
    public double aptitud() {
        return this.aptitudPorCaracteristicas() + this.aptitudPorEstadisticas() - this.costoAtleta();
    }

    @Override
    public Individuo generarRandom() {
        Atleta atleta = new Atleta();
        atleta.generarCaracteristicasRandom();
        atleta.generarEstadisticasRandom();
        return atleta;
    }

    private Double aptitudPorCaracteristicas(){
        Double aptitudCaracteristicas = 0.0D;
        for(Caracteristica característica : características){
            aptitudCaracteristicas += característica.aptitud();
        }
        return aptitudCaracteristicas;
    }

    private Double aptitudPorEstadisticas() {
        Double aptitudEstadisticas = 0.0D;
        for(Estadistica estadistica : estadisticas){
            aptitudEstadisticas += estadistica.aptitud();
        }
        return aptitudEstadisticas;
    }

    private Double costoAtleta(){
        return this.costoCaracteristicas() + this.costoEstadisticas();
    }

    private Double costoEstadisticas() {
        Double costoEstadisticas = 0.0D;
        for(Estadistica estadistica : estadisticas){
            costoEstadisticas += estadistica.costo();
        }
        return costoEstadisticas;
    }

    private Double costoCaracteristicas() {
        Double costoCaracteristicas = 0.0D;
        for(Caracteristica característica : características){
            costoCaracteristicas += característica.costo();
        }
        return costoCaracteristicas;
    }

    private void generarEstadisticasRandom() {
        estadisticas.add(PorcentajeAsistencia.randomOf());
        estadisticas.add(PorcentajeCarreraCompleta.randomOf());
        estadisticas.add(PorcentajePodios.randomOf());
        estadisticas.add(PromedioKilometros.randomOf());
    }

    private void generarCaracteristicasRandom(){
        características.add(Velocidad.randomOf());
        características.add(Resistencia.randomOf());
        características.add(Mentalidad.randomOf());
        características.add(Experiencia.randomOf());
        características.add(CapacidadNatacion.randomOf());
        características.add(CapacidadCiclismo.randomOf());
        características.add(CapacidadCarreraPie.randomOf());
    }

    private String descripcionEstadisticas() {
        StringBuilder sbEstadisticas = new StringBuilder();
        String separador = "";
        for(Estadistica estadistica : estadisticas){
            sbEstadisticas.append(separador).append(estadistica.toString());
            separador = " - ";
        }
        return sbEstadisticas.toString();
    }

    private String descripcionCaracterísticas() {
        StringBuilder sbCaracteristicas = new StringBuilder();
        String separador = "";
        for(Caracteristica caracteristica : características){
            sbCaracteristicas.append(separador).append(caracteristica.toString());
            separador = " - ";
        }
        return sbCaracteristicas.toString();
    }

    /**
     * Este cálculo se hace tomando el dato de que el 95% de los triatletas ganan U$D 50.000 anuales
     * Por lo que tomamos un máximo sueldo de U$D 75.000 (ignorando a los triatletas de elite)
     * Fuente: https://www.triatloners.com/los-triatletas-mejores-pagos-el-95-gano-menos-de-50k/
     * Nota: El artículo es del 2015
     *
     * Considerando que el mejor atleta posible (Con todas sus características y estadísticas al máximo)
     * puede tener 50.000 puntos de costo se obtiene un factor de conversión dado por:
     *
     * FACTOR = SUELDO_MAXIMO / COSTO_NORMALIZADO_MAXIMO = 1.5
     */
    private double sueldoAnualEnDolares() {
        double factorConversion = 1.5D;
        return this.costoAtleta()* factorConversion;
    }

    public List<Caracteristica> getCaracterísticas() {
        return características;
    }

    public void setCaracterísticas(List<Caracteristica> características) {
        this.características = características;
    }

    public List<Estadistica> getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(List<Estadistica> estadisticas) {
        this.estadisticas = estadisticas;
    }

}
