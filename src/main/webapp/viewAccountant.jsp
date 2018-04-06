<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>

<script type="text/javascript" class="init">
    $(document).ready( function () {
        $('#userTable').DataTable();
    } );
</script>
<html>
<body>

<div class="container-fluid">
    <table id="userTable" class="display" cellspacing="0" width="100%">
        <thead>
        <th>Id</th>
        <th>Name</th>
        <th>Username</th>
        <th>Password</th>
        <th>Email</th>
        <th>Address</th>
        <th>Contact</th>
        </thead>
        <tbody>
        <c:forEach var="accountant" items="${accountants}">
            <tr>
                <td>${user.id}</td>
                <td>${user.firstName}${user.lastName}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
                <td>${user.email}</td>
                <td>${user.address}</td>
                <td>${user.contact}</td>


            </tr>


        </c:forEach>
        </tbody>
    </table>


    <br/>
    <a class="btn btn-info" href="welcomeAdmin">Back</a>

</div>

</body>
</html>
