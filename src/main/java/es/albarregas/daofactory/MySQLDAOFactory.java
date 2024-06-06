package es.albarregas.daofactory;



import es.albarregas.dao.FotoDAO;

import es.albarregas.dao.IFotoDAO;
import es.albarregas.dao.IUsuarioDAO;
import es.albarregas.dao.UsuarioDAO;


public class MySQLDAOFactory extends DAOFactory{

    
    @Override
    public IUsuarioDAO getUsuarioDAO() {
        return new UsuarioDAO();
    }

    @Override
    public IFotoDAO getFotoDAO() {
        return new FotoDAO();
    }

}
