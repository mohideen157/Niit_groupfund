<%-- 
    Document   : adminloginpgn
    Created on : Aug 19, 2016, 9:37:51 AM
    Author     : Rosheinee
--%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/html">
<head>
<title>BusinessHighway | Support</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.3.2.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/arial.js"></script>
<script type="text/javascript" src="js/cuf_run.js"></script>
<h1 align="center" style="color:red;"><u> Registration form </u></h1>

<script type="text/javascript">
function validateForm()
{
var p=document.forms["myForm"]["id"].value;
if (p===null || p==="")
{
alert("Id must be filled out");
document.myForm.id.focus();
return false;
}
var x=document.forms["myForm"]["firstname"].value;
if (x===null || x==="")
{
alert("First name must be filled out");
document.myForm.firstname.focus();
return false;
}

var y=document.forms["myForm"]["fathersname"].value;
if (y===null || y==="")
{
alert("Fathers name must be filled out");
document.myForm.fathersname.focus();
return false;
}
var a=document.forms["myForm"]["age"].value;
if (a===null || a==="")
{
alert("age must be filled out");
document.myForm.age.focus();
return false;
}

var c=document.forms["myForm"]["email"].value;
var atpos=c.indexOf("@");
var dotpos=c.lastIndexOf(".");

if (atpos<1 || dotpos<atpos+2 || dotpos+2>=c.length)
{
alert("Not a valid e-mail address");
document.myForm.email.focus();
return false;
}

var d=document.forms["myForm"]["phonenum"].value;
if (d===null || d==="")
{
alert("phone number must be filled out");
document.myForm.phonenum.focus();
return false;
}
var f=document.forms["myForm"]["account"].value;
if (f===null || f==="")
{
alert("Account Type must be Selected");
document.myForm.qualification.focus();
return false;
}
}

</script>

</head>
<body>
<!-- START PAGE SOURCE -->
<div class="main">
  <div class="header">
    <div class="logo">
      <h1><a href="index.html">busines<span>s</span>highway<small>Simple web template</small></a></h1>
    </div>
    <div class="menu_nav">
      <ul>
        <li><a href="index.html">Home</a></li>
        <li class="active"><a href="support.html">Support</a></li>
        <li><a href="about.html">About Us</a></li>
        <li><a href="blog.html">Blog</a></li>
        <li><a href="contact.html">Contact Us</a></li>
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
       
            
            
            <form name="myForm" onsubmit="return validateForm()" action=RegistrationServlet method="post">
<table align="center">
<tr><td> User Id:</td><td><input type="text" name="id" /><br /></td></tr>
<tr><td> First name:</td><td><input type="text" name="firstname" /><br /></td></tr>
<tr><td> Fathersname:</td><td> <input type="text" name="fathersname" /><br/></td></tr>
<tr><td> Age:</td><td><input type="text" name="age" /></br></td></tr>

<tr><td> Gender:</td><td></br>
<input type="radio" name="sex" value="male" /> Male<br />
<input type="radio" name="sex" value="female" /> Female</br></td></tr>
<tr><td> EmailId:</td><td><input type="text" name="email"/><br /></td></tr>
<tr><td>
Phone Number:</td><td><input type="text" name="phonenum"/><br /></td></tr>
<tr><td> Account Type</td><td> <select name="account"/>
<option value="SavingAcc">SavingsAcc</option>
<option value="CurrentAcc">CurrentAcc</option>
<option value="FD">FD</option>
<option value="Other">Other</option>
</select></br></td></tr>
<tr><td> 
<input type="reset" value="reset" /></td>
<td> <input type="Submit" value="insert" name="s1"></td>
<td> <input type="Submit" value="delete" name="s1"> </td></tr>
</form>

            
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
          <h2><span>Sidebar</span> Menu</h2>
          <div class="clr"></div>
          <ul class="sb_menu">
            <li class="active"><a href="#">Home</a></li>
            <li><a href="#">TemplateInfo</a></li>
            <li><a href="#">Style Demo</a></li>
            <li><a href="#">Blog</a></li>
            <li><a href="#">Archives</a></li>
          </ul>
        </div>
        <div class="gadget">
          <h2><span>Sponsors</span></h2>
          <div class="clr"></div>
          <ul class="ex_menu">
            <li class="active"><a href="#">Lorem ipsum dolor</a> <span>Donec libero. Suspendisse bibendum</span></li>
            <li><a href="#">Dui pede condimentum</a> <span>Phasellus suscipit, leo a pharetra</span></li>
            <li><a href="#">Condimentum lorem</a> <span>Tellus eleifend magna eget</span></li>
            <li><a href="#">Fringilla velit magna</a> <span>Curabitur vel urna in tristique</span></li>
            <li><a href="#">Suspendisse bibendum</a> <span>Cras id urna orbi tincidunt orci ac</span></li>
            <li><a href="#">Donec mattis</a> <span>purus nec placerat bibendum</span></li>
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
        <h2><span>Lorem Ipsum</span></h2>
        <p>Lorem ipsum dolor<br />
          Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec libero. Suspendisse bibendum. Cras id urna. <a href="#">Morbi tincidunt, orci ac convallis aliquam</a>, lectus turpis varius lorem, eu posuere nunc justo tempus leo. Donec mattis, purus nec placerat bibendum, dui pede condimentum odio, ac blandit ante orci ut diam.</p>
      </div>
      <div class="col c3">
        <h2><span>About</span></h2>
        <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec libero. Suspendisse bibendum. Cras id urna. Morbi tincidunt, orci ac convallis aliquam, lectus turpis varius lorem, eu posuere nunc justo tempus leo. llorem, eu posuere nunc justo tempus leo. Donec mattis, purus nec placerat bibendum. <a href="#">Learn more...</a></p>
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