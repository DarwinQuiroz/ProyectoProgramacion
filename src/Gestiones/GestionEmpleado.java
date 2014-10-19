/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestiones;

import CapaDatos.Conexion;
import Clases.Empleado;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Darwin
 */
public class GestionEmpleado implements IGestion
{
    Empleado ObEmpleado = new Empleado(null, null, null, 0, 0, 00, 0, 00, null, null, null, null, null);

    public GestionEmpleado() 
    {
        Conexion.GetInstancia().CadenaConexion();
    }
    
    public Empleado getEmpleado()
    {
        return ObEmpleado;
    }
    public void setEmPleado(Empleado empleado)
    {
        this.ObEmpleado = empleado;
    }  
    
    @Override
    public void Nuevo() throws SQLException 
    {
        ObEmpleado.setCedRuc_Persona(0000000000);
        ObEmpleado.setNom_Persona(null);
        ObEmpleado.setDir_Persona(null);
        ObEmpleado.setTel_Persona(null);
        ObEmpleado.setApe_Persona(null);
        ObEmpleado.setEmail_Persona(null);
        ObEmpleado.setTip_Empleado(null);
        ObEmpleado.setUser_Empleado(null);
        ObEmpleado.setClave_Empleado(null);
        ObEmpleado.setNHT_Empledo(0);
        ObEmpleado.setNHE_Empleado(0);
        ObEmpleado.setVPH_Empleado(00.00);
    }
    
    @Override
    public void Grabar() throws SQLException 
    {     
        try
        {
            Conexion.GetInstancia().Conectar();
            Conexion.GetInstancia().Ejecutar("INSERT INTO Empleado(CedRuc_Empleado,Nom_Empleado,Dir_Empleado,Tel_Empleado,Ape_Empleado,Email_Empleado,Tip_Empleado,User_Empleado,Clave_Empleado,NHT_Empleado,NHE_Empleado,VPH_Empleado) "
            +"VALUES('"+ObEmpleado.getCedRuc_Persona()+"','"+ObEmpleado.getNom_Persona()+"','"+ObEmpleado.getDir_Persona()+"','"+ObEmpleado.getTel_Persona()+"','"+ObEmpleado.getApe_Persona()+"','"+ObEmpleado.getEmail_Persona()+"','"+ObEmpleado.getTip_Empleado()+"','"+ObEmpleado.getUser_Empleado()+"','"+ObEmpleado.getClave_Empleado()+"','"+ObEmpleado.getNHT_Empledo()+"','"+ObEmpleado.getNHE_Empleado()+"','"+ObEmpleado.getVPH_Empleado()+"')");
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
            Conexion.GetInstancia().Ejecutar("UPDATE Empleado SET Nom_Empleado = '"+ObEmpleado.getNom_Persona()+"',Dir_Empleado = '"+ObEmpleado.getDir_Persona()+"',Tel_Empleado = '"+ObEmpleado.getTel_Persona()+"',Ape_Empleado = '"+ObEmpleado.getApe_Persona()+"',Email_Empleado = '"+ObEmpleado.getEmail_Persona()+"',Tip_Empleado = '"+ObEmpleado.getTip_Empleado()+"',User_Empleado = '"+ObEmpleado.getUser_Empleado()+"',Clave_Empleado = '"+ObEmpleado.getClave_Empleado()+"',"
            + "NHT_Empleado = '"+ObEmpleado.getNHT_Empledo()+"',NHE_Empleado = '"+ObEmpleado.getNHE_Empleado()+"',VPH_Empleado = '"+ObEmpleado.getVPH_Empleado()+"' WHERE CedRuc_Empleado ='"+ObEmpleado.getCedRuc_Persona()+"'");
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
            Conexion.GetInstancia().Ejecutar("DELETE FROM Empleado WHERE CedRuc_Empleado ="+ObEmpleado.getCedRuc_Persona());
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
            ResultSet rs = Conexion.GetInstancia().EjecutarConsulta("SELECT Nom_Empleado,Dir_Empleado,Tel_Empleado,Ape_Empleado,Email_Empleado,Tip_Empleado,NHT_Empleado,NHE_Empleado,VPH_Empleado FROM Empleado WHERE CedRuc_Empleado ='"+ObEmpleado.getCedRuc_Persona()+"'");
            while(rs.next())
            {
                ObEmpleado.setNom_Persona(rs.getString("Nom_Empleado"));
                ObEmpleado.setDir_Persona(rs.getString("Dir_Empleado"));
                ObEmpleado.setTel_Persona(rs.getString("Tel_Empleado"));
                ObEmpleado.setApe_Persona(rs.getString("Ape_Empleado"));
                ObEmpleado.setEmail_Persona(rs.getString("Email_Empleado"));
                ObEmpleado.setTip_Empleado(rs.getString("Tip_Empleado"));
                ObEmpleado.setNHT_Empledo(rs.getInt("NHT_Empleado"));
                ObEmpleado.setNHE_Empleado(rs.getInt("NHE_Empleado"));
                ObEmpleado.setVPH_Empleado(rs.getDouble("VPH_Empleado"));
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
