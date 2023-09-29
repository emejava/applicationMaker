package com.applicationmaker.model.service.dbService;


import com.applicationmaker.model.entity.db.*;
import com.applicationmaker.model.entity.db.enums.DB;
import com.applicationmaker.model.entity.db.enums.Dependencies;

public class DbService {


    public Response getOracleConfig(Request request) {
        DriverClass driverClass = new DriverClass();
        MvnDependency mvnDependency = new MvnDependency();
        GradleDependency gradleDependency = new GradleDependency();

        ConnectionString connectionString = new ConnectionString();
        Response response = new Response();
        if (request.getDb().equals(DB.oracle)) {
            if (request.getSelectedDependency().equals(Dependencies.MvnDependency)) {
                response.setDb(request.getDb());
                response.setDependency(mvnDependency.getOracleDependency());
                response.setConnectionString(connectionString.getOracleConnectionString());
                response.setDriverClass(driverClass.getOracleDriverClass());
                return response;
            } else if (request.getSelectedDependency().equals(Dependencies.GradleDependency)) {
                response.setDb(request.getDb());
                response.setDependency(gradleDependency.getOracleDependency());
                response.setConnectionString(connectionString.getOracleConnectionString());
                response.setDriverClass(driverClass.getOracleDriverClass());
                return response;
            }
        }
        return Response.builder()
                .connectionString("invalid data")
                .dependency("invalid data")
                .driverClass("invalid data")
                .build();
    }

    public Response getMySqlConfig(Request request) {
        DriverClass driverClass = new DriverClass();
        MvnDependency mvnDependency = new MvnDependency();
        GradleDependency gradleDependency = new GradleDependency();
        ConnectionString connectionString = new ConnectionString();
        Response response = new Response();
        if (request.getDb().equals(DB.mysql)) {
            if (request.getSelectedDependency().equals(Dependencies.MvnDependency)) {
                response.setDb(request.getDb());
                response.setDependency(mvnDependency.getMysqlDependency());

                response.setConnectionString(connectionString.getMySqlConnectionString(request.getHostName(), request.getServerPort(), request.getDbName()));
                response.setDriverClass(driverClass.getMysqlDriverClass());
                return response;
            } else if (request.getSelectedDependency().equals(Dependencies.GradleDependency)) {
                response.setDb(request.getDb());
                response.setDependency(gradleDependency.getOracleDependency());
                response.setConnectionString(connectionString.getMySqlConnectionString(request.getHostName(), request.getServerPort(), request.getDbName()));
                response.setDriverClass(driverClass.getMysqlDriverClass());
                return response;
            }
        }
        return Response.builder()
                .connectionString("invalid data")
                .dependency("invalid data")
                .driverClass("invalid data")
                .build();
    }

    public Response getPostgresConfig(Request request) {
        DriverClass driverClass = new DriverClass();
        MvnDependency mvnDependency = new MvnDependency();
        GradleDependency gradleDependency = new GradleDependency();
        ConnectionString connectionString = new ConnectionString();
        Response response = new Response();
        if (request.getDb().equals(DB.postgres)) {
            if (request.getSelectedDependency().equals(Dependencies.MvnDependency)) {
                response.setDb(request.getDb());
                response.setDependency(mvnDependency.getPostgresDependency());

                response.setConnectionString(connectionString.getPostgresConnectionString(request.getDbUsername(), request.getDbPassword(), request.getHostName(), request.getServerPort(), request.getDbName()));
                response.setDriverClass(driverClass.getPostgresDriverClass());
                return response;
            } else if (request.getSelectedDependency().equals(Dependencies.GradleDependency)) {
                response.setDb(request.getDb());
                response.setDependency(gradleDependency.getPostgresDependency());
                response.setConnectionString(connectionString.getPostgresConnectionString(request.getDbUsername(), request.getDbPassword(), request.getHostName(), request.getServerPort(), request.getDbName()));
                response.setDriverClass(driverClass.getPostgresDriverClass());
                return response;
            }
        }
        return Response.builder()
                .connectionString("invalid data")
                .dependency("invalid data")
                .driverClass("invalid data")
                .build();
    }

    public Response getMongodbConfig(Request request) {
        DriverClass driverClass = new DriverClass();
        MvnDependency mvnDependency = new MvnDependency();
        GradleDependency gradleDependency = new GradleDependency();
        ConnectionString connectionString = new ConnectionString();
        Response response = new Response();
        if (request.getDb().equals(DB.mongodb)) {
            if (request.getSelectedDependency().equals(Dependencies.MvnDependency)) {
                response.setDb(request.getDb());
                response.setDependency(mvnDependency.getMongodbDependency());

                response.setConnectionString(connectionString.getMongodbConnectionString(request.getHostName(), request.getServerPort(), request.getDbName()));
                response.setDriverClass(driverClass.getMongodbDriverClass());
                return response;
            } else if (request.getSelectedDependency().equals(Dependencies.GradleDependency)) {
                response.setDb(request.getDb());
                response.setDependency(gradleDependency.getMongodbDependency());
                response.setConnectionString(connectionString.getMongodbConnectionString(request.getHostName(), request.getServerPort(), request.getDbName()));
                response.setDriverClass(driverClass.getPostgresDriverClass());
                return response;
            }
        }
        return Response.builder()
                .connectionString("invalid data")
                .dependency("invalid data")
                .driverClass("invalid data")
                .build();
    }


}
