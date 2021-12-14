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
        <form method="post" action="EggsServletFilterByType">
            <label for='name'>Egg Code (*) </label>
            <select name="eggsType">
                <option value="type0">0 - Eco Chickens</option>
                <option value="type1">1 - Free Chickens</option>
                <option value="type2">2 - Room Chickens</option>
                <option value="type3">3 - Cage Chickens</option>
            </select>
            <input class="btn btn-primary" type="submit" name="ok" value="Filter"/>
        </form> 
        <% 
            // Si la llista d'ous del servlet, 
            // filtrada per tipus, s'ha carregat correctament ...
            ArrayList<String> resultList = 
                (ArrayList<String>) request.getAttribute("filteredEggsList");
                // ... la mostrem a la web.
                if(resultList!=null) {
                    out.println("<ol>");
                    for (String result : resultList) {
                        out.println("<li>"+result+"</li>");
                    }
                    out.println("</ol>");
                } else {
                    out.println("<p style='color:red;'>No hi ha ous d'aquest tipus</p>");
                }
        %>
    </body>
</html>
