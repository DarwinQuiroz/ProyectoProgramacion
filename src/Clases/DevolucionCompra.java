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
public class DevolucionCompra 
{ 

    public DevolucionCompra(int Id_DevCompra, Producto Id_Producto, int NumFacCom_DevCompra, Date Fec_DevCompra, String Des_DevCompra, int CanPro_DevCompra, double Pcp_DevCompra, double ValCob_DevCompra, Compra Id_Compra, Empleado Id_Empleado) 
    {
        this.Id_DevCompra = Id_DevCompra;
        this.Id_Producto = Id_Producto;
        this.NumFacCom_DevCompra = NumFacCom_DevCompra;
        this.Fec_DevCompra = Fec_DevCompra;
        this.Des_DevCompra = Des_DevCompra;
        this.CanPro_DevCompra = CanPro_DevCompra;
        this.Pcp_DevCompra = Pcp_DevCompra;
        this.ValCob_DevCompra = ValCob_DevCompra;
        this.Id_Compra = Id_Compra;
        this.Id_Empleado = Id_Empleado;
    }
    
    private int Id_DevCompra;

    /**
     * Get the value of Id_DevCompra
     *
     * @return the value of Id_DevCompra
     */
    public int getId_DevCompra() 
    {
        return Id_DevCompra;
    }

    /**
     * Set the value of Id_DevCompra
     *
     * @param Id_DevCompra new value of Id_DevCompra
     */
    public void setId_DevCompra(int Id_DevCompra) 
    {
        this.Id_DevCompra = Id_DevCompra;
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

    private int NumFacCom_DevCompra;

    /**
     * Get the value of NumFacCom_DevCompra
     *
     * @return the value of NumFacCom_DevCompra
     */
    public int getNumFacCom_DevCompra() 
    {
        return NumFacCom_DevCompra;
    }

    /**
     * Set the value of NumFacCom_DevCompra
     *
     * @param NumFacCom_DevCompra new value of NumFacCom_DevCompra
     */
    public void setNumFacCom_DevCompra(int NumFacCom_DevCompra) 
    {
        this.NumFacCom_DevCompra = NumFacCom_DevCompra;
    }

    private Date Fec_DevCompra;

    /**
     * Get the value of Fec_DevCompra
     *
     * @return the value of Fec_DevCompra
     */
    public Date getFec_DevCompra() 
    {
        return Fec_DevCompra;
    }

    /**
     * Set the value of Fec_DevCompra
     *
     * @param Fec_DevCompra new value of Fec_DevCompra
     */
    public void setFec_DevCompra(Date Fec_DevCompra) 
    {
        this.Fec_DevCompra = Fec_DevCompra;
    }

    private String Des_DevCompra;

    /**
     * Get the value of Des_DevCompra
     *
     * @return the value of Des_DevCompra
     */
    public String getDes_DevCompra() 
    {
        return Des_DevCompra;
    }

    /**
     * Set the value of Des_DevCompra
     *
     * @param Des_DevCompra new value of Des_DevCompra
     */
    public void setDes_DevCompra(String Des_DevCompra) 
    {
        this.Des_DevCompra = Des_DevCompra;
    }

    private int CanPro_DevCompra;

    /**
     * Get the value of CanPro_DevCompra
     *
     * @return the value of CanPro_DevCompra
     */
    public int getCanPro_DevCompra() 
    {
        return CanPro_DevCompra;
    }

    /**
     * Set the value of CanPro_DevCompra
     *
     * @param CanPro_DevCompra new value of CanPro_DevCompra
     */
    public void setCanPro_DevCompra(int CanPro_DevCompra) 
    {
        this.CanPro_DevCompra = CanPro_DevCompra;
    }

    private double Pcp_DevCompra;

    /**
     * Get the value of Pcp_DevCompra
     *
     * @return the value of Pcp_DevCompra
     */
    public double getPcp_DevCompra() 
    {
        return Pcp_DevCompra;
    }

    /**
     * Set the value of Pcp_DevCompra
     *
     * @param Pcp_DevCompra new value of Pcp_DevCompra
     */
    public void setPcp_DevCompra(double Pcp_DevCompra) 
    {
        this.Pcp_DevCompra = Pcp_DevCompra;
    }

    private double ValCob_DevCompra;

    /**
     * Get the value of ValCob_DevCompra
     *
     * @return the value of ValCob_DevCompra
     */
    public double getValCob_DevCompra()
    {
        return ValCob_DevCompra;
    }

    /**
     * Set the value of ValCob_DevCompra
     *
     * @param ValCob_DevCompra new value of ValCob_DevCompra
     */
    public void setValCob_DevCompra(double ValCob_DevCompra) 
    {
        this.ValCob_DevCompra = ValCob_DevCompra;
    }

    private Compra Id_Compra;

    /**
     * Get the value of Id_Compra
     *
     * @return the value of Id_Compra
     */
    public Compra getId_Compra() 
    {
        return Id_Compra;
    }

    /**
     * Set the value of Id_Compra
     *
     * @param Id_Compra new value of Id_Compra
     */
    public void setId_Compra(Compra Id_Compra) 
    {
        this.Id_Compra = Id_Compra;
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
