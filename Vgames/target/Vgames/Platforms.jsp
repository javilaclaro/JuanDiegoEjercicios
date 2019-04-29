<%@page contentType="text/html;charset=UTF-8" %>
<%@page import="com.codesplai.vgames.*" %>


<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="css/estilos.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</head>
<body>
    
<table class="table" id="tabla_listado">
  <thead>
    <tr>
      <th > <h1># id</h1></th>
      <th ><h1>Plataforma</h1></th>
      </tr>
  </thead>
  <tbody>
        <button onclick="topFunction()" id="myBtn" title="Go to top">Ir arriba</button>
        <script>
                // When the user scrolls down 20px from the top of the document, show the button
                window.onscroll = function() {scrollFunction()};
                function ordenar(){ location.reload(forcedGet);}
                function scrollFunction() {
                  if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
                    document.getElementById("myBtn").style.display = "block";
                  } else {
                    document.getElementById("myBtn").style.display = "none";
                  }
                }
                
                // When the user clicks on the button, scroll to the top of the document
                function topFunction() {
                  document.body.scrollTop = 0;
                  document.documentElement.scrollTop = 0;
                }
                </script>
   <% for (Plataforma pla : PlataformaController.getAll()) { %>
        <tr>
        <td><%= pla.id_plataforma %></td>
        <td><%= pla.plataforma %></td>
        </tr>
    <% } %>
    <a href="index.jsp">Inicio</a>
    <a href="Generos.jsp">Generos</a>
    <a href="Publishers.jsp">Publishers</a>
    <a href="Platforms.jsp">Platforms</a>
    <a href="Ventas.jsp">Ventas</a>
  </tbody>
</table>
<a href="index.jsp">Volver al inicio</a>

</body>
</html>