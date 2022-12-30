<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">

<title>ERROR</title>

<style type="text/css">
     
     h1{
        text-align : center;
       font-size : 50px;
        font-family: Rockwell;
       margin-top: 200px;
       color: white;
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
  <h1> Aucun étudiant ne correspond à votre recherche !</h1>
  
  
     <form action="index.jsp">
        <div class="position-absolute top-50 start-50 translate-middle">
        <button type="submit" class="btn btn-outline-danger">Retourner vers la page principale</button></div>
     
     </form>
  
  
</body>
</html>