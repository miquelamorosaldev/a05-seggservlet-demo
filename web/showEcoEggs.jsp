<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EGGS SERVLETS DEMO - SHOW ECO EGGS</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h2>EGGS SERVLETS DEMO - SHOW ECO EGGS</h2>
        <p><a href="./index.html">Back to Main</a></p>
        <ol>
        <% 
            // Si la llista d'ous del servlet s'ha carregat correctament ...
            ArrayList<String> resultList = 
                (ArrayList<String>) request.getAttribute("ecoEggsList");
                // ... la mostrem a la web.
                if(resultList!=null) {
                    for (String result : resultList) {
                        out.println("<li>"+result+"</li>");
                    }
                }
        %>
        </ol>
</html>
