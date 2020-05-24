package main.java.ar.edu.utn.frba.ia.ag.triatlon.algoritmo;

import main.java.ar.edu.utn.frba.ia.ag.triatlon.atleta.Atleta;

import java.util.logging.Logger;

public class Reporte {
    
    private static final String SALTO_LINEA = "\n";
    private static final String TAB = "\t";
    private static final String SEPARACION = "------------------------------------------------------------------------"+SALTO_LINEA;

    public static void reporteParametrosValoracion() {
        StringBuilder sbValoracion = new StringBuilder(SALTO_LINEA + "Valoracion de atributos:")
            .append(enmarcarSinEnterFinal(resumenPonderacionYCosto()))
            .append("Máximos:")
            .append(enmarcarSinEnterFinal(resumenMaximos()));
        Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).severe(sbValoracion.toString());
    }

    private static String resumenPonderacionYCosto(){
        return new StringBuilder()
            .append(alinear(6,"Atributo")+" | Peso | Costo |"+ SALTO_LINEA)
            .append(informarValoracion(alinear(6,"Velocidad"), ParametrosValoracion.PONDERACION_VELODIDAD, ParametrosValoracion.COSTO_VELOCIDAD))
            .append(informarValoracion(alinear(6,"Resistencia"), ParametrosValoracion.PONDERACION_RESISTENCIA, ParametrosValoracion.COSTO_RESISTENCIA))
            .append(informarValoracion(alinear(6,"Mentalidad"), ParametrosValoracion.PONDERACION_MENTALIDAD, ParametrosValoracion.COSTO_MENTALIDAD))
            .append(informarValoracion(alinear(6,"Experiencia"), ParametrosValoracion.PONDERACION_EXPERIENCIA, ParametrosValoracion.COSTO_EXPERIENCIA))
            .append(informarValoracion(alinear(6,"Capacidad Natacion"), ParametrosValoracion.PONDERACION_CAPACIDAD_NATACION, ParametrosValoracion.COSTO_CAPACIDAD_NATACION))
            .append(informarValoracion(alinear(6,"Capacidad Ciclismo"), ParametrosValoracion.PONDERACION_CAPACIDAD_CICLISMO, ParametrosValoracion.COSTO_CAPACIDAD_CICLISMO))
            .append(informarValoracion(alinear(6,"Capacidad Carrera Pie"), ParametrosValoracion.PONDERACION_CAPACIDAD_CARRERA_PIE, ParametrosValoracion.COSTO_CAPACIDAD_CARRERA_PIE))
            .append(informarValoracion(alinear(6,"Promedio Kilometros"), ParametrosValoracion.PONDERACION_PROMEDIO_KILOMETROS, ParametrosValoracion.COSTO_PROMEDIO_KILOMETROS))
            .append(informarValoracion(alinear(6,"Porcentaje Podios"), ParametrosValoracion.PONDERACION_PORCENTAJE_PODIOS, ParametrosValoracion.COSTO_PORCENTAJE_PODIOS))
            .append(informarValoracion(alinear(6,"Porcentaje Carrera Completa"), ParametrosValoracion.PONDERACION_PORCENTAJE_CARRERA_COMPLETA, ParametrosValoracion.COSTO_PORCENTAJE_CARRERA_COMPLETA))
            .append(informarValoracion(alinear(6,"Porcentaje Asistencia"), ParametrosValoracion.PONDERACION_PORCENTAJE_ASISTENCIA, ParametrosValoracion.COSTO_PORCENTAJE_ASISTENCIA))
            .toString();
    }

    private static String resumenMaximos(){
        return new StringBuilder()
                .append(informarMaximaValoracionPorCaracteristicas())
                .append(informarMaximaValoracionPorEstadisticas())
                .append(informarMaximoSalarioAnualEnDolares())
                .append(informarMaximaAptitud())
                .toString();
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
        return String.format("Máximo valoración por características: %,6.2f"+ SALTO_LINEA, ParametrosValoracion.maximoValoracionPorCaracteristicas());
    }

    private static String informarMaximaValoracionPorEstadisticas(){
        return String.format("Máximo valoración por estadísticas: %,6.2f"+ SALTO_LINEA, ParametrosValoracion.maximoValoracionPorEstadisticas());
    }

    private static String informarMaximaAptitud(){
        return String.format("Máxima aptitud posible: %,6.2f"+ SALTO_LINEA, ParametrosValoracion.maximoAptitud());
    }

    private static String informarMaximoSalarioAnualEnDolares(){
        return String.format("Máximo salario anual en dólares: U$D %,6.2f anuales"+ SALTO_LINEA, ParametrosValoracion.maximoSalarioAnualEnDolares());
    }

    private static String alinear(Integer cantidadTabulaciones, String texto) {
        int tamanioTab = 4;
        Integer cantidadTabs = cantidadTabulaciones - (texto.length() / tamanioTab);
        StringBuilder sbAlienado = new StringBuilder(TAB + texto);
        for (int i = 0; i <= cantidadTabs; i++) {
            sbAlienado.append(TAB);
        }
        return sbAlienado.toString();
    }

    public static String enmarcarSinEnterFinal(String textoEnmarcado){
        return SALTO_LINEA + SEPARACION + textoEnmarcado + SEPARACION;
    }

    public static String enmarcar(String textoEnmarcado){
        return SALTO_LINEA + SEPARACION + textoEnmarcado + SALTO_LINEA + SEPARACION;
    }

    static void informarMejorTriatleta(Atleta mejorAtleta) {
        Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).severe(enmarcar("Individuo final: " + mejorAtleta.toString()));
        Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).severe(enmarcarSinEnterFinal(mejorAtleta.aptitudSobreIdeal()));
    }
}
