<%@page contentType="text/html;charset=UTF-8" %>
<%@page import="com.codesplai.vgames.*" %>

<%
String genero = request.getParameter("genero");
Genre g = new Genre(genero);
    GenreController.create(g);
%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>

<body>

<h2>Creando: <%= g.genre %> </h2>

</body>
</html>