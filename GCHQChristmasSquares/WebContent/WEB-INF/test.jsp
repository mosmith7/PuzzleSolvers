<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Example c:forEach tag in JSTL</title>
</head>
<body>
<c:forEach var="counter" begin="1" end="10">
 <c:out value="${counter}"/>
</c:forEach>
			
<div>  
    <table id = "mytable" width="100%" border="1" cellpadding="2" cellspacing="2" style="background-color: #ffffff;">
    <% for(int i = 0; i < 25; i+=1) { %>
        <tr valign="top">
    	<% for(int j = 0; j < 25; j+=1) { %>
             <td class = "td" style="background-color:black"><br />  </td>
        <% } %>
        </tr>
    <% } %>
    </table>
  </div>

<div>  
    <table id = "mytable" width="100%" border="1" cellpadding="2" cellspacing="2" style="background-color: #ffffff;">
			<c:forEach var="row" items="${initialBoard}">
			<tr valign="top">
			  <c:forEach var="value" items="${row}">
			  <c:if test = "${value==0}">
             	<td class = "td" style="background-color:black"><br />  </td>
        	  </c:if>
        	  <c:if test ="${value==1}">
             	<td class = "td" style="background-color:white"><br />  </td>
        	  </c:if>
    	      </c:forEach> 
    	      </tr>
			</c:forEach> 
	</table>
</div>
  
</body>
</html>