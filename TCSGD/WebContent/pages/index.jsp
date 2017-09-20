<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>INDEX</title>
<script type="text/javascript">
	
</script>
<jsp:include page="/pages/common.jsp" flush="true"></jsp:include>
<body>
	<s:a href="test">test</s:a>
	<br />
	<form name="itemForm" target="_self" id="itemForm" method="post"
		action="uploading" enctype="multipart/form-data">
		<input name="file" type="file" size="40" maxlength="40">
		<button type="submit">上传</button>
	</form>
</body>
</html>