package com.applicationmaker.model;

import com.applicationmaker.model.engine.enums.JavaVersion;
import com.applicationmaker.model.service.engine.ProjectCreatorService;
import com.applicationmaker.model.service.engine.ServiceCreatorService;
import org.apache.commons.io.FileUtils;


import java.io.File;


public class Main {
    public static void main(String[] args) throws Exception {
        // TODO: These tests have the location of project, if you test this part please delete copied zip or entity
//        TEST ServiceCreatorService
        ServiceCreatorService.getService().create(
                "person", "com", "applICationmaker",
                "./src/main/java/com/applicationMaker/model/entity/engine");

//        TEST ProjectCreatorService
        File file = ProjectCreatorService.getService().create(JavaVersion.EE8);
        File file2 = new File("./");
        FileUtils.copyDirectory(file, file2);

    }
}
