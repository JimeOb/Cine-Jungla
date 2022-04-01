package co.edu.udistrital.cine.persistencia;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DataSource {
    
    private static final String CONFIG_FILE_PATH = "src/main/resources/datasource.properties";
    private static final HikariConfig config = new HikariConfig(CONFIG_FILE_PATH);
    private static final HikariDataSource ds = new HikariDataSource(config);
    
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
    
}
