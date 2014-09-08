<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <style type="text/css" media="screen">   
    @import url("<c:url value="/static/styles/style.css"/>");
  </style> 
<title>Listar</title>
</head>
<body>
  <div id="wrap">
  
  	<div id="menu">
    	<%@ include file="/menu.jsp" %>
    </div>
    <div id="main">
    	<div id="body">
    <c:if test="${not empty usuarios}">
        <table width="600px">
            <tr>
                <thead>
                    <th>Login</th>                    
                    <th>Idade</th>                    
                </thead>
            </tr>
            <c:forEach items="${usuarios}" var="usuario">
                <tr>
                                     
                    <td>${usuario.login}</td>
                    <td>${usuario.idade}</td>
                   
                    <td align="center">
                        <form:form action="/blog/usuario/${usuario.login}" method="GET">
                            <input alt="Mostrar Usuario" src="<c:url value="/static/images/show.png"/>" title="Mostrar" type="image" value="Mostrar"/>
                        </form:form>
                    </td>
                    <td align="center">
                        <form:form action="/blog/usuario/${usuario.login}/form" method="GET">
                            <input alt="Atualizar" src="<c:url value="/static/images/update.png"/>" title="Atualizar" type="image" value="Atualizar"/>
                        </form:form>
                    </td>
                    <td align="center">
                        <form:form action="/blog/usuario/${usuario.login}" method="DELETE">
                            <input alt="Excluir " src="<c:url value="/static/images/delete.png"/>" title="Excluir" type="image" value="Excluir"/>
                        </form:form>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
    <c:if test="${empty usuarios}">Não há Usuarios cadastrados.</c:if>

		</div>
	</div>
  </div>

</body>
</html>