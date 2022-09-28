package ExamenParcial;

import java.util.Date;

public class Contratos {
    private Integer idContratos;
    private String nro_contrato, nombre_llamado;
    private Date fecha_incio, fecha_fin;
    private Double monto_contrato;

    private TiposContratos idTipoContrato;
    private CategoriasContrato idCategoria;
    private Sectores idSector;
    private EstadosContratos idEstadosContrato;
    private Usuarios idUsuario;


    public void Contratos(){

    }

    public Integer getIdContratos() {
        return idContratos;
    }

    public void setIdContratos(Integer idContratos) {
        this.idContratos = idContratos;
    }

    public String getNro_contrato() {
        return nro_contrato;
    }

    public void setNro_contrato(String nro_contrato) {
        this.nro_contrato = nro_contrato;
    }

    public String getNombre_llamado() {
        return nombre_llamado;
    }

    public void setNombre_llamado(String nombre_llamado) {
        this.nombre_llamado = nombre_llamado;
    }

    public Date getFecha_incio() {
        return fecha_incio;
    }

    public void setFecha_incio(Date fecha_incio) {
        this.fecha_incio = fecha_incio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public Double getMonto_contrato() {
        return monto_contrato;
    }

    public void setMonto_contrato(Double monto_contrato) {
        this.monto_contrato = monto_contrato;
    }

    public TiposContratos getIdTipoContrato() {
        return idTipoContrato;
    }

    public void setIdTipoContrato(TiposContratos idTipoContrato) {
        this.idTipoContrato = idTipoContrato;
    }

    public CategoriasContrato getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(CategoriasContrato idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Sectores getIdSector() {
        return idSector;
    }

    public void setIdSector(Sectores idSector) {
        this.idSector = idSector;
    }

    public EstadosContratos getIdEstadosContrato() {
        return idEstadosContrato;
    }

    public void setIdEstadosContrato(EstadosContratos idEstadosContrato) {
        this.idEstadosContrato = idEstadosContrato;
    }

    public Usuarios getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuarios idUsuario) {
        this.idUsuario = idUsuario;
    }
}
