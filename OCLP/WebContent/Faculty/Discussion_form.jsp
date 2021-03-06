<!DOCTYPE html>

<html lang="en">
  <head>
    <!-- 
    More Templates Visit ==> ProBootstrap.com
    Free Template by ProBootstrap.com under the License Creative Commons 3.0 ==> (probootstrap.com/license)

    IMPORTANT: You can do whatever you want with this template but you need to keep the footer link back to ProBootstrap.com
    -->
    <title>Discussion</title>
    <link rel="icon" href="images/kce.png" type="image/png"></link>
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
   <div class="w3-container w3-center w3-animate-bottom">
   <p></p>
  <h1 align=center>DISCUSSION FORUM</h1>
 </div>
 <% try{
 		String status =(String) request.getSession().getAttribute("discuss");
 		if(status.equals("added")){
 			%>
 		<h3 align = center> Your query submitted successfully</h3>
 		<%
 			}
 			else if(status.equals("failed")){
 			
 		%>
 		<h3 align = center> Your query submission failed</h3>
 		<%
 			}
 			else{
 				%>
 				<h3 align = center> Submit your queries here</h3>
 				<%
 			}
 		}
 catch(Exception e){
	 e.printStackTrace();
 }
 %>
  <h1 align=center></h1>
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
            <li class="probootstrap-animate" data-animate-effect="fadeInLeft" style="color:black;font-size:20px;font-family:"Arial"><a href="Assessment.jsp">Assessments</a></li>
            <li class="probootstrap-animate" data-animate-effect="fadeInLeft" style="color:black;font-size:20px;font-family:"Arial"><a href="Result.jsp">View Results</a></li>
            <li class="probootstrap-animate active" data-animate-effect="fadeInLeft" style="color:black;font-size:20px;font-family:"Arial"><a href="Discussion_form.jsp">Discussion Forum</a></li>
           </ul>
        </nav>
        <footer class="probootstrap-aside-footer probootstrap-animate" data-animate-effect="fadeInLeft">
          <p>&copy;<a href="https://kce.ac.in/" target="_blank">Karpagam College of Engineering</a>. <br> All Rights Reserved.</p>
        </footer>
      </div>
    </aside>


    <main role="main" class="probootstrap-main js-probootstrap-main">
      <div class="probootstrap-bar">
        <a href="#" class="probootstrap-toggle js-probootstrap-toggle"><span class="oi oi-menu"></span></a>
        <div class="probootstrap-main-site-logo"><a href="index.jsp">Aside</a></a></div>
      </div>
      <div class="container-fluid">
        <div class="row justify-content-center">
          <div class="col-xl-8 col-lg-12">
           <!--  <p class="mb-5"><img src="images/img_bg_1.jpg"  class="img-fluid"></p> -->

            <div class="row">
              <div class="col-xl-8 col-lg-12 mx-auto">

                <form action="DiscussionServlet" method="get" class="probootstrap-form mb-5">
                  <div class="row">
                    <div class="col-md-6">
                      <div class="form-group">
                        <label for="fname">Roll Number</label>
                        <input type="text" class="form-control" id="roll" name="fname">
                      </div>
                    </div>
                    <div class="col-md-6">
                      <div class="form-group">
                        <label for="lname">Name</label>
                        <input type="text" class="form-control" id="name" name="lname">
                      </div>
                    </div>
                  </div>
                  <div class="form-group mb-4">
                    <label for="message">Message</label>
                    <textarea cols="30" rows="10" class="form-control" id="msg" name="message"></textarea>
                  </div>
                  <div class="form-group">
                    <input type="submit" class="btn btn-primary" id="submit" name="submit" value="Send Message">
                  </div>
                </form>
               
              </div>
            </div>
            
          </div>
        </div>
        <!-- END row -->

        

            
          </div>
        </section>
        <!-- END section -->

      </div>

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

    <script src="js/main.js"></script>

    
  </body>
</html>