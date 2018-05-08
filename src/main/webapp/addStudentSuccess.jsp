<%@include file="taglib.jsp"%>
<c:set var="title" value="Adding Student Successful" />
<%@include file="head.jsp"%>

<head role="banner">
    <nav id="navbar-primary" class="navbar" role="navigation">
        <div class="container-fluid">
            <div class="collapse navbar-collapse" id="navbar-primary-collapse">
                <ul class="nav navbar-nav">
                    <li><a href="addStudent.jsp">Add Student</a></li>
                    <li><a href="viewStudent">View Student</a></li>
                    <li><img id="logo-navbar-middle" src="images/feeLogo.png" width="200"></li>
                    <li><a href="searchStudent.jsp">Search Student</a></li>
                    <li><a href="logout">Logout</a></li>
                </ul>
            </div>
        </div>
    </nav>
</head>

<div class="container">
    <div class="alert alert-success">
        <strong>Successfully!</strong> Adding New Student!
    </div>
</div>
