<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>DashBoard</title>
            <script src="js/jquery-1.11.1.min.js"></script>
            <link href="css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
            <script src="js/bootstrap.min.js"></script>
            <link href="css/fontawsome.css" rel="stylesheet">
            <link href="css/font-awesome.min.css" rel="stylesheet">
            <link href="css/main.css" rel="stylesheet">
            <script src="js/apmosyscalender.js" type="text/javascript"></script>
         

        </head>
        <body class="home">
            <div class="container-fluid display-table">
                <div class="row display-table-row">
                    <div class="col-md-2 col-sm-1 hidden-xs display-table-cell v-align box" id="navigation">
                        <div class="logo">
                            <a hef="home.html">
                                <img src="images/clockinout.png" alt="logo" class="hidden-xs hidden-sm">
                                <img src="http://jskrishna.com/work/merkury/images/circle-logo.png" alt="merkery_logo" class="visible-xs visible-sm circle-logo">
                            </a>
                        </div>
                        <div class="navi" style="height: 750px;">
                            <ul>
                                <li class="active"><a href="#"><i class="fa fa-home"
								aria-hidden="true"></i><span class="hidden-xs hidden-sm">Home</span></a>
                                </li>
                                <li><a href="#"><i class="fa fa-tasks" aria-hidden="true"></i><span
								class="hidden-xs hidden-sm">Attendence Detais</span></a>
                                </li>
                                <li><a href="#"><i class="fa fa-bar-chart"
								aria-hidden="true"></i><span class="hidden-xs hidden-sm">Apply
									Leave</span></a>
                                </li>
                                <li><a href="#"><i class="fa fa-user" aria-hidden="true"></i><span
								class="hidden-xs hidden-sm">View Profile</span></a>
                                </li>
                                <li><a href="#"><i class="fa fa-calendar"
								aria-hidden="true"></i><span class="hidden-xs hidden-sm">View</span></a>
                                </li>
                                <li><a href="./UpdateController?empId=${employee.empId}"><i class="fa fa-edit" aria-hidden="true"></i><span
								class="hidden-xs hidden-sm">Edit Profile</span></a>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-md-10 col-sm-11 display-table-cell v-align">
                        <!--<button type="button" class="slide-toggle">Slide Toggle</button> -->
                        <div class="row">
                            <header>
                                <div class="col-md-7">
                                    <nav class="navbar-default pull-left">
                                        <div class="navbar-header">
                                            <button type="button" class="navbar-toggle collapsed" data-toggle="offcanvas" data-target="#side-menu" aria-expanded="false">
                                                <span class="sr-only">Toggle navigation</span>  <span class="icon-bar"></span>  <span class="icon-bar"></span>  <span class="icon-bar"></span>
                                            </button>
                                        </div>
                                    </nav>

                                </div>
                                <div class="col-md-5">
                                    <div class="header-rightside">
                                        <ul class="list-inline header-top">
                                            <li class="hidden-xs"><a href="#" class="add-project" data-toggle="modal" data-target="#add_project">Add Project</a>
                                            </li>
                                            <li><a href="#"><i class="fa fa-envelope" aria-hidden="true"></i></a>
                                            </li>
                                            <li>
                                                <a href="#" class="icon-info"> <i class="fa fa-bell" aria-hidden="true"></i>  <span class="label label-primary">3</span>
                                                </a>
                                            </li>
                                            <li><span>${employee.firstName}</span>
                                            </li>
                                            <li class="dropdown">
                                                <a href="#" class="dropdown-toggle" data-toggle="dropdown"> <b class="caret"></b>
                                                </a>
                                                <ul class="dropdown-menu">
                                                    <li>
                                                        <div class="navbar-content">

                                                            <span>${employee.firstName}</span>
                                                            <p class="text-muted small">${employee.email}</p>
                                                            <div class="divider"></div>
                                                            <a href="#" class="view btn-sm active">View Profile</a>
                                                        </div>
                                                    </li>
                                                </ul>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </header>
                        </div>
                        <div class="user-dashboard1">
                            <div id='mycalender'>
                                <div id='wrap'>

                                    <div id='calendar'></div>

                                    <div style='clear: both'></div>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </body>

        </html>
