<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="awakwlab.Grupal4.Modelo.been.Capacitaciones" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <%@ include file="inicio.jsp" %>
    
    <title>Lista de Capacitaciones</title>
    
</head>
<body>
    <h1>Lista de Capacitaciones</h1>
    <table border="1">
        <tr>
            <th>Identificador</th>
            <th>RUT Cliente</th>
            <th>Día</th>
            <th>Hora</th>
            <th>Lugar</th>
            <th>Duración</th>
            <th>Cantidad de Asistentes</th>
        </tr>
        <c:forEach items="${capacitaciones}" var="capacitaciones">
            <tr>
                <td><c:out value ="${capacitaciones.identificador}"/></td>
                <td><c:out value ="${capacitaciones.rutCliente}"/></td>
                <td><c:out value ="${capacitaciones.dia}"/></td>
                <td><c:out value ="${capacitaciones.hora}"/></td>
                <td><c:out value ="${capacitaciones.lugar}"/></td>
                <td><c:out value ="${capacitaciones.duracion}"/></td>
                <td><c:out value ="${capacitaciones.cantidadAsistentes}"/></td>
            </tr>
        </c:forEach>
    </table>
    
</body>
</html>