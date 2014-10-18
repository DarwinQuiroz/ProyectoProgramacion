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
public class DevolucionEquipo 
{
    public DevolucionEquipo(int Id_Entrega, OrdenTrabajo Id_Orden, int Id_Empleado, Date Fecha_Entrega, Equipo Id_Equipo, int CanEqui_Entrega, double ValPag_Entrega, double ValPenPag_Entrega) 
    {
        this.Id_Entrega = Id_Entrega;
        this.Id_Orden = Id_Orden;
        this.Id_Empleado = Id_Empleado;
        this.Fecha_Entrega = Fecha_Entrega;
        this.Id_Equipo = Id_Equipo;
        this.CanEqui_Entrega = CanEqui_Entrega;
        this.ValPag_Entrega = ValPag_Entrega;
        this.ValPenPag_Entrega = ValPenPag_Entrega;
    }
    
    private int Id_Entrega;

    /**
     * Get the value of Id_Entrega
     *
     * @return the value of Id_Entrega
     */
    public int getId_Entrega() 
    {
        return Id_Entrega;
    }

    /**
     * Set the value of Id_Entrega
     *
     * @param Id_Entrega new value of Id_Entrega
     */
    public void setId_Entrega(int Id_Entrega) 
    {
        this.Id_Entrega = Id_Entrega;
    }

    private OrdenTrabajo Id_Orden;

    /**
     * Get the value of Id_Orden
     *
     * @return the value of Id_Orden
     */
    public OrdenTrabajo getId_Orden()
    {
        return Id_Orden;
    }

    /**
     * Set the value of Id_Orden
     *
     * @param Id_Orden new value of Id_Orden
     */
    public void setId_Orden(OrdenTrabajo Id_Orden)
    {
        this.Id_Orden = Id_Orden;
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

    private Date Fecha_Entrega;

    /**
     * Get the value of Fecha_Entrega
     *
     * @return the value of Fecha_Entrega
     */
    public Date getFecha_Entrega() 
    {
        return Fecha_Entrega;
    }

    /**
     * Set the value of Fecha_Entrega
     *
     * @param Fecha_Entrega new value of Fecha_Entrega
     */
    public void setFecha_Entrega(Date Fecha_Entrega) 
    {
        this.Fecha_Entrega = Fecha_Entrega;
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

    private int CanEqui_Entrega;

    /**
     * Get the value of CanEqui_Entrega
     *
     * @return the value of CanEqui_Entrega
     */
    public int getCanEqui_Entrega() 
    {
        return CanEqui_Entrega;
    }

    /**
     * Set the value of CanEqui_Entrega
     *
     * @param CanEqui_Entrega new value of CanEqui_Entrega
     */
    public void setCanEqui_Entrega(int CanEqui_Entrega)
    {
        this.CanEqui_Entrega = CanEqui_Entrega;
    }

    private double ValPag_Entrega;

    /**
     * Get the value of ValPag_Entrega
     *
     * @return the value of ValPag_Entrega
     */
    public double getValPag_Entrega() 
    {
        return ValPag_Entrega;
    }

    /**
     * Set the value of ValPag_Entrega
     *
     * @param ValPag_Entrega new value of ValPag_Entrega
     */
    public void setValPag_Entrega(double ValPag_Entrega)
    {
        this.ValPag_Entrega = ValPag_Entrega;
    }

    private double ValPenPag_Entrega;

    /**
     * Get the value of ValPenPag_Entrega
     *
     * @return the value of ValPenPag_Entrega
     */
    public double getValPenPag_Entrega() 
    {
        return ValPenPag_Entrega;
    }

    /**
     * Set the value of ValPenPag_Entrega
     *
     * @param ValPenPag_Entrega new value of ValPenPag_Entrega
     */
    public void setValPenPag_Entrega(double ValPenPag_Entrega) 
    {
        this.ValPenPag_Entrega = ValPenPag_Entrega;
    }

}
