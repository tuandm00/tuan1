<%-- 
    Document   : cart
    Created on : Jan 13, 2021, 2:51:34 PM
    Author     : ASUS
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link href="css/cart.css" rel="stylesheet" type="text/css"/>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<script src="https://use.fontawesome.com/c560c025cf.js"></script>
<div class="container">
    <div class="card shopping-cart">
        <div class="card-header bg-dark text-light">
            <i class="fa fa-shopping-cart" aria-hidden="true"></i>
            Shopping cart
            <a href="HomeController" class="btn btn-outline-info btn-sm pull-right">Continue shopping</a>
            <div class="clearfix"></div>
        </div>
        <div class="card-body">
            <!-- PRODUCT -->
            <form action="UpdateCartController"> 
                <hr>
                <!-- END PRODUCT -->
                <!-- PRODUCT -->
                <div class="row">
                    <c:forEach items="${listCart}" var="a" varStatus="b">
                        <div class="col-12 col-sm-12 col-md-2 text-center">
                            <img class="img-responsive" src="images/${a.productImage}" alt="prewiew" width="120" height="80">
                        </div>
                        <div class="col-12 text-sm-center col-sm-12 text-md-left col-md-6">
                            <h4 class="product-name"><strong>${a.productName}</strong></h4>
                        </div>
                        <div class="col-12 col-sm-12 text-sm-center col-md-4 text-md-right row">
                            <div class="col-3 col-sm-3 col-md-6 text-md-right" style="padding-top: 5px">
                                <h6><strong>${a.productPrice} <span class="text-muted"></span></strong></h6>
                            </div>
                            <div class="col-4 col-sm-4 col-md-4">
                                <div class="quantity">
                                    <input type="number" step="1" max="99" min="1" value="${a.quantity}" title="Qty" class="qty" name="quantity${b.count-1}"
                                           size="4">
                                </div>
                            </div>
                            <div class="col-2 col-sm-2 col-md-2 text-right" >
                                <a href="DeleteCartController?productId=${a.productid}" class="btn btn-danger"><i class="fa fa-trash"></i></a>
                            </div>

                        </div>
                    </c:forEach>
                </div>
                <div class="pull-right">
                        <button type="submit" class="btn btn-info ml-2"><i class="fas fa-sync-alt mr-2"></i>Update Cart</button>
                    </div>
            </form>
            <hr>
            <!-- END PRODUCT -->

        </div>
        <div class="card-footer">

            <div class="pull-right" style="margin: 10px">
                <a href="" class="btn btn-success pull-right">Checkout</a>
                <div class="pull-right" style="margin: 5px">
                    Total price: <b>${totalPrice}</b>
                </div>
            </div>
        </div>
    </div>
</div>
