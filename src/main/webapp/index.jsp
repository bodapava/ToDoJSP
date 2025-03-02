<html>
<head>
<!-- Bootstrap core CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div class="container mt-2">
<h4 class="text-danger">${error}</h4>
</div>
<form method="POST" action="/ToDoJSPServlet/login.do" style="margin: 30px;">

  <div class="mb-3 row">
    <label for="staticEmail" class="col-sm-2 col-form-label">UserName</label>
    <div class="col-sm-10">
      <input type="text"  class="form-control" name="username" id="username" placeholder="priya/123">
    </div>
  </div>
  <div class="mb-3 row">
    <label for="inputPassword" class="col-sm-2 col-form-label">Password</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" name="password" id="pwd">
    </div>
  </div>
<button type="submit" class="btn btn-primary">Login</button>
</form>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>
