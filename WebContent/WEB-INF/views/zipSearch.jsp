<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script> 
<script>
function zipFind(){
	$.ajax({
		type:"get",
		url:"zipFind.my",
		data:{"dong" :$("#dong").val()},
		success:function(data){
			alert(data);
		}
	})
}
</script>
</head>
<body>
동이름을 입력하세요 <input type="text" name="dong" id="dong" placeholder="동이름 입력"> <input type="button" value="검색" onclick="zipFind()">
</body>
</html>