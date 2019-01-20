<%@include file="includes/header.jsp" %>
<div class="col-4 mx-auto" style="margin-top: 100px;margin-bottom: 250px;">
    <div class="card" style="margin-top: 150px;">
        <img class="card-img-top" src="resources/images/login-user.png" alt="Card image cap" style="width: 150px;margin: 0 auto;margin-top: -75px;">
        <div class="card-body">
            <form>
                <div class="form-group">
                    <label for="exampleInputEmail1">Email address</label>
                    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">Password</label>
                    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                </div>
                <button type="submit" class="btn btn-primary btn-block">Login <i class="fas fa-sign-in-alt"></i></button>
            </form>
        </div>
    </div>
</div>
<%@include file="includes/footer.jsp" %>
