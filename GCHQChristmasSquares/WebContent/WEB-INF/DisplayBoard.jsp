<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>


<style>
    div
    {
    text-align: left; 
    text-indent: 0px; 
    padding: 0px 0px 0px 0px; 
    margin: 0px 0px 0px 0px;
    }
    td.td
    {
                 border-width : 1px; 
                 background-color: #99cc00;
                 text-align:center;

    }
    </style>  
  <body>
  
<div>  
    <table id = "mytable" width="100%" border="1" cellpadding="2" cellspacing="2" style="background-color: #ffffff;">
			<c:forEach var="row" items="${board}">
			<tr valign="top">
			  <c:forEach var="value" items="${row}">
			  <c:if test = "${value==0}">
             	<td class = "td" style="background-color:white"><br />  </td>
        	  </c:if>
        	  <c:if test ="${value==1}">
             	<td class = "td" style="background-color:black"><br />  </td>
        	  </c:if>
    	      </c:forEach> 
    	      </tr>
			</c:forEach> 
	</table>
</div>

<form action = "/GCHQChristmasSquares/firstStep" method="get">
		<input type="submit" value="Solve Puzzle: Step 1" /> 
	</form>
  
  </body>

<body>