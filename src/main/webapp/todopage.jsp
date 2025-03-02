<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<!-- Bootstrap core CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Welcome ${username}!</a>
        </li>
        <li class="nav-item">
         <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">ToDos</a>
        </li>
        </ul>
         <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
           <li class="nav-item">
             <a class="nav-link" href="/ToDoJSPServlet/logout.do">Logout</a>
           </li>
         </ul>
    </div>
  </div>
</nav>
<div class="container">
<ol class="list-group list-group-numbered mt-2">
<c:forEach items="${todos}" var="todo">
    <li class="list-group-item">${todo.name}
    <a href="/ToDoJSPServlet/delete-todo.do?todo=${todo.name}" style="margin: 10px">Delete</a>
    </li>
</c:forEach>
</ol>
<h3 class="bs-danger">${errorMessage}</h3>
<form method="POST" action="/ToDoJSPServlet/todo.do">
<div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">New Todo:</label>
    <input type="text" name="newtodo" id="newtodo1" class="form-control" aria-describedby="emailHelp"/>
  </div>
<button type="submit" class="btn btn-primary">Add</button>
</form>
</div>
</div>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>
