
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Página de Inicio</title>
    <!-- Hoja de estilo -->
    <link rel="stylesheet" href="<core:url value="/res/css/estilo.css" />">
    <!-- JavaScript para efecto de desplazamiento suave -->
    <script>
        document.addEventListener("DOMContentLoaded", function() {
            var links = document.querySelectorAll('a[href^="#"]');
            links.forEach(function(link) {
                link.addEventListener('click', function(e) {
                    e.preventDefault();
                    var targetId = this.getAttribute('href').substring(1);
                    var targetElement = document.getElementById(targetId);
                    if (targetElement) {
                        var offsetTop = targetElement.offsetTop;
                        window.scrollTo({
                            top: offsetTop,
                            behavior: 'smooth'
                        });
                    }
                });
            });
        });
    </script>
</head>
<body>
    <div class="container">
        <h1>${mensaje}</h1>
       <h2>PREVENSION 2.0 SOCIEDAD LIMITADA</h2> 
        <p>En nuestro portal encontrarás información relevante sobre prevención de riesgos en tu empresa.</p>
        <p>Puedes comenzar explorando nuestras capacitaciones, contactándonos para más información o creando una nueva capacitación.</p>
        <ul>
            <%@ include file="mimenu.jsp" %> <!-- Aquí se incluiría el menú -->
        </ul>
    </div>
</body>
</html>
	