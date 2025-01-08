package classes;

import java.sql.*;
import java.util.List;

public abstract class BaseModel<T> {
    protected Connection connection;
    
    public BaseModel(Connection connection) {
        this.connection = connection;
    }
    
    public abstract List<T> findAll() throws SQLException;
    public abstract T findById(int id) throws SQLException;
    public abstract boolean insert(T object) throws SQLException;
    public abstract boolean update(T object) throws SQLException;
    public abstract boolean delete(int id) throws SQLException;
}