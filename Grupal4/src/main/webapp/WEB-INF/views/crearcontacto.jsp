<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<%@ include file="inicio.jsp" %>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario de Contacto</title>
    <style>
        .formulario-contacto {
            font-family: Arial, sans-serif;
            max-width: 600px;
            margin: 20px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .formulario-contacto h1 {
            color: #333;
        }
        .formulario-contacto input[type="text"],
        .formulario-contacto textarea {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
            box-sizing: border-box;
        }
        .formulario-contacto input[type="submit"] {
            padding: 10px 20px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }
        .formulario-contacto input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="formulario-contacto">
        <h1>Formulario de Contacto</h1>
        <form action="/crearcontacto" method="post">
            <label for="nombre">Nombre:</label>
            <input type="text" id="nombre" name="nombre" required><br>
            <label for="email">Correo Electrónico:</label>
            <input type="text" id="email" name="email" required><br>
            <label for="asunto">Asunto:</label>
            <input type="text" id="asunto" name="asunto" required><br>
            <label for="mensaje">Mensaje:</label><br>
            <textarea id="mensaje" name="mensaje" rows="5" required></textarea><br>
            <input type="submit" value="Enviar">
        </form>
    </div>
</body>
</html>
