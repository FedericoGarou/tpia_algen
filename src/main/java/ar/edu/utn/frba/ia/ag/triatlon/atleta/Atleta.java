package main.java.ar.edu.utn.frba.ia.ag.triatlon;

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

import java.util.List;

public class Atleta extends Individuo {

    private List<Caracteristica> características;

    private List<Estadistica> estadisticas;

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

}
