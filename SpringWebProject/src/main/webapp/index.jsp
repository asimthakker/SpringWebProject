<!DOCTYPE html>
<html>
<head>
<script src="${pageContext.request.contextPath}/js/jquery-1.7.1.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.json-2.3.js"></script>

<meta charset="ISO-8859-1">
<title>Insert title here</title>

   <script type="text/javascript">
  
   $.getJSON('${pageContext.request.contextPath}/contest/abcd', function(data) {
	console.log(data);
		});
   </script>
   
</head>
<body>

</body>
</html>