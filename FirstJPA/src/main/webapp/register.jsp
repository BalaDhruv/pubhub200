<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Register</title>

</head>
<body>

	<%@ include file="../../layout/header.jsp"%>
	<% out.println(session.getAttribute("status"));%>
	<div class="container-fluid">

		<div class="row">
			<div class="col-md-4">

				<div class="portlet-title">
					<div class="page-header">
						<h3>Register</h3>
					</div>
				</div>
				<div class="portlet-body">
					<form action="/auth/checkregister" method="POST">
					<div class="form-group">
							<label for="userName">Username :</label> <input type="text"
								class="form-control" name="username" placeholder="Enter Username"
								autofocus="autofocus" required="required" id="email"
								 />
						</div>
						<div class="form-group">
							<label for="email">EmailId :</label> <input type="email"
								class="form-control" name="email" placeholder="Enter emailId"
								autofocus="autofocus" required="required" id="email"
								/>
						</div>

						<div class="form-group">
							<label for="password">Password :</label> <input type="password"
								class="form-control" name="password"
								placeholder="Enter Password" required="required" id="password"
								 />
						</div>
						<div class="form-group">
							<button type="submit" name="add" class="btn btn-success"
								id="addLoginBtn">Register</button>

							<a href="auth/register" class='btn btn-primary'>SignIN</a>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

</body>

</html>