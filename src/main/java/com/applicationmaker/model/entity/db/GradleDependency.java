package com.applicationmaker.model.entity.db;

import lombok.Data;

@Data
public class GradleDependency {
    private String oracleDependency   = "implementation group: 'com.oracle.database.jdbc', name: 'ojdbc8', version: '23.2.0.0'";
    private String mysqlDependency    = "implementation group: 'mysql', name: 'mysql-connector-java', version: '8.0.33'";
    private String postgresDependency = "implementation group: 'org.postgresql', name: 'postgresql', version: '42.6.0'";
    private String mongodbDependency  = "implementation group: 'org.mongodb', name: 'mongodb-driver-sync', version: '4.10.2'";
}
