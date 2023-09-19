package com.applicationmaker.model.engine;

import java.lang.reflect.Field;
import java.util.List;


public class ServiceCreator {

    private String entityName;
    private String createdEntityName;
    private String className;
    private String createdClassName;
    private String createdCrudRep;

    public ServiceCreator(Class entity){
        try{
            Object object = entity.getDeclaredConstructor().newInstance();
            this.entityName = object.getClass().getSimpleName();
            this.createdEntityName = entityName.toLowerCase();
            this.className = entityName + "Service";
            this.createdClassName = entityName.toLowerCase() + "Service";
            this.createdCrudRep = createdEntityName + "DA";
        }catch (Exception e) {
            e.getMessage(); //--------------TODO: ADD EXCEPTION WRAPPER----------------
        }
    }

    public String toString(){
        return "public class " + className + "{\n" +
                "\n" +
                "    //------SINGLETON----------------------------------------------------\n" +
                "    private static final " + className + " " + createdClassName + " = new " + className + "();\n" +
                "\n" +
                "    private " + className + "() {\n" +
                "    }\n" +
                "\n" +
                "    public static " + className + " get" + className + "() {\n" +
                "        return " + createdClassName + ";\n" +
                "    }\n" +
                "\n" +
                "    //-------INSERT------------------------------------------------------\n" +
                "    public " + entityName + " save(" + entityName + " " + createdEntityName + ") throws Exception {\n" +
                "        try (CrudRepository<" + entityName + ", Long> " + createdCrudRep + " = new CrudRepository<>()) {\n" +
                "         return " + createdCrudRep + ".save(" + createdEntityName + ");\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    //-------UPDATE------------------------------------------------------\n" +
                "    public " + entityName + " edit(" + entityName + " " + createdEntityName + ") throws Exception {\n" +
                "        try (CrudRepository<" + entityName + ", Long> " + createdCrudRep + " = new CrudRepository<>()) {\n" +
                "           return " + createdCrudRep + ".edit(" + createdEntityName + ");\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    //-------REMOVE------------------------------------------------------\n" +
                "    public " + entityName + " delete(Long id) throws Exception {\n" +
                "        try (CrudRepository<" + entityName + ",Long> " + createdCrudRep + " = new CrudRepository<>()) {\n" +
                "            return " + createdCrudRep + ".delete(" + entityName + ".class, id);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    //------FIND-ALL-----------------------------------------------------\n" +
                "    public List<" + entityName + "> findAll() throws Exception {\n" +
                "        try (CrudRepository<" + entityName + ",Long> " + createdCrudRep + " = new CrudRepository<>()){\n" +
                "            return " + createdCrudRep + ".findAll(" + entityName + ".class);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    //------------------------------------------------------------------\n" +
                "    public List<" + entityName + "> findById(Long id) throws Exception {\n" +
                "        try(CrudRepository<" + entityName + ",Long> " + createdCrudRep + " = new CrudRepository<>()){\n" +
                "            return " + createdCrudRep + ".findById(" + entityName + ".class, id);\n" +
                "        }\n" +
                "    }\n" +
                "}"
                ;
    }

}
