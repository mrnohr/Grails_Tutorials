<html>
<head>
	<meta name="layout" content="main"/>
	<title>What's Been Happening</title>
	<g:javascript libray="scriptacolous" />
</head>
<body>
	<h1>What's Been Happening?</h1>
	<div id="messages">
		<g:render template="statusMessage" collection="${statusMessages}" var="statusMessage" />
	</div>
</body>
</html>