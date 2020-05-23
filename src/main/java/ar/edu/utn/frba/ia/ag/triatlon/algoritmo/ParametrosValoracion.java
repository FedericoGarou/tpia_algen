package main.java.ar.edu.utn.frba.ia.ag.triatlon.algoritmo;

import main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica.Velocidad;
import main.java.ar.edu.utn.frba.ia.ag.triatlon.estadistica.PorcentajePodios;
import main.java.ar.edu.utn.frba.ia.ag.triatlon.estadistica.PromedioKilometros;

import java.util.logging.Logger;

public class ParametrosValoracion {

    public static final Integer PONDERACION_VELODIDAD = 20;
    public static final Integer COSTO_VELOCIDAD = 16;

    public static final Integer PONDERACION_RESISTENCIA = 55;
    public static final Integer COSTO_RESISTENCIA = 20;

    public static final Integer PONDERACION_MENTALIDAD = 80;
    public static final Integer COSTO_MENTALIDAD = 64;

    public static final Integer PONDERACION_EXPERIENCIA = 85;
    public static final Integer COSTO_EXPERIENCIA = 65;

    public static final Integer PONDERACION_CAPACIDAD_NATACION = 70;
    public static final Integer COSTO_CAPACIDAD_NATACION = 56;

    public static final Integer PONDERACION_CAPACIDAD_CICLISMO = 70;
    public static final Integer COSTO_CAPACIDAD_CICLISMO = 52;

    public static final Integer PONDERACION_CAPACIDAD_CARRERA_PIE = 70;
    public static final Integer COSTO_CAPACIDAD_CARRERA_PIE = 45;

    public static final Integer PONDERACION_PROMEDIO_KILOMETROS = 45;
    public static final Integer COSTO_PROMEDIO_KILOMETROS = 36;

    public static final Integer PONDERACION_PORCENTAJE_PODIOS = 95;
    public static final Integer COSTO_PORCENTAJE_PODIOS = 76;

    public static final Integer PONDERACION_PORCENTAJE_CARRERA_COMPLETA = 40;
    public static final Integer COSTO_PORCENTAJE_CARRERA_COMPLETA = 25;

    public static final Integer PONDERACION_PORCENTAJE_ASISTENCIA = 20;
    public static final Integer COSTO_PORCENTAJE_ASISTENCIA = 15;

    public static final Double FACTOR_CONVERSION_SALARIO = 1.5D;

    private static final String SALTO_LINEA = "\n";
    private static final String TAB = "\t";
    private static final String SEPARACION = "------------------------------------------------------------------------"+SALTO_LINEA;

