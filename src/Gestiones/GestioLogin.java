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
public class GestioLogin 
{
    Empleado ObEmpleado = new Empleado(null, null, null, 00, 00, 00, 00, 000, null, null, null, null, null);
    
    public GestioLogin() 
    {
        Conexion.GetInstancia().CadenaConexion();
    }
    public void Login() throws SQLException
    {
    try
    {
        Conexion.GetInstancia().Conectar();
        ResultSet rs = Conexion.GetInstancia().EjecutarConsulta
        ("SELECT User_Empleado, Clave_Empleado FROM Empleado WHERE User_Empleado ='"+ObEmpleado.getUser_Empleado()+"' AND Clave_Empleado='"+ObEmpleado.getClave_Empleado()+"'");
        if(rs.next())
        {
            JOptionPane.showMessageDialog(null, "logueo correcto");
//            frmMenu menu=new frmMenu();
//            menu.show();
//            menu.setExtendedState(new frmMenu().MAXIMIZED_BOTH);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"usuario y clave incorrecto");
            
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
