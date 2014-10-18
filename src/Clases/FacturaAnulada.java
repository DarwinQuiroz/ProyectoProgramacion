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
public class FacturaAnulada 
{
    public FacturaAnulada(int Id_Anulacion, DetalleFactura Id_Factura, Empleado Id_Empleado, Producto Id_Producto, Date Fecha_Anulacion, String Des_Anulacion, int CanPro_Anulacion, double ValPro_Anulacion, double ValT_Anulacion) 
    {
        this.Id_Anulacion = Id_Anulacion;
        this.Id_Factura = Id_Factura;
        this.Id_Empleado = Id_Empleado;
        this.Id_Producto = Id_Producto;
        this.Fecha_Anulacion = Fecha_Anulacion;
        this.Des_Anulacion = Des_Anulacion;
        this.CanPro_Anulacion = CanPro_Anulacion;
        this.ValPro_Anulacion = ValPro_Anulacion;
        this.ValT_Anulacion = ValT_Anulacion;
    }
    
    private int Id_Anulacion;

    /**
     * Get the value of Id_Anulacion
     *
     * @return the value of Id_Anulacion
     */
    public int getId_Anulacion() 
    {
        return Id_Anulacion;
    }

    /**
     * Set the value of Id_Anulacion
     *
     * @param Id_Anulacion new value of Id_Anulacion
     */
    public void setId_Anulacion(int Id_Anulacion)
    {
        this.Id_Anulacion = Id_Anulacion;
    }

    private DetalleFactura Id_Factura;

    /**
     * Get the value of Id_Factura
     *
     * @return the value of Id_Factura
     */
    public DetalleFactura getId_Factura() 
    {
        return Id_Factura;
    }

    /**
     * Set the value of Id_Factura
     *
     * @param Id_Factura new value of Id_Factura
     */
    public void setId_Factura(DetalleFactura Id_Factura) 
    {
        this.Id_Factura = Id_Factura;
    }

    private Empleado Id_Empleado;

    /**
     * Get the value of Id_Empleado
     *
     * @return the value of Id_Empleado
     */
    public Empleado getId_Empleado()
    {
        return Id_Empleado;
    }

    /**
     * Set the value of Id_Empleado
     *
     * @param Id_Empleado new value of Id_Empleado
     */
    public void setId_Empleado(Empleado Id_Empleado)
    {
        this.Id_Empleado = Id_Empleado;
    }

    private Producto Id_Producto;

    /**
     * Get the value of Id_Producto
     *
     * @return the value of Id_Producto
     */
    public Producto getId_Producto() 
    {
        return Id_Producto;
    }

    /**
     * Set the value of Id_Producto
     *
     * @param Id_Producto new value of Id_Producto
     */
    public void setId_Producto(Producto Id_Producto) 
    {
        this.Id_Producto = Id_Producto;
    }

    private Date Fecha_Anulacion;

    /**
     * Get the value of Fecha_Anulacion
     *
     * @return the value of Fecha_Anulacion
     */
    public Date getFecha_Anulacion() 
    {
        return Fecha_Anulacion;
    }

    /**
     * Set the value of Fecha_Anulacion
     *
     * @param Fecha_Anulacion new value of Fecha_Anulacion
     */
    public void setFecha_Anulacion(Date Fecha_Anulacion)
    {
        this.Fecha_Anulacion = Fecha_Anulacion;
    }

    private String Des_Anulacion;

    /**
     * Get the value of Des_Anulacion
     *
     * @return the value of Des_Anulacion
     */
    public String getDes_Anulacion() 
    {
        return Des_Anulacion;
    }

    /**
     * Set the value of Des_Anulacion
     *
     * @param Des_Anulacion new value of Des_Anulacion
     */
    public void setDes_Anulacion(String Des_Anulacion) 
    {
        this.Des_Anulacion = Des_Anulacion;
    }

    private int CanPro_Anulacion;

    /**
     * Get the value of CanPro_Anulacion
     *
     * @return the value of CanPro_Anulacion
     */
    public int getCanPro_Anulacion() 
    {
        return CanPro_Anulacion;
    }

    /**
     * Set the value of CanPro_Anulacion
     *
     * @param CanPro_Anulacion new value of CanPro_Anulacion
     */
    public void setCanPro_Anulacion(int CanPro_Anulacion) 
    {
        this.CanPro_Anulacion = CanPro_Anulacion;
    }

    private double ValPro_Anulacion;

    /**
     * Get the value of ValPro_Anulacion
     *
     * @return the value of ValPro_Anulacion
     */
    public double getValPro_Anulacion() 
    {
        return ValPro_Anulacion;
    }

    /**
     * Set the value of ValPro_Anulacion
     *
     * @param ValPro_Anulacion new value of ValPro_Anulacion
     */
    public void setValPro_Anulacion(double ValPro_Anulacion) 
    {
        this.ValPro_Anulacion = ValPro_Anulacion;
    }

    private double ValT_Anulacion;

    /**
     * Get the value of ValT_Anulacion
     *
     * @return the value of ValT_Anulacion
     */
    public double getValT_Anulacion() 
    {
        return ValT_Anulacion;
    }

    /**
     * Set the value of ValT_Anulacion
     *
     * @param ValT_Anulacion new value of ValT_Anulacion
     */
    public void setValT_Anulacion(double ValT_Anulacion) 
    {
        this.ValT_Anulacion = ValT_Anulacion;
    }
}
