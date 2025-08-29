<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
        body {
            font-family: Arial, sans-serif;
            background: #DED6CE;
            text-align: center;
            padding: 100px;
        }
        .card {
            background: white;
            border-radius: 12px;
            padding: 20px 30px;
            box-shadow: 0 4px 10px rgba(0,0,0,0.1);
            display: inline-block;
        }
        h1 {
            color: #333;
        }
    </style>
</head>
<body>
<div class="card">
       <h1>
	<marquee>
	  ${info}
	</marquee>
</h1>
    </div>

</body>
</html>