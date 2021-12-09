<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EGGS SERVLETS DEMO - ADD NEW EGG</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h2>EGGS SERVLETS DEMO - ADD NEW EGG</h2>
        <p><a href="./index.html">Back to Main</a></p>
        <% 
            String addEggResponse 
                = (String) request.getAttribute("addEggResponse");
            // Si es la primera vegada que entrem al form, no es mostrarà.
            // Si venim del servlet, mostrem la resposta.
            if (addEggResponse != null) {
                out.println(addEggResponse);
            }
        %>
        <form method="post" action="AddEggServlet">
            <label for='name'>Egg Code (*) </label>
            <input class="form-control" type="text" required id='eggCode' name="eggCode" 
                   placeholder='0ES93056123'></input>
            <input class="btn btn-primary" type="submit" name="ok" value="Add"/>
        </form> 
    </body>
</html>
