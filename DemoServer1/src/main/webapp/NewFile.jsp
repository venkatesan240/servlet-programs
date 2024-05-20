<%@page import="com.servlet.Register"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
 <style>
        table {
            border-collapse: collapse;
            width: 50%;
            text-align:center;
        }

        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }
        a{
        	text-decoration:none;
        	color:green;
        	
        }
        a:hover{
        	color:blue;
        }
    </style>
 </style>
<body>
<h2>ArrayList Data</h2>
    <table>
     <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Mobile</th>
        <th>password</th>
        <th>confirm-password</th>
    </tr>
        <%
            ArrayList<Register> list =( ArrayList<Register>)  request.getAttribute("list");
        if(list != null)
            for (Register item : list) {
        %>
        <tr>
            <td><%= item.getName() %></td>
            <td><%= item.getEmail() %></td>
            <td><%= item.getMobile() %></td>
            <td><%= item.getPassword() %></td>
            <td><%= item.getConfirmpassword() %></td>
            <td>
                   <form action="Example1" method="post">
                       <input type="hidden" name="email" value="<%= item.getEmail() %>">
                       <input type="hidden" value="delete" name="action">
                       <input type="submit" value="delete">
                   </form>
               </td>
         </tr>  
        
        <%
            }
        %>
    </table>
    <a href='http://localhost:8080/DemoServer1/'>Add account</a>
</body>
</html>