<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="es.paqueteria.paqueteria.modelo.*,es.paqueteria.paqueteria.bbdd.*"%>
<%@ page import="java.sql.ResultSet,java.sql.PreparedStatement,java.sql.Connection" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

ConectarMysql db = new ConectarMysql();
try {
	db.MySQLConnection("root", "", "paqueteria");
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

ResultSet rs;
PreparedStatement ps = null;

	rs = ps.executeQuery("SELECT * FROM PROVINCIA WHERE ID_L = 1");
	rs = ps.executeQuery();
	
	rs.getInt(1);
	

%>
<p>Nombre Localidad: <%= rs.getString(3)%> <p>
</body>
</html>