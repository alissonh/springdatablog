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
<title>Exibir</title>
</head>
<body>
  <div id="wrap">
  
  	<div id="menu">
    	<%@ include file="/menu.jsp" %>
    </div>
    <div id="main">
    	<div id="body">
    <c:if test="${not empty usuario}">       
        <div>
            <label for="nome">Usuario:</label>
            <div id="nome">${usuario.login}</div>
        </div>
        <br/>
        <div>
            <label for="email">Idade:</label>
            <div id="email">${usuario.idade}</div>
        </div>
        <br/>
       
    </c:if>
    <c:if test="${empty usuario}">Não há usuario neste ID.</c:if>

		</div>
	</div>
  </div>

</body>
</html>