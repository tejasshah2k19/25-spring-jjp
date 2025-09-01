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
        <h3 class="mb-4 text-center">Sign Up</h3>

        <form id="signupForm" method="post" action="saveuser" novalidate>
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label class="required" for="firstName">First Name</label>
                    <input type="text" class="form-control" id="firstName" name="firstName" required>
                    <div class="invalid-feedback">First name is required.</div>
                </div>
                <div class="form-group col-md-6">
                    <label class="required" for="lastName">Last Name</label>
                    <input type="text" class="form-control" id="lastName" name="lastName" required>
                    <div class="invalid-feedback">Last name is required.</div>
                </div>
            </div>

            <div class="form-group">
                <label class="required" for="email">Email</label>
                <input type="email" class="form-control" id="email" name="email" required>
                <div class="invalid-feedback">Please provide a valid email.</div>
            </div>

            <div class="form-row">
                <div class="form-group col-md-6">
                    <label class="required" for="password">Password</label>
                    <input type="password" class="form-control" id="password" name="password" minlength="6" required>
                    <div class="invalid-feedback">Password must be at least 6 characters.</div>
                </div>
                <div class="form-group col-md-6">
                    <label class="required" for="confirmPassword">Confirm Password</label>
                    <input type="password" class="form-control" id="confirmPassword" name="confirmPassword" minlength="6" required>
                    <div class="invalid-feedback">Passwords must match.</div>
                </div>
            </div>

            <button type="submit" class="btn btn-primary btn-block">Sign Up</button>
        </form>

        <hr>
        <p class="mb-0 text-center">
            Already have an account? <a href="login">Log in</a>
        </p>
    </div>
</div>

<!-- Bootstrap JS + jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.bundle.min.js"></script>

<script>
    (function () {
        var form = document.getElementById('signupForm');
        form.addEventListener('submit', function (e) {
            if (!form.checkValidity()) {
                e.preventDefault();
                e.stopPropagation();
            }

            var p1 = document.getElementById('password');
            var p2 = document.getElementById('confirmPassword');
            if (p1.value !== p2.value) {
                e.preventDefault();
                e.stopPropagation();
                p2.setCustomValidity("Passwords do not match");
            } else {
                p2.setCustomValidity("");
            }

            form.classList.add('was-validated');
        });
    })();
</script>
</body>
</html>
