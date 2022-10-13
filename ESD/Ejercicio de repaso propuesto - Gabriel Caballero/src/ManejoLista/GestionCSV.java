package ManejoLista;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestionCSV implements BaseFichero{
    private File archivo;
    private FileReader permisoArchivo;
    private BufferedReader archivoRecorrido;
    private List<CI> listaCi;

    @Override
    public boolean verificarFichero(String url) {
        archivo = new File(url);
        return archivo.isFile();
    }

    @Override
    public boolean gestionarFichero(String url) {
        try{
            archivo = new File(url);
            permisoArchivo = new FileReader(archivo);
            archivoRecorrido = new BufferedReader(permisoArchivo);
            String linea;
            String cadena[];
            listaCi = new ArrayList<>();
            CI ci;
            while((linea = archivoRecorrido.readLine()) != null){
                cadena = linea.split("\\;");
                if(cadena.length == 4) {
                    ci = new CI();
                    ci.setNroCi(cadena[0]);
                    ci.setNomApellido(cadena[1]);
                    ci.setDepartamento(cadena[2]);
                    ci.setDistrito(cadena[3]);
                    listaCi.add(ci);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public List<CI> obtenerRegistros(){
        if((listaCi == null) || (listaCi.isEmpty())){
            listaCi = new ArrayList<>();
                CI ci = new CI();
                ci.setNroCi("0000000");
                ci.setNomApellido("DATO POR DEFECTO");
                ci.setDepartamento("DATO POR DEFECTO");
                ci.setDistrito("DATO POR DEFECTO");
        }
        return listaCi;
    }

    @Override
    public boolean cerrarFichero(String url) {
        return false;
    }
}
