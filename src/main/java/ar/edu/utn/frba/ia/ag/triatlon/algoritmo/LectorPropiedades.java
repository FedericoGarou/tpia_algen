package main.java.ar.edu.utn.frba.ia.ag.triatlon.algoritmo;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class LectorPropiedades {

    private Properties properties;

    private static final String BASE_PATH = "src/resource/";

    private String nombrePropiedades = "resource.properties";

    public void cargarPropiedades(String nombrePropiedades) {
        this.nombrePropiedades = nombrePropiedades;
    }

    public LectorPropiedades() {
        try {
            properties = new Properties();
            properties.load(new FileReader(rutaParaProperty()));
        } catch (IOException e) {
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).severe("Error al leer las propiedades: " + rutaParaProperty());
        }
    }

    public Integer leerPonderacion(String nombrePropiedad){
        return Integer.valueOf(properties.getProperty(nombrePropiedad));
    }

    public Integer leerCosto(String nombrePropiedad){
        return Integer.valueOf(properties.getProperty(nombrePropiedad));
    }

    public Double leerDouble(String nombrePropiedad){
        return Double.valueOf(properties.getProperty(nombrePropiedad));
    }

    private String rutaParaProperty(){
        return BASE_PATH + nombrePropiedades;
    }

}
