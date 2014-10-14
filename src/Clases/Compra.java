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
public class Compra 
{    
    private int Id_Compra;

    /**
     * Get the value of Id_Compra
     *
     * @return the value of Id_Compra
     */
    public int getId_Compra() 
    {
        return Id_Compra;
    }

    /**
     * Set the value of Id_Compra
     *
     * @param Id_Compra new value of Id_Compra
     */
    public void setId_Compra(int Id_Compra) 
    {
        this.Id_Compra = Id_Compra;
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

    private int NumFac_Compra;

    /**
     * Get the value of NumFac_Compra
     *
     * @return the value of NumFac_Compra
     */
    public int getNumFac_Compra() 
    {
        return NumFac_Compra;
    }

    /**
     * Set the value of NumFac_Compra
     *
     * @param NumFac_Compra new value of NumFac_Compra
     */
    public void setNumFac_Compra(int NumFac_Compra) 
    {
        this.NumFac_Compra = NumFac_Compra;
    }

    private Date Fec_Compra;

    /**
     * Get the value of Fec_Compra
     *
     * @return the value of Fec_Compra
     */
    public Date getFec_Compra() 
    {
        return Fec_Compra;
    }

    /**
     * Set the value of Fec_Compra
     *
     * @param Fec_Compra new value of Fec_Compra
     */
    public void setFec_Compra(Date Fec_Compra) 
    {
        this.Fec_Compra = Fec_Compra;
    }

    private String Des_Compra;

    /**
     * Get the value of Des_Compra
     *
     * @return the value of Des_Compra
     */
    public String getDes_Compra() 
    {
        return Des_Compra;
    }

    /**
     * Set the value of Des_Compra
     *
     * @param Des_Compra new value of Des_Compra
     */
    public void setDes_Compra(String Des_Compra) 
    {
        this.Des_Compra = Des_Compra;
    }

    private int CanPro_Compra;

    /**
     * Get the value of CanPro_Compra
     *
     * @return the value of CanPro_Compra
     */
    public int getCanPro_Compra() 
    {
        return CanPro_Compra;
    }

    /**
     * Set the value of CanPro_Compra
     *
     * @param CanPro_Compra new value of CanPro_Compra
     */
    public void setCanPro_Compra(int CanPro_Compra) 
    {
        this.CanPro_Compra = CanPro_Compra;
    }

    private double Pcp_Compra;

    /**
     * Get the value of Pcp_Compra
     *
     * @return the value of Pcp_Compra
     */
    public double getPcp_Compra() 
    {
        return Pcp_Compra;
    }

    /**
     * Set the value of Pcp_Compra
     *
     * @param Pcp_Compra new value of Pcp_Compra
     */
    public void setPcp_Compra(double Pcp_Compra) 
    {
        this.Pcp_Compra = Pcp_Compra;
    }

    private double ValPag_Compra;

    /**
     * Get the value of ValPag_Compra
     *
     * @return the value of ValPag_Compra
     */
    public double getValPag_Compra() 
    {
        return ValPag_Compra;
    }

    /**
     * Set the value of ValPag_Compra
     *
     * @param ValPag_Compra new value of ValPag_Compra
     */
    public void setValPag_Compra(double ValPag_Compra) 
    {
        this.ValPag_Compra = ValPag_Compra;
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

}
