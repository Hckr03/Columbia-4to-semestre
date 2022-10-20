package Fichero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionTXT implements BaseFichero{

    private File archivo;
    private FileReader permisoArchivo;
    private BufferedReader archivoRecorrido;
    private List<Ruc> listaRuc;
    
    private List<Ruc> listaEstadoActivo;    
    private List<Ruc> listaEstadoCancelado;   
    private List<Ruc> listaEstadoSuspendido;
    private List<Ruc> listaEstadoBloqueado;
    private List<Ruc> listaEstadoCanDefinitivo;
    
    @Override
    public boolean verificarFichero(String url) {
        archivo = new File(url);
        return archivo.isFile() ;
    }

    @Override
    public boolean gestionarFichero(String url) {
        try {
            archivo = new File(url);
            permisoArchivo = new FileReader(archivo);
            archivoRecorrido = new BufferedReader(permisoArchivo);
            String linea;
            String cadena[];
            listaRuc = new  ArrayList<>();
            
            listaEstadoActivo = new ArrayList<>();
            listaEstadoCancelado = new ArrayList<>();
            listaEstadoSuspendido = new ArrayList<>();
            listaEstadoBloqueado = new ArrayList<>();
            listaEstadoCanDefinitivo = new ArrayList<>();
            
            Ruc ruc;
            while ((linea = archivoRecorrido.readLine()) != null ) {                
               // System.out.println(linea);
                cadena= linea.split("\\|");
                ruc = new Ruc();
                ruc.setNroRuc(cadena[0]);
                ruc.setRazonSocial(cadena[1]);
                ruc.setDv(cadena[2]);
                ruc.setRucAnterior(cadena[3]);
                ruc.setEstado(cadena[4]);
                listaRuc.add(ruc);
                
                if("ACTIVO".equals(cadena[4])){
                    ruc = new Ruc();
                    ruc.setNroRuc(cadena[0]);
                    ruc.setRazonSocial(cadena[1]);
                    ruc.setDv(cadena[2]);
                    ruc.setRucAnterior(cadena[3]);
                    ruc.setEstado(cadena[4]);
                    listaEstadoActivo.add(ruc);
                }
                if("CANCELADO".equals(cadena[4])){
                    ruc = new Ruc();
                    ruc.setNroRuc(cadena[0]);
                    ruc.setRazonSocial(cadena[1]);
                    ruc.setDv(cadena[2]);
                    ruc.setRucAnterior(cadena[3]);
                    ruc.setEstado(cadena[4]);
                    listaEstadoCancelado.add(ruc);
                }
                if("SUSPENSION TEMPORAL".equals(cadena[4])){
                    ruc = new Ruc();
                    ruc.setNroRuc(cadena[0]);
                    ruc.setRazonSocial(cadena[1]);
                    ruc.setDv(cadena[2]);
                    ruc.setRucAnterior(cadena[3]);
                    ruc.setEstado(cadena[4]);
                    listaEstadoSuspendido.add(ruc);
                }
                if("BLOQUEADO".equals(cadena[4])){
                    ruc = new Ruc();
                    ruc.setNroRuc(cadena[0]);
                    ruc.setRazonSocial(cadena[1]);
                    ruc.setDv(cadena[2]);
                    ruc.setRucAnterior(cadena[3]);
                    ruc.setEstado(cadena[4]);
                    listaEstadoBloqueado.add(ruc);
                }
                if("CANCELADO DEFINITIVO".equals(cadena[4])){
                    ruc = new Ruc();
                    ruc.setNroRuc(cadena[0]);
                    ruc.setRazonSocial(cadena[1]);
                    ruc.setDv(cadena[2]);
                    ruc.setRucAnterior(cadena[3]);
                    ruc.setEstado(cadena[4]);
                    listaEstadoCanDefinitivo.add(ruc);
                }                  
            }

                   
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestionTXT.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestionTXT.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         return true;
    }

    public List<Ruc> obtenerRegistros(){
        if ( (listaRuc == null) || (listaRuc.isEmpty())  ) {
            listaRuc = new ArrayList<>();
                Ruc r = new Ruc();
                r.setNroRuc("0000");
                r.setRazonSocial("DATO POR DEFECTO");
                r.setRucAnterior("0000");
                r.setDv("0");
                r.setEstado("DATO POR DEFECTO");
            listaRuc.add(r);
        }
        
        return listaRuc;
    }
    
    public List<Ruc> filtroActivo(){
        if ( (listaEstadoActivo == null) || (listaEstadoActivo.isEmpty())  ) {
            listaEstadoActivo = new ArrayList<>();
                Ruc r = new Ruc();
                r.setNroRuc("0000");
                r.setRazonSocial("DATO POR DEFECTO");
                r.setRucAnterior("0000");
                r.setDv("0");
                r.setEstado("DATO POR DEFECTO");
            listaEstadoActivo.add(r);
        }
        
        return listaEstadoActivo;
    }
    public List<Ruc> filtroCancelado(){
        if ( (listaEstadoCancelado == null) || (listaEstadoCancelado.isEmpty())  ) {
            listaEstadoCancelado = new ArrayList<>();
                Ruc r = new Ruc();
                r.setNroRuc("0000");
                r.setRazonSocial("DATO POR DEFECTO");
                r.setRucAnterior("0000");
                r.setDv("0");
                r.setEstado("DATO POR DEFECTO");
            listaEstadoCancelado.add(r);
        }
        
        return listaEstadoCancelado;
    }
    public List<Ruc> filtroSuspendido(){
        if ( (listaEstadoSuspendido == null) || (listaEstadoSuspendido.isEmpty())  ) {
            listaEstadoSuspendido = new ArrayList<>();
                Ruc r = new Ruc();
                r.setNroRuc("0000");
                r.setRazonSocial("DATO POR DEFECTO");
                r.setRucAnterior("0000");
                r.setDv("0");
                r.setEstado("DATO POR DEFECTO");
            listaEstadoSuspendido.add(r);
        }
        
        return listaEstadoSuspendido;
    }
    public List<Ruc> filtroBloqueado(){
        if ( (listaEstadoBloqueado == null) || (listaEstadoBloqueado.isEmpty())  ) {
            listaEstadoBloqueado = new ArrayList<>();
                Ruc r = new Ruc();
                r.setNroRuc("0000");
                r.setRazonSocial("DATO POR DEFECTO");
                r.setRucAnterior("0000");
                r.setDv("0");
                r.setEstado("DATO POR DEFECTO");
            listaEstadoBloqueado.add(r);
        }
        
        return listaEstadoBloqueado;
    }
    public List<Ruc> filtroCanDefinitivo(){
        if ( (listaEstadoCanDefinitivo == null) || (listaEstadoCanDefinitivo.isEmpty())  ) {
            listaEstadoCanDefinitivo = new ArrayList<>();
                Ruc r = new Ruc();
                r.setNroRuc("0000");
                r.setRazonSocial("DATO POR DEFECTO");
                r.setRucAnterior("0000");
                r.setDv("0");
                r.setEstado("DATO POR DEFECTO");
            listaEstadoCanDefinitivo.add(r);
        }
        
        return listaEstadoCanDefinitivo;
    }
    
    @Override
    public boolean cerrarFichero(String url) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
