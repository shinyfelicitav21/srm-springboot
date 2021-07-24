<html>
<body>

<p id="demo"></p>
<script>
document.getElementById("demo").innerHTML = "Welcome Here!";
function login()
{
    let name=document.getElementById("demo").value;
   let pwd=document.getElementById("pwd").value;
   alert("Successfully Logined!!");
}
</script>
<h2>Current Date: </h2>
<% 
out.println((new java.util.Date()).toString());
%>

<form>
<table>
<tr>
<td>User Name: </td>
<td><input type="text" id="user"></td>
</tr>
<tr>
<td>Password: </td>
<td><input type="password" id="pwd"></td>
</tr>
<tr><input type="button" onclick="login()" value="LOGIN"></tr>
</table>
</form>
</body>
</html>
