/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestiones;

import CapaDatos.Conexion;
import Clases.Producto;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Darwin
 */
public class GestionProducto implements IGestion
{
    Producto ObProducto = new Producto(null, 0, null, null, null, null, null, null, null, 0, null, null);

    public GestionProducto() 
    {
        Conexion.GetInstancia().CadenaConexion();
    }
    
    public Producto getProducto()
    {
        return ObProducto;
    }
    
    public void setProducto(Producto producto)
    {
        this.ObProducto = producto;
    }

    @Override
    public void Nuevo() throws SQLException
    {
        ObProducto.setProductoBodega(null);
        ObProducto.setId_Producto(0);
        ObProducto.setId_Bodega(null);
        ObProducto.setId_Proveedor(null);
        ObProducto.setId_Descuento(null);
        ObProducto.setNom_Producto(null);
        ObProducto.setDes_Producto(null);
        ObProducto.setEst_Producto(null);
        ObProducto.setStock_Producto(null);
        ObProducto.setPVP_Producto(0);
        ObProducto.setMar_Producto(null);
        ObProducto.setTam_Producto(null);
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
            Conexion.GetInstancia().Ejecutar("DELETE FROM Producto WHERE Id_Prodcuto ="+ObProducto.getId_Producto());
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
            ResultSet rs = Conexion.GetInstancia().EjecutarConsulta("");
            while(rs.next())
            {
//                ObProducto.setProductoBodega(null);
//                ObProducto.setId_Producto(0);
//                ObProducto.setId_Bodega(rs.getString(""));
//                ObProducto.setId_Proveedor(rs.getString(""));
//                ObProducto.setId_Descuento(rs.getString(""));
                ObProducto.setNom_Producto(rs.getString(""));
                ObProducto.setDes_Producto(rs.getString(""));
                ObProducto.setEst_Producto(rs.getString(""));
                ObProducto.setStock_Producto(rs.getString(""));
                ObProducto.setPVP_Producto(rs.getDouble(""));
                ObProducto.setMar_Producto(rs.getString(""));
                ObProducto.setTam_Producto(rs.getString(""));
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
