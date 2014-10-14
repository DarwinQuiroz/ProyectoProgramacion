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
public class Bodega 
{

    public Bodega(int Id_Bodega, Sucursal Id_Sucursal, String Cod_Bodega, String Nom_Bodega, String Des_Bodega, int Ext_Bodega) 
    {
        this.Id_Bodega = Id_Bodega;
        this.Id_Sucursal = Id_Sucursal;
        this.Cod_Bodega = Cod_Bodega;
        this.Nom_Bodega = Nom_Bodega;
        this.Des_Bodega = Des_Bodega;
        this.Ext_Bodega = Ext_Bodega;
    }
    
    private int Id_Bodega;

    /**
     * Get the value of Id_Bodega
     *
     * @return the value of Id_Bodega
     */
    public int getId_Bodega() 
    {
        return Id_Bodega;
    }

    /**
     * Set the value of Id_Bodega
     *
     * @param Id_Bodega new value of Id_Bodega
     */
    public void setId_Bodega(int Id_Bodega)
    {
        this.Id_Bodega = Id_Bodega;
    }

    private Sucursal Id_Sucursal;

    /**
     * Get the value of Id_Sucursal
     *
     * @return the value of Id_Sucursal
     */
    public Sucursal getId_Sucursal() 
    {
        return Id_Sucursal;
    }

    /**
     * Set the value of Id_Sucursal
     *
     * @param Id_Sucursal new value of Id_Sucursal
     */
    public void setId_Sucursal(Sucursal Id_Sucursal) 
    {
        this.Id_Sucursal = Id_Sucursal;
    }

    private String Cod_Bodega;

    /**
     * Get the value of Cod_Bodega
     *
     * @return the value of Cod_Bodega
     */
    public String getCod_Bodega() 
    {
        return Cod_Bodega;
    }

    /**
     * Set the value of Cod_Bodega
     *
     * @param Cod_Bodega new value of Cod_Bodega
     */
    public void setCod_Bodega(String Cod_Bodega) 
    {
        this.Cod_Bodega = Cod_Bodega;
    }

    private String Nom_Bodega;

    /**
     * Get the value of Nom_Bodega
     *
     * @return the value of Nom_Bodega
     */
    public String getNom_Bodega() 
    {
        return Nom_Bodega;
    }

    /**
     * Set the value of Nom_Bodega
     *
     * @param Nom_Bodega new value of Nom_Bodega
     */
    public void setNom_Bodega(String Nom_Bodega) 
    {
        this.Nom_Bodega = Nom_Bodega;
    }

    private String Des_Bodega;

    /**
     * Get the value of Des_Bodega
     *
     * @return the value of Des_Bodega
     */
    public String getDes_Bodega() 
    {
        return Des_Bodega;
    }

    /**
     * Set the value of Des_Bodega
     *
     * @param Des_Bodega new value of Des_Bodega
     */
    public void setDes_Bodega(String Des_Bodega) 
    {
        this.Des_Bodega = Des_Bodega;
    }

    private int Ext_Bodega;

    /**
     * Get the value of Ext_Bodega
     *
     * @return the value of Ext_Bodega
     */
    public int getExt_Bodega() 
    {
        return Ext_Bodega;
    }

    /**
     * Set the value of Ext_Bodega
     *
     * @param Ext_Bodega new value of Ext_Bodega
     */
    public void setExt_Bodega(int Ext_Bodega) 
    {
        this.Ext_Bodega = Ext_Bodega;
    }

}
