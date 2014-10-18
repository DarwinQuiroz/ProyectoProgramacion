/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Darwin
 */
public class DetalleFactura
{
    public DetalleFactura(CabeceraFactura Id_Fac, CotizacionVenta Id_Venta, OrdenTrabajo Id_Orden, Producto Id_Producto, int CanPro_Fac, double ValPag_Fac, double IVA_Fac, double ValDes_Fact, double TotalPag_Fac) 
    {
        this.Id_Fac = Id_Fac;
        this.Id_Venta = Id_Venta;
        this.Id_Orden = Id_Orden;
        this.Id_Producto = Id_Producto;
        this.CanPro_Fac = CanPro_Fac;
        this.ValPag_Fac = ValPag_Fac;
        this.IVA_Fac = IVA_Fac;
        this.ValDes_Fact = ValDes_Fact;
        this.TotalPag_Fac = TotalPag_Fac;
    }
    
    private CabeceraFactura Id_Fac;

    /**
     * Get the value of Id_Fac
     *
     * @return the value of Id_Fac
     */
    public CabeceraFactura getId_Fac() 
    {
        return Id_Fac;
    }

    /**
     * Set the value of Id_Fac
     *
     * @param Id_Fac new value of Id_Fac
     */
    public void setId_Fac(CabeceraFactura Id_Fac)
    {
        this.Id_Fac = Id_Fac;
    }

    private CotizacionVenta Id_Venta;

    /**
     * Get the value of Id_Venta
     *
     * @return the value of Id_Venta
     */
    public CotizacionVenta getId_Venta() 
    {
        return Id_Venta;
    }

    /**
     * Set the value of Id_Venta
     *
     * @param Id_Venta new value of Id_Venta
     */
    public void setId_Venta(CotizacionVenta Id_Venta) 
    {
        this.Id_Venta = Id_Venta;
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

    private int CanPro_Fac;

    /**
     * Get the value of CanPro_Fac
     *
     * @return the value of CanPro_Fac
     */
    public int getCanPro_Fac() 
    {
        return CanPro_Fac;
    }

    /**
     * Set the value of CanPro_Fac
     *
     * @param CanPro_Fac new value of CanPro_Fac
     */
    public void setCanPro_Fac(int CanPro_Fac)
    {
        this.CanPro_Fac = CanPro_Fac;
    }

    private double ValPag_Fac;

    /**
     * Get the value of ValPag_Fac
     *
     * @return the value of ValPag_Fac
     */
    public double getValPag_Fac() 
    {
        return ValPag_Fac;
    }

    /**
     * Set the value of ValPag_Fac
     *
     * @param ValPag_Fac new value of ValPag_Fac
     */
    public void setValPag_Fac(double ValPag_Fac) 
    {
        this.ValPag_Fac = ValPag_Fac;
    }

    private double IVA_Fac;

    /**
     * Get the value of IVA_Fac
     *
     * @return the value of IVA_Fac
     */
    public double getIVA_Fac() 
    {
        return IVA_Fac;
        //return ValPag_Fac*0.12;
    }

    /**
     * Set the value of IVA_Fac
     *
     * @param IVA_Fac new value of IVA_Fac
     */
    public void setIVA_Fac(double IVA_Fac) 
    {
        this.IVA_Fac = IVA_Fac;
    }

    private double ValDes_Fact;

    /**
     * Get the value of ValDes_Fact
     *
     * @return the value of ValDes_Fact
     */
    public double getValDes_Fact() 
    {
        return ValDes_Fact;
    }

    /**
     * Set the value of ValDes_Fact
     *
     * @param ValDes_Fact new value of ValDes_Fact
     */
    public void setValDes_Fact(double ValDes_Fact) 
    {
        this.ValDes_Fact = ValDes_Fact;
    }

    private double TotalPag_Fac;

    /**
     * Get the value of TotalPag_Fac
     *
     * @return the value of TotalPag_Fac
     */
    public double getTotalPag_Fac() 
    {
        return TotalPag_Fac;
    }

    /**
     * Set the value of TotalPag_Fac
     *
     * @param TotalPag_Fac new value of TotalPag_Fac
     */
    public void setTotalPag_Fac(double TotalPag_Fac) 
    {
        this.TotalPag_Fac = TotalPag_Fac;
    }

}
