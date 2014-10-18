/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;
/**
 *
 * @author Darwin
 */
public class CabeceraFactura
{
    public CabeceraFactura(int Id_Fact, Sucursal Id_Sucursal, String TipPag_Fac, Date Fec_Fac) 
    {
        this.Id_Fact = Id_Fact;
        this.Id_Sucursal = Id_Sucursal;
        this.TipPag_Fac = TipPag_Fac;
        this.Fec_Fac = Fec_Fac;
    }
   
    private int Id_Fact;

    /**
     * Get the value of Id_Fact
     *
     * @return the value of Id_Fact
     */
    public int getId_Fact()
    {
        return Id_Fact;
    }

    /**
     * Set the value of Id_Fact
     *
     * @param Id_Fact new value of Id_Fact
     */
    public void setId_Fact(int Id_Fact)
    {
        this.Id_Fact = Id_Fact;
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

    private Cliente Id_Cliente;

    /**
     * Get the value of Id_Cliente
     *
     * @return the value of Id_Cliente
     */
    public Cliente getId_Cliente() 
    {
        return Id_Cliente;
    }

    /**
     * Set the value of Id_Cliente
     *
     * @param Id_Cliente new value of Id_Cliente
     */
    public void setId_Cliente(Cliente Id_Cliente) 
    {
        this.Id_Cliente = Id_Cliente;
    }
    
    private Empleado Id_Empleado;

    /**
     * Get the value of Id_Empleado
     *
     * @return the value of Id_Empleado
     */
    public Empleado getId_Empleado() 
    {
        return Id_Empleado;
    }

    /**
     * Set the value of Id_Empleado
     *
     * @param Id_Empleado new value of Id_Empleado
     */
    public void setId_Empleado(Empleado Id_Empleado) 
    {
        this.Id_Empleado = Id_Empleado;
    }

    private String TipPag_Fac;

    /**
     * Get the value of TipPag_Fac
     *
     * @return the value of TipPag_Fac
     */
    public String getTipPag_Fac() 
    {
        return TipPag_Fac;
    }
    /**
     * Set the value of TipPag_Fac
     *
     * @param TipPag_Fac new value of TipPag_Fac
     */
    public void setTipPag_Fac(String TipPag_Fac) 
    {
        this.TipPag_Fac = TipPag_Fac;
    }
    
    private Date Fec_Fac;

    /**
     * Get the value of Fec_Fac
     *
     * @return the value of Fec_Fac
     */
    public Date getFec_Fac() 
    {
        return Fec_Fac;
    }

    /**
     * Set the value of Fec_Fac
     *
     * @param Fec_Fac new value of Fec_Fac
     */
    public void setFec_Fac(Date Fec_Fac)
    {
        this.Fec_Fac = Fec_Fac;
    }

}
