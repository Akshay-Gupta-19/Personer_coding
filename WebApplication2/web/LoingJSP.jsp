<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Login Page</h1>
        <form action="LoginServlet">
            Enter uname <input type="text" name="uname"> <br>
            Enter password <input type="text" name="pwd"> <br>
            <input type="submit" value="Login">
            
            <br>
            ${param.ERRORMSG}
        </form>
    </body>
</html>
