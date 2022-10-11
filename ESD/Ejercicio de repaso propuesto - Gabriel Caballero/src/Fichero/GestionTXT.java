package Fichero;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestionTXT implements BaseFichero{
    private File archivo;
    private FileReader permisoArchivo;
    private BufferedReader archivoRecorrido;
    private List<Ruc> listaRuc;

    @Override
    public boolean verificarFichero(String url) {
        archivo = new File(url);
        return archivo.isFile();
    }

    @Override
    public boolean gestionarFichero(String url) {
        try {
            archivo = new File(url);
            permisoArchivo = new FileReader(archivo);
            archivoRecorrido = new BufferedReader(permisoArchivo);
            String linea;
            String cadena[];
            listaRuc = new ArrayList<>();
            Ruc ruc;
            while((linea = archivoRecorrido.readLine()) != null){
//              System.out.println(linea);
                cadena = linea.split("\\|");
                ruc = new Ruc();
                ruc.setNroRuc(cadena[0]);
                ruc.setRazonSocial(cadena[1]);
                ruc.setDv(cadena[2]);
                ruc.setRucAnterior(cadena[3]);
                ruc.setEstado(cadena[4]);
            listaRuc.add(ruc);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public List<Ruc> obtenerRegistros(){
        if ((listaRuc == null) || (listaRuc.isEmpty())){
            listaRuc = new ArrayList<>();
                Ruc ruc = new Ruc();
                ruc.setNroRuc("0000000");
                ruc.setRazonSocial("DATO POR DEFECTO");
                ruc.setDv("0");
                ruc.setRucAnterior("0000000");
                ruc.setEstado("DATO POR DEFECTO");
            listaRuc.add(ruc);
        }
        return listaRuc;
    }

    @Override
    public boolean cerrarFichero(String url) {
        return false;
    }
}