    public static void informar() {
        StringBuilder sbValoracion = new StringBuilder(SALTO_LINEA)
            .append("Valoracion:\n")
            .append(SEPARACION)
            .append(alinear(6,"Atributo")+" | Peso | Costo |"+SALTO_LINEA)
            .append(informarValoracion(alinear(6,"Velocidad"),PONDERACION_VELODIDAD,COSTO_VELOCIDAD))
            .append(informarValoracion(alinear(6,"Resistencia"),PONDERACION_RESISTENCIA,COSTO_RESISTENCIA))
            .append(informarValoracion(alinear(6,"Mentalidad"),PONDERACION_MENTALIDAD,COSTO_MENTALIDAD))
            .append(informarValoracion(alinear(6,"Experiencia"),PONDERACION_EXPERIENCIA,COSTO_EXPERIENCIA))
            .append(informarValoracion(alinear(6,"Capacidad Natacion"),PONDERACION_CAPACIDAD_NATACION,COSTO_CAPACIDAD_NATACION))
            .append(informarValoracion(alinear(6,"Capacidad Ciclismo"),PONDERACION_CAPACIDAD_CICLISMO,COSTO_CAPACIDAD_CICLISMO))
            .append(informarValoracion(alinear(6,"Capacidad Carrera Pie"),PONDERACION_CAPACIDAD_CARRERA_PIE,COSTO_CAPACIDAD_CARRERA_PIE))
            .append(informarValoracion(alinear(6,"Promedio Kilometros"),PONDERACION_PROMEDIO_KILOMETROS,COSTO_PROMEDIO_KILOMETROS))
            .append(informarValoracion(alinear(6,"Porcentaje Podios"),PONDERACION_PORCENTAJE_PODIOS,COSTO_PORCENTAJE_PODIOS))
            .append(informarValoracion(alinear(6,"Porcentaje Carrera Completa"),PONDERACION_PORCENTAJE_CARRERA_COMPLETA,COSTO_PORCENTAJE_CARRERA_COMPLETA))
            .append(informarValoracion(alinear(6,"Porcentaje Asistencia"),PONDERACION_PORCENTAJE_ASISTENCIA,COSTO_PORCENTAJE_ASISTENCIA))
            .append(SEPARACION)
            .append(informarMaximaValoracionPorCaracteristicas())
            .append(informarMaximaValoracionPorEstadisticas())
            .append(informarMaximoSalarioAnualEnDolares())
            .append(informarMaximaAptitud())
            .append(SEPARACION);
        Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).severe(sbValoracion.toString());
    }

    private static String alinear(Integer cantidadTabulaciones,String texto) {
        int tamanioTab = 4;
        Integer cantidadTabs = cantidadTabulaciones - (texto.length() / tamanioTab);
        StringBuilder sbAlienado = new StringBuilder(TAB+texto);
        for (int i = 0; i <= cantidadTabs; i++) {
            sbAlienado.append(TAB);
        }
        return sbAlienado.toString();
    }

    private static String informarValoracion(String nombreAtributo, Integer ponderacion, Integer costo){
        return new StringBuilder(nombreAtributo)
                .append(" |  ")
                .append(ponderacion)
                .append("  |  ")
                .append(costo)
                .append("   |")
                .append(SALTO_LINEA)
                .toString();
    }

    private static String informarMaximaValoracionPorCaracteristicas(){
        return String.format("Máximo valoración por características: %,6.2f"+SALTO_LINEA,maximoValoracionPorCaracteristicas());
    }

    private static String informarMaximaValoracionPorEstadisticas(){
        return String.format("Máximo valoración por estadísticas: %,6.2f"+SALTO_LINEA,maximoValoracionPorEstadisticas());
    }

    private static String informarMaximaAptitud(){
        return String.format("Máxima aptitud posible: %,6.2f"+SALTO_LINEA,maximoAptitud());
    }

    private static String informarMaximoSalarioAnualEnDolares(){
        return String.format("Máximo salario anual en dólares: U$D %,6.2f anuales"+SALTO_LINEA,maximoSalarioAnualEnDolares());
    }

    private static Double maximoAptitud() {
        return maximoValoracionPorCaracteristicas() + maximoValoracionPorEstadisticas() - maximoCosto();
    }

    private static Double maximoValoracionPorCaracteristicas(){
        return maximoValorPosible(PONDERACION_VELODIDAD, Velocidad.limiteSuperior()) +
        maximoValorPosible(PONDERACION_RESISTENCIA) +
        maximoValorPosible(PONDERACION_MENTALIDAD) +
        maximoValorPosible(PONDERACION_EXPERIENCIA) +
        maximoValorPosible(PONDERACION_CAPACIDAD_NATACION) +
        maximoValorPosible(PONDERACION_CAPACIDAD_CICLISMO) +
        maximoValorPosible(PONDERACION_CAPACIDAD_CARRERA_PIE);
    }

    private static Double maximoValoracionPorEstadisticas(){
        return maximoValorPosible(PONDERACION_PROMEDIO_KILOMETROS, PromedioKilometros.limiteSuperior()) +
        maximoValorPosible(PONDERACION_PORCENTAJE_PODIOS, PorcentajePodios.limiteSuperior()) +
        maximoValorPosible(PONDERACION_PORCENTAJE_CARRERA_COMPLETA) +
        maximoValorPosible(PONDERACION_PORCENTAJE_ASISTENCIA);
    }

    private static Double maximoSalarioAnualEnDolares(){
        return maximoCosto() * FACTOR_CONVERSION_SALARIO;
    }

    private static double maximoCosto() {
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

    private static Double maximoValorPosible(Integer ponderacion, Double maximoValor){
        return ponderacion * maximoValor;
    }

    private static Double maximoValorPosible(Integer ponderacion){
        return ponderacion * 100.0D;
    }

}
