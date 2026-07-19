<%@page language="java" %>
<!DOCTYPE html>
<html>
    <head>
        <title>My Web Page</title>
        <link rel="stylesheet" type="text/css" href="style.css" />
    </head>
    <body>
        <h2 class="title">Calculator</h2>
        <form action="/add" method="POST">
          <label for="num1">Enter First Number : </label><br>
          <input type="number" id="num1" name="num1" value="Enter First Number"><br> <br>
          <label for="num2">Enter Second Number : </label><br>
          <input type="number" id="num2" name="num2" value="Enter Second Number"><br><br>
          <input type="submit" value="Submit">
        </form>
        <script src=""></script>
    </body>
</html>