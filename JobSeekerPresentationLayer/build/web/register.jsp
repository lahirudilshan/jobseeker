<%@include file="includes/header.jsp" %>
<div class="col-4 mx-auto" style="margin-top: 100px;margin-bottom: 250px;">
    <div class="card" style="margin-top: 50px;">
        <div class="card-body">
            <form>
                <u class="text-muted"><h5 class="text-center">Registration form <i class="fas fa-save"></i></h5></u>
                <br>
                <br>
                <div class="form-row">
                    <div class="form-group col-md-6">
                        <label for="first_name">First Name<span class="required">*</span></label>
                        <input type="text" class="form-control" id="inputEmail4" placeholder="First name*">
                    </div>
                    <div class="form-group col-md-6">
                        <label for="last_name">Last Name<span class="required">*</span></label>
                        <input type="text" class="form-control" id="inputPassword4" placeholder="Last name*">
                    </div>
                </div>
                <div class="form-row">
                    <div class="form-group col-md-12">
                        <label for="contact">Email<span class="required">*</span></label>
                        <input type="email" class="form-control" placeholder="Email*">
                    </div>
                </div>
                <div class="form-row">
                    <div class="form-group col-md-12">
                        <label for="contact">Contact<span class="required">*</span></label>
                        <input type="text" class="form-control" placeholder="Contact*">
                    </div>
                </div>
                <button type="submit" class="btn btn-primary btn-block">Register <i class="fas fa-save"></i></button>
            </form>
        </div>
    </div>
</div>
<%@include file="includes/footer.jsp" %>
