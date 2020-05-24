package main.java.ar.edu.utn.frba.ia.ag.triatlon.algoritmo;

import main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica.Velocidad;
import main.java.ar.edu.utn.frba.ia.ag.triatlon.estadistica.PorcentajePodios;
import main.java.ar.edu.utn.frba.ia.ag.triatlon.estadistica.PromedioKilometros;

public class ParametrosValoracion {

    private static LectorPropiedades propiedades = new LectorPropiedades();

    public static final Integer PONDERACION_VELODIDAD = propiedades.leerPonderacion("velodidad.ponderacion");
    public static final Integer COSTO_VELOCIDAD = propiedades.leerCosto("velocidad.costo");

    public static final Integer PONDERACION_RESISTENCIA = propiedades.leerPonderacion("resistencia.ponderacion");
    public static final Integer COSTO_RESISTENCIA = propiedades.leerCosto("resistencia.costo");

    public static final Integer PONDERACION_MENTALIDAD = propiedades.leerPonderacion("mentalidad.ponderacion");
    public static final Integer COSTO_MENTALIDAD = propiedades.leerCosto("mentalidad.costo");

    public static final Integer PONDERACION_EXPERIENCIA = propiedades.leerPonderacion("experiencia.ponderacion");
    public static final Integer COSTO_EXPERIENCIA = propiedades.leerCosto("experiencia.costo");

    public static final Integer PONDERACION_CAPACIDAD_NATACION = propiedades.leerPonderacion("capacidadNatacion.ponderacion");
    public static final Integer COSTO_CAPACIDAD_NATACION = propiedades.leerCosto("capacidadNatacion.costo");

    public static final Integer PONDERACION_CAPACIDAD_CICLISMO = propiedades.leerPonderacion("capacidadCiclismo.ponderacion");
    public static final Integer COSTO_CAPACIDAD_CICLISMO = propiedades.leerCosto("capacidadCiclismo.costo");

    public static final Integer PONDERACION_CAPACIDAD_CARRERA_PIE = propiedades.leerPonderacion("capacidadCarreraPie.ponderacion");
    public static final Integer COSTO_CAPACIDAD_CARRERA_PIE = propiedades.leerCosto("capacidadCarreraPie.costo");

    public static final Integer PONDERACION_PROMEDIO_KILOMETROS = propiedades.leerPonderacion("promedioKilometros.ponderacion");
    public static final Integer COSTO_PROMEDIO_KILOMETROS = propiedades.leerCosto("promedioKilometros.costo");

    public static final Integer PONDERACION_PORCENTAJE_PODIOS = propiedades.leerPonderacion("porcentajePodios.ponderacion");
    public static final Integer COSTO_PORCENTAJE_PODIOS = propiedades.leerCosto("porcentajePodios.costo");

    public static final Integer PONDERACION_PORCENTAJE_CARRERA_COMPLETA = propiedades.leerPonderacion("porcentajeCarreraCompleta.ponderacion");
    public static final Integer COSTO_PORCENTAJE_CARRERA_COMPLETA = propiedades.leerCosto("porcentajeCarreraCompleta.costo");

    public static final Integer PONDERACION_PORCENTAJE_ASISTENCIA = propiedades.leerPonderacion("porcentajeAsistencia.ponderacion");
    public static final Integer COSTO_PORCENTAJE_ASISTENCIA = propiedades.leerCosto("porcentajeAsistencia.costo");

    public static Double maximoAptitud() {
        return maximoValoracionPorCaracteristicas() + maximoValoracionPorEstadisticas() - maximoCosto();
    }

    public static Double maximoValoracionPorCaracteristicas(){
        return maximoValorPosible(PONDERACION_VELODIDAD, Velocidad.limiteSuperior()) +
        maximoValorPosible(PONDERACION_RESISTENCIA) +
        maximoValorPosible(PONDERACION_MENTALIDAD) +
        maximoValorPosible(PONDERACION_EXPERIENCIA) +
        maximoValorPosible(PONDERACION_CAPACIDAD_NATACION) +
        maximoValorPosible(PONDERACION_CAPACIDAD_CICLISMO) +
        maximoValorPosible(PONDERACION_CAPACIDAD_CARRERA_PIE);
    }

    public static Double maximoValoracionPorEstadisticas(){
        return maximoValorPosible(PONDERACION_PROMEDIO_KILOMETROS, PromedioKilometros.limiteSuperior()) +
        maximoValorPosible(PONDERACION_PORCENTAJE_PODIOS, PorcentajePodios.limiteSuperior()) +
        maximoValorPosible(PONDERACION_PORCENTAJE_CARRERA_COMPLETA) +
        maximoValorPosible(PONDERACION_PORCENTAJE_ASISTENCIA);
    }

    public static Double maximoSalarioAnualEnDolares(){
        return maximoCosto() * factorConversion();
    }

    public static double maximoCosto() {
        return maximoValorPosible(COSTO_VELOCIDAD, Velocidad.limiteSuperior()) +
                maximoValorPosible(COSTO_RESISTENCIA) +
                maximoValorPosible(COSTO_MENTALIDAD) +
                maximoValorPosible(COSTO_EXPERIENCIA) +
                maximoValorPosible(COSTO_CAPACIDAD_NATACION) +
                maximoValorPosible(COSTO_CAPACIDAD_CICLISMO) +
                maximoValorPosible(COSTO_CAPACIDAD_CARRERA_PIE) +
                maximoValorPosible(COSTO_PROMEDIO_KILOMETROS, PromedioKilometros.limiteSuperior()) +
                maximoValorPosible(COSTO_PORCENTAJE_PODIOS, PorcentajePodios.limiteSuperior()) +
                maximoValorPosible(COSTO_PORCENTAJE_CARRERA_COMPLETA) +
                maximoValorPosible(COSTO_PORCENTAJE_ASISTENCIA);
    }

    public static Double maximoValorPosible(Integer ponderacion, Double maximoValor){
        return ponderacion * maximoValor;
    }

    public static Double maximoValorPosible(Integer ponderacion){
        return ponderacion * 100.0D;
    }

    public static Double factorConversion() {
        Double maximoSalario = propiedades.leerDouble("maximoSalario");
        return maximoSalario / ( maximoValoracionPorCaracteristicas() + maximoValoracionPorEstadisticas() );
    }

}
