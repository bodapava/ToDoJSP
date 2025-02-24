<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head></head>
<body>
<h2>Welcome to the To-Do page using JSP ${username}!!</h2>
<div>
<h3>Below are your todos</h3>
<ol>
<c:forEach items="${todos}" var="todo">
    <li>${todo.name} <a href="/ToDoJSPServlet/delete-todo?todo=${todo.name}" style="margin: 10px">Delete</a>
    </li>
</c:forEach>
</ol>

<h3>${errorMessage}</h3>
<form method="POST" action="/ToDoJSPServlet/todo">
New Todo: <input type="text" name="newtodo" id="newtodo1" /><button type="submit" style="margin: 10px;">Add</button>
</form>
</div>
</body>
</html>
