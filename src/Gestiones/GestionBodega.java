/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestiones;

import CapaDatos.Conexion;
import Clases.Bodega;
import Clases.Sucursal;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Darwin
 */
public class GestionBodega implements IGestion
{
    Bodega ObBodega = new Bodega(null, 0, null, null, null, null, 00000);

    public GestionBodega() 
    {
        Conexion.GetInstancia().CadenaConexion();
    }
    
    public Bodega getBodega()
    {
        return ObBodega;
    }
    
    public void setBodega(Bodega bodega)
    {
        this.ObBodega = bodega;
    }

    @Override
    public void Nuevo() throws SQLException 
    {
        ObBodega.setProductoBodega(null);
        ObBodega.setId_Bodega(0);
        ObBodega.setId_Sucursal(null);
        ObBodega.setCod_Bodega(null);
        ObBodega.setNom_Bodega(null);
        ObBodega.setDes_Bodega(null);
        ObBodega.setExt_Bodega(0000000);
    }
    
    @Override
    public void Grabar() throws SQLException 
    {
        try
        {
            Conexion.GetInstancia().Conectar();
            Conexion.GetInstancia().Ejecutar("INSERT INTO Bodega (Id_Sucursal,Cod_Bodega,Nom_Bodega,Des_Bodega,Ext_Bodega)VALUES('"+ObBodega.getId_Sucursal()+"','"+ObBodega.getCod_Bodega()+"','"+ObBodega.getNom_Bodega()+"','"+ObBodega.getDes_Bodega()+"','"+ObBodega.getExt_Bodega()+"')");
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
            Conexion.GetInstancia().Ejecutar("UPDATE Bodega SET Nom_Bodega = '"+ObBodega.getNom_Bodega()+"',Des_Bodega = '"+ObBodega.getDes_Bodega()+"',Ext_Bodega = '"+ObBodega.getExt_Bodega()+"' WHERE Cod_Bodega ="+ObBodega.getCod_Bodega());
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
            Conexion.GetInstancia().Ejecutar("DELETE FROM Bodega WHERE Cod_Bodega ="+ObBodega.getCod_Bodega());
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
            ResultSet rs = Conexion.GetInstancia().EjecutarConsulta("SELECT Id_Bodega,Id_Sucursal,Nom_Bodega,Des_Bodega,Ext_Bodega FROM Bodega WHERE Cod_Bodega ='"+ObBodega.getCod_Bodega()+"'");
            while(rs.next())
            {
                ObBodega.setId_Bodega(rs.getInt(""));
                //ObBodega.setId_Sucursal(rs.gett);
                ObBodega.setCod_Bodega(rs.getString(""));
                ObBodega.setNom_Bodega(rs.getString(""));
                ObBodega.setDes_Bodega(rs.getString(""));
                ObBodega.setExt_Bodega(rs.getInt(""));
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
