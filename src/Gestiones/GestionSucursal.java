package Gestiones;

import CapaDatos.Conexion;
import Clases.Sucursal;
import java.sql.ResultSet;
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
    public void Modificar() throws SQLException
    {
        try
        {
            Conexion.GetInstancia().Conectar();
            Conexion.GetInstancia().Ejecutar("UPDATE Sucursal SET Nom_Sucursal = '"+ObSucursal.getNom_Sucursal()+"',Ciu_Sucursal = '"+ObSucursal.getCiu_Sucursal()+"',Dir_Sucursal = '"+ObSucursal.getDir_Sucursal()+"',Tel_Sucursal = '"+ObSucursal.getTel_Sucursal()+"' WHERE Cod_Sucursal ="+ObSucursal.getCod_Sucursal());
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
            Conexion.GetInstancia().Ejecutar("DELETE FROM Sucursal WHERE Cod_Sucursal ="+ObSucursal.getCod_Sucursal());
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
            ResultSet rs = Conexion.GetInstancia().EjecutarConsulta("SELECT Nom_Sucursal ,Ciu_Sucursal ,Dir_Sucursal,Tel_Sucursal FROM Sucursal WHERE Cod_Sucursal ='"+ObSucursal.getCod_Sucursal()+"'");
            while(rs.next())
            {
                ObSucursal.setNom_Sucursal(rs.getString("Nom_Sucursal"));
                ObSucursal.setCiu_Sucursal(rs.getString("Ciu_Sucursal"));
                ObSucursal.setDir_Sucursal(rs.getString("Dir_Sucursal"));
                ObSucursal.setTel_Sucursal(rs.getString("Tel_Sucursal"));
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
