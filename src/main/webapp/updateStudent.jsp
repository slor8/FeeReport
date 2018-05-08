<%@include file="taglib.jsp"%>
<c:set var="title" value="Update Student" />
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
        <h3>-- Update --</h3>
        <hr/>
        <form action="updateStudent2" method="post">
            <input type="hidden" name="id" value="${student.id}" />
            <input type="text" value="${student.first_name}" name="firstName" placeholder="First Name"  required>
            <input type="text" value="${student.last_name}" name="lastName" placeholder="Last Name"  required>
            <input type="email" value="${student.email}" name="email" placeholder="Email"  required>
            <input type="text" value="${student.course}" name="course" placeholder="Course"  required>
            <input type="text" value="${student.fee}" name="fee" placeholder="Fee"  required>
            <input type="text" value="${student.paid}" name="paid" placeholder="Paid"  required>
            <input type="text" value="${student.due}" name="due" placeholder="Due"  required>
            <input type="text" value="${student.address}" name="address" placeholder="Address"  required>
            <input type="text" value="${student.city}" name="city" placeholder="City"  required>
            <input type="text" value="${student.state}" name="state" placeholder="State example: WI"  required>
            <input type="text" value="${student.zipCode}" name="zipCode" placeholder="Zip Code"  required>
            <input type="text" value="${student.phone}" name="phone" placeholder="Phone"  required>
            <br/><br/>
            <button type="submit">Update & Save</button>
        </form>
    </div>
</div>
