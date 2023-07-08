<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

<!-- Compiled and minified JavaScript -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</head>
<body
	style="background: url(image/shutterstock.jpg); background-size: cover; background-attachment: fixed">
	<div class="container">
		<div class="row">
			<div class="col m6 offset-m3" id="myform">
				<div class="card">
					<div class="card-content">
						<h3 style="margin-top: 10px;" class="center-align">Register
							here</h3>
						<div class="form center-align">
							<form action="register" method="post">
								<input type="text" name="username" placeholder="Enter your name">
								<input type="password" name="userpassword"
									placeholder="Enter your password"> <input type="email"
									name="useremail" placeholder="Enter your email">


								<button type="submit" class="btn #ff5252 red accent-2">Submit</button>
							</form>
						</div>

						<div class="loader center-align"
							style="margin-top: 20px; display: none;">
							<div class="preloader-wrapper active">
								<div class="spinner-layer spinner-red-only">
									<div class="circle-clipper left">
										<div class="circle"></div>
									</div>
									<div class="gap-patch">
										<div class="circle"></div>
									</div>
									<div class="circle-clipper right">
										<div class="circle"></div>
									</div>
								</div>
							</div>
							<h5>Please Wait ...</h5>
						</div>


					</div>
				</div>
			</div>
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.7.0.min.js"
		integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g="
		crossorigin="anonymous"></script>

	<script>
		/*$(document).ready(function (){
			console.log("page is ready")
			
			$("#myform").on('submit',function(event){
				event.preventDefault();
				
				var f = $(this).serialize();
				
				console.log(f);
				
				$.ajax({
					url: "register",
					data: f,
					type: 'POST',
					success: function (data,textStatus,jqXHR){
						console.log(data);
						console.log("success ...")
					},
					error: function (jqXHR, textStatus, errorThrown){
						console.log(data);
						console.log("success ...")
					}
				})
			})
		})*/
	</script>
</body>
</html>