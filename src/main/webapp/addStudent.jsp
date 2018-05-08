<%@include file="taglib.jsp"%>
<c:set var="title" value="Add New Student" />
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
        <h3>-- Add Student --</h3>
        <hr/>
        <form action="addStudent" method="POST">
            <input type="text" name="firstName" placeholder="First Name"  required>
            <input type="text" name="lastName" placeholder="Last Name"  required>
            <input type="email" name="email" placeholder="Email"  required>
            <input type="text" name="course" placeholder="Course"  required>
            <input type="text" name="fee" placeholder="Fee"  required>
            <input type="text" name="paid" placeholder="Paid"  required>
            <input type="text" name="due" placeholder="Due"  required>
            <input type="text" name="address" placeholder="Address"  required>
            <input type="text" name="city" placeholder="City"  required>
            <input type="text" name="state" placeholder="Ex. WI"  required>
            <input type="text" name="zipCode" placeholder="Zip Code"  required>
            <input type="text" name="phone" placeholder="Phone"  required>
            <br/><br/>
            <button type="submit">Add</button>
        </form>
    </div>
</div>
