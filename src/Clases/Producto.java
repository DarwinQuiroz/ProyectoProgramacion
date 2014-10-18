/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.List;
import org.omg.CORBA.portable.ApplicationException;

/**
 *
 * @author Darwin
 */
public class Producto 
{ 

    public Producto(List<ProductoBodega> ProductoBodega, int Id_Producto, Bodega Id_Bodega, Proveedor Id_Proveedor, Descuento Id_Descuento, String Nom_Producto, String Des_Producto, String Est_Producto, String Stock_Producto, double PVP_Producto, String Mar_Producto, String Tam_Producto) 
    {
        this.ProductoBodega = ProductoBodega;
        this.Id_Producto = Id_Producto;
        this.Id_Bodega = Id_Bodega;
        this.Id_Proveedor = Id_Proveedor;
        this.Id_Descuento = Id_Descuento;
        this.Nom_Producto = Nom_Producto;
        this.Des_Producto = Des_Producto;
        this.Est_Producto = Est_Producto;
        this.Stock_Producto = Stock_Producto;
        this.PVP_Producto = PVP_Producto;
        this.Mar_Producto = Mar_Producto;
        this.Tam_Producto = Tam_Producto;
    }    
    private List<ProductoBodega> ProductoBodega;
    
    public List<ProductoBodega> getProductoBodega() 
    {
        return ProductoBodega;
    }    
    public void setProductoBodega(List<ProductoBodega> ProductoBodega) 
    {        
        this.ProductoBodega = ProductoBodega;
    }
    
    private int Id_Producto;
    /**
     * Get the value of Id_Producto
     *
     * @return the value of Id_Producto
     */
    public int getId_Producto() 
    {
        return Id_Producto;
    }

    /**
     * Set the value of Id_Producto
     *
     * @param Id_Producto new value of Id_Producto
     */
    public void setId_Producto(int Id_Producto) 
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

    private Proveedor Id_Proveedor;

    /**
     * Get the value of Id_Proveedor
     *
     * @return the value of Id_Proveedor
     */
    public Proveedor getId_Proveedor() 
    {
        return Id_Proveedor;
    }

    /**
     * Set the value of Id_Proveedor
     *
     * @param Id_Proveedor new value of Id_Proveedor
     */
    public void setId_Proveedor(Proveedor Id_Proveedor) 
    {
        this.Id_Proveedor = Id_Proveedor;
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
    
    
    private String Nom_Producto;

    /**
     * Get the value of Nom_Producto
     *
     * @return the value of Nom_Producto
     */
    public String getNom_Producto() 
    {
        return Nom_Producto;
    }

    /**
     * Set the value of Nom_Producto
     *
     * @param Nom_Producto new value of Nom_Producto
     */
    public void setNom_Producto(String Nom_Producto) 
    {
        this.Nom_Producto = Nom_Producto;
    }

    private String Des_Producto;

    /**
     * Get the value of Des_Producto
     *
     * @return the value of Des_Producto
     */
    public String getDes_Producto() 
    {
        return Des_Producto;
    }

    /**
     * Set the value of Des_Producto
     *
     * @param Des_Producto new value of Des_Producto
     */
    public void setDes_Producto(String Des_Producto) 
    {
        this.Des_Producto = Des_Producto;
    }

    private String Est_Producto;

    /**
     * Get the value of Est_Producto
     *
     * @return the value of Est_Producto
     */
    public String getEst_Producto() 
    {
        return Est_Producto;
    }

    /**
     * Set the value of Est_Producto
     *
     * @param Est_Producto new value of Est_Producto
     */
    public void setEst_Producto(String Est_Producto) 
    {
        this.Est_Producto = Est_Producto;
    }

    private String Stock_Producto;

    /**
     * Get the value of Stock_Producto
     *
     * @return the value of Stock_Producto
     */
    public String getStock_Producto() 
    {
        return Stock_Producto;
    }

    /**
     * Set the value of Stock_Producto
     *
     * @param Stock_Producto new value of Stock_Producto
     */
    public void setStock_Producto(String Stock_Producto) 
    {
        this.Stock_Producto = Stock_Producto;
    }

    private double PVP_Producto;

    /**
     * Get the value of PVP_Producto
     *
     * @return the value of PVP_Producto
     */
    public double getPVP_Producto() 
    {
        return PVP_Producto;
    }

    /**
     * Set the value of PVP_Producto
     *
     * @param PVP_Producto new value of PVP_Producto
     */
    public void setPVP_Producto(double PVP_Producto) 
    {
        this.PVP_Producto = PVP_Producto;
    }

    private String Mar_Producto;

    /**
     * Get the value of Mar_Producto
     *
     * @return the value of Mar_Producto
     */
    public String getMar_Producto() 
    {
        return Mar_Producto;
    }

    /**
     * Set the value of Mar_Producto
     *
     * @param Mar_Producto new value of Mar_Producto
     */
    public void setMar_Producto(String Mar_Producto) 
    {
        this.Mar_Producto = Mar_Producto;
    }

    private String Tam_Producto;

    /**
     * Get the value of Tam_Producto
     *
     * @return the value of Tam_Producto
     */
    public String getTam_Producto() 
    {
        return Tam_Producto;
    }

    /**
     * Set the value of Tam_Producto
     *
     * @param Tam_Producto new value of Tam_Producto
     */
    public void setTam_Producto(String Tam_Producto) 
    {
        this.Tam_Producto = Tam_Producto;
    }

}
