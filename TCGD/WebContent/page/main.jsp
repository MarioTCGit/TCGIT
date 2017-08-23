<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
<jsp:include page="/page/common.jsp" flush="true"></jsp:include>
</head>
<body>
	<div>
		<form action="test/jump">
			<input type="text" name="id" /> <br /> <input type="password"
				name="pwd" /> <br />
			<button type="submit">login</button>
		</form>
	</div>
</body>
</html>