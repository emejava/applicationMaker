<%--
  User: Ali Rad
  Date: 9/28/2023
  Time: 2:12 PM
  Git : https://github.com/alixrad2 
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../db/style.css">
    <title>DB Conf resp</title>
</head>
<body>
<strong><h2>Tanks for using our Service</h2></strong>
<br>
<strong><h2>Here is your ${sessionScope.db} Database Config : </h2></strong>
<hr>
<h3>Database Name : </h3>
<strong><h4>${sessionScope.db}</h4></strong><br>

<h3>Dependency For DataBase (Mvn,Gradle) : </h3>
<div class="text">
    <textarea id="ِDependency" rows="7" cols="60" readonly>
        ${sessionScope.dependency}
    </textarea>
</div>
<br>

<h3>DriverClass For Database : </h3>
<strong><h4>${sessionScope.driverClass}</h4></strong><br>

<h3>Connection String For Database : </h3>
<strong><h4>${sessionScope.connectionString}</h4></strong><br>



</body>
</html>
