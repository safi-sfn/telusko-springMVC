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
    <h1>Course Information</h1>

    <!-- Accessing the "courses" object -->
    <p><strong>ID:</strong> ${courses.cId}</p>
    <p><strong>Name:</strong> ${courses.cName}</p>
    <p><strong>Cost:</strong> ₹${courses.cCost}</p>

    <!-- Link to course description page -->
    <a href="${pageContext.request.contextPath}/buyCourse/course-desc">
        View Course Description
    </a>
 </div>
</body>
</html>








