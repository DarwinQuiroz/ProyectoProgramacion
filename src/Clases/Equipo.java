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
public class Equipo 
{

    public Equipo(int Id_Equipo, LaboratorioTecnico Id_Laboratorio, String Serie_Equipo, String Nom_Equipo, String Des_Equipo, int NumRep_Equipo, double Val_Equipo) 
    {
        this.Id_Equipo = Id_Equipo;
        this.Id_Laboratorio = Id_Laboratorio;
        this.Serie_Equipo = Serie_Equipo;
        this.Nom_Equipo = Nom_Equipo;
        this.Des_Equipo = Des_Equipo;
        this.NumRep_Equipo = NumRep_Equipo;
        this.Val_Equipo = Val_Equipo;
    }
    
    private int Id_Equipo;

    /**
     * Get the value of Id_Equipo
     *
     * @return the value of Id_Equipo
     */
    public int getId_Equipo() 
    {
        return Id_Equipo;
    }

    /**
     * Set the value of Id_Equipo
     *
     * @param Id_Equipo new value of Id_Equipo
     */
    public void setId_Equipo(int Id_Equipo) 
    {
        this.Id_Equipo = Id_Equipo;
    }

    private LaboratorioTecnico Id_Laboratorio;

    /**
     * Get the value of Id_Laboratorio
     *
     * @return the value of Id_Laboratorio
     */
    public LaboratorioTecnico getId_Laboratorio() 
    {
        return Id_Laboratorio;
    }

    /**
     * Set the value of Id_Laboratorio
     *
     * @param Id_Laboratorio new value of Id_Laboratorio
     */
    public void setId_Laboratorio(LaboratorioTecnico Id_Laboratorio) 
    {
        this.Id_Laboratorio = Id_Laboratorio;
    }

    private String Serie_Equipo;

    /**
     * Get the value of Serie_Equipo
     *
     * @return the value of Serie_Equipo
     */
    public String getSerie_Equipo() 
    {
        return Serie_Equipo;
    }

    /**
     * Set the value of Serie_Equipo
     *
     * @param Serie_Equipo new value of Serie_Equipo
     */
    public void setSerie_Equipo(String Serie_Equipo)
    {
        this.Serie_Equipo = Serie_Equipo;
    }

    private String Nom_Equipo;

    /**
     * Get the value of Nom_Equipo
     *
     * @return the value of Nom_Equipo
     */
    public String getNom_Equipo() 
    {
        return Nom_Equipo;
    }

    /**
     * Set the value of Nom_Equipo
     *
     * @param Nom_Equipo new value of Nom_Equipo
     */
    public void setNom_Equipo(String Nom_Equipo) 
    {
        this.Nom_Equipo = Nom_Equipo;
    }

    private String Des_Equipo;

    /**
     * Get the value of Des_Equipo
     *
     * @return the value of Des_Equipo
     */
    public String getDes_Equipo() 
    {
        return Des_Equipo;
    }

    /**
     * Set the value of Des_Equipo
     *
     * @param Des_Equipo new value of Des_Equipo
     */
    public void setDes_Equipo(String Des_Equipo) 
    {
        this.Des_Equipo = Des_Equipo;
    }

    private int NumRep_Equipo;

    /**
     * Get the value of NumRep_Equipo
     *
     * @return the value of NumRep_Equipo
     */
    public int getNumRep_Equipo() 
    {
        return NumRep_Equipo;
    }

    /**
     * Set the value of NumRep_Equipo
     *
     * @param NumRep_Equipo new value of NumRep_Equipo
     */
    public void setNumRep_Equipo(int NumRep_Equipo) 
    {
        this.NumRep_Equipo = NumRep_Equipo;
    }

    private double Val_Equipo;

    /**
     * Get the value of Val_Equipo
     *
     * @return the value of Val_Equipo
     */
    public double getVal_Equipo() 
    {
        return Val_Equipo;
    }

    /**
     * Set the value of Val_Equipo
     *
     * @param Val_Equipo new value of Val_Equipo
     */
    public void setVal_Equipo(double Val_Equipo) 
    {
        this.Val_Equipo = Val_Equipo;
    }
}
