<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>

<html>
    <body>
        <div class="container-fluid">
            <h2>New Accountant</h2>
            <form action="addAccountant" method="POST">
                <table>
                    <tr><td>First Name: <input type="text" name="firstName" required /></td></tr>
                    <tr><td>Last Name: <input type="text" name="lastName" required /></td></tr>
                    <tr><td>Username: <input type="text" name="userName" required /></td></tr>
                    <tr><td>Password: <input type="password" name="password" required /></td></tr>
                    <tr><td>Email: <input type="text" name="email" required /></td></tr>
                    <tr><td>Address: <input type="text" name="address" required /></td></tr>
                    <tr><td>Contact: <input type="text" name="contact" required /></td></tr>

                    <tr><td><button type="submit">Add</button></td></tr>

                </table>

                <a class="btn btn-info" href="welcomeAdmin">Back</a>

            </form>
        </div>
    </body>
</html>