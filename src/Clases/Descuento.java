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
public class Descuento 
{

    public Descuento(int Id_Descuento, String TipProSer_Descuento, String Des_Descuento, int Porcen_Descuento) 
    {
        this.Id_Descuento = Id_Descuento;
        this.TipProSer_Descuento = TipProSer_Descuento;
        this.Des_Descuento = Des_Descuento;
        this.Porcen_Descuento = Porcen_Descuento;
    }
    
    private int Id_Descuento;

    /**
     * Get the value of Id_Descuento
     *
     * @return the value of Id_Descuento
     */
    public int getId_Descuento() 
    {
        return Id_Descuento;
    }

    /**
     * Set the value of Id_Descuento
     *
     * @param Id_Descuento new value of Id_Descuento
     */
    public void setId_Descuento(int Id_Descuento) 
    {
        this.Id_Descuento = Id_Descuento;
    }

    private String TipProSer_Descuento;

    /**
     * Get the value of TipProSer_Descuento
     *
     * @return the value of TipProSer_Descuento
     */
    public String getTipProSer_Descuento() 
    {
        return TipProSer_Descuento;
    }

    /**
     * Set the value of TipProSer_Descuento
     *
     * @param TipProSer_Descuento new value of TipProSer_Descuento
     */
    public void setTipProSer_Descuento(String TipProSer_Descuento)
    {
        this.TipProSer_Descuento = TipProSer_Descuento;
    }

    private String Des_Descuento;

    /**
     * Get the value of Des_Descuento
     *
     * @return the value of Des_Descuento
     */
    public String getDes_Descuento() 
    {
        return Des_Descuento;
    }

    /**
     * Set the value of Des_Descuento
     *
     * @param Des_Descuento new value of Des_Descuento
     */
    public void setDes_Descuento(String Des_Descuento) 
    {
        this.Des_Descuento = Des_Descuento;
    }

    private int Porcen_Descuento;

    /**
     * Get the value of Porcen_Descuento
     *
     * @return the value of Porcen_Descuento
     */
    public int getPorcen_Descuento() 
    {
        return Porcen_Descuento;
    }

    /**
     * Set the value of Porcen_Descuento
     *
     * @param Porcen_Descuento new value of Porcen_Descuento
     */
    public void setPorcen_Descuento(int Porcen_Descuento) 
    {
        this.Porcen_Descuento = Porcen_Descuento;
    }

}
