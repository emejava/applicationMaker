package com.applicationmaker.model.entity.db;

public class ConnectionString {

    public String getOracleConnectionString(){
        String oracleCS   = "jdbc:oracle:thin:@localhost:1521:xe";
        return oracleCS;
    }

    public String getMySqlConnectionString(String hostName, String serverPort, String dbName){
//        baseUrl+hostName+":"+serverPort+"/"+dbName;
        String mySqlCS = "jdbc:mysql://%s:%s/%s";
        String mySqlConnectionString = String.format(mySqlCS,hostName, serverPort, dbName);
        return mySqlConnectionString;
    }



    public String getPostgresConnectionString(String dbUsername, String dbPassword
            , String hostName, String serverPort, String dbName){
        //baseUrl+dbUsername+":"+dbPassword+"@"+hostName+":"+serverPort+"/"+dbName;
        String postgresCS = "postgres://%s:%s@%s:%s/%s";
        String postgresConnectionString = String.format(postgresCS,dbUsername,dbPassword,hostName,serverPort,dbName);
        return postgresConnectionString;
    }

    public String getMongodbConnectionString(String hostname, String serverPort, String dbName){
//        baseUrl+hostName+":"+serverPort+"/"+dbName
        String mongoCS = "mongodb://%s:%s/%s";
        String mongoDbConnectionString = String.format(mongoCS,hostname,serverPort,dbName);
        return mongoDbConnectionString;
    }
}
