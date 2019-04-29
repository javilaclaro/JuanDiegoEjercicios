<%@page contentType="text/html;charset=UTF-8" %>
<%@page import="com.codesplai.vgames.*" %>


<!DOCTYPE html>
<html lang="es">
<head>
        <link rel="stylesheet" href="css/estilos.css">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body>
  <tbody>
  <h1 id="principal">Selecciona qué quieres ver:</h1>
  <br><br><br><br><br>
  <a href="index.jsp">Inicio</a>
    <a href="Generos.jsp">Generos</a>
    <a href="Publishers.jsp">Publishers</a>
    <a href="Platforms.jsp">Platforms</a>
    <a href="Ventas.jsp">Ventas</a>
    <a href="formagenero.jsp">Forma Genero</a>
    <button class="modificar"><a href="formagenero.jsp"> Crear género</a></button>
    <button class="modificar"><a href="formagenero.jsp"> Eliminar género</a></button>
    <button class="modificar"><a href="formagenero.jsp"> Crear Plataforma</a></button>
    <button class="modificar"><a href="formagenero.jsp"> Eliminar Plataforma</a></button>


  </tbody>
</table>


</body>
</html>