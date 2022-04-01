package co.edu.udistrital.cine.persistencia;

import java.sql.Connection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataSourceTest {

    @Test
    public void testGetConnection() throws Exception {
        Assertions.assertDoesNotThrow(() -> {
            try ( Connection conn = DataSource.getConnection();) {
            }
        });
    }

}
