<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<link href="${pageContext.request.contextPath}/static/css/bootstrap.css" rel="stylesheet" type="text/css" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Create notice..........</title>
<link
	href="${pageContext.request.contextPath}/static/lib/bootstrap/css/bootstrap.css"
	rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="container">
		<sf:form method="post" commandName="user"
			action="${pageContext.request.contextPath}/created-account">

			<fieldset>

				<!-- Form Name -->
				<legend>Create User</legend>

				<!-- Text input-->
				<div class="control-group">
					<label class="control-label" for="name">Username</label>
					<div class="controls">
						<sf:input id="username" path="username" name="username"
							placeholder="enter name" class="input-xlarge" type="text" />
						<sf:errors path="username" cssClass="alert-danger"></sf:errors>
					</div>

				</div>

				

				<!-- Password input-->
				<div class="control-group">
					<label class="control-label" for="password">Password</label>
					<div class="controls">
						<sf:input id="password" path="password" name="password"
							class="input-xlarge" type="text" />
						<sf:errors path="password" cssClass="alert-danger"></sf:errors>

					</div>
				</div>

				

				<!-- Button -->
				<div class="control-group">
					<label class="control-label" for="submit"></label>
					<div class="controls">
						<button id="submit" name="submit" class="btn btn-primary">Create
							User</button>
					</div>
				</div>

			</fieldset>


		</sf:form>
	</div>
</body>
<script>
		var password1 = document.getElementById('password');
		var password2 = document.getElementById('confirmedpassword');

		var checkPasswordValidity = function() {
			if (password1.value != password2.value) {
				password1.setCustomValidity('Passwords must match.');
			} else {
				password1.setCustomValidity('');
			}
		};

		password1.addEventListener('change', checkPasswordValidity, false);
		password2.addEventListener('change', checkPasswordValidity, false);

		var form = document.getElementById('user');
		form.addEventListener('submit', function() {
			checkPasswordValidity();
			if (!this.checkValidity()) {
				event.preventDefault();
				//Implement you own means of displaying error messages to the user here.
				password1.focus();
			}
		}, false);
	</script>
</html>