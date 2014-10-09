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
public class Cliente extends Persona
{

    public Cliente(String Tip_Cliente, double SalPen_Cliente, String Promo_Producto, int Id_persona, int CedRuc_persona, String Nom_Persona, String Dir_Persona, String Tel_Persona, String Email_Persona) 
    {
        super(Id_persona, CedRuc_persona, Nom_Persona, Dir_Persona, Tel_Persona, Email_Persona);
        this.Tip_Cliente = Tip_Cliente;
        this.SalPen_Cliente = SalPen_Cliente;
        this.Promo_Producto = Promo_Producto;
    }

    private String Tip_Cliente;

    /**
     * Get the value of Tip_Cliente
     *
     * @return the value of Tip_Cliente
     */
    public String getTip_Cliente() 
    {
        return Tip_Cliente;
    }

    /**
     * Set the value of Tip_Cliente
     *
     * @param Tip_Cliente new value of Tip_Cliente
     */
    public void setTip_Cliente(String Tip_Cliente) 
    {
        this.Tip_Cliente = Tip_Cliente;
    }

    private double SalPen_Cliente;

    /**
     * Get the value of SalPen_Cliente
     *
     * @return the value of SalPen_Cliente
     */
    public double getSalPen_Cliente() 
    {
        return SalPen_Cliente;
    }

    /**
     * Set the value of SalPen_Cliente
     *
     * @param SalPen_Cliente new value of SalPen_Cliente
     */
    public void setSalPen_Cliente(double SalPen_Cliente) 
    {        
        this.SalPen_Cliente = SalPen_Cliente;
    }

    private String Promo_Producto;

    /**
     * Get the value of Promo_Producto
     *
     * @return the value of Promo_Producto
     */
    public String getPromo_Producto() 
    {
        return Promo_Producto;
    }

    /**
     * Set the value of Promo_Producto
     *
     * @param Promo_Producto new value of Promo_Producto
     */
    public void setPromo_Producto(String Promo_Producto) 
    {
        this.Promo_Producto = Promo_Producto;
    }

}
