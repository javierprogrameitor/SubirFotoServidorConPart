<jsp:directive.page contentType="text/html" pageEncoding="UTF-8"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contexto" value="${pageContext.request.contextPath}" scope="application"/>
<c:url var="estilo" value="/CSS/estilo.css" scope="application"/>
<!DOCTYPE html>
<html lang="es">
    <head>
        <c:import url="INC/cabecera.jsp">
            <c:param name="titulo" value="Gestión de imágenes" />
            <c:param name="estilo" value="${estilo}" />
        </c:import>
    </head>
    <body>
        <form action="${contexto}/FrontController" method="post">
            <div class="flota">
                <fieldset class="dentro">
                    <legend>Clase Part</legend>

                    <p><input type="submit" name="boton" value="1. Actualizar" class="enlace" 
                              title="FrontController&#10;listaActualizar.jsp&#10;ActualizarUsuario&#10;actualizar.jsp&#10;SubirAvatarUsuarioPart" /></p>
                    <p><input type="submit" name="boton" value="2. Visualizar" class="enlace" 
                              title="FrontController&#10;listado.jsp&#10;FrontController" /></p>
                    <p><input type="submit" name="boton" value="3. Subir privado" class="enlace" 
                              title="FrontController&#10;listaSubirPrivado.jsp&#10;SubirPrivadoAvatarUsuario" /></p>
                    <p><input type="submit" name="boton" value="4. Ver privado" class="enlace" 
                              title="FrontController&#10;listadoUsuariosConAvatarPrivado.jsp&#10;FrontController" /></p>
                </fieldset>
            </div>
        </form>
    </body>
</html>
