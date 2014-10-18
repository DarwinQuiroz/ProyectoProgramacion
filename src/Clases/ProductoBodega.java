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
public class ProductoBodega 
{
    public ProductoBodega(Producto Id_Producto, Bodega Id_Bodega, int Cantidad)
    {
        this.Id_Producto = Id_Producto;
        this.Id_Bodega = Id_Bodega;
        this.Cantidad = Cantidad;
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

    private int Cantidad;

    /**
     * Get the value of Cantidad
     *
     * @return the value of Cantidad
     */
    public int getCantidad() 
    {
        return Cantidad;
    }

    /**
     * Set the value of Cantidad
     *
     * @param Cantidad new value of Cantidad
     */
    public void setCantidad(int Cantidad) 
    {
        this.Cantidad = Cantidad;
    }

}
