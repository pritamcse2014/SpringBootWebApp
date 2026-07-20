<%@page language="java" %>
<!DOCTYPE html>
<html>
    <head>
        <title>My Web Page</title>
        <link rel="stylesheet" type="text/css" href="../style.css" />
    </head>
    <body>
        <h2 class="title">Calculator</h2>
        <form action="/add" method="POST">
          <label for="id">Enter ID : </label><br>
          <input type="number" id="id" name="id" placeholder="Enter ID"><br> <br>
          <label for="name">Enter Name : </label><br>
          <input type="text" id="name" name="name" placeholder="Enter Name"><br> <br>
          <input type="submit" value="Submit">
        </form>
        <script src=""></script>
    </body>
</html>