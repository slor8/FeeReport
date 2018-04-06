<%@include file="taglib.jsp"%>


<nav class="navbar navbar-default" role="navigation" id="navbar">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
    </div>
    <div class="navbar-collapse collapse">
        <ul class="nav navbar-nav navbar-center">
            <li><a href="#">Home</a></li>
            <li><a href="#">Add Accountant</a></li>
            <li><a href="#">View Accountant</a></li>
            <li><a href="#">Logout</a></li>
        </ul>
    </div>
</nav>




<div class="container">
    <form action="./logOut" method="GET">
        <button class="btn btn-danger logOut" type="submit">Log Out</button>
    </form>
</div>
<div class="container">
    <div class="login-container">
        <div class="form-box">
            <form action="addAccountant.jsp" method="GET">
                <button class="btn btn-info btn-block login" type="submit">Add Accountant</button>
            </form>
            <form action="viewUser" method="GET">
                <button class="btn btn-info btn-block login" type="submit">View Accountant</button>
            </form>
        </div>
    </div>
</div>

