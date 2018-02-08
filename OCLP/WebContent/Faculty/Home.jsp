<!DOCTYPE html>
<%@page import="com.onlineportal.tp.bean.FacultyBean"%>
<html lang="en">
  <head>
   <style>
        .container 
{
  position: relative;
  width: 50%;
}

.image {
  display: block;
  width: 100%;
  height: auto;
}

.overlay {
  position: absolute;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  height: 100%;
  width: 100%;
  opacity: 0;
  transition: .5s ease;
  background-color: blue;
}

.container:hover .overlay 
{
  opacity: 10;
}

.text {
  color: black;
  font-size: 35px;
  position: absolute;
  font-weight: 900;
  font-family:Arial;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
}
   
  </style>
  <!-- 
    More Templates Visit ==> ProBootstrap.com
    Free Template by ProBootstrap.com under the License Creative Commons 3.0 ==> (probootstrap.com/license)
    IMPORTANT: You can do whatever you want with this template but you need to keep the footer link back to ProBootstrap.com
    -->
    
    <title>KCE|Online Course Learning Portal</title>
    <link rel="icon" href="images/kce.png" type="image/png"/>
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
  <form name="upload" action="UploadServlet.java" method="get">
  <div class="w3-container w3-center w3-animate-bottom">
  <h1 align="center">START LEARNING!!!!!</h1>

  
  <%
  FacultyBean facultyBean=(FacultyBean) request.getSession().getAttribute("session");
  
  %>

  <h2 align="center">Welcome, <%= facultyBean.getFacultyName() %></h2>
 <% try{
 	String subs = facultyBean.getCoursesEnrolled();
 	String[] courses = subs.split(" ");
 	System.out.print(courses);
 %>
 

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
            <li class="probootstrap-animate active" data-animate-effect="fadeInLeft" style="color:black;font-size:20px;font-family:"Arial"><a href="Home.jsp">Home</a></li>
            <li class="probootstrap-animate" data-animate-effect="fadeInLeft" style="color:black;font-size:20px;font-family:"Arial"><a href="Assessment.jsp">Assessments</a></li>
            <li class="probootstrap-animate" data-animate-effect="fadeInLeft" style="color:black;font-size:20px;font-family:"Arial"><a href="Result.jsp">View Results</a></li>
            <li class="probootstrap-animate" data-animate-effect="fadeInLeft" style="color:black;font-size:20px;font-family:"Arial"><a href="Discussion_form.jsp">Discussion Forum</a></li>
           </ul>
        </nav>
        <footer class="probootstrap-aside-footer probootstrap-animate" data-animate-effect="fadeInLeft">
        <p></p>
         <p></p>
          <p></p>
        <p>&copy;<a href="https://kce.ac.in/" target="_blank">Karpagam College of Engineering</a>. <br> All Rights Reserved.</p>
        </footer>
      </div>
    </aside>
    <main role="main" class="probootstrap-main js-probootstrap-main">
      <div class="probootstrap-bar">
        <a href="#" class="probootstrap-toggle js-probootstrap-toggle"><span class="oi oi-menu"></span></a>
        <div class="probootstrap-main-site-logo"><a href="index.jsp">Aside</a></a></div>
      </div>
      <div class="card-columns">

      <%
      	for(String sub: courses){
      	if(sub.equalsIgnoreCase("DataStructures"))  {%>

      <div class="card">
      <div class="container">
          <a href="uploadfiles.jsp">
            <img class="card-img-top probootstrap-animate" src="images/DS.jpg" alt="Card image cap" data-animate-effect="fadeIn">
          </a>
           <div class="overlay">
    			<div class="text" style="color:white;font-size:20px;font-family:"Arial" name="ds">Data Structures</div>
 			 	</div>
  			</div>
        </div>
        <%} %>
        
      
         <% if(sub.equalsIgnoreCase("C")) { %>
        <div class="card">
        <div class="container">
          <a href="uploadfiles.jsp">
            <img class="card-img-top probootstrap-animate" src="images/c.jpg" alt="Card image cap" data-animate-effect="fadeIn">
          </a>
           <div class="overlay">
    		<div class="text" style="color:white;font-size:20px;font-family:"Arial" name="c">C</div>
  </div>
        </div>
        </div>
        <% } %>

        
         <% if(sub.equalsIgnoreCase("C++"))  {%>
    
        <div class="card">
        <div class="container">
          <a href="uploadfiles.jsp">
            <img class="card-img-top probootstrap-animate" src="images/C++.jpg" alt="Card image cap" data-animate-effect="fadeIn">
          </a>
           <div class="overlay">
    <div class="text" style="color:white;font-size:20px;font-family:"Arial" name="c++">C++</div>
  </div>
        </div>
        </div>
        <%} %>
       
         <% if(sub.equalsIgnoreCase("OS"))  {%>
    
        <div class="card">
        <div class="container">
          <a href="uploadfiles.jsp">
            <img class="card-img-top probootstrap-animate" src="images/OS.jpg" alt="Card image cap" data-animate-effect="fadeIn">
          </a>
           <div class="overlay">
    <div class="text" style="color:white;font-size:20px;font-family:"Arial" name="os">Operating System</div>
  </div>
        </div>
        </div>
        <%} %>

         <% if(sub.equalsIgnoreCase("Java"))  { %>
     
        <div class="card">
        <div class="container">
          <a href="uploadfiles.jsp">
            <img class="card-img-top probootstrap-animate" src="images/java.jpg" alt="Card image cap" data-animate-effect="fadeIn">
          </a>
           <div class="overlay">
    <div class="text" style="color:white;font-size:20px;font-family:"Arial" name="java">Java</div>
  </div>
        </div>
        </div>
<% } %>       
        
         <% if(sub.equalsIgnoreCase("ComputerNetworks")) { %>
    
        <div class="card">
        <div class="container">
          <a href="uploadfiles.jsp">
            <img class="card-img-top probootstrap-animate" src="images/CN.jpg" alt="Card image cap" data-animate-effect="fadeIn">
          </a>
           <div class="overlay">
    <div class="text" style="color:white;font-size:20px;font-family:"Arial" name="CN">Computer Network</div>
  </div>
        </div>
        </div>
        <% } %>

        
         <% if(sub.equalsIgnoreCase("DBMS"))  { %>
     
        <div class="card">
        <div class="container">
          <a href="uploadfiles.jsp">
            <img class="card-img-top probootstrap-animate" src="images/DBMS.jpg" alt="Card image cap" data-animate-effect="fadeIn">
          </a>
           <div class="overlay">
    <div class="text" style="color:white;font-size:20px;font-family:"Arial" name="DBMS">DBMS</div>
  </div>
        </div>
        </div>
        <% } %>

        
         <% if(sub.equalsIgnoreCase("Aptitude"))  {%>
     
        <div class="card">
        <div class="container">
          <a href="uploadfiles.jsp">
            <img class="card-img-top probootstrap-animate" src="images/APTITUDE.jpg" alt="Card image cap" data-animate-effect="fadeIn">
          </a>
           <div class="overlay">
    <div class="text" style="color:white;font-size:20px;font-family:"Arial" name="apti">Aptitude</div>
  </div>
        </div>
        </div>
        <%}
      	}
      	
      	}catch(NullPointerException e){
      		response.sendRedirect("../Home/Login.jsp");
      	}
      	 %>
        <div class="container-fluid d-md-none">
        <div class="row">
          <div class="col-md-12">
            <ul class="list-unstyled d-flex probootstrap-aside-social">
              <li><a href="#" class="p-2"><span class="icon-twitter"></span></a></li>
              <li><a href="#" class="p-2"><span class="icon-instagram"></span></a></li>
              <li><a href="#" class="p-2"><span class="icon-dribbble"></span></a></li>
            </ul>
            <p>&copy; 2017 <a href="https://probootstrap.com/" target="_blank">ProBootstrap:Aside</a>. <br> All Rights Reserved. Designed by <a href="https://probootstrap.com/" target="_blank">ProBootstrap.com</a></p>
          </div>
        </div>
      </div>
</main>
 <script src="js/jquery-3.2.1.slim.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/jquery.waypoints.min.js"></script>
    <script src="js/imagesloaded.pkgd.min.js"></script>
    <script src="js/imagesloaded.pkgd.min.js"></script>
<script src="js/main.js"></script>
</form>
</body>
</html>