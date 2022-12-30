<%@page import="service.ConcoursWSProxy"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Acceptance</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">

<style type="text/css">
      .titre{
       text-align : center;
       font-size : 45px;
       font-family: Rockwell;
       margin-top: 150px;
       color: black;
       text-shadow : 2px 2px 2px green;
       
    }  
    .titref{
       text-align : center;
       font-size : 45px;
       font-family: Rockwell;
       margin-top: 150px;
       color: black;
       text-shadow : 2px 2px 2px red;
       
    }  
    body{
       background-image : url("Images/Back.jpg");
       background-size : cover;
       background-attachment: fixed;
       
    }
</style>

</head>
<body>
     
     <%
         int res;String CNI;
         
         if (request.getParameter("cni")!= null){
        	 CNI= request.getParameter("cni");
        	 ConcoursWSProxy stub = new ConcoursWSProxy();
        	 res = stub.isAccepted(CNI);
        	 
        	 if(res == 1){
        		 %>
        	  <p class="titre">Félicitation! Vous êtes accepté pour passer le concours ! Plus d'informations sur la date et les modalités du concours vous seront communiqués ultérierement</p>
        		<%  
        	 }else if(res == 0){
        		 %>
        		 <p class="titref">Malhereusement, votre candidature a été rejetée. Vos notes ne sont pas qualifiantes !</p>
        	     <% 
        	 }else{
        		
        		  
        		   response.sendRedirect("NonExistant.jsp"); 
        		  
        	 }
         }	 
         
     %>
     <form action="index.jsp">
        <div class="position-absolute top-50 start-50 translate-middle">
        <button type="submit" class="btn btn-primary btn-lg">Retourner vers la page principale</button></div>
     
     </form>

     
</body>
</html>