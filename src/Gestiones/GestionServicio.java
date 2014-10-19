/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestiones;

import CapaDatos.Conexion;
import Clases.Servicio;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Darwin
 */
public class GestionServicio implements IGestion
{
    Servicio ObServicio = new Servicio(0, null, null, null, 0, 0, null);

    public GestionServicio() 
    {
        Conexion.GetInstancia().CadenaConexion();
    }
    
    public Servicio getServicio()
    {
        return ObServicio;
    }
    
    public void setServicio(Servicio servicio)
    {
        this.ObServicio = servicio;
    }
    
    @Override
    public void Nuevo() throws SQLException 
    {
        ObServicio.setId_Servicio(0);
        ObServicio.setId_Lab(null);
        ObServicio.setTip_Servicio(null);
        ObServicio.setDes_Servicio(null);
        ObServicio.setVal_Servicio(0);
        ObServicio.setRecargo_Servicio(0);
        ObServicio.setTiem_Servicio(null);
    }

    @Override
    public void Grabar() throws SQLException 
    {
        try
        {            
            Conexion.GetInstancia().Conectar();
            Conexion.GetInstancia().Ejecutar("");
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
            Conexion.GetInstancia().Ejecutar("");
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
            Conexion.GetInstancia().Ejecutar("DELETE FROM Servicio WHERE Id_Servicio ="+ObServicio.getId_Servicio());
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
            ResultSet rs = Conexion.GetInstancia().EjecutarConsulta("SELECT");
            while(rs.next())
            {
//                ObServicio.setId_Servicio(0);
//                ObServicio.setId_Lab(null);
                ObServicio.setTip_Servicio(rs.getString(""));
                ObServicio.setDes_Servicio(rs.getString(""));
                ObServicio.setVal_Servicio(rs.getDouble(""));
                ObServicio.setRecargo_Servicio(rs.getDouble(""));
                ObServicio.setTiem_Servicio(rs.getString(""));
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
