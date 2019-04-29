<%@page contentType="text/html; charset=UTF-8" %>
<%@page import="com.codesplai.javaweb.MiWeb" %>
<%@page import="com.codesplai.javaweb.PersonaController" %>
<%@page import="com.codesplai.javaweb.Persona" %>

<%
    String ids = request.getParameter("id");
    int id = Integer.parseInt(ids);
    Persona encontrada = PersonaController.getById(id);
    String datosPersona = "Persona no econtrada";
    if (encontrada!=null){
        datosPersona = String.format(
            "<h2>Nombre: %s, Email: %s</h2>",
            encontrada.nombre, encontrada.email
        );
    }
%>

<!DOCTYPE html>
<html lang="es-ES">
<head>
    <meta charset="utf-8">
    <title>Ejercicios HMTL/CSS</title>
    <link rel="stylesheet" type="text/css" href="css/estilos.css">
</head>
<body>

<a href="index.jsp">Volver</a>

<h1>Detalle de contacto <%= id %> </h1>
<%= datosPersona %>

<br>