<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css">
<title>Login</title>
</head>
<body>
<div class="container">
<h1>Login</h1>

  <form action="LoginServlet" method="post">
       <label for="username">Username: </label>
       <input type="text" id="username" name="username" required><br>
       <label for="password">Password: </label>
       <input type="text" id="password" name="password" required><br>
       <button type="submit">Login</button>
  </form>
      <p><a href="index.html">Back to Home</a>
      <%-- Display Error Message when login failes --%>
      
      <% String error = request.getParameter("error");
       if(error!=null && error.equals("1")){ %>
         <p style="color : red;">Invalid Username or password !!
         <% } %>
         
         
      <% String sc = request.getParameter("registration");
           if (sc!= null && sc.equals("success")) { %>
            <p style="color: green;">Registration Succesfull. Please Login Now!!.</p>
        <% } %>   
      
</div>

</body>
</html>