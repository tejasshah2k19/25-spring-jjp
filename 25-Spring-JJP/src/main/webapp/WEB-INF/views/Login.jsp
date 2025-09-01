<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap 4.5 CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

    <style>
        body { background: #f8f9fa; }
        .card { max-width: 400px; margin: 80px auto; }
        .required::after { content: " *"; color: red; }
    </style>
</head>
<body>
<div class="card shadow-sm">
    <div class="card-body">
        <h3 class="mb-4 text-center">Login</h3>

        <form id="loginForm" method="post" action="login" novalidate>
            <div class="form-group">
                <label class="required" for="email">Email</label>
                <input type="email" class="form-control" id="email" name="email" required>
                <div class="invalid-feedback">Please enter a valid email.</div>
            </div>

            <div class="form-group">
                <label class="required" for="password">Password</label>
                <input type="password" class="form-control" id="password" name="password" minlength="6" required>
                <div class="invalid-feedback">Password is required.</div>
            </div>

            <button type="submit" class="btn btn-primary btn-block">Login</button>
        </form>

        <hr>
        <p class="mb-0 text-center">
            Don’t have an account? <a href="signup">Sign Up</a>
        </p>
    </div>
</div>

<!-- Bootstrap JS + jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.bundle.min.js"></script>

<script>
    (function () {
        var form = document.getElementById('loginForm');
        form.addEventListener('submit', function (e) {
            if (!form.checkValidity()) {
                e.preventDefault();
                e.stopPropagation();
            }
            form.classList.add('was-validated');
        });
    })();
</script>
</body>
</html>
