<%@include file="taglib.jsp"%>
<c:set var="title" value="Welcome To Fee-Report" />
<%@include file="head.jsp"%>

<div class="container">
    <div class="login-container">
        <div id="output"></div>
        <div class="avatar"></div>
        <li><img id="logo-navbar-middle" src="images/feeLogo.png" width="200"></li>
        <div class="form-box">
            <form action="./welcomeAccountant" method="GET">
                <button class="btn btn-info btn-block login" type="submit">Accountant</button>
            </form>
            <form action="./welcomeAdmin" method="GET">
                <button class="btn btn-info btn-block login" type="submit">Admin</button>
            </form>
        </div>
    </div>
</div>