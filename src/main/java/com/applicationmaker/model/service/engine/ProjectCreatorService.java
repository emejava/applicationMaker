package com.applicationmaker.model.service.engine;

import com.applicationmaker.model.engine.enums.JavaVersion;

import java.io.File;

public class ProjectCreatorService {

    //------SINGLETON----------------------------------------------------
    private static ProjectCreatorService service = new ProjectCreatorService();

    private ProjectCreatorService(){
    }

    public static ProjectCreatorService getService() {
        return service;
    }

    //------CREATE--------------------------------------------------------
    public File create(JavaVersion jV){
        String path = "";
        switch (jV.toString()){
            case "EE8":
                path = "./project2copy/javaEE8";
                break;
        }
        return new File(path);
    }
}
