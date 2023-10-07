<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" import="javax.servlet.http.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String fName = (String)application.getAttribute("fName");
out.println("WELCOME : "+fName+"<br>");
String s1 = (String)application.getAttribute("s1");
if(s1.equals("AdminLogin")){
%>
<jsp:include page="link2.html"/>
<%
}else{
%>
<jsp:include page="link.html"/>
<%
}
%>
</body>
</html>
