<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
<script src="./js/jquery-2.1.4.js"></script>
<script>
	function testJsonToString() {
		var obj;
		var testJson = [ [ {
			"a" : "aa",
			"b" : "bb"
		}, {
			"a" : "cc",
			"b" : "dd"
		} ], [ {
			"a" : "aa",
			"b" : "bb"
		}, {
			"a" : "cc",
			"b" : "dd"
		} ] ];
		$.ajax({
			url : "test/jsonToString",
			type : "POST",
			dataType : "text",
			data : JSON.stringify(testJson),
			contentType : "application/text; charset=utf-8",
			success : function(data) {
				alert(data);
				obj = JSON.parse(data);
				alert(obj);
			},
			error : function() {
				alert("error");
			}
		});
	}
</script>
</head>
<body onload='javascript:location.href="HOME/"'>
	<a href="javascript:testJsonToString()">JSon To String</a>
</body>
</html>