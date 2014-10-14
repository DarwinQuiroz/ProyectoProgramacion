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
public class CotizacionVenta 
{

    public CotizacionVenta(int Id_Venta, Producto Id_Producto, Cliente Id_Cliente, Bodega Id_Bodega, Empleado Id_Empelado, Date Fec_Venta, String Des_Venta, int CanPro_Venta, double Pvp_Venta, String TipPag_Venta, double ValPag_Venta) 
    {
        this.Id_Venta = Id_Venta;
        this.Id_Producto = Id_Producto;
        this.Id_Cliente = Id_Cliente;
        this.Id_Bodega = Id_Bodega;
        this.Id_Empelado = Id_Empelado;
        this.Fec_Venta = Fec_Venta;
        this.Des_Venta = Des_Venta;
        this.CanPro_Venta = CanPro_Venta;
        this.Pvp_Venta = Pvp_Venta;
        this.TipPag_Venta = TipPag_Venta;
        this.ValPag_Venta = ValPag_Venta;
    }
    
    private int Id_Venta;

    /**
     * Get the value of Id_Venta
     *
     * @return the value of Id_Venta
     */
    public int getId_Venta() 
    {
        return Id_Venta;
    }

    /**
     * Set the value of Id_Venta
     *
     * @param Id_Venta new value of Id_Venta
     */
    public void setId_Venta(int Id_Venta) 
    {
        this.Id_Venta = Id_Venta;
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

    private Bodega Id_Bodega;

    /**
     * Get the value of Id_Bodega
     *
     * @return the value of Id_Bodega
     */
    public Bodega getId_Bodega() 
    {
        return Id_Bodega;
    }

    /**
     * Set the value of Id_Bodega
     *
     * @param Id_Bodega new value of Id_Bodega
     */
    public void setId_Bodega(Bodega Id_Bodega) 
    {
        this.Id_Bodega = Id_Bodega;
    }

    private Empleado Id_Empelado;

    /**
     * Get the value of Id_Empelado
     *
     * @return the value of Id_Empelado
     */
    public Empleado getId_Empelado() {
        return Id_Empelado;
    }

    /**
     * Set the value of Id_Empelado
     *
     * @param Id_Empelado new value of Id_Empelado
     */
    public void setId_Empelado(Empleado Id_Empelado) {
        this.Id_Empelado = Id_Empelado;
    }

    private Date Fec_Venta;

    /**
     * Get the value of Fec_Venta
     *
     * @return the value of Fec_Venta
     */
    public Date getFec_Venta() 
    {
        return Fec_Venta;
    }

    /**
     * Set the value of Fec_Venta
     *
     * @param Fec_Venta new value of Fec_Venta
     */
    public void setFec_Venta(Date Fec_Venta) 
    {
        this.Fec_Venta = Fec_Venta;
    }

    private String Des_Venta;

    /**
     * Get the value of Des_Venta
     *
     * @return the value of Des_Venta
     */
    public String getDes_Venta() 
    {
        return Des_Venta;
    }

    /**
     * Set the value of Des_Venta
     *
     * @param Des_Venta new value of Des_Venta
     */
    public void setDes_Venta(String Des_Venta) 
    {
        this.Des_Venta = Des_Venta;
    }

    private int CanPro_Venta;

    /**
     * Get the value of CanPro_Venta
     *
     * @return the value of CanPro_Venta
     */
    public int getCanPro_Venta() 
    {
        return CanPro_Venta;
    }

    /**
     * Set the value of CanPro_Venta
     *
     * @param CanPro_Venta new value of CanPro_Venta
     */
    public void setCanPro_Venta(int CanPro_Venta) 
    {
        this.CanPro_Venta = CanPro_Venta;
    }

    private double Pvp_Venta;

    /**
     * Get the value of Pvp_Venta
     *
     * @return the value of Pvp_Venta
     */
    public double getPvp_Venta() 
    {
        return Pvp_Venta;
    }

    /**
     * Set the value of Pvp_Venta
     *
     * @param Pvp_Venta new value of Pvp_Venta
     */
    public void setPvp_Venta(double Pvp_Venta) 
    {
        this.Pvp_Venta = Pvp_Venta;
    }

    private String TipPag_Venta;

    /**
     * Get the value of TipPag_Venta
     *
     * @return the value of TipPag_Venta
     */
    public String getTipPag_Venta() 
    {
        return TipPag_Venta;
    }

    /**
     * Set the value of TipPag_Venta
     *
     * @param TipPag_Venta new value of TipPag_Venta
     */
    public void setTipPag_Venta(String TipPag_Venta) 
    {
        this.TipPag_Venta = TipPag_Venta;
    }

    private double ValPag_Venta;

    /**
     * Get the value of ValPag_Venta
     *
     * @return the value of ValPag_Venta
     */
    public double getValPag_Venta() 
    {
        return ValPag_Venta;
    }

    /**
     * Set the value of ValPag_Venta
     *
     * @param ValPag_Venta new value of ValPag_Venta
     */
    public void setValPag_Venta(double ValPag_Venta) 
    {
        this.ValPag_Venta = ValPag_Venta;
    }

}
