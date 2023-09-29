package com.applicationmaker.model.entity.db;

import lombok.Data;

@Data
public class DriverClass {
    private String oracleDriverClass   = "oracle.jdbc.driver.OracleDriver";
    private String mysqlDriverClass   = "com.mysql.jdbc.Driver";
    private String postgresDriverClass = "org.postgresql.Driver";
    private String mongodbDriverClass  = "mongodb.jdbc.MongoDriver";
}
