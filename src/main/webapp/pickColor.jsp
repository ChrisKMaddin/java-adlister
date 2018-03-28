<%--
  Created by IntelliJ IDEA.
  User: christophermaddin
  Date: 3/28/18
  Time: 10:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>
<h1>Pick your favorite Color!!</h1>


<form action="/color" method="POST">
    <select name="color" id="color">
        <option value="#F00">Red</option>
        <option value="#0F0">Green</option>
        <option value="#00F">Blue</option>
    </select>
    <button type="submit">Submit</button>
</form>

</body>
</html>
