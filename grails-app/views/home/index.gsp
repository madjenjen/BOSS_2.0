<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="semantic"/>
		<title>TheConnMan</title>
	</head>
	<body>
		<div class="ui segment">
			<sec:ifLoggedIn>
				<sec:username />
			</sec:ifLoggedIn>
			<h1>Welcome to TheConnMan's Grails Base</h1>
		</div>
	</body>
</html>
