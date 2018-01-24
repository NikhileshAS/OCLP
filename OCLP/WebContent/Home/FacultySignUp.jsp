<!DOCTYPE html>
<html lang="en">
  <head>
  <style>
  [type="date"] {
  background: url(https://cdn1.iconfinder.com/data/icons/cc_mono_icon_set/blacks/16x16/calendar_2.png)  97% 50% no-repeat ;
}
[type="date"]::-webkit-inner-spin-button {
  display: none;
}
[type="date"]::-webkit-calendar-picker-indicator {
  opacity: 0;
}


/* custom styles */
body {
  padding: 4em;
  background: #e5e5e5;
  font: 13px/1.4 Geneva, 'Lucida Sans', 'Lucida Grande', 'Lucida Sans Unicode', Verdana, sans-serif;
}

input {
  border: 1.5px solid white;
  border-radius: 5px;
  background-color: white;
  padding: 3px 5px;
  box-shadow: inset 0 3px 6px rgba(0,0,0,0.1);
  width: 350px;
  height: 50px;
}
  </style>
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
<title>Faculty registration form</title>
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
<script>
function fun()
{
	var phnno=document.FacultyRegisteration.phonenumber.value;
	if(phnno.length!=10)
		{
		window.alert("Enter valid Number");
		}
	}
</script>
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
		     <select>
		     <option>Select your department</option>
		     <option>CSE</option>
		     <option>IT</option>
		     <option>ECE</option>
		     <option>AUTO</option>
		     <option>MECH</option>
		     <option>ETE</option>
		     <option>EIE</option>
		     <option>EEE</option>
		     </select>
			</span>
	</li>
	<li>
		<label class="w3ls-opt">Subject<span class="w3ls-star"> * </span></label>	
			<span class="w3ls-text w3ls-name">
				 <select>
		     <option>Select your subject</option>
		     <option>Java</option>
		     <option>C</option>
		     <option>C++</option>
		     <option>Aptitude</option>
		     <option>Data Structure</option>
		     <option>Computer Network</option>
		     <option>Dbms</option>
		     <option>Os</option>
		     </select>
			</span>
	</li>
	<li>
	<input type="date" name="dateofbirth" id="dateofbirth">
		<label class="w3ls-opt">DateOfBirth<span class="w3ls-star"> * </span></label>	
			 <span class="w3ls-text w3ls-name"> 
				
				</input>				
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
			<span class="w3ls-text w3ls-name">
				<select>
				<option>select state</option>
				<option>Andhra Pradesh</option>
<option>Arunachal Pradesh</option>
<option>Assam</option>		
<option>Bihar</option>
<option>Chhattisgarh</option>
<option>Goa</option>
<option>Gujarat</option>
<option>Haryana</option>
<option>Himachal Pradesh</option>
<option>Jammu and Kashmir</option>
<option>Jharkhand</option>
<option>Karnataka</option>
<option>Kerala</option>
<option>Madhya Pradesh</option>
<option>Maharashtra</option>
<option>Manipur</option>
<option>Meghalaya</option>
<option>Mizoram</option>
<option>Nagaland</option>
<option>Odisha</option>
<option>Punjab</option>
<option>Rajasthan</option>
<option>Sikkim</option>
<option>Tamil Nadu</option>
<option>Telangana</option>
<option>Tripura</option>
<option>Uttarakhand</option>
<option>Uttar Pradesh</option>
<option>West Bengal</option>
<option>Andaman and Nicobar Islands</option>
<option>Chandigarh</option>
<option>Dadra and Nagar Haveli</option>
<option>Daman and Diu</option>
<option>Delhi</option>
<option>Lakshadweep</option>
<option>Puducherry</option>
				</select>
				
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
				<input type="text" name="phonenumber"  maxlength="10"  pattern="[0-9]{10}"placeholder="phone number" required=""/>
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
		<input type="submit" value="submit" onclick="fun();"/>
	</div>
</form>
</div>
</div>

</body>
</html>
      
