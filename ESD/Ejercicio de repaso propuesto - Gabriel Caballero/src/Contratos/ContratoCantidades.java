package Contratos;

import java.util.Date;

public class ContratoCantidades extends Contratos{
    private Integer idCantidad;
    private Date fechaFin;
    private Integer cantMinima;
    private Integer cantMaxima;

    public void ContratoCantidades(){

    }

    public Integer getIdCantidad() {
        return idCantidad;
    }

    public void setIdCantidad(Integer idCantidad) {
        this.idCantidad = idCantidad;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getCantMinima() {
        return cantMinima;
    }

    public void setCantMinima(Integer cantMinima) {
        this.cantMinima = cantMinima;
    }

    public Integer getCantMaxima() {
        return cantMaxima;
    }

    public void setCantMaxima(Integer cantMaxima) {
        this.cantMaxima = cantMaxima;
    }
}
