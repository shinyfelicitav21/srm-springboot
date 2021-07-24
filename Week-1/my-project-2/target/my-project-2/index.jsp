<html>
<body>

<h2>Utility String Functions: </h2>

<%=  org.training.example.StringDemo.sample("Function","Function")%><br/>
<%=  org.training.example.StringDemo.contains("Shiny")%><br/>
<%=  org.training.example.StringDemo.length("Felicita")%><br/>
<%=  org.training.example.StringDemo.concat("Sheila")%><br/>
<%=  org.training.example.StringDemo.index("Kiran")%><br/>
<%=  org.training.example.StringDemo.hash("Sunny Hieden")%>

<h2>Utility Date Function: </h2>

<% out.println((new java.util.Date()).toString()); %><br/>
<% out.print(org.training.example.DateDemo.afterDate());%><br/>
<% out.print(org.training.example.DateDemo.beforeDate());%> 
</body>
</html>
