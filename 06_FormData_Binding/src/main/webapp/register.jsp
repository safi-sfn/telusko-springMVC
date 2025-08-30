<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

        <!-- The form submits to /employee/save -->
       <form action="${pageContext.request.contextPath}/employee/save" method="post"> 
     

            <label for="eId">Employee ID</label>
            <input type="number" id="eId" name="eId" value="${employee.eId}" required />

            <label for="eName">Employee Name</label>
            <input type="text" id="eName" name="eName" value="${employee.eName}" required />

            <label for="eCity">City</label>
            <input type="text" id="eCity" name="eCity" value="${employee.eCity}" required />

            <label for="eSalary">Salary</label>
            <input type="number" step="0.01" id="eSalary" name="eSalary" value="${employee.eSalary}" required />

            <button type="submit">Register</button>
        </form>
    </div>
</body>
</html>