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
            background: #f4f7f8;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            margin: 0;
        }

        .success-container {
            background: #ffffff;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0px 4px 12px rgba(0, 0, 0, 0.1);
            width: 400px;
            text-align: center;
        }

        h2 {
            color: #4CAF50;
            margin-bottom: 20px;
        }

        p {
            font-size: 15px;
            margin: 8px 0;
            color: #333;
        }

        strong {
            color: #555;
        }

        a {
            display: inline-block;
            margin-top: 20px;
            padding: 12px 20px;
            background: #4CAF50;
            color: white;
            text-decoration: none;
            border-radius: 6px;
            font-size: 14px;
            transition: background 0.3s ease;
        }

        a:hover {
            background: #45a049;
        }
    </style>
</head>
<body>
<div class="success-container">
    <h2>🎉 Employee Registered Successfully!</h2>

    <p><strong>Employee ID:</strong> ${emp.eId}</p>
    <p><strong>Employee Name:</strong> ${emp.eName}</p>
    <p><strong>City:</strong> ${emp.eCity}</p>
    <p><strong>Salary:</strong> ₹${emp.eSalary}</p>

    <br/>
    <!-- Link back to registration form -->
    <a href="${pageContext.request.contextPath}/employee/registration">Register Another Employee</a>
</div>
</body>
</html>