package main.java.ar.edu.utn.frba.ia.ag.triatlon.atleta;

import main.java.ar.edu.utn.frba.ia.ag.Individuo;
import main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica.CapacidadCarreraPie;
import main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica.CapacidadCiclismo;
import main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica.CapacidadNatacion;
import main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica.Caracteristica;
import main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica.Experiencia;
import main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica.Mentalidad;
import main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica.Resistencia;
import main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica.Velocidad_kph;
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

    public static void main(String[] args) {
        Individuo atleta = new Atleta().generarRandom();
        System.out.println(atleta);
    }

    @Override
    public String toString() {
        String descripcion = "\nAptitud: %3.2f\nCaracteristicas: %s\nEstadisticas: %s";
        return String.format(descripcion,aptitud(),this.descripcionCaracterísticas(),this.descripcionEstadisticas());
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
        características.add(Velocidad_kph.randomOf());
        características.add(Resistencia.randomOf());
        características.add(Mentalidad.randomOf());
        características.add(Experiencia.randomOf());
        características.add(CapacidadNatacion.randomOf());
        características.add(CapacidadCiclismo.randomOf());
        características.add(CapacidadCarreraPie.randomOf());
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
