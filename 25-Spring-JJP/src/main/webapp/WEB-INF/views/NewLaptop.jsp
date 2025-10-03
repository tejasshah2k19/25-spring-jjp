<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>New Laptop</title>
<!-- Bootstrap 5 CDN -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<style>
.card {
	max-width: 720px;
	margin: 32px auto;
}
</style>
</head>
<body>

	<div class="card shadow-sm">
		<div class="card-body">
			<h3 class="card-title mb-4">Add New Laptop</h3>

			<!-- Example: if using Spring MVC, provide model attribute 'laptop' or fall back to request params -->
			<form action="savelaptop" method="post"
				class="row g-3 needs-validation" novalidate>

				<div class="col-12">
					<label for="modelName" class="form-label">Model Name</label> <input
						type="text" class="form-control" id="modelName" name="modelName"
						placeholder="e.g. Dell Inspiron 15" required>
					<div class="invalid-feedback">Please provide a model name.</div>
					<div class="invalid-feedback">${result.getFieldError("modelName").getDefaultMessage() }</div>

				</div>

				<div class="col-md-6">
					<label for="ram" class="form-label">RAM (GB)</label> <input
						type="number" class="form-control" id="ram" name="ram" min="1"
						step="1" required placeholder="8">
					<div class="invalid-feedback">Enter RAM in GB (numeric).</div>
					<div class="invalid-feedback">${result.getFieldError("ram").getDefaultMessage() }</div>

				</div>

				<div class="col-md-6">
					<label for="ssd" class="form-label">SSD (GB)</label> <input
						type="number" class="form-control" id="ssd" name="ssd" min="0"
						step="1" required placeholder="256">
					<div class="invalid-feedback">Enter SSD capacity in GB
						(numeric).</div>
					<div class="invalid-feedback">${result.getFieldError("ssd").getDefaultMessage() }</div>

				</div>

				<div class="col-12">
					<label for="price" class="form-label">Price (INR)</label>
					<div class="input-group">
						<span class="input-group-text">₹</span> <input type="number"
							class="form-control" id="price" name="price" min="0" step="0.01"
							required placeholder="49999">
					</div>
					<div class="invalid-feedback">Please enter a valid price.</div>
					<div class="invalid-feedback">${result.getFieldError("price").getDefaultMessage() }</div>

				</div>

				<div class="col-12 d-flex justify-content-end">
					<a href="/laptops" class="btn btn-outline-secondary me-2">Cancel</a>
					<button type="submit" class="btn btn-primary">Save Laptop</button>
				</div>
			</form>
		</div>
	</div>

	<script>
		// Bootstrap custom validation (see https://getbootstrap.com/docs/5.3/forms/validation/)
		(function() {
			'use strict'
			var forms = document.querySelectorAll('.needs-validation')
			Array.prototype.slice.call(forms).forEach(function(form) {
				form.addEventListener('submit', function(event) {
					if (!form.checkValidity()) {
						event.preventDefault()
						event.stopPropagation()
					}
					form.classList.add('was-validated')
				}, false)
			})
		})()
	</script>

</body>
</html>
