
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="awakwlab.Grupal4.Modelo.been.Capacitaciones" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <%@ include file="inicio.jsp" %>

    <title>Lista de Capacitaciones con DAO </title>
    <style>
        .bordes-alternativos {
            width: 70%;
            border-collapse: collapse;
        }
        .bordes-alternativos th, .bordes-alternativos td {
            border: 2px  solid blue;
            padding: 8px;
            text-align: left;
        }
        .bordes-alternativos tr:nth-child(even) {
            border-top: 4px solid blue; /* Cambiar el color a azul */
            border-bottom: 4px solid blue; /* Cambiar el color a azul */
        }
    </style>
</head>
<body>
    <h1>Lista de Capacitaciones desde DAO</h1>
    <div class="table-responsive">
    <table class="bordes-alternativos"> 
    
        <tr>
            <th>Identificador</th>
            <th>RUT Cliente</th>
            <th>Día</th>
            <th>Hora</th>
            <th>Lugar</th>
            <th>Duración</th>
            <th>Cantidad de Asistentes</th>
        </tr>
        <c:forEach items="${listarcapacitacionesdao}" var="capacitaciones">
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
    </div>
</body>
</html>