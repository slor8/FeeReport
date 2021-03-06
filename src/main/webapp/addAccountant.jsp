<%@include file="taglib.jsp"%>
<c:set var="title" value="Add New Accountant" />
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

<div class="container-fluid">
    <div class="login-container">
        <h3>-- Add Accountant --</h3>
        <hr/>
        <form action="addAccountant" method="POST">
            <input type="text" name="firstName" placeholder="First Name"  required>
            <input type="text" name="lastName" placeholder="Last Name"  required>
            <input type="text" name="userName" placeholder="Username"  required>
            <input type="password" name="password" placeholder="Password"  required>
            <input type="email" name="email" placeholder="Email"  required>
            <input type="text" name="address" placeholder="Address"  required>
            <input type="text" name="contact" placeholder="Contact"  required>
            <input type="text" name="role" placeholder="ex. user" required>
            <br/><br/>
            <button type="submit">Add</button>
        </form>
    </div>
</div>
