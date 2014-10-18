package Gestiones;

import CapaDatos.Conexion;
import Clases.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Darwin
 */
public class GestionCliente implements IGestion
{
    private Cliente ObCliente = new Cliente(null, 00, 000000, null, null, null, null, null);

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
    public void Nuevo() throws SQLException 
    {        
        //ObCliente.setId_Persona(00);
        ObCliente.setCedRuc_Persona(000000000);
        ObCliente.setNom_Persona(null);
        ObCliente.setApe_Persona(null);
        ObCliente.setDir_Persona(null);
        ObCliente.setTel_Persona(null);
        ObCliente.setEmail_Persona(null);
        ObCliente.setTip_Cliente(null);
        ObCliente.setSalPen_Cliente(00.00);
    }
    
    @Override
    public void Grabar() throws SQLException 
    {
        try
        {
            Conexion.GetInstancia().Conectar();
            Conexion.GetInstancia().Ejecutar("INSERT INTO Cliente(CedRuc_Cliente,Nom_Cliente,Dir_Cliente,Tel_Cliente,Ape_Cliente,Email_Cliente,Tip_Cliente,SalPen_Cliente)VALUES('"+ObCliente.getCedRuc_Persona()+"','"+ObCliente.getNom_Persona()+"','"+ObCliente.getDir_Persona()+"','"+ObCliente.getTel_Persona()+"','"+ObCliente.getApe_Persona()+"','"+ObCliente.getEmail_Persona()+"','"+ObCliente.getTip_Cliente()+"','"+ObCliente.getSalPen_Cliente()+"')");
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
            Conexion.GetInstancia().Ejecutar("UPDATE Cliente SET Nom_Cliente = '"+ObCliente.getNom_Persona()+"',Dir_Cliente = '"+ObCliente.getDir_Persona()+"',Tel_Cliente = '"+ObCliente.getTel_Persona()+"',Ape_Cliente = '"+ObCliente.getApe_Persona()+"',Email_Cliente = '"+ObCliente.getEmail_Persona()+"',Tip_Cliente = '"+ObCliente.getTip_Cliente()+"',SalPen_Cliente= '"+ObCliente.getSalPen_Cliente()+"' WHERE CedRuc_Cliente="+ObCliente.getCedRuc_Persona());
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
            Conexion.GetInstancia().Ejecutar("DELETE FROM Cliente WHERE CedRuc_Cliente ="+ObCliente.getCedRuc_Persona());
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
            ResultSet rs = Conexion.GetInstancia().EjecutarConsulta("SELECT Nom_Cliente,Dir_Cliente,Tel_Cliente,Ape_Cliente ,Email_Cliente,Tip_Cliente,SalPen_Cliente FROM Cliente WHERE CedRuc_Cliente ='"+ObCliente.getCedRuc_Persona()+"'");
            while(rs.next())
            {
                ObCliente.setNom_Persona(rs.getString("Nom_Cliente"));
                ObCliente.setDir_Persona(rs.getString("Dir_Cliente"));
                ObCliente.setTel_Persona(rs.getString("Tel_Cliente"));
                ObCliente.setApe_Persona(rs.getString("Ape_Cliente"));
                ObCliente.setEmail_Persona(rs.getString("Email_Cliente"));
                ObCliente.setTip_Cliente(rs.getString("Tip_Cliente"));
                ObCliente.setSalPen_Cliente(rs.getDouble("SalPen_Cliente"));
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
