<%@include file="taglib.jsp"%>
<c:set var="title" value="Search Student" />
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
<div class="container-fluid">
    <div class="login-container">
        <h3>-- Search Student --</h3>
        <hr/>
        <form action="searchStudent">
            <input type="search" id="searchTerm" name="searchTerm" placeholder="Student Last Name" required>
            <br/><br/>
            <button type="submit" name="submit" value="search">Search</button>
        </form>
    </div>
</div>