<%@ page import="racetrack.User"%>
<!doctype html>
<html>
<head>
<meta name="layout" content="main">
<g:set var="entityName"
	value="${message(code: 'user.label', default: 'User')}" />
<title>Login</title>
</head>
<body>
	<h1>Login</h1>
	<g:if test="${flash.message}">
		<div class="message">
			${flash.message}
		</div>
	</g:if>
	<g:form action="authenticate" method="post">
		<div class="dialog">
			<table>
				<tbody>
					<tr class="prop">
						<td valign="top" class="name"><label for="login">Login:</label>
						</td>
						<td valign="top"><input type="text" id="login" name="login" />
						</td>
					</tr>
					<tr class="prop">
						<td valign="top" class="name"><label for="password">Password:</label>
						</td>
						<td valign="top"><input type="password" id="password"
							name="password" /></td>
					</tr>
				</tbody>
			</table>
		</div>
		<div class="buttons">
			<span class="button"> <input type="submit" value="Login" />
			</span>
		</div>
	</g:form>
	</div>
</body>
</html>
