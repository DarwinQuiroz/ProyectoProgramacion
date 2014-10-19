/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author Darwin
 */
public class OrdenTrabajo 
{
    public OrdenTrabajo(int Id_Orden, Cliente Id_Cliente, Equipo Id_Equipo, LaboratorioTecnico Id_Lab, int Id_Empleado, Date Fecha_Orden, int Cant_Orden, String DesEqui_Orden, Date FechEnt_Orden, double ValPag_Orden, Servicio Id_Servicio, double AbonoPag_Orden, Descuento Id_Descuento) 
    {
        this.Id_Orden = Id_Orden;
        this.Id_Cliente = Id_Cliente;
        this.Id_Equipo = Id_Equipo;
        this.Id_Lab = Id_Lab;
        this.Id_Empleado = Id_Empleado;
        this.Fecha_Orden = Fecha_Orden;
        this.Cant_Orden = Cant_Orden;
        this.DesEqui_Orden = DesEqui_Orden;
        this.FechEnt_Orden = FechEnt_Orden;
        this.ValPag_Orden = ValPag_Orden;
        this.Id_Servicio = Id_Servicio;
        this.AbonoPag_Orden = AbonoPag_Orden;
        this.Id_Descuento = Id_Descuento;
    }
    
    
    private int Id_Orden;

    /**
     * Get the value of Id_Orden
     *
     * @return the value of Id_Orden
     */
    public int getId_Orden() 
    {
        return Id_Orden;
    }

    /**
     * Set the value of Id_Orden
     *
     * @param Id_Orden new value of Id_Orden
     */
    public void setId_Orden(int Id_Orden) 
    {
        this.Id_Orden = Id_Orden;
    }

    private Cliente Id_Cliente;

    /**
     * Get the value of Id_Cliente
     *
     * @return the value of Id_Cliente
     */
    public Cliente getId_Cliente() 
    {
        return Id_Cliente;
    }

    /**
     * Set the value of Id_Cliente
     *
     * @param Id_Cliente new value of Id_Cliente
     */
    public void setId_Cliente(Cliente Id_Cliente) 
    {
        this.Id_Cliente = Id_Cliente;
    }

    private Equipo Id_Equipo;

    /**
     * Get the value of Id_Equipo
     *
     * @return the value of Id_Equipo
     */
    public Equipo getId_Equipo()
    {
        return Id_Equipo;
    }

    /**
     * Set the value of Id_Equipo
     *
     * @param Id_Equipo new value of Id_Equipo
     */
    public void setId_Equipo(Equipo Id_Equipo) 
    {
        this.Id_Equipo = Id_Equipo;
    }

    private LaboratorioTecnico Id_Lab;

    /**
     * Get the value of Id_Lab
     *
     * @return the value of Id_Lab
     */
    public LaboratorioTecnico getId_Lab() 
    {
        return Id_Lab;
    }

    /**
     * Set the value of Id_Lab
     *
     * @param Id_Lab new value of Id_Lab
     */
    public void setId_Lab(LaboratorioTecnico Id_Lab) 
    {
        this.Id_Lab = Id_Lab;
    }

    private int Id_Empleado;

    /**
     * Get the value of Id_Empleado
     *
     * @return the value of Id_Empleado
     */
    public int getId_Empleado() 
    {
        return Id_Empleado;
    }

    /**
     * Set the value of Id_Empleado
     *
     * @param Id_Empleado new value of Id_Empleado
     */
    public void setId_Empleado(int Id_Empleado) 
    {
        this.Id_Empleado = Id_Empleado;
    }

    private Date Fecha_Orden;

    /**
     * Get the value of Fecha_Orden
     *
     * @return the value of Fecha_Orden
     */
    public Date getFecha_Orden() 
    {
        return Fecha_Orden;
    }

    /**
     * Set the value of Fecha_Orden
     *
     * @param Fecha_Orden new value of Fecha_Orden
     */
    public void setFecha_Orden(Date Fecha_Orden) 
    {
        this.Fecha_Orden = Fecha_Orden;
    } 
    
        private int Cant_Orden;

    /**
     * Get the value of Cant_Orden
     *
     * @return the value of Cant_Orden
     */
    public int getCant_Orden() 
    {
        return Cant_Orden;
    }

    /**
     * Set the value of Cant_Orden
     *
     * @param Cant_Orden new value of Cant_Orden
     */
    public void setCant_Orden(int Cant_Orden) 
    {
        this.Cant_Orden = Cant_Orden;
    }

    private String DesEqui_Orden;

    /**
     * Get the value of DesEqui_Orden
     *
     * @return the value of DesEqui_Orden
     */
    public String getDesEqui_Orden() 
    {
        return DesEqui_Orden;
    }

    /**
     * Set the value of DesEqui_Orden
     *
     * @param DesEqui_Orden new value of DesEqui_Orden
     */
    public void setDesEqui_Orden(String DesEqui_Orden)
    {
        this.DesEqui_Orden = DesEqui_Orden;
    }

    private Date FechEnt_Orden;

    /**
     * Get the value of FechEnt_Orden
     *
     * @return the value of FechEnt_Orden
     */
    public Date getFechEnt_Orden() 
    {
        return FechEnt_Orden;
    }

    /**
     * Set the value of FechEnt_Orden
     *
     * @param FechEnt_Orden new value of FechEnt_Orden
     */
    public void setFechEnt_Orden(Date FechEnt_Orden)
    {
        this.FechEnt_Orden = FechEnt_Orden;
    }

    private double ValPag_Orden;

    /**
     * Get the value of ValPag_Orden
     *
     * @return the value of ValPag_Orden
     */
    public double getValPag_Orden() 
    {
        return ValPag_Orden;
    }

    /**
     * Set the value of ValPag_Orden
     *
     * @param ValPag_Orden new value of ValPag_Orden
     */
    public void setValPag_Orden(double ValPag_Orden) 
    {
        this.ValPag_Orden = ValPag_Orden;
    }

    private Servicio Id_Servicio;

    /**
     * Get the value of Id_Servicio
     *
     * @return the value of Id_Servicio
     */
    public Servicio getId_Servicio() 
    {
        return Id_Servicio;
    }

    /**
     * Set the value of Id_Servicio
     *
     * @param Id_Servicio new value of Id_Servicio
     */
    public void setId_Servicio(Servicio Id_Servicio)
    {
        this.Id_Servicio = Id_Servicio;
    }

    private double AbonoPag_Orden;

    /**
     * Get the value of AbonoPag_Orden
     *
     * @return the value of AbonoPag_Orden
     */
    public double getAbonoPag_Orden()
    {
        return AbonoPag_Orden;
    }

    /**
     * Set the value of AbonoPag_Orden
     *
     * @param AbonoPag_Orden new value of AbonoPag_Orden
     */
    public void setAbonoPag_Orden(double AbonoPag_Orden)
    {
        this.AbonoPag_Orden = AbonoPag_Orden;
    }

    private Descuento Id_Descuento;

    /**
     * Get the value of Id_Descuento
     *
     * @return the value of Id_Descuento
     */
    public Descuento getId_Descuento() 
    {
        return Id_Descuento;
    }

    /**
     * Set the value of Id_Descuento
     *
     * @param Id_Descuento new value of Id_Descuento
     */
    public void setId_Descuento(Descuento Id_Descuento)
    {
        this.Id_Descuento = Id_Descuento;
    }

}
