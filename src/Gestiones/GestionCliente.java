/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestiones;

import CapaDatos.Conexion;
import Clases.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Darwin
 */
public class GestionCliente implements IGestiones
{
    private Cliente ObCliente = new Cliente(null, 00.00, 00, 0000, null, null, null, null, null);

    public GestionCliente() 
    {
        Conexion.GetInstancia().CadenaConexion();
    }      

    public Cliente getCliente() 
    {
        return ObCliente;
    }
    public void setCliente(Cliente cliente) 
    {
        this.ObCliente = cliente;
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
    public void Nuevo() throws SQLException 
    {
        ObCliente.setTip_Cliente(null);
        ObCliente.setSalPen_Cliente(00.00);
        ObCliente.setId_persona(00);
        ObCliente.setCedRuc_persona(000000000);
        ObCliente.setNom_Persona(null);
        ObCliente.setDir_Persona(null);
        ObCliente.setTel_Persona(null);
        ObCliente.setApe_Persona(null);
        ObCliente.setEmail_Persona(null);
    }

    @Override
    public void Eliminar() throws SQLException 
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
    public void Consultar() throws SQLException 
    {
        try
        {
            Conexion.GetInstancia().Conectar();
            ResultSet rs = Conexion.GetInstancia().EjecutarConsulta("");
            while(rs.next())
            {
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
