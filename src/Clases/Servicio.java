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
public class Servicio 
{
    public Servicio(int Id_Servicio, LaboratorioTecnico Id_Lab, String Tip_Servicio, String Des_Servicio, double Val_Servicio, double Recargo_Servicio, String Tiem_Servicio) 
    {
        this.Id_Servicio = Id_Servicio;
        this.Id_Lab = Id_Lab;
        this.Tip_Servicio = Tip_Servicio;
        this.Des_Servicio = Des_Servicio;
        this.Val_Servicio = Val_Servicio;
        this.Recargo_Servicio = Recargo_Servicio;
        this.Tiem_Servicio = Tiem_Servicio;
    }    
    
    private int Id_Servicio;

    /**
     * Get the value of Id_Servicio
     *
     * @return the value of Id_Servicio
     */
    public int getId_Servicio() 
    {
        return Id_Servicio;
    }

    /**
     * Set the value of Id_Servicio
     *
     * @param Id_Servicio new value of Id_Servicio
     */
    public void setId_Servicio(int Id_Servicio) 
    {
        this.Id_Servicio = Id_Servicio;
    }

    private LaboratorioTecnico Id_Lab;

    /**
     * Get the value of Id_Lab
     *
     * @return the value of Id_Lab
     */
    public LaboratorioTecnico getId_Lab() 
    {
        return Id_Lab;
    }

    /**
     * Set the value of Id_Lab
     *
     * @param Id_Lab new value of Id_Lab
     */
    public void setId_Lab(LaboratorioTecnico Id_Lab) 
    {
        this.Id_Lab = Id_Lab;
    }

    private String Tip_Servicio;

    /**
     * Get the value of Tip_Servicio
     *
     * @return the value of Tip_Servicio
     */
    public String getTip_Servicio() 
    {
        return Tip_Servicio;
    }

    /**
     * Set the value of Tip_Servicio
     *
     * @param Tip_Servicio new value of Tip_Servicio
     */
    public void setTip_Servicio(String Tip_Servicio) 
    {
        this.Tip_Servicio = Tip_Servicio;
    }

    private String Des_Servicio;

    /**
     * Get the value of Des_Servicio
     *
     * @return the value of Des_Servicio
     */
    public String getDes_Servicio() 
    {
        return Des_Servicio;
    }

    /**
     * Set the value of Des_Servicio
     *
     * @param Des_Servicio new value of Des_Servicio
     */
    public void setDes_Servicio(String Des_Servicio) 
    {
        this.Des_Servicio = Des_Servicio;
    }

    private double Val_Servicio;

    /**
     * Get the value of Val_Servicio
     *
     * @return the value of Val_Servicio
     */
    public double getVal_Servicio() 
    {
        return Val_Servicio;
    }

    /**
     * Set the value of Val_Servicio
     *
     * @param Val_Servicio new value of Val_Servicio
     */
    public void setVal_Servicio(double Val_Servicio)
    {
        this.Val_Servicio = Val_Servicio;
    }
    
    private double Recargo_Servicio;

    /**
     * Get the value of Recargo_Servicio
     *
     * @return the value of Recargo_Servicio
     */
    public double getRecargo_Servicio() 
    {
        return Recargo_Servicio;
    }

    /**
     * Set the value of Recargo_Servicio
     *
     * @param Recargo_Servicio new value of Recargo_Servicio
     */
    public void setRecargo_Servicio(double Recargo_Servicio) 
    {
        this.Recargo_Servicio = Recargo_Servicio;
    }

    private String Tiem_Servicio;

    /**
     * Get the value of Tiem_Servicio
     *
     * @return the value of Tiem_Servicio
     */
    public String getTiem_Servicio() 
    {
        return Tiem_Servicio;
    }

    /**
     * Set the value of Tiem_Servicio
     *
     * @param Tiem_Servicio new value of Tiem_Servicio
     */
    public void setTiem_Servicio(String Tiem_Servicio)
    {
        this.Tiem_Servicio = Tiem_Servicio;
    }

}
