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
public class LaboratorioTecnico 
{
    public LaboratorioTecnico(int Id_Lab, Sucursal Id_Sucursal, String Cod_Lab, String Nom_Lab, String Des_Lab, int Ext_Lab) 
    {
        this.Id_Lab = Id_Lab;
        this.Id_Sucursal = Id_Sucursal;
        this.Cod_Lab = Cod_Lab;
        this.Nom_Lab = Nom_Lab;
        this.Des_Lab = Des_Lab;
        this.Ext_Lab = Ext_Lab;
    }   
   
    private int Id_Lab;

    /**
     * Get the value of Id_Lab
     *
     * @return the value of Id_Lab
     */
    public int getId_Lab() 
    {
        return Id_Lab;
    }

    /**
     * Set the value of Id_Lab
     *
     * @param Id_Lab new value of Id_Lab
     */
    public void setId_Lab(int Id_Lab) 
    {
        this.Id_Lab = Id_Lab;
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

    private String Cod_Lab;

    /**
     * Get the value of Cod_Lab
     *
     * @return the value of Cod_Lab
     */
    public String getCod_Lab() 
    {
        return Cod_Lab;
    }

    /**
     * Set the value of Cod_Lab
     *
     * @param Cod_Lab new value of Cod_Lab
     */
    public void setCod_Lab(String Cod_Lab) 
    {
        this.Cod_Lab = Cod_Lab;
    }

    private String Nom_Lab;

    /**
     * Get the value of Nom_Lab
     *
     * @return the value of Nom_Lab
     */
    public String getNom_Lab() 
    {
        return Nom_Lab;
    }

    /**
     * Set the value of Nom_Lab
     *
     * @param Nom_Lab new value of Nom_Lab
     */
    public void setNom_Lab(String Nom_Lab) 
    {
        this.Nom_Lab = Nom_Lab;
    }

    private String Des_Lab;

    /**
     * Get the value of Des_Lab
     *
     * @return the value of Des_Lab
     */
    public String getDes_Lab() 
    {
        return Des_Lab;
    }

    /**
     * Set the value of Des_Lab
     *
     * @param Des_Lab new value of Des_Lab
     */
    public void setDes_Lab(String Des_Lab) 
    {
        this.Des_Lab = Des_Lab;
    }

    private int Ext_Lab;

    /**
     * Get the value of Ext_Lab
     *
     * @return the value of Ext_Lab
     */
    public int getExt_Lab() 
    {
        return Ext_Lab;
    }

    /**
     * Set the value of Ext_Lab
     *
     * @param Ext_Lab new value of Ext_Lab
     */
    public void setExt_Lab(int Ext_Lab) 
    {
        this.Ext_Lab = Ext_Lab;
    }
}
