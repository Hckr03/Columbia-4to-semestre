package Clases;

import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class Personas {
    private Integer cedula, peso, altura;
    private String nombres, apellidos, telefono, sexo;
    private String fechaNacimiento;
    private Double imc;
    private Ciudades ciudad;
    private List<Nacionalidades> listaNacionalidades;

    public Personas() {
        
    }

    public void setListaNacionalidades(List<Nacionalidades> listaNacionalidades){
        this.listaNacionalidades = listaNacionalidades;
    }

    public List<Nacionalidades> getListaNacionalidades(){
        return listaNacionalidades;
    }

    public void setCiudades(Ciudades ciudad){
        this.ciudad = ciudad;
    }

    public Ciudades getCiudades(){
        return ciudad;
    }

    public Personas(Integer cedula, String nombres, String apellidos) {
            System.out.println("Nombre: " +nombres+ "\nApellidos: " +apellidos+ "\nCedula: " +cedula);
    }
    
    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setfechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Double getIMC() {
        return imc;
    }

    public void setIMC(Double imc) {
        this.imc = imc;
    }

    public void tipoSexo(int sexo) {
        if(sexo == 1){
            System.out.println("masculino");
        }else if(sexo == 2) {
            System.out.println("femenino");
        }
    }

    public void calcularEdad(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(fechaNacimiento, fmt);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);
        System.out.printf("Tu edad es: %s años, %s meses y %s días\n",
        periodo.getYears(), periodo.getMonths(), periodo.getDays());

    }

    public void calcularIMC(Double altura, Double peso) {
        imc = (peso / (altura * altura));
        if(imc>30){
            System.out.println("IMC: Obeso");
        }else if(imc > 25 && imc < 30){
            System.out.println("IMC: Sobrepeso");
        }else if(imc > 18.5 && imc < 25){
            System.out.println("IMC: Normal");
        }else if(imc < 18.5){
            System.out.println("IMC: Bajo peso");
        }else{
            System.out.println("IMC: gg balanza");
        }
    }
}
