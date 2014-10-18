/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestiones;

import CapaDatos.Conexion;
import Clases.Proveedor;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Darwin
 */
public class GestionProveedor implements IGestion
{
    Proveedor ObProveedor = new Proveedor(null, 0000000, null, null, null, 00, 0000, null, null, null, null, null);

    public GestionProveedor() 
    {
        Conexion.GetInstancia().CadenaConexion();
    }
    
    public Proveedor getProveedor()
    {
        return ObProveedor;
    }
    public void setProveedor(Proveedor proveedor)
    {
        this.ObProveedor = proveedor;
    }
    
    @Override
    public void Nuevo() throws SQLException 
    {
        ObProveedor.setCedRuc_Persona(00000000000);
        ObProveedor.setNom_Persona(null);
        ObProveedor.setApe_Persona(null);
        ObProveedor.setDirEmp_Proveedor(null);
        ObProveedor.setTel_Persona(null);        
        ObProveedor.setEmail_Persona(null);
        ObProveedor.setEmp_Proveedor(null);
        ObProveedor.setRucEmp_Proveedor(0000000000);
        ObProveedor.setDirEmp_Proveedor(null);
        ObProveedor.setTelEmp_Proveedor(null);
        ObProveedor.setTip_Proveedor(null);
        ObProveedor.setSalPen_Proveedor(000.00);
    }
    
    @Override
    public void Grabar() throws SQLException 
    {
        try
        {
            Conexion.GetInstancia().Conectar();
            Conexion.GetInstancia().Ejecutar("INSERT INTO Proveedor(CedRuc_Proveedor,Nom_Proveedor,Dir_Proveedor,Tel_Proveedor,Ape_Proveedor ,Email_Proveedor,Emp_Proveedor,RucEmp_Proveedor,DirEmp_Proveedor,TelEmp_Proveedor,Tip_Proveedor,SalPen_Proveedor) VALUES('"+ObProveedor.getCedRuc_Persona()+"','"+ObProveedor.getNom_Persona()+"','"+ObProveedor.getDir_Persona()+"','"+ObProveedor.getTel_Persona()+"','"+ObProveedor.getApe_Persona()+"' ,'"+ObProveedor.getEmail_Persona()+"','"+ObProveedor.getEmp_Proveedor()+"','"+ObProveedor.getRucEmp_Proveedor()+"','"+ObProveedor.getDirEmp_Proveedor()+"','"+ObProveedor.getTelEmp_Proveedor()+"','"+ObProveedor.getTip_Proveedor()+"','"+ObProveedor.getSalPen_Proveedor()+"')");
        }
        catch(SQLException ex)
        {
            throw ex;
        }
        finally
        {
            Conexion.GetInstancia().Desconectar();
        }
    }

    @Override
    public void Modificar() throws SQLException 
    {
        try
        {
            Conexion.GetInstancia().Conectar();
            Conexion.GetInstancia().Ejecutar("UPDATE Proveedor SET Nom_Proveedor = '"+ObProveedor.getNom_Persona()+"',Dir_Proveedor = '"+ObProveedor.getDir_Persona()+"',Tel_Proveedor = '"+ObProveedor.getTel_Persona()+"',Ape_Proveedor = '"+ObProveedor.getApe_Persona()+"',Email_Proveedor = '"+ObProveedor.getEmail_Persona()+"',Emp_Proveedor = '"+ObProveedor.getEmp_Proveedor()+"',RucEmp_Proveedor = '"+ObProveedor.getRucEmp_Proveedor()+"' ,DirEmp_Proveedor = '"+ObProveedor.getDirEmp_Proveedor()+"',TelEmp_Proveedor = '"+ObProveedor.getTelEmp_Proveedor()+"',Tip_Proveedor = '"+ObProveedor.getTip_Proveedor()+"',SalPen_Proveedor = '"+ObProveedor.getSalPen_Proveedor()+"' WHERE CedRuc_Proveedor ="+ObProveedor.getCedRuc_Persona());
        }
        catch(SQLException ex)
        {
            throw ex;
        }
        finally
        {
            Conexion.GetInstancia().Desconectar();
        }
    }    

    @Override
    public void Eliminar() throws SQLException
    {
        try
        {
            Conexion.GetInstancia().Conectar();
            Conexion.GetInstancia().Ejecutar("DELETE FROM Proveedor WHERE CedRuc_Proveedor ="+ObProveedor.getCedRuc_Persona());
        }
        catch(SQLException ex)
        {
            throw ex;
        }
        finally
        {
            Conexion.GetInstancia().Desconectar();
        }
    }

    @Override
    public void Consultar() throws SQLException 
    {
        try
        {
            Conexion.GetInstancia().Conectar();
            ResultSet rs = Conexion.GetInstancia().EjecutarConsulta("SELECT Nom_Proveedor,Dir_Proveedor,Tel_Proveedor,Ape_Proveedor,Email_Proveedor,Emp_Proveedor,RucEmp_Proveedor,DirEmp_Proveedor,TelEmp_Proveedor,Tip_Proveedor,SalPen_Proveedor FROM Proveedor WHERE CedRucProveedor ='"+ObProveedor.getCedRuc_Persona()+"'");
            while(rs.next())
            {   
                ObProveedor.setNom_Persona(rs.getString("Nom_Proveedor"));
                ObProveedor.setDir_Persona(rs.getString("Dir_Proveedor"));
                ObProveedor.setTel_Persona(rs.getString("Tel_Proveedor"));
                ObProveedor.setApe_Persona(rs.getString("Ape_Proveedor"));
                ObProveedor.setEmail_Persona(rs.getString("Email_Proveedor"));
                ObProveedor.setEmp_Proveedor(rs.getString("Emp_Proveedor"));
                ObProveedor.setRucEmp_Proveedor(rs.getInt("RucEmp_Proveedor"));
                ObProveedor.setDirEmp_Proveedor(rs.getString("DirEmp_Proveedor"));
                ObProveedor.setTelEmp_Proveedor("TelEmp_Proveedor");
                ObProveedor.setTip_Proveedor(rs.getString("Tip_Proveedor"));
                ObProveedor.setSalPen_Proveedor(rs.getShort("SalPen_Proveedor"));
            }
        }
        catch(SQLException ex)
        {
            throw ex;
        }
        finally
        {
            Conexion.GetInstancia().Desconectar();
        }
    }
    
}
