<%@include file="taglib.jsp"%>
<c:set var="title" value="Search Results" />
<%@include file="head.jsp"%>

<script type="text/javascript" class="init">
    $(document).ready( function () {
        $('#accountantTable').DataTable();
    } );
</script>
<html>
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
    <body>
        <div class="container-fluid">
            <table id="accountantTable" class="display" cellspacing="0" width="100%">
                <thead>
                    <th>Id</th><br/>
                    <th>First Name</th><br/>
                    <th>Last Name</th><br/>
                    <th>Email</th><br/>
                    <th>Course</th><br/>
                    <th>Fee</th><br/>
                </thead>
                <tbody>
                <c:forEach var="student" items="${students}">
                    <tr>
                        <td>${student.id}</td><br/>
                        <td>${student.first_name}</td><br/>
                        <td>${student.last_name}</td><br/>
                        <td>${student.email}</td><br/>
                        <td>${student.course}</td><br/>
                        <td>${student.fee}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
