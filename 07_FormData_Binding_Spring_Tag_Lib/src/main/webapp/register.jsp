<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <title>Employee Registration</title>
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

        .form-container {
            background: #ffffff;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0px 4px 12px rgba(0, 0, 0, 0.1);
            width: 400px;
        }

        h2 {
            text-align: center;
            color: #333;
            margin-bottom: 20px;
        }

        label {
            display: block;
            margin-bottom: 6px;
            font-weight: bold;
            color: #555;
        }

        input[type="text"],
        input[type="number"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 6px;
            font-size: 14px;
        }

        input[type="text"]:focus,
        input[type="number"]:focus {
            border-color: #4CAF50;
            outline: none;
        }

        button {
            width: 100%;
            padding: 12px;
            background: #4CAF50;
            border: none;
            border-radius: 6px;
            color: white;
            font-size: 16px;
            cursor: pointer;
            transition: background 0.3s ease;
        }

        button:hover {
            background: #45a049;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>Employee Registration</h2>
<!-- if get and post mapping path url is same then we dont need to add
		action="${pageContext.request.contextPath}/employee/save" in form tag
 -->
            <form:form method="post"  modelAttribute="emp">

            <label for="eId">Employee ID</label>
             <form:input path="eId" id="eId" type="number" required="true" />

            <label for="eName">Employee Name</label>
            <form:input path="eName" id="eName" type="text" required="true" />

            <label for="eCity">City</label>
             <form:input path="eCity" id="eCity" type="text" required="true" />

            <label for="eSalary">Salary</label>
              <form:input path="eSalary" id="eSalary" type="number" step="0.01" required="true" />

            <button type="submit">Register</button>
        </form:form>
    </div>
</body>
</html>