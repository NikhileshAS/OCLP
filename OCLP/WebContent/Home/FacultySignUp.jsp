<!DOCTYPE html>
<html lang="en">
  <head>
  <style>
  [type="date"] {
  background: url(https://cdn1.iconfinder.com/data/icons/cc_mono_icon_set/blacks/16x16/calendar_2.png)  97% 50% no-repeat ;
}
[type="date"]::-webkit-inner-spin-button 
{
  display: none;
}
[type="date"]::-webkit-calendar-picker-indicator
 {
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
</script>
</head>
<body>
<h2 align="center" style="color:white">FACULTY  REGISTRATION  FORM</h2>
<div class="w3ls-main">
<div class="w3ls-form">
<form action="FacultySignUpServlet" method="get" name ="FacultyRegisteration">
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
		<label class="w3ls-opt">Gender<span class="w3ls-star"> * </span></label>	
			<span class="w3ls-text w3ls-name">
				<select name="gender">
				<option>Select Gender</option>
				<option value="male">Male</option>
				<option value="female">Female</option>
				
							
				</select>
			</span>
	</li>
	<li>
		<label class="w3ls-opt">Department<span class="w3ls-star"> * </span></label>	
			<span class="w3ls-text w3ls-name">
		     <select name="dept">
		     <option value="none">Select your department</option>
		     <option value="CSE">CSE</option>
		     <option value="IT">IT</option>
		     <option value="ECE">ECE</option>
		     <option value="AUTO">AUTO</option>
		     <option value="MECH">MECH</option>
		     <option value="ETE">ETE</option>
		     <option value="EIE">EIE</option>
		     <option value="EEE">EEE</option>
		     <option value="MCA">MCA</option>
		     <option value="MBA">MBA</option>
		     </select>
			</span>
	</li>
	<li>
		<label class="w3ls-opt">Select courses<span class="w3ls-star"> * </span></label>
		     <table>
		     <tr>
		     <td><input type="checkbox" name="course" value="Java ">Java</td>
		     <td><input type="checkbox" name="course" value="C ">C</td>
		     </tr>
		     <tr>
		     <td><input type="checkbox" name="course" value="C++ ">C++</td>
		     <td><input type="checkbox" name="course" value="Aptitude ">General Aptitude</td>
		     </tr>
		     <tr>
		     <td><input type="checkbox" name="course" value="DataStructures ">Data Structures</td>
		     <td><input type="checkbox" name="course" value="ComputerNetworks ">Computer Networks</td>
		     </tr>
		     <tr>
		     <td><input type="checkbox" name="course" value="DBMS ">DBMS</td>
		     <td><input type="checkbox" name="course" value="OS ">OS</td>
		     </tr>
		     </table>
			
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
				<input type="text" name="stAddress" placeholder="street address" required/>
			</span>
			<span class="text">
				<input type="text" name="st2Address" placeholder="street line2" required/>
			</span>
			<span class="text">
				<input type="text" name="city" placeholder="city" required/>
				
			</span>
			<span class="w3ls-text w3ls-name">
				<select name="state">
				<option value="none">Select State *</option>
				<option value="Andhra Pradesh">Andhra Pradesh</option>
<option value="Arunachal Pradesh">Arunachal Pradesh</option>
<option value="Assam">Assam</option>		
<option value="Bihar">Bihar</option>
<option value="Chhattisgarh">Chhattisgarh</option>
<option value="Goa">Goa</option>
<option value="Gujarat">Gujarat</option>
<option value="Haryana">Haryana</option>
<option value="Himachal Pradesh">Himachal Pradesh</option>
<option value="Jammu and Kashmir">Jammu and Kashmir</option>
<option value="Jharkhand">Jharkhand</option>
<option value="Karnataka">Karnataka</option>
<option value="Kerala">Kerala</option>
<option value=">Madhya Pradesh">Madhya Pradesh</option>
<option value="Maharashtra">Maharashtra</option>
<option value="Manipur">Manipur</option>
<option value="Meghalaya">Meghalaya</option>
<option value="Mizoram">Mizoram</option>
<option value="Nagaland">Nagaland</option>
<option value="Odisha">Odisha</option>
<option value="Punjab">Punjab</option>
<option value="Punjab">Punjab</option>
<option value="Sikkim">Sikkim</option>
<option value="Tamil Nadu">Tamil Nadu</option>
<option value="Telangana">Telangana</option>
<option value="Tripura">Tripura</option>
<option value="Uttarakhand">Uttarakhand</option>
<option value="Uttar Pradesh">Uttar Pradesh</option>
<option value="West Bengal">West Bengal</option>
<option value="Andaman and Nicobar Islands">Andaman and Nicobar Islands</option>
<option value="Chandigarh">Chandigarh</option>
<option value="Dadra and Nagar Haveli">Dadra and Nagar Haveli</option>
<option value="Daman and Diu">Daman and Diu</option>
<option value="Delhi">Delhi</option>
<option value="Lakshadweep">Lakshadweep</option>
<option value="Puducherry">Puducherry</option>
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
		<input type="submit" value="submit" />
	</div>
</form>
</div>
</div>

</body>
</html>
      
