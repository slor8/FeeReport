<%@include file="taglib.jsp"%>
<c:set var="title" value="Update Accountant" />
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
        <h3>-- Update Accountant --</h3>
        <hr/>
        <form action="updateAccountant2" method="post">
            <input type="hidden" name="id" value="${accountant.id}" />
            <input type="text" value="${accountant.first_name}" name="firstName" placeholder="First Name"  required>
            <input type="text" value="${accountant.last_name}" name="lastName" placeholder="Last Name"  required>
            <input type="text" value="${accountant.user_name}" name="userName" placeholder="Username"  required>
            <input type="password" value="${accountant.password}" name="password" placeholder="Password"  required>
            <input type="email" value="${accountant.email}" name="email" placeholder="Email"  required>
            <input type="text" value="${accountant.address}" name="address" placeholder="Address"  required>
            <input type="text" value="${accountant.contact}" name="contact" placeholder="Contact"  required>
            <br/><br/>
            <button type="submit">Update & Save</button>
        </form>
    </div>
</div>
