package pl.vojteu.restapiweb;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

public class JdbcConfig {
    public static DataSource getMysqlDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:8081/sql-kurs");
        dataSource.setUsername("root");
        dataSource.setPassword("admin123");

        return dataSource;
    }
}

