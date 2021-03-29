<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World!</title>
</head>
<body>
	<%! public void showSessionID(PageContext pc) throws IOException{
		JspWriter out = pc.getOut();
		HttpSession session = pc.getSession();
		Date created = new Date(session.getCreationTime());
		out.println("<p><font size='3' color='green'> The session was created at </font>"+created+"</p>");
		String name = pc.getServletConfig().getServletName();
		out.println("<h3>Servlet Name is: "+name+"</h3>");
	}
	%>
	<% showSessionID(pageContext); %>
</body>
</html>