<%@include file="taglib.jsp"%>
<c:set var="title" value="View Student" />
<%@include file="head.jsp"%>

<script type="text/javascript" class="init">
    $(document).ready( function () {
        $('#accountantTable').DataTable();
    } );
</script>
<html>
<body>

<html>
<<head role="banner">
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
    <body>
        <div class="container-fluid">
                <table id="accountantTable" class="display" cellspacing="0" width="100%">
                    <thead>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Course</th>
                        <th>Fee</th>
                        <th>Paid</th>
                        <th>Due</th>
                        <th>Address</th>
                        <th>City</th>
                        <th>State</th>
                        <th>Zip Code</th>
                        <th>Phone</th>
                        <th>Action</th>
                    </thead>
                    <tbody>
                        <c:forEach var="student" items="${students}">
                            <tr>
                                <td>${student.id}</td>
                                <td>${student.first_name} ${student.last_name}</td>
                                <td>${student.email}</td>
                                <td>${student.course}</td>
                                <td>${student.fee}</td>
                                <td>${student.paid}</td>
                                <td>${student.due}</td>
                                <td>${student.address}</td>
                                <td>${student.city}</td>
                                <td>${student.state}</td>
                                <td>${student.zipCode}</td>
                                <td>${student.phone}</td>
                                <td>
                                    <a href='updateStudent?id=${student.id}'>Update</a>
                                    <a href='deleteStudent?id=${student.id}'>Delete</a></td>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
        </div>
    </body>
</html>

