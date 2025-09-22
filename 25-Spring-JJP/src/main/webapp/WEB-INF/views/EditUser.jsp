<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sign Up</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap 4.5 CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

    <style>
        body { background: #f8f9fa; }
        .card { max-width: 500px; margin: 60px auto; }
        .required::after { content: " *"; color: red; }
    </style>
</head>
<body>
<div class="card shadow-sm">
    <div class="card-body">
        <h3 class="mb-4 text-center">Edit User</h3>

        <form id="signupForm" method="post" action="updateuser" novalidate>
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label class="required" for="firstName">First Name</label>
                    <input type="text" class="form-control" value="${user.firstName}" id="firstName" name="firstName" required>
                    <div class="text-danger">${result.getFieldError("firstName").getDefaultMessage()}</div>
                </div>
                <div class="form-group col-md-6">
                    <label class="required" for="lastName">Last Name</label>
                    <input type="text" class="form-control" value="${user.lastName}" id="lastName" name="lastName" required>
                    <div class="text-danger">${result.getFieldError("lastName").getDefaultMessage()}</div>
                </div>
                
                <input type="hidden" name="userId" value="${user.userId}"/>
            </div>

            <button type="submit" class="btn btn-primary btn-block">Update</button>
        </form>

        <hr>
        <p class="mb-0 text-center">
            <a href="listuser">Back?</a>
        </p>
    </div>
</div>

<!-- Bootstrap JS + jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.bundle.min.js"></script>
 </body>
</html>
