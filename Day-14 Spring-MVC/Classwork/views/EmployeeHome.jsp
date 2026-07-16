<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="EmployeeStyle.css">
<title>Employee Management System</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>

<body>
    <div class="header">
        <h1>Employee Management System</h1>
    </div>
    <form action="employee" method = "post">
    <div class="content">
        <table>

            <tr>
                <td>Employee ID:</td>
                <td><input type="number" name="eid"></td>
            </tr>

    <tr>
        <td>Employee Name:</td>
        <td><input type="text" name="ename"></td>
    </tr>
    <tr>
        <td>Employee Salary:</td>
        <td><input type="number" name="esalary"></td>
    </tr>
    <tr>
        <td>Department Number:</td>
        <td><input type="number" name="dno"></td>
    </tr>


        </table>
        <br>
        <input type="submit"  name="Insert" value="Insert" class="btn btn-primary"></input>
        <input type="submit" name="Delete" value="Delete" class="btn btn-danger"></input>
        <input type="submit" name="Update" value="Update" class="btn btn-warning"></input>
        <input type="submit" name="Find"  value="Find" class="btn btn-secondary"></input>
        <input type="submit" name="FindAll" value="FindAll" class="btn btn-dark"></input>
        <br>

    </div>
    </form>
    
    <br/>
    <div>
    
    <b>${result}</b>
    </div>
</body>
</html>
