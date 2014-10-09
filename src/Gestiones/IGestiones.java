/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestiones;

import java.sql.SQLException;

/**
 *
 * @author Darwin
 */
public interface IGestiones 
{
    public void Grabar () throws SQLException;
    public void Modificar() throws SQLException;
    public void Nuevo() throws SQLException;
    public void Eliminar() throws SQLException;
    public void Consultar() throws SQLException; 
}
