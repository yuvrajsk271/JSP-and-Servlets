<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP scripting elements</title>
</head>
<body>
<strong>Examples</strong>
<%! int x= 22;
int y= 44; %>
<%= new Integer(50) %>
<%= new String ("Chaand") %>
<br/>
<% int x=10; 
out.println(x); %>
<br/>
<%! 
	String message(){
	return "This is a random message";
}
%>
<%= message() %>
<br/>
<br/>

<!-- making use of the redirect method here -->
	<% 
		int z = 25;
	out.print("The value of x :");
	out.print(z);
	response.sendRedirect("https:www.google.com");
	%>>
</body>
</html>