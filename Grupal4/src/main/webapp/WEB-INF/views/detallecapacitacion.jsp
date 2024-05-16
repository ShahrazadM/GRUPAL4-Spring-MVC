<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <%@ include file="inicio.jsp" %>
    <title>Detalle de Capacitación</title>
</head>
<body>
    <h1>Detalle de la Capacitación</h1>
    <ul>
        <li><strong>Identificador:</strong> ${capacitacion.identificador}</li>
        <li><strong>RUT Cliente:</strong> ${capacitacion.rutCliente}</li>
        <li><strong>Día:</strong> ${capacitacion.dia}</li>
        <li><strong>Hora:</strong> ${capacitacion.hora}</li>
        <li><strong>Lugar:</strong> ${capacitacion.lugar}</li>
        <li><strong>Duración:</strong> ${capacitacion.duracion}</li>
        <li><strong>Cantidad de Asistentes:</strong> ${capacitacion.cantidadAsistentes}</li>
    </ul>
    <a href="crearcapacitacionesdao">Crear otra capacitación</a>
</body>
</html>