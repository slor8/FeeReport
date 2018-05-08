<%@include file="taglib.jsp"%>
<c:set var="title" value="View Accountant" />
<%@include file="head.jsp"%>

<script type="text/javascript" class="init">
    $(document).ready( function () {
        $('#accountantTable').DataTable();
    } );
</script>
<html>
<body>

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
        <table id="accountantTable" class="display" cellspacing="0" width="100%">
            <thead>
                <th>Id</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Username</th>
                <th>Password</th>
                <th>Email</th>
                <th>Address</th>
                <th>Contact</th>
                <th>Action</th>
            </thead>
            <tbody>
            <c:forEach var="accountant" items="${accountants}">
                <tr>
                    <td>${accountant.id}</td>
                    <td>${accountant.first_name}</td>
                    <td>${accountant.last_name}</td>
                    <td>${accountant.user_name}</td>
                    <td>${accountant.password}</td>
                    <td>${accountant.email}</td>
                    <td>${accountant.address}</td>
                    <td>${accountant.contact}</td>
                    <td>
                        <a href='updateAccountant?id=${accountant.id}'>Update</a>
                        <a href='deleteAccountant?id=${accountant.id}'>Delete</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

</body>
</html>



