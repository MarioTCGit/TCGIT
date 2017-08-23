<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
<jsp:include page="/page/common.jsp" flush="true"></jsp:include>
<script>
	function xxx() {

		var objects = new Array(2);
		objects[0] = {
			"caller" : "caller0",
			"imsi" : "imsi0",
			"imei" : "imei0",
			"osid" : "osid0",
		};
		objects[1] = {
			"caller" : "caller1",
			"imsi" : "imsi1",
			"imei" : "imei1",
			"osid" : "osid1",
		};

		//1,获取上面id为cloneTr的tr元素  
		var tr = $("#cloneTr");

		$.each(objects, function(index, item) {
			//克隆tr，每次遍历都可以产生新的tr                              
			var clonedTr = tr.clone();
			var _index = index;

			//循环遍历cloneTr的每一个td元素，并赋值  
			clonedTr.children("td").each(function(inner_index) {

				//根据索引为每一个td赋值  
				switch (inner_index) {
				case (0):
					$(this).html(_index + 1);
					break;
				case (1):
					$(this).html(item.caller);
					break;
				case (2):
					$(this).html(item.imsi);
					break;
				case (3):
					$(this).html(item.imei);
					break;
				case (4):
					$(this).html(item.osid);
					break;

				}//end switch                          
			});//end children.each  

			//把克隆好的tr追加原来的tr后面  
			clonedTr.insertAfter(tr);
		});//end $each 
		$("#cloneTr").hide();//隐藏id=clone的tr，因为该tr中的td没有数据，不隐藏起来会在生成的table第一行显示一个空行  
		// 		$("#generatedTable").show();
	}
	function yyy() {

		var objects = new Array(2);
		objects[0] = {
			"caller" : "caller00",
			"imsi" : "imsi00",
			"imei" : "imei00",
			"osid" : "osid00",
		};
		objects[1] = {
			"caller" : "caller11",
			"imsi" : "imsi11",
			"imei" : "imei11",
			"osid" : "osid11",
		};

		//1,获取上面id为cloneTr的tr元素  
		var tr = $("#cloneTr");

		$.each(objects, function(index, item) {
			//克隆tr，每次遍历都可以产生新的tr                              
			var clonedTr = tr.clone();
			var _index = index;

			//循环遍历cloneTr的每一个td元素，并赋值  
			clonedTr.children("td").each(function(inner_index) {

				//根据索引为每一个td赋值  
				switch (inner_index) {
				case (0):
					$(this).html(_index + 1);
					break;
				case (1):
					$(this).html(item.caller);
					break;
				case (2):
					$(this).html(item.imsi);
					break;
				case (3):
					$(this).html(item.imei);
					break;
				case (4):
					$(this).html(item.osid);
					break;

				}//end switch                          
			});//end children.each  

			//把克隆好的tr追加原来的tr后面  
			clonedTr.insertAfter(tr);
		});//end $each 
		$("#cloneTr").hide();//隐藏id=clone的tr，因为该tr中的td没有数据，不隐藏起来会在生成的table第一行显示一个空行  
		// 		$("#generatedTable").show();
	}
</script>
</head>
<body>
	<table id="generatedTable" style="border: 1px solid #000000;"
		cellspacing=0>
		<thead>
			<tr>
				<th style='width: 10%;'>第一列</th>
				<th style='width: 15%;'>第二列</th>
				<th style='width: 10%;'>第三列</th>
				<th style='width: 10%;'>第四列</th>
				<th style='width: 3%;'>第五列</th>
			</tr>
		</thead>
		<tbody>
			<tr id="cloneTr">
				<td style="border: 1px solid #000000;"></td>
				<td style="border: 1px solid #000000;"></td>
				<td style="border: 1px solid #000000;"></td>
				<td style="border: 1px solid #000000;"></td>
				<td style="border: 1px solid #000000;"></td>
			</tr>
		</tbody>
	</table>
	<input type="button" onclick="xxx()" value="xxx" />
	<input type="button" onclick="yyy()" value="yyy" />
</body>
</html>