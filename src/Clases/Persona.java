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
public class Persona 
{  
    public Persona(int Id_Persona, int CedRuc_Persona, String Nom_Persona, String Ape_Persona, String Dir_Persona, String Tel_Persona, String Email_Persona) 
    {
        this.Id_Persona = Id_Persona;
        this.CedRuc_Persona = CedRuc_Persona;
        this.Nom_Persona = Nom_Persona;
        this.Ape_Persona = Ape_Persona;
        this.Dir_Persona = Dir_Persona;
        this.Tel_Persona = Tel_Persona;
        this.Email_Persona = Email_Persona;
    }
    
    private int Id_Persona;

    /**
     * Get the value of Id_Persona
     *
     * @return the value of Id_Persona
     */
    public int getId_Persona() 
    {
        return Id_Persona;
    }

    /**
     * Set the value of Id_Persona
     *
     * @param Id_Persona new value of Id_Persona
     */
    public void setId_Persona(int Id_Persona) 
    {
        this.Id_Persona = Id_Persona;
    }
 
    private int CedRuc_Persona;

    /**
     * Get the value of CedRuc_Persona
     *
     * @return the value of CedRuc_Persona
     */
    public int getCedRuc_Persona()
    {
        return CedRuc_Persona;
    }

    /**
     * Set the value of CedRuc_Persona
     *
     * @param CedRuc_Persona new value of CedRuc_Persona
     */
    public void setCedRuc_Persona(int CedRuc_Persona) 
    {
        this.CedRuc_Persona = CedRuc_Persona;
    }

    private String Nom_Persona;

    /**
     * Get the value of Nom_Persona
     *
     * @return the value of Nom_Persona
     */
    public String getNom_Persona() 
    {
        return Nom_Persona;
    }

    /**
     * Set the value of Nom_Persona
     *
     * @param Nom_Persona new value of Nom_Persona
     */
    public void setNom_Persona(String Nom_Persona) 
    {
        this.Nom_Persona = Nom_Persona;
    }
    
    private String Ape_Persona;

    /**
     * Get the value of Ape_Persona
     *
     * @return the value of Ape_Persona
     */
    public String getApe_Persona() 
    {
        return Ape_Persona;
    }

    /**
     * Set the value of Ape_Persona
     *
     * @param Ape_Persona new value of Ape_Persona
     */
    public void setApe_Persona(String Ape_Persona) 
    {
        this.Ape_Persona = Ape_Persona;
    }

    private String Dir_Persona;

    /**
     * Get the value of Dir_Persona
     *
     * @return the value of Dir_Persona
     */
    public String getDir_Persona() 
    {
        return Dir_Persona;
    }

    /**
     * Set the value of Dir_Persona
     *
     * @param Dir_Persona new value of Dir_Persona
     */
    public void setDir_Persona(String Dir_Persona) 
    {
        this.Dir_Persona = Dir_Persona;
    }

    private String Tel_Persona;

    /**
     * Get the value of Tel_Persona
     *
     * @return the value of Tel_Persona
     */
    public String getTel_Persona() 
    {
        return Tel_Persona;
    }

    /**
     * Set the value of Tel_Persona
     *
     * @param Tel_Persona new value of Tel_Persona
     */
    public void setTel_Persona(String Tel_Persona)
    {
        this.Tel_Persona = Tel_Persona;
    }
    
    private String Email_Persona;

    /**
     * Get the value of Email_Persona
     *
     * @return the value of Email_Persona
     */
    public String getEmail_Persona() 
    {
        return Email_Persona;
    }

    /**
     * Set the value of Email_Persona
     *
     * @param Email_Persona new value of Email_Persona
     */
    public void setEmail_Persona(String Email_Persona) 
    {
        this.Email_Persona = Email_Persona;
    }

}
