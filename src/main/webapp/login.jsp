<%@include file="taglib.jsp"%>
<c:set var="title" value="Login" />
<%@include file="head.jsp"%>

<div class="container">
    <div class="login-container">
        <li><img id="logo-navbar-middle" src="images/feeLogo.png" width="200"></li>
        <br/><br/>
        <form action="j_security_check" method="POST">

            <input type="text" name="j_username" placeholder="Username" required>

            <input type="password" name="j_password" placeholder="Password" required>
            <br/><br/>
            <input type="submit" value="Login">
        </form>
    </div>
</div>



