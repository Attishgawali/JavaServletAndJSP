<%@ page language="java" contentType="text/html"
	pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<form action="result.jsp">
					<div class="card">
						<div class="card-header bg-dark text-white">
							<h3>Provide Two Numbers</h3>
						</div>
						<div class="card-body bg-secondary">
							<div class="form-group">
								<input type="number" class="form-control" name="n1" placeholder="Enter n1">
							</div>

							<div class="form-group">
								<input type="number" class="form-control" name="n2" placeholder="Enter n2">
							</div>

						</div>
						<div class="card-footer text-center bg-dark text-white">
							<button type="submit" btn btn-outline-light">Divide</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>