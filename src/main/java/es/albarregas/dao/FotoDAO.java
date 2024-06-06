 
package es.albarregas.dao;


import es.albarregas.beans.Foto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class FotoDAO implements IFotoDAO {
    
  
        
    @Override
    public void delete(Foto foto) {
        Connection conexion = null;
        String sqlFoto = "DELETE FROM fotos WHERE idFoto=?";
        
        PreparedStatement preparada;
        try {
            conexion = ConnectionFactory.getConnection();
            conexion.setAutoCommit(false);
            preparada = conexion.prepareStatement(sqlFoto);

            preparada.setInt(1, foto.getId());
            preparada.executeUpdate();
            conexion.commit();
        } catch (SQLException ex) {
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(FotoDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(FotoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.closeConnection();
        }
    }
    
    @Override
    public void closeConnection() {
        ConnectionFactory.closeConnection();
    }

    
}
