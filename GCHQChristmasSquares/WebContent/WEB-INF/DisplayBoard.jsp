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
    <% for(int i = 0; i < 25; i+=1) { %>
        <tr valign="top">
    	<% for(int j = 0; j < 25; j+=1) { %>
             <td class = "td" style="background-color:black"><br />  </td>
        <% } %>
        </tr>
    <% } %>
    </table>
  </div>
  
  <table>
		<tr>
			<td>Board object:</td>
			<td>${initialBoard}</td>
		</tr>
  </table>
  <table>
		<tr>
			<td>Board element:</td>
			<td><c:forEach items="${initialBoard}" var="element">
    The element value is ${element} <br/>
</c:forEach> </td>
		</tr>
  </table>
  </body>

<body>