<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EGGS SERVLETS DEMO - FILTER EGGS BY TYPE</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h2>EGGS SERVLETS DEMO  - FILTER EGGS BY TYPE</h2>
        <p><a href="./index.html">Back to Main</a></p>
        <form method="post" action="EggsManager">
            <label for='name'>Egg Code (*) </label>
            <input class="form-control" type="text" required id='name' name="name" 
                   placeholder='Nom'></input>
            <input class="btn btn-primary" type="submit" name="ok" value="Add"/>
        </form> 
        <% 
            // Si la llista d'ous del servlet s'ha carregat correctament ...
            ArrayList<String> resultList = 
                (ArrayList<String>) request.getAttribute("filteredEggsList");
            if(resultList!=null) {
                out.println(resultList.get(0).toString());
            }
        %>
    </body>
</html>
