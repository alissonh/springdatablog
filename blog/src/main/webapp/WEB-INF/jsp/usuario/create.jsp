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
<title>Cadastrar</title>

</head>
<body>
  <div id="wrap">
  
  	<div id="menu">
    	<%@ include file="/menu.jsp" %>
    </div>
    <div id="main">
    	<div id="body">
    <form action="/blog/usuario" method="POST">    
        <div>
           Login:
            <input type ="text" name="login" id = "login"/>
          
        </div>
        <br/>
        <div>
           Senha:
            <input type ="password" name="senha" id = "senha"/>
            
        </div>        
        <br/>
        <div>
          Idade: 
          <input type ="text" name="idade" id = "idade"/>
            
        </div>
        <br/>
 
        <div class="submit">
            <input id="criar" type="submit" value="Criar Usuario"/>
        </div>
    </form>
		</div>
	</div>
  </div>

</body>
</html>