<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Faculty Registration Form</title>
     <link rel="icon" href="img/kce.png" type="image/png"></link>
         <meta name="description" content="Free Bootstrap Theme by ProBootstrap.com">
    <meta name="keywords" content="free website templates, free bootstrap themes, free template, free bootstrap, free website template">
    
    <link href="https://fonts.googleapis.com/css?family=Raleway:300,400,500,700|Open+Sans" rel="stylesheet">
    <link rel="stylesheet" href="css/styles-merged.css">
    <link rel="stylesheet" href="css/style.min.css">
    <link rel="stylesheet" href="css/custom.css">
  </head>
  <body>
  
    <div class="probootstrap-page-wrapper">
      <!-- Fixed navbar -->
      
      <nav class="navbar navbar-default probootstrap-navbar">
        <div class="container">
          <div class="navbar-header">
            <div class="btn-more js-btn-more visible-xs">
              <a href="#"><i class="icon-dots-three-vertical "></i></a>
            </div>
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse" aria-expanded="false" aria-controls="navbar">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <h3 style="font-family: sans-serif;;font-weight:bold;color:navy;">KCE | Online Course Portal</h3>
          </div>

          <div id="navbar-collapse" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
              <li style="font-weight: bold;width=5;height=5"><a href="index.jsp" >Home</a></li>
              <li style="font-weight: bold;"><a href="courses.jsp">Courses</a></li>
              <li style="font-weight: bold;"><a href="teachers.jsp">Teachers</a></li>
              <li style="font-weight: bold;"><a href="events.jsp">Events</a></li>
             <li style="font-weight: bold;"><a href="Login.jsp">SignIn</a></li>
              <li style="font-weight: bold;"class="dropdown">
                <a href="#" data-toggle="dropdown" class="dropdown-toggle" >SignUp</a>
                <ul class="dropdown-menu" style="background-color:gray;">
                  <li><a href="StudentSignUp.jsp" >Student</a></li>
                  <li><a href="FacultySignUp.jsp" >Faculty</a></li>
                </ul>
              </li>  
              <li style="font-weight: bold;"><a href="contact.jsp">Contact</a></li>
            </ul>
          </div>
        </div>
      </nav>
       <script src="js/scripts.min.js"></script>
    <script src="js/main.min.js"></script>
    <script src="js/custom.js"></script>
      </div>
      </body>
      </html>
      
      

<html>
<head>
<title>Student registration form</title>
<!-- metatags-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="effective application form a Flat Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Meta tag Keywords -->
<link href="../Signup/css/style.css" rel="stylesheet" type="text/css" media="all"/><!--style_sheet-->
<link href="//fonts.googleapis.com/css?family=Quicksand" rel="stylesheet"><!--online_fonts-->
<link href="//fonts.googleapis.com/css?family=Lato" rel="stylesheet"><!--online_fonts-->
<link href="//fonts.googleapis.com/css?family=Raleway" rel="stylesheet"><!--online_fonts-->
</head>
<body>
<h2 align="center" style="color:white">FACULTY  REGISTRATION  FORM</h2>
<div class="w3ls-main">
<div class="w3ls-form">
<form action="FacultySignUpServlet" method="get" name = "FacultyRegisteration">
<ul class="fields">
	<li>	
		<label class="w3ls-opt">Faculty name<span class="w3ls-star"> * </span></label>
		<div class="w3ls-name">	
			<input type="text" name="username"  placeholder="first name" required="required"/>
		</div>
	</li>
	<li>
		<label class="w3ls-opt">FacultyId<span class="w3ls-star"> * </span></label>
		<div class="w3ls-name">
			<input type="text" name="facultyId" placeholder="FacultyId" required="required"/>
		</div>
	</li>
	<li>
		<label class="w3ls-opt">Department<span class="w3ls-star"> * </span></label>	
			<span class="w3ls-text w3ls-name">
				<input type="text" name="dept" placeholder="department" required="required"/>
			</span>
	</li>
	<li>
		<label class="w3ls-opt">DateOfBirth<span class="w3ls-star"> * </span></label>	
			<span class="w3ls-text w3ls-name">
				<input type="text" name="dob" placeholder="dateofbirth" required="required"/>
			</span>
	</li>
	<li>
		<label class="w3ls-opt">current address <span class="w3ls-star"> * </span> </label>
		<div class="adderss">
			<span class="text">
				<input type="text" name="stAddress" placeholder="street address" required=" "/>
			</span>
			<span class="text">
				<input type="text" name="st2Address" placeholder="street line2" required=" "/>
			</span>
			<span class="text">
				<input type="text" name="city" placeholder="city" required=""/>
				
			</span>
			<span class="text">
				<input type="text" name="state" placeholder="state/province"  required=""/>
				
			</span>
			<span class="text">
				<input type="text" name="zipcode" placeholder="postal/zipcode" required=""/>
			</span>
			<span class="text">
				<input type="text" name="country" placeholder="country" required=""/>
			</span>
		</div>
	</li>
	<li>
		<label class="w3ls-opt">phone number<span class="w3ls-star"> * </span></label>	
			<span class="w3ls-text w3ls-name">
				<input type="text" name="phone number" placeholder="phone number" required=""/>
			</span>
	</li>
	<li>
		<div class="mail">
			<label class="w3ls-opt">e-mail<span class="w3ls-star"> * </span></label>
			<span class="w3ls-text w3ls-name">
				<input type="email" name="email" placeholder="enter your e-mail" required=""/>
			</span>
		</div>
	</li>
	<li>
		<label class="w3ls-opt">Experience<span class="w3ls-star"> * </span></label>	
			<span class="w3ls-text w3ls-name">
				<input type="text" name="exp" placeholder="Experience in years" required=""/>
			</span>
	</li>
</ul>
<div class="clear"></div>
	<div class="w3ls-btn">
		<input type="submit" value="submit" onclick=""/>
	</div>
</form>
</div>
</div>

</body>
</html>
      
