<%-- 
    Document   : admin_page
    Created on : Jan 7, 2021, 10:00:16 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Admin</h1>
        <br/>
        <h1>Add Food</h1>
        <form action="AddController" method="post">
            <div class="form-group">
                <label>Food Name <span class="text-danger">*</span></label>
                <input type="text" name="name" placeholder="Enter Food name">
            </div>
            <div class="form-group">
                <label>Price <span class="text-danger">*</span></label>
                <input type="text" name="price" placeholder="Enter Food price">
            </div>
            <div class="form-group">
                <label>Description<span class="text-danger">*</span></label>
                <input type="text" name="description" placeholder="Enter Food description">
            </div> 
            <div class="form-group">
                <label>Quantity<span class="text-danger">*</span></label>
                <input type="text" name="quantity" placeholder="Enter Food quantity">
            </div>  
            <div class="form-group">
                <label>Image<span class="text-danger">*</span></label>
                <input type="file" name="image" placeholder="Enter Food image">
            </div>       
            <div class="form-group">
                <button type="submit" name="add" value="submit"><i class="fa fa-fw fa-plus-circle"></i> Add Food</button>
            </div>
        </form>
        <br/>
        <h1>Delete Food</h1>
        <form action="DeleteController">
            <div class="form-group">
                <input type="text" name="deletefoodname" placeholder="Enter Food ID to Delete">
                <button type="submit" name="delete" value="delete"><i class="fa fa-fw fa-plus-circle"></i> Delete Food</button>
            </div>
        </form>
        <br/>
        <h1>Update Food</h1>
        <form action="GetInfoToUpdateController" method="post"><br/>
            <input type="text" name="foodid" placeholder="Enter Food ID to update"><br/>
            <button type="submit" value="Find"/>Find</button>
    </form>

    <form action="UpdateController" method="post"><br/>
        Food Name <input type="text" name="foodname" value="${sessionScope.product.productName}"><br/>
        Price <input type="text" name="foodprice" value="${sessionScope.product.price}"><br/>
        Description <input type="text" name="fooddescription" value="${sessionScope.product.description}"><br/>
        Quantity <input type="text" name="quantity" value="${sessionScope.product.quantity}"><br/>
        Status <input type="text" name="status" value="${sessionScope.product.status}"><br/>
        Image <img src="images/${sessionScope.product.image}" width="300" height="300"/><br/>
        Choose Image to update <input type="file" name="foodimage"/><br/>
        <button type="submit" value="Update"><i class="fa fa-fw fa-plus-circle"></i> Update Food</button>
    </form>
    <br/>
    <a href="HomeController">Go to Home</a>
</body>
</html>
