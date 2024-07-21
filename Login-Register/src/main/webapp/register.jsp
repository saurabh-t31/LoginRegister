<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css">
<title>Register</title>
</head>
<body>
<div class="container">

<h1 style="text-decoration:underline; font-stretch: extra-expanded; ">Register</h1>

  <form action="RegisterServlet" method="post">
  
       <label for="username">Username: </label>
       <input type="text" id="username" name="username" required><br>
       
       <label for="password">Password: </label>
       <input type="text" id="password" name="password" required><br>
       
       <button type="submit">Register</button>
       
  </form>
  
      <p><a href="index.html"> Back to Home </a>
      
       <% String error = request.getParameter("error");
           if (error != null && error.equals("1")) { %>
            <p style="color: red;">Registration failed. Please try again.</p>
        <% } %>    
        
        
            
        
</div>
</body>
</html>