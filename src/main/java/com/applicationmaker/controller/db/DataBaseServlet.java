package com.applicationmaker.controller.db;


import com.applicationmaker.model.entity.db.Request;
import com.applicationmaker.model.entity.db.Response;
import com.applicationmaker.model.entity.db.enums.DB;
import com.applicationmaker.model.entity.db.enums.Dependencies;
import com.applicationmaker.model.entity.db.enums.JDKVersion;
import com.applicationmaker.model.service.dbService.DbService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/dbConfig")
public class DataBaseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DbService dbService = new DbService();
        DB db = DB.valueOf(req.getParameter("dbs"));
        Dependencies dependencies = Dependencies.valueOf(req.getParameter("dependencies"));
        String username = req.getParameter("dbUsername");
        String password = req.getParameter("dbPassword");
        String hostName = req.getParameter("hostName");
        String serverPort = req.getParameter("serverPort");
        String dbName = req.getParameter("dbName");
        JDKVersion jdkVersion = JDKVersion.valueOf(req.getParameter("jdkVersions"));

        Request request = new Request(db,dependencies,username,password,hostName,serverPort,dbName, jdkVersion);


        if (request.getDb().equals(DB.oracle)){
            Response response = dbService.getOracleConfig(request);
            req.getSession().setAttribute("db",response.getDb());
            req.getSession().setAttribute("dependency",response.getDependency());
            req.getSession().setAttribute("driverClass",response.getDriverClass());
            req.getSession().setAttribute("connectionString",response.getConnectionString());
            req.getRequestDispatcher("db/showConfig.jsp").forward(req,resp);
        }
        if (request.getDb().equals(DB.mysql)){
            Response response = dbService.getMySqlConfig(request);
            req.getSession().setAttribute("db",response.getDb());
            req.getSession().setAttribute("dependency",response.getDependency());
            req.getSession().setAttribute("driverClass",response.getDriverClass());
            req.getSession().setAttribute("connectionString",response.getConnectionString());
            req.getRequestDispatcher("db/showConfig.jsp").forward(req,resp);
        }
        if (request.getDb().equals(DB.postgres)){
            Response response = dbService.getPostgresConfig(request);
            req.getSession().setAttribute("db",response.getDb());
            req.getSession().setAttribute("dependency",response.getDependency());
            req.getSession().setAttribute("driverClass",response.getDriverClass());
            req.getSession().setAttribute("connectionString",response.getConnectionString());
            req.getRequestDispatcher("db/showConfig.jsp").forward(req,resp);
        }
        if (request.getDb().equals(DB.mongodb)){
            Response response = dbService.getMongodbConfig(request);
            req.getSession().setAttribute("db",response.getDb());
            req.getSession().setAttribute("dependency",response.getDependency());
            req.getSession().setAttribute("driverClass",response.getDriverClass());
            req.getSession().setAttribute("connectionString",response.getConnectionString());
            req.getRequestDispatcher("db/showConfig.jsp").forward(req,resp);
        }
    }
}
