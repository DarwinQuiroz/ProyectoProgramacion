/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestiones;

import CapaDatos.Conexion;
import Clases.Sucursal;
import java.sql.SQLException;

/**
 *
 * @author Darwin
 */
public class GestionSucursal implements IGestion        
{
    Sucursal ObSucursal = new Sucursal(0, null, null, null, null, null);
    
    public GestionSucursal()
    {
        Conexion.GetInstancia().CadenaConexion();
    }
    
    public Sucursal getSucursal()
    {
        return ObSucursal;
    }
    
    public void setSucursal(Sucursal sucursal)
    {
        this.ObSucursal = sucursal;
    }

    @Override
    public void Nuevo() throws SQLException 
    {
        ObSucursal.setId_Sucursal(0);
        ObSucursal.setCod_Sucursal(null);
        ObSucursal.setNom_Sucursal(null);
        ObSucursal.setCiu_Sucursal(null);
        ObSucursal.setDir_Sucursal(null);
        ObSucursal.setTel_Sucursal(null);
    }

    @Override
    public void Grabar() throws SQLException 
    {
        try
        {
            Conexion.GetInstancia().Conectar();
            Conexion.GetInstancia().Ejecutar("INSERT INTO Sucursal (Cod_Sucursal,Nom_Sucursal,Ciu_Sucursal,Dir_Sucursal,Tel_Sucursal) VALUES ('"+ObSucursal.getCod_Sucursal()+"','"+ObSucursal.getNom_Sucursal()+"','"+ObSucursal.getCiu_Sucursal()+"','"+ObSucursal.getDir_Sucursal()+"','"+ObSucursal.getTel_Sucursal()+"')");
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
    public void Modificar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Eliminar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Consultar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
