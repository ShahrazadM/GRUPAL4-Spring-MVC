<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <%@ include file="inicio.jsp" %>
    
    <title>Lista de Contactos</title>
    <style>
        table {
            border-collapse: separate;
            width: 50%;
            border: 2px solid orange; /* Establece el borde de la tabla a 2px sólido azul */
        }
        
        th, td {
            border: 2px solid orange; /* Establece el borde de las celdas a 2px sólido azul */
            padding: 8px;
            text-align: left;
        }
        
        th {
            background-color: #f2f2f2; /* Color de fondo para las celdas de encabezado */
        }
    </style>
</head>
<body>
    <h1>Lista de Contactos</h1>
    <table border="1">
        <tr>
            <th>Nombre</th>
            <th>Correo Electrónico</th>
            <th>Asunto</th>
            <th>Mensaje</th>
        </tr>
        <c:forEach items="${contacto}" var="contacto">
            <tr>
                <td><c:out value ="${contacto.getNombre()}"></c:out></td>
                <td><c:out value ="${contacto.getEmail()}"></c:out></td>
                <td><c:out value ="${contacto.getAsunto()}"></c:out></td>
                <td><c:out value ="${contacto.getMensaje()}"></c:out></td>
                
            </tr>
        </c:forEach>
    </table>
</body>
</html>
