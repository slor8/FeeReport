<%@include file="taglib.jsp"%>
<c:set var="title" value="Search Results" />
<%@include file="head.jsp"%>

<script type="text/javascript" class="init">
    $(document).ready( function () {
        $('#userTable').DataTable();
    } );
</script>
<html>
<body>

<div class="container-fluid">
    <h2>Search Accountant </h2>
    <table id="userTable" class="display" cellspacing="0" width="100%">
        <thead>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Password</th>
        <th>Address</th>
        <th>Contact</th>
        </thead>
        <tbody>
        <c:forEach var="accountant" items="${accountants}">
            <tr>
                <td>${accountant.id}</td>
                <td>${accountant.firstName} ${user.lastName}</td>
                <td>${accountant.email}</td>
                <td>${accountant.password}</td>
                <td>${accountant.address}</td>
                <td>${accountant.contact}</td>

            </tr>


        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
