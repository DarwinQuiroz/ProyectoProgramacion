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
import javax.swing.JOptionPane;

/**
 *
 * @author Darwin
 */
public class GestionLogin
{
    Empleado ObEmpleado = new Empleado(null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null);
    
    public GestionLogin() 
    {
        Conexion.GetInstancia().CadenaConexion();
    }
    public Empleado getEmpleado()
    {
        return ObEmpleado;
    }
    public void setEmpleado(Empleado empleado)
    {
        this.ObEmpleado = empleado;
    }
    
    public void Login() throws SQLException
    {
    try
    {
        Conexion.GetInstancia().Conectar();
        ResultSet rs = Conexion.GetInstancia().EjecutarConsulta
        ("SELECT User_Empleado, Clave_Empleado FROM Empleado WHERE User_Empleado ='"+ObEmpleado.getUser_Empleado()+"' AND Clave_Empleado='"+ObEmpleado.getClave_Empleado()+"'");
        while(rs.next())
        {
            ObEmpleado.setUser_Empleado(rs.getString("User_Empleado"));
            ObEmpleado.setClave_Empleado(rs.getString("Clave_Empleado"));
            //JOptionPane.showMessageDialog(null, "logueo correcto");            
//            frmMenu menu=new frmMenu();
//            menu.show();
//            menu.setExtendedState(new frmMenu().MAXIMIZED_BOTH);
        }
//        else
//        {
//            JOptionPane.showMessageDialog(null,"usuario y clave incorrecto");
//            
//        }
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
