package com.applicationmaker.model.service.engine;

import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ServiceCreatorService {

    //------SINGLETON----------------------------------------------------
    private static ServiceCreatorService service = new ServiceCreatorService();

    private ServiceCreatorService(){
    }

    public static ServiceCreatorService getService() {
        return service;
    }

    //------CREATE--------------------------------------------------------
    public void create(String entityName, String projectGroup, String projectName, String servicePackagePath) throws Exception{
        Path path = Paths.get("./src/main/java/com/applicationMaker/model/entity/engine/ServiceTemplate.txt");
        String content = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);

        entityName = entityName.substring(0, 1).toUpperCase() + entityName.substring(1);

        content = content.replaceAll("&ENTITY_NAME&", entityName);
        content = content.replaceAll("&PROJECT_GROUP&", projectGroup.toLowerCase());
        content = content.replaceAll("&PROJECT_NAME&", projectName.toLowerCase());

        FileWriter writer = new FileWriter(servicePackagePath + "\\" + entityName + "Service.java");
        writer.write(content);
        writer.close();
    }
}
