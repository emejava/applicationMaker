package com.applicationmaker.model.entity.db;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class MvnDependency {
    private String oracleDependency =
            "    <dependency>\n" +
            "       <groupId>com.oracle.database.jdbc</groupId>\n" +
            "       <artifactId>ojdbc8</artifactId>\n" +
            "       <version>23.2.0.0</version>\n" +
            "    </dependency>";

    private String mysqlDependency =
            "<dependency>\n" +
            "    <groupId>mysql</groupId>\n" +
            "           <artifactId>mysql-connector-java</artifactId>\n" +
            "    <version>8.0.29</version>\n" +
            "</dependency>\n";

    private String postgresDependency =
            "    <dependency>\n" +
            "       <groupId>org.postgresql</groupId>\n" +
            "       <artifactId>postgresql</artifactId>\n" +
            "       <version>42.6.0</version>\n" +
            "    </dependency>";

    private String mongodbDependency =
            "     <dependency>\n" +
            "        <groupId>org.mongodb</groupId>\n" +
            "        <artifactId>mongodb-driver-sync</artifactId>\n" +
            "        <version>4.10.2</version>\n" +
            "     </dependency>";
}
