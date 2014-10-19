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
public class Proveedor extends Persona
{ 
    public Proveedor(String Emp_Proveedor, int RucEmp_Proveedor, String DirEmp_Proveedor, String TelEmp_Proveedor, String Tip_Proveedor, double SalPen_Proveedor, int Id_Persona, int CedRuc_Persona, String Nom_Persona, String Ape_Persona, String Dir_Persona, String Tel_Persona, String Email_Persona) 
    {
        super(Id_Persona, CedRuc_Persona, Nom_Persona, Ape_Persona, Dir_Persona, Tel_Persona, Email_Persona);
        this.Emp_Proveedor = Emp_Proveedor;
        this.RucEmp_Proveedor = RucEmp_Proveedor;
        this.DirEmp_Proveedor = DirEmp_Proveedor;
        this.TelEmp_Proveedor = TelEmp_Proveedor;
        this.Tip_Proveedor = Tip_Proveedor;
        this.SalPen_Proveedor = SalPen_Proveedor;
    }
       
    private String Emp_Proveedor;

    /**
     * Get the value of Emp_Proveedor
     *
     * @return the value of Emp_Proveedor
     */
    public String getEmp_Proveedor()
    {
        return Emp_Proveedor;
    }

    /**
     * Set the value of Emp_Proveedor
     *
     * @param Emp_Proveedor new value of Emp_Proveedor
     */
    public void setEmp_Proveedor(String Emp_Proveedor) 
    {
        this.Emp_Proveedor = Emp_Proveedor;
    }

    private int RucEmp_Proveedor;

    /**
     * Get the value of RucEmp_Proveedor
     *
     * @return the value of RucEmp_Proveedor
     */
    public int getRucEmp_Proveedor() 
    {
        return RucEmp_Proveedor;
    }

    /**
     * Set the value of RucEmp_Proveedor
     *
     * @param RucEmp_Proveedor new value of RucEmp_Proveedor
     */
    public void setRucEmp_Proveedor(int RucEmp_Proveedor) 
    {
        this.RucEmp_Proveedor = RucEmp_Proveedor;
    }

    private String DirEmp_Proveedor;

    /**
     * Get the value of DirEmp_Proveedor
     *
     * @return the value of DirEmp_Proveedor
     */
    public String getDirEmp_Proveedor() 
    {
        return DirEmp_Proveedor;
    }

    /**
     * Set the value of DirEmp_Proveedor
     *
     * @param DirEmp_Proveedor new value of DirEmp_Proveedor
     */
    public void setDirEmp_Proveedor(String DirEmp_Proveedor) 
    {
        this.DirEmp_Proveedor = DirEmp_Proveedor;
    }

    private String TelEmp_Proveedor;

    /**
     * Get the value of TelEmp_Proveedor
     *
     * @return the value of TelEmp_Proveedor
     */
    public String getTelEmp_Proveedor() 
    {
        return TelEmp_Proveedor;
    }

    /**
     * Set the value of TelEmp_Proveedor
     *
     * @param TelEmp_Proveedor new value of TelEmp_Proveedor
     */
    public void setTelEmp_Proveedor(String TelEmp_Proveedor) 
    {
        this.TelEmp_Proveedor = TelEmp_Proveedor;
    }

    private String Tip_Proveedor;

    /**
     * Get the value of Tip_Proveedor
     *
     * @return the value of Tip_Proveedor
     */
    public String getTip_Proveedor() 
    {
        return Tip_Proveedor;
    }

    /**
     * Set the value of Tip_Proveedor
     *
     * @param Tip_Proveedor new value of Tip_Proveedor
     */
    public void setTip_Proveedor(String Tip_Proveedor)
    {
        this.Tip_Proveedor = Tip_Proveedor;
    }

    private double SalPen_Proveedor;

    /**
     * Get the value of SalPen_Proveedor
     *
     * @return the value of SalPen_Proveedor
     */
    public double getSalPen_Proveedor()
    {
        return SalPen_Proveedor;
    }

    /**
     * Set the value of SalPen_Proveedor
     *
     * @param SalPen_Proveedor new value of SalPen_Proveedor
     */
    public void setSalPen_Proveedor(double SalPen_Proveedor)
    {
        this.SalPen_Proveedor = SalPen_Proveedor;
    }

}
