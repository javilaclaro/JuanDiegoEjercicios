<%@page contentType="text/html; charset=UTF-8" %>
<%@page import="com.codesplai.javaweb.MiWeb" %>
<%@page import="com.codesplai.javaweb.PersonaController" %>
<%
    PersonaController.inicializa();
    String tablaHtml = MiWeb.tablaPersonas();
%>

<!DOCTYPE html>
<html lang="es-ES">
<head>
    <meta charset="utf-8">
    <title>Ejercicios HMTL/CSS</title>
    <link rel="stylesheet" type="text/css" href="css/estilos.css">
</head>
<body>

<h1>Lista de agenda</h1>

<%= tablaHtml %>

<br>