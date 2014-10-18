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
    public OrdenTrabajo(int Id_Orden, Cliente Id_Cliente, Equipo Id_Equipo, LaboratorioTecnico Id_Lab, int Id_Empleado, Date Fecha_Orden) 
    {
        this.Id_Orden = Id_Orden;
        this.Id_Cliente = Id_Cliente;
        this.Id_Equipo = Id_Equipo;
        this.Id_Lab = Id_Lab;
        this.Id_Empleado = Id_Empleado;
        this.Fecha_Orden = Fecha_Orden;
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

}
