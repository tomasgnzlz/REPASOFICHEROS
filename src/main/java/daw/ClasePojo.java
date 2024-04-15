/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author tomas
 */
public class ClasePojo {

    // Declaración de atributos
    private String nombre;
    private String dniPasaporte;
    private String tipoPersonal;
    private String puestoTrabajo;
    private boolean horarioPersonalizado;
    private LocalDate fechaAlta;
    private LocalDate fechaBaja;
    private LocalTime horasIniciales;
    private String totalHoras;
    private boolean activo;

    public ClasePojo(String nombre, String dniPasaporte, String tipoPersonal, String puestoTrabajo, boolean horarioPersonalizado, LocalDate fechaAlta, LocalDate fechaBaja, LocalTime horasIniciales, String totalHoras, boolean activo) {
        this.nombre = nombre;
        this.dniPasaporte = dniPasaporte;
        this.tipoPersonal = tipoPersonal;
        this.puestoTrabajo = puestoTrabajo;
        this.horarioPersonalizado = horarioPersonalizado;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        this.horasIniciales = horasIniciales;
        this.totalHoras = totalHoras;
        this.activo = activo;
    }

    public ClasePojo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDniPasaporte() {
        return dniPasaporte;
    }

    public void setDniPasaporte(String dniPasaporte) {
        this.dniPasaporte = dniPasaporte;
    }

    public String getTipoPersonal() {
        return tipoPersonal;
    }

    public void setTipoPersonal(String tipoPersonal) {
        this.tipoPersonal = tipoPersonal;
    }

    public String getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public void setPuestoTrabajo(String puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    public boolean isHorarioPersonalizado() {
        return horarioPersonalizado;
    }

    public void setHorarioPersonalizado(boolean horarioPersonalizado) {
        this.horarioPersonalizado = horarioPersonalizado;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public LocalTime getHorasIniciales() {
        return horasIniciales;
    }

    public void setHorasIniciales(LocalTime horasIniciales) {
        this.horasIniciales = horasIniciales;
    }

    public String getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(String totalHoras) {
        this.totalHoras = totalHoras;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

  
    @Override
    public String toString() {
        return "ClasePojo{" + "nombre=" + nombre + ", dniPasaporte=" + dniPasaporte + ", tipoPersonal=" + tipoPersonal + ", puestoTrabajo=" + puestoTrabajo + ", horarioPersonalizado=" + horarioPersonalizado + ", fechaAlta=" + fechaAlta + ", fechaBaja=" + fechaBaja + ", horasIniciales=" + horasIniciales + ", totalHoras=" + totalHoras + ", activo=" + activo + '}';
    }

}
