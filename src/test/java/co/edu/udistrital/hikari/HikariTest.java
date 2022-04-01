package co.edu.udistrital.hikari;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.SQLException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HikariTest {
    
    private static HikariConfig config;
    private static HikariDataSource ds;
    
    @BeforeAll
    public static void setup() {
        config = new HikariConfig();
        config.setUsername("cine");
        config.setPassword("123");
        config.setJdbcUrl("jdbc:h2:~/test");
        ds = new HikariDataSource(config);
    }
    
    @Test
    public void hikariShouldConnectToDB() {        
        Assertions.assertDoesNotThrow(HikariTest::connect);
    }
    
    public static void connect() {
        try {
            ds.getConnection();
            ds.close();
        } catch (SQLException ex) {
            System.out.println("Error trying to connect H2");
        }
    }
    
}
