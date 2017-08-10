<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<title>Login Page</title>
<link href="${pageContext.request.contextPath}/static/css/bootstrap.css" rel="stylesheet" type="text/css" />
</head>
<body onload='document.f.j_username.focus();'>

	<div class="col-md-6 col-md-offset-3">
		<sf:form class="form-horizontal" commandName="user"
			action="${pageContext.request.contextPath}/login" method="post">
			<fieldset>

				<!-- Form Name -->
				<legend>Login</legend>

				<!-- Text input-->
				<div class="control-group">
					<label class="control-label" for="j_username">Username</label>
					<div class="controls">
						<sf:input path="username" id="j_username" name="username"
							placeholder="" class="input-xlarge" type="text" />

					</div>
				</div>

				<!-- Password input-->
				<div class="control-group">
					<label class="control-label" for="j_password">Password</label>
					<div class="controls">
						<sf:input path="password" id="j_password" name="password"
							placeholder="" class="input-xlarge" type="password" />

					</div>
				</div>
				<div class="alert-danger">
					<c:if test="${params.error !=null}">
				 	 Invalid Username or Password
				 	</c:if>
				</div>
				<div class="control-group">
					<label class="control-label" for="j_password">Remember Me &nbsp;</label>
					
						<input type='checkbox' name='remember-me'/>

					
				</div>
				<!-- Button -->
				<div class="control-group">
					<label class="control-label" for="submit"></label>
					<div class="controls">
						<button id="submit" name="submit" class="btn btn-primary">Submit</button>
					</div>
				</div>

			</fieldset>
		</sf:form>
		<a href="<c:url value='/create-account'/>">Create new Account</a>
	</div>

</body>
</html>
