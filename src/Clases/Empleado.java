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
public class Empleado extends Persona
{

    public Empleado(String Tip_Empleado, String User_Empleado, String Clave_Empleado, int NHT_Empledo, int NHE_Empleado, double VPH_Empleado, int Id_persona, int CedRuc_persona, String Nom_Persona, String Dir_Persona, String Tel_Persona, String Ape_Persona, String Email_Persona) 
    {
        super(Id_persona, CedRuc_persona, Nom_Persona, Dir_Persona, Tel_Persona, Ape_Persona, Email_Persona);
        this.Tip_Empleado = Tip_Empleado;
        this.User_Empleado = User_Empleado;
        this.Clave_Empleado = Clave_Empleado;
        this.NHT_Empledo = NHT_Empledo;
        this.NHE_Empleado = NHE_Empleado;
        this.VPH_Empleado = VPH_Empleado;
    }
       
    private String Tip_Empleado;

    /**
     * Get the value of Tip_Empleado
     *
     * @return the value of Tip_Empleado
     */
    public String getTip_Empleado() 
    {
        return Tip_Empleado;
    }

    /**
     * Set the value of Tip_Empleado
     *
     * @param Tip_Empleado new value of Tip_Empleado
     */
    public void setTip_Empleado(String Tip_Empleado)
    {
        this.Tip_Empleado = Tip_Empleado;
    }
 
    private String User_Empleado;

    /**
     * Get the value of User_Empleado
     *
     * @return the value of User_Empleado
     */
    public String getUser_Empleado() 
    {
        return User_Empleado;
    }

    /**
     * Set the value of User_Empleado
     *
     * @param User_Empleado new value of User_Empleado
     */
    public void setUser_Empleado(String User_Empleado) 
    {
        this.User_Empleado = User_Empleado;
    }

    private String Clave_Empleado;

    /**
     * Get the value of Clave_Empleado
     *
     * @return the value of Clave_Empleado
     */
    public String getClave_Empleado() 
    {
        return Clave_Empleado;
    }

    /**
     * Set the value of Clave_Empleado
     *
     * @param Clave_Empleado new value of Clave_Empleado
     */
    public void setClave_Empleado(String Clave_Empleado) 
    {
        this.Clave_Empleado = Clave_Empleado;
    }

    private int NHT_Empledo;

    /**
     * Get the value of NHT_Empledo
     *
     * @return the value of NHT_Empledo
     */
    public int getNHT_Empledo() 
    {
        return NHT_Empledo;
    }

    /**
     * Set the value of NHT_Empledo
     *
     * @param NHT_Empledo new value of NHT_Empledo
     */
    public void setNHT_Empledo(int NHT_Empledo) 
    {
        this.NHT_Empledo = NHT_Empledo;
    }

    private int NHE_Empleado;

    /**
     * Get the value of NHE_Empleado
     *
     * @return the value of NHE_Empleado
     */
    public int getNHE_Empleado() 
    {
        return NHE_Empleado;
    }

    /**
     * Set the value of NHE_Empleado
     *
     * @param NHE_Empleado new value of NHE_Empleado
     */
    public void setNHE_Empleado(int NHE_Empleado) 
    {
        this.NHE_Empleado = NHE_Empleado;
    }

    private double VPH_Empleado;

    /**
     * Get the value of VPH_Empleado
     *
     * @return the value of VPH_Empleado
     */
    public double getVPH_Empleado() 
    {
        return VPH_Empleado;
    }

    /**
     * Set the value of VPH_Empleado
     *
     * @param VPH_Empleado new value of VPH_Empleado
     */
    public void setVPH_Empleado(double VPH_Empleado) 
    {
        this.VPH_Empleado = VPH_Empleado;
    }

}
