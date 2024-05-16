<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <%@ include file="inicio.jsp" %>
    <title>Crear Capacitación DAO</title>
    <style>
        .formulario-capacitacion {
            font-family: Arial, sans-serif;
            max-width: 600px;
            margin: 20px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .formulario-capacitacion h1 {
            color: #333;
        }
        .formulario-capacitacion input[type="text"],
        .formulario-capacitacion textarea {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
            box-sizing: border-box;
        }
        .formulario-capacitacion input[type="submit"] {
            padding: 10px 20px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }
        .formulario-capacitacion input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="formulario-capacitacion">
    <h1>Crear Nueva Capacitación DAO</h1>
        <form action="crearcapacitacionesdao" method="post">
            <label for="identificador">Identificador:</label>
            <input type="text" id="identificador" name="identificador"><br>
        
            <label for="rutCliente">RUT Cliente:</label>
            <input type="text" id="rutCliente" name="rutCliente"><br>
        
            <label for="dia">Día:</label>
            <input type="text" id="dia" name="dia"><br>
        
            <label for="hora">Hora:</label>
            <input type="text" id="hora" name="hora"><br>
        
            <label for="lugar">Lugar:</label>
            <input type="text" id="lugar" name="lugar"><br>
        
            <label for="duracion">Duración:</label>
            <input type="text" id="duracion" name="duracion"><br>
        
            <label for="cantidadAsistentes">Cantidad de Asistentes:</label>
            <input type="text" id="cantidadAsistentes" name="cantidadAsistentes"><br>
        
            <input type="submit" value="Crear Capacitación DAO">
        </form>
        </div>
</body>
</html>