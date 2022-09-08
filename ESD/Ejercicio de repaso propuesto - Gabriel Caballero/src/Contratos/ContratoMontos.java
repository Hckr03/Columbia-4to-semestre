package Contratos;

import java.util.Date;

public class ContratoMontos extends Contratos{
    private Integer idMonto;
    private Date fechaFin;
    private Integer montoMinimo;
    private Integer montoMaximo;

    public void ContratoMontos(){

    }

    public Integer getIdMonto() {
        return idMonto;
    }

    public void setIdMonto(Integer idMonto) {
        this.idMonto = idMonto;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getMontoMinimo() {
        return montoMinimo;
    }

    public void setMontoMinimo(Integer montoMinimo) {
        this.montoMinimo = montoMinimo;
    }

    public Integer getMontoMaximo() {
        return montoMaximo;
    }

    public void setMontoMaximo(Integer montoMaximo) {
        this.montoMaximo = montoMaximo;
    }
}
