<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.Date"%>

<%!
    // Declaration
    int number = 5;

    public int square(int n) {
        return n * n;
    }
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Assignment</title>

<style>
body{
    font-family:Arial;
}

table{
    border-collapse:collapse;
    width:40%;
}

th,td{
    border:1px solid black;
    padding:8px;
    text-align:center;
}

h2{
    color:blue;
}
</style>

</head>

<body>

<%-- 1.Welcome to JSP  --%>
<h2> Welcome to JSP</h2>

Welcome to JSP

<hr>


<%-- 2.Current Date and Time  --%>
<h2> Current Date and Time</h2>

Current Date and Time :
<b><%= new Date() %></b>

<hr>

<%-- 3. JSP Tags --%>
<h2> JSP Declaration</h2>

Number = <%= number %>

<br><br>

Square of <%= number %> =
<b><%= square(number) %></b>

<hr>

<h2> JSP Scriptlet</h2>

<%
int a = 10;
int b = 20;
int sum = a + b;

out.println("A = " + a + "<br>");
out.println("B = " + b + "<br>");
out.println("Sum = " + sum);
%>

<hr>

<h2> JSP Expression</h2>

Current Year :
<%= java.time.Year.now() %>

<br><br>

Addition :
<%= 100 + 200 %>

<hr>

<%-- 4. Multiplication Table  --%>

<h2> Multiplication Table of 5</h2>

<table>

<tr>
<th>Expression</th>
<th>Result</th>
</tr>

<%
for(int i=1;i<=10;i++){
%>

<tr>
<td>5 x <%= i %></td>
<td><%= 5*i %></td>
</tr>

<%
}
%>

</table>

</body>
</html>