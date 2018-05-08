<%@include file="taglib.jsp"%>
<c:set var="title" value="Welcome Admin" />
<%@include file="head.jsp"%>

<head role="banner">
    <nav id="navbar-primary" class="navbar" role="navigation">
        <div class="container-fluid">
            <div class="collapse navbar-collapse" id="navbar-primary-collapse">
                <ul class="nav navbar-nav">
                    <li><a href="addAccountant.jsp">Add Accountant</a></li>
                    <li><img id="logo-navbar-middle" src="images/feeLogo.png" width="200"></li>
                    <li><a href="viewAccountant">View Accountant</a></li>
                    <li><a href="logout">Logout</a></li>
                </ul>
            </div>
        </div>
    </nav>
</head>

