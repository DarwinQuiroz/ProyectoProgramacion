/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestiones;

import CapaDatos.Conexion;
import Clases.Descuento;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Darwin
 */
public class GestionDescuento implements IGestion
{
    Descuento ObDecuento = new Descuento(0, null, null, 00);

    public GestionDescuento() 
    {
        Conexion.GetInstancia().CadenaConexion();
    }
    
    public Descuento getDescuento()
    {
        return ObDecuento;
    }
    
    public void setDescuento(Descuento descuento)
    {
        this.ObDecuento = descuento;
    }
    
    @Override
    public void Nuevo() throws SQLException 
    {
        ObDecuento.setId_Descuento(0);
        ObDecuento.setTipProSer_Descuento(null);
        ObDecuento.setDes_Descuento(null);
        ObDecuento.setTipProSer_Descuento(null);
    }

    @Override
    public void Grabar() throws SQLException 
    {
        try
        {
            Conexion.GetInstancia().Conectar();
            Conexion.GetInstancia().Ejecutar("INSERT INTO Descuento (TipProSer_Descuento,Des_Descuento,PorceN_Descuento) VALUES('"+ObDecuento.getTipProSer_Descuento()+"','"+ObDecuento.getDes_Descuento()+"','"+ObDecuento.getPorcen_Descuento()+"')");
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
            Conexion.GetInstancia().Ejecutar("UPDATE Descuento SET TipProSer_Descuento = '"+ObDecuento.getTipProSer_Descuento()+"',Des_Descuento = '"+ObDecuento.getDes_Descuento()+"',PorceN_Descuento =  WHERE Id_Descuento ="+ObDecuento.getId_Descuento());
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
            Conexion.GetInstancia().Ejecutar("DELETE FROM Descuento WHERE Id_Descuento ="+ObDecuento.getId_Descuento());
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
            ResultSet rs = Conexion.GetInstancia().EjecutarConsulta("SELECT TipProSer_Descuento,Des_Descuento,Porcen_Descuento FROM Descuento WHERE Id_Descuento ='"+ObDecuento.getId_Descuento()+"'");
            while(rs.next())
            {                
                ObDecuento.setTipProSer_Descuento(rs.getString("TipProSer_Descuento"));
                ObDecuento.setDes_Descuento(rs.getString("Des_Descuento"));
                ObDecuento.setPorcen_Descuento(rs.getInt("Porcen_Descuento"));
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
