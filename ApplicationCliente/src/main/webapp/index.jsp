<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Candidature Concours Institut X</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
<style type="text/css">
    .titre{
       text-align : center;
       font-size : 45px;
       font-family: Rockwell;
       margin-top: 200px;
       color: black;
       text-shadow : 2px 2px 2px grey;
       
    }  
    body{
       background-image : url("Images/Back.jpg");
       background-size : cover;
       background-attachment: fixed;
       
    }
</style>

</head>
<body>
 
 
 <p class="titre">Bienvenue dans le portail du concours d'accès à l'institut X</p>
 <div class="position-absolute top-50 start-50 translate-middle">
  <form action="IsAccepted.jsp">
     <div class="row g-3">
    <div class="col">
    <input type="text" class="form-control" placeholder="CNI" aria-label="CNI" name="cni">
    </div>
   <div class="col">
    <input type="text" class="form-control" placeholder="CNE" aria-label="CNE" name="cne">
   </div>
   </div>
   <div class="position-absolute top-50 start-100 translate-middle-y">
   <button type="submit" class="btn btn-outline-info">Soumettre</button></div>
   
  </form>
  </div>
  
  
</body>
</html>