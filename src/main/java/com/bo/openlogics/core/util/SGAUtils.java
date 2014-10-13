package com.bo.openlogics.core.util;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: esalamanca
 * Date: 13-03-14
 * Time: 07:26 PM
 * Utilitarios NSGA.
 */
public class SGAUtils {

    /**
     * Convertir InputStream a String
     *
     * @param is InputStrem
     * @return String
     */
    public static String getStringFromInputStream(InputStream is) {

        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();

        String line;
        try {
            br = new BufferedReader(new InputStreamReader(is));
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return sb.toString();
    }

    /**
     * Remover un prefijo de un string dado
     *
     * @param fileName Cadena en la q se busca el prefijo
     * @param prefix   Prefijo que se busca
     * @return La cadena fileName despues de prefijo, si prefijo no existe, devuelve toda la cadena
     */
    public static String removePrefix(String fileName, String prefix) {
        try {
            int index = fileName.indexOf(prefix);
            if (index >= 0) {
                return fileName.substring(index + prefix.length());
            } else {
                return fileName;
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Crear un directorio si no existe y devolver el resultado de la operacion
     *
     * @param path La direccion del folder que se desea crear
     * @throws java.lang.Exception
     */
    public static void createDirectory(String path) throws Exception {
        File dir = new File(path);
        if (!dir.exists()) {
            if (!dir.mkdir()) {
                throw new Exception("No se pudo crear el directorio " + path);
            }
        }
    }
}
