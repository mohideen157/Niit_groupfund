<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Banking Queue Management System</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.3.2.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/arial.js"></script>
<script type="text/javascript" src="js/cuf_run.js"></script>
</head>
<body>
<!-- START PAGE SOURCE -->
<div class="main">
  <div class="header">
    <div class="logo">
      <h1><a href="index.html">Banking<span>s</span><small>Queue Management System</small></a></h1>
    </div>
    <div class="menu_nav">
      <ul>
        <li class="active"><a href="index.html">Home</a></li>
        <li><a href="supportn.html">Support</a></li>
        <li><a href="aboutusn.html">About Us</a></li>
        <li><a href="centraldisplaywelcomen.jsp">Central Display</a></li>
       
      </ul>
      <div class="clr"></div>
    </div>
    <div class="clr"></div>
    <div class="hbg"><img src="images/header_images.jpg" width="1060" height="238" alt="" /></div>
  </div>
  <div class="content">
    <div class="content_bg">
      <div class="mainbar">
        <div class="article">

          <body>
    <h3>CENTRAL DISPLAY</h3>
    <h2>
        CURRENT STATUS,<br/>
        It is in processing
        <%=session.getAttribute("tno")%></h2>
</body>
        
        
        
        </div>
        </div>
      <div class="sidebar">
        <div class="gadget">
          <div class="search">
            <form method="get" id="search" action="#">
              <span>
              <input type="text" value="Search..." name="s" id="s" />
              <input name="searchsubmit" type="image" src="images/search.gif" value="Go" id="searchsubmit" class="btn"  />
              </span>
            </form>
            <div class="clr"></div>
          </div>
          <div class="clr"></div>
        </div>
        <div class="gadget">
          <h2><span>LOgiN</span>   HEre</h2>
          <div class="clr"></div>
          <ul class="sb_menu">
            <li class="active"></li>
            <li><a href="adminloginpgn1.html">Admin</a></li>
            <li><a href="bankofficerloginpgn1.html">Bank Officer</a></li>
            <li><a href="userloginpgn1.html">Customers</a></li>
            
          </ul>
        </div>
        <div class="gadget">
          <h2><span>KeY mEAsuRemenTS</span></h2>
          <div class="clr"></div>
          <ul class="ex_menu">
            <li class="active"><a href="#">The number of people entering the Bank</a></li>
            <li><a href="#">Queue Length</a></li>
            <li><a href="#">Average Waiting Time</a></li>
            <li><a href="#">Till Operator or Bank Teller Idle Time</a></li>
            <li><a href="#">Total Waiting Time</a></li> 
          </ul>
        </div>
        <div class="gadget">
          <h2 class="grey"><span>Wise Words</span></h2>
          <div class="clr"></div>
          <div class="testi">
            <p><span class="q"><img src="images/quote_1.gif" width="16" height="14" alt="" /></span> We can let circumstances rule us, or we can take charge and rule our lives from within. <span class="q"><img src="images/quote_2.gif" width="16" height="14" alt="" /></span></p>
            <p class="title"><strong>Earl Nightingale</strong></p>
          </div>
        </div>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="fbg">
    <div class="fbg_resize">
      <div class="col c1">
        <h2><span>Image Gallery</span></h2>
        <a href="#"><img src="images/pic_1.jpg" width="58" height="58" alt="" /></a> <a href="#"><img src="images/pic_2.jpg" width="58" height="58" alt="" /></a> <a href="#"><img src="images/pic_3.jpg" width="58" height="58" alt="" /></a> <a href="#"><img src="images/pic_4.jpg" width="58" height="58" alt="" /></a> <a href="#"><img src="images/pic_5.jpg" width="58" height="58" alt="" /></a> <a href="#"><img src="images/pic_6.jpg" width="58" height="58" alt="" /></a> </div>
      <div class="col c2">
        <h2><span>QUEUE</span></h2>
        <p>The main objective of any queue management system is to achieve a better quality service to customers. The queue management system will issue a queue ticket to a customer and later announce the  ticket number when service is available, eliminating the need to stand in line while waiting....</p>
          
      </div>
      <div class="col c3">
        <h2><span>About</span></h2>
        <p>Every customer has to wait for long hours to accomplish his or her transactions in banks. Banking customers face this problem every day in their daily life. By solving this issue, it will eventually speed up customer throughput and increase sales and profitability while improving productivity an operational efficiencies. Moreover, it minimizes prolonged customer waiting and reduces frustrations......</p>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="footer">
    <div class="footer_resize">
      <p class="lf">Copyright &copy; 2010 <a href="#">SiteName</a> - All Rights Reserved</p>
      <p class="rf"><a href="http://all-free-download.com/free-website-templates/">Free CSS Templates</a> by <a href="http://www.atomicwebsitetemplates.com/">Atomic Website Templates</a></p>
      <div class="clr"></div>
    </div>
  </div>
</div>
<!-- END PAGE SOURCE -->
<div align=center>This template  downloaded form <a href='http://all-free-download.com/free-website-templates/'>free website templates</a></div></body>
</html>