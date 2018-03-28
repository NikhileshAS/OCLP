<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- 
    More Templates Visit ==> ProBootstrap.com
    Free Template by ProBootstrap.com under the License Creative Commons 3.0 ==> (probootstrap.com/license)

    IMPORTANT: You can do whatever you want with this template but you need to keep the footer link back to ProBootstrap.com
    -->
    <title>Assessment</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Free HTML5 Website Template by ProBootstrap.com" />
    <meta name="keywords" content="free bootstrap 4, free bootstrap 4 template, free website templates, free html5, free template, free website template, html5, css3, mobile first, responsive" />
    <meta name="author" content="ProBootstrap.com" />
    
    <!-- <link href="https://fonts.googleapis.com/css?family=Work+Sans" rel="stylesheet"> -->

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/open-iconic-bootstrap.min.css">
    
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">

    <link rel="stylesheet" href="css/icomoon.css">
    <link rel="stylesheet" href="css/animate.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

  </head>
  <body>
<<<<<<< Upstream, based on branch 'master' of https://github.com/NikhileshAS/OCLP.git
  
=======
     <% if(request.getSession().getAttribute("session") != null){
	   %>
	   <form action = "LogoutServlet"name = "logoutButton" method="post">
		<input type = "submit" style="float: right;"  class="btn btn-primary" value = "Log out" onclick="">
		</form>
		<%}%>
		
>>>>>>> 868137b All To Rebase
    <div class="w3-container w3-center w3-animate-bottom">
    <p></p>
  <h1 align=center>ASSESSMENT!!!!!</h1>
 </div>
   <aside class="probootstrap-aside js-probootstrap-aside">
      <a href="#" class="probootstrap-close-menu js-probootstrap-close-menu d-md-none"><span class="oi oi-arrow-left"></span> Close</a>
      <div class="probootstrap-site-logo probootstrap-animate" data-animate-effect="fadeInLeft">
        
        <a href="https://kce.ac.in/" class="mb-2 d-block probootstrap-logo"> <img src="images\kce.jpg"></img></a>
        <p class="mb-0" style="color:black;font-size:18px;font-family:"Arial">Online Course Learning Portal <p> <p style="color:black;font-size:18px;font-family:"Arial">Department of Placement <a href="https://probootstrap.com/" target="_blank"></a></p>
      </div>
      <div class="probootstrap-overflow">
        <nav class="probootstrap-nav">
          <ul>
            <li class="probootstrap-animate " data-animate-effect="fadeInLeft" style="color:black;font-size:20px;font-family:"Arial"><a href="Home.jsp">Home</a></li>
            <li class="probootstrap-animate active" data-animate-effect="fadeInLeft" style="color:black;font-size:20px;font-family:"Arial"><a href="Assessment.jsp">Assessments</a></li>
            <li class="probootstrap-animate" data-animate-effect="fadeInLeft" style="color:black;font-size:20px;font-family:"Arial"><a href="Result.jsp">View Results</a></li>
            <li class="probootstrap-animate" data-animate-effect="fadeInLeft" style="color:black;font-size:20px;font-family:"Arial"><a href="Discussion_form.jsp">Discussion Forum</a></li>
           </ul>
        </nav>
        <footer class="probootstrap-aside-footer probootstrap-animate" data-animate-effect="fadeInLeft">
          <p>&copy;<a href="https://kce.ac.in/" target="_blank">Karpagam College of Engineering</a>. <br> All Rights Reserved.</p>
        </footer>
      </div>
    </aside>
	<h3 align = "center">
	
	<form action="QuestionsCountServlet" name="questionForm" method="post" >
	
		Enter Number of Questions :<input type="text" name = "count">
		<input type="submit" name = "countSubmit" value = "OK" onclick=""> 
	</form>
	</h3>
	
	<%
	int count = 0;
	try{
	 count = (int)request.getSession().getAttribute("count");
	}
	catch(NullPointerException e){
		e.printStackTrace();
	}
	%>
	<form name = "questions" action = "AssessmentServlet" method = "post">
		<%
			for(int i=0;i<count;i++){
				%>				
				<h4 align="center">
				Question: <input type = "text" name="question" maxlength="500" size = "50">
				</h4>
				<h5 align = "center">
				<br>
				
				Option A: <input align="center" type = "text" name="optionA">
				
				<br>
				
				Option B: <input align="center" type = "text" name="optionB">
				
				<br>
				
				Option C: <input  align="center" type = "text" name="optionC">
				
				<br>
				Option D: <input align="center" type = "text" name="optionD">
				<br>	
				</h5>
				
				
				<% } %>
				<h3 align="center"><input  type="submit" name="submit" value="SUBMIT" onclick=""></h3>
	</form> 
	
	<%
	
	try{
		String testId = (String) request.getSession().getAttribute("testId");
		
		%>
		<h3 align ="center" Your test is ><% System.out.print(testId);%></h3>
		<%
	}
	catch(Exception e){
		e.printStackTrace();
	}
	%>
    

    <script src="js/jquery-3.2.1.slim.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/jquery.waypoints.min.js"></script>
    <script src="js/imagesloaded.pkgd.min.js"></script>

    <script src="js/main.js"></script>

    
  </body>
</html>