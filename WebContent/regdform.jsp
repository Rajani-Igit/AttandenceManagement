<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Regstration</title>
<style>
@import "font-awesome.min.css";
@import "font-awesome-ie7.min.css";
/* Space out content a bit */
body {
  padding-top: 20px;
  padding-bottom: 20px;
}

/* Everything but the jumbotron gets side spacing for mobile first views */
.header,
.marketing,
.footer {
  padding-right: 15px;
  padding-left: 15px;
}

/* Custom page header */
.header {
  border-bottom: 1px solid #e5e5e5;
}
/* Make the masthead heading the same height as the navigation */
.header h3 {
  padding-bottom: 19px;
  margin-top: 0;
  margin-bottom: 0;
  line-height: 40px;
}

/* Custom page footer */
.footer {
  padding-top: 19px;
  color: #777;
  border-top: 1px solid #e5e5e5;
}

/* Customize container */
@media (min-width: 768px) {
  .container {
    max-width: 730px;
  }
}
.container-narrow > hr {
  margin: 30px 0;
}

/* Main marketing message and sign up button */
.jumbotron {
  text-align: center;
  border-bottom: 1px solid #e5e5e5;
}
.jumbotron .btn {
  padding: 14px 24px;
  font-size: 21px;
}

/* Supporting marketing content */
.marketing {
  margin: 40px 0;
}
.marketing p + h4 {
  margin-top: 28px;
}

/* Responsive: Portrait tablets and up */
@media screen and (min-width: 768px) {
  /* Remove the padding we set earlier */
  .header,
  .marketing,
  .footer {
    padding-right: 0;
    padding-left: 0;
  }
  /* Space out the masthead */
  .header {
    margin-bottom: 30px;
  }
  /* Remove the bottom border on the jumbotron for visual effect */
  .jumbotron {
    border-bottom: 0;
  }
}
</style>
</head>
<body>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<div class="container">
	<div class="col-lg-12 well">
	<div class="row">
				<form action="RegistrationController" method="post">
					<div class="col-sm-12">
						<div class="row">
							<div class="col-sm-6 form-group">
								<label>First Name</label>
								<input name="fname" type="text" placeholder="Enter First Name Here.." class="form-control">
							</div>
							<div class="col-sm-6 form-group">
								<label>Last Name</label>
								<input name="lname" type="text" placeholder="Enter Last Name Here.." class="form-control">
							</div>
						</div>					
						
						<div class="row">
							<div class="col-sm-6 form-group">
								<label>Title</label>
								<input type="text" placeholder="Enter Designation Here.." class="form-control">
							</div>		
							<div class="col-sm-6 form-group">
								<label>EmpId</label>
								<input name="empId" type="text" placeholder="Enter Employee Id Here.." class="form-control">
							</div>	
						</div>	
						<div class="row">					
					<div class="col-sm-6 form-group">
						<label>Phone Number</label>
						<input name="contactNo" type="text" placeholder="Enter Phone Number Here.." class="form-control">
					</div>		
					<div class="col-sm-6 form-group">
						<label>Email Address</label>
						<input  name="email" type="text" placeholder="Enter Email Address Here.." class="form-control">
					</div>	
					</div>
					<div class="row">
							<div class="col-sm-6 form-group">
								<label>City</label>
								<input name="city" type="text" placeholder="Enter City Name Here.." class="form-control">
							</div>	
							<div class="col-sm-6 form-group">
								<label>State</label>
								<input name="state" type="text" placeholder="Enter State Name Here.." class="form-control">
							</div>	
						</div>
						<div class="row">
						<div class="col-sm-6 form-group">
								<label>Zip</label>
								<input name="zip" type="text" placeholder="Enter Zip Code Here.." class="form-control">
							</div>	
								<div class="col-sm-6 form-group">
								<label>Gender</label>
								 <div class="radio">
  <label><input type="radio" name="gender" value="M" >Male</label>
</div>
<div class="radio">
  <label><input type="radio" name="gender" value="F" >Female</label>
</div>
							</div>
							</div>
						<div class="form-group">
							<label>Address</label>
							<textarea placeholder="Enter Address Here.." rows="3" class="form-control"></textarea>
						</div>
					<button type="submit" class="btn btn-sm btn-info" style="margin-left: 573px;">Submit</button>					
					</div>
				</form> 
				</div>
	</div>
	</div>
</body>
</html>