<%-- 
    Document   : home
    Created on : Jan 7, 2021, 11:07:11 AM
    Author     : ASUS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Shop Homepage</title>

        <!-- Bootstrap core CSS -->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="css/shop-homepage.css" rel="stylesheet">

    </head>

    <body>
        <h1>Welcome</h1>

        <!-- Navigation -->
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
            <div class="container">
                <a class="navbar-brand" href="#"> </a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">

                    <c:if test="${sessionScope.LOGIN_USER != null}">
                        <h2 style="color: white">Welcome! ${sessionScope.LOGIN_USER.fullname}</h2>
                    </c:if>

                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="HomeController">Home
                                <span class="sr-only">(current)</span>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">About</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Services</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Contact</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="GetListCart">Cart</a>
                        </li>

                        <c:choose>
                            <c:when test="${sessionScope.LOGIN_USER != null}">
                                <li class="nav-item">
                                    <a class="nav-link" href="LogoutController">Logout</a>
                                </li>
                            </c:when> 
                            <c:otherwise>
                                <li class="nav-item">
                                    <a class="nav-link" href="login.html">Login</a>
                                </li>
                            </c:otherwise>
                        </c:choose>

                    </ul>
                </div>
            </div>
        </nav>

        <!-- Page Content -->
        <div class="container">
            <div class="row">

                <div class="col-lg-3">

                    <h1 class="my-4">Hana Shop</h1>

                    <form action="SearchController" method="post"> 
                        <input type="text" name="txtSearch"/>
                        <input  type="submit" value="Search"/>
                    </form>
                </div>
                <br/>

                <!-- /.col-lg-3 -->

                <div class="col-lg-9">

                    <div id="carouselExampleIndicators" class="carousel slide my-4" data-ride="carousel">

                        <div class="carousel-inner" role="listbox">

                        </div>
                    </div>

                    <div class="row">
                        <c:forEach items="${list}" var="a">

                            <div class="col-lg-4 col-md-6 mb-4">

                                <div class="card h-100">

                                    <a href="#"><img class="card-img-top" src="images/${a.image}" alt="" width="600" height="300"></a>
                                    <div class="card-body">
                                        <h4 class="card-title">
                                            <a href="#">${a.productName}</a>
                                        </h4>
                                        <h5>${a.price}</h5>
                                        <h5>${a.description}</h5>
                                        <p class="card-text"></p>
                                    </div>
                                    <div class="card-footer">
                                        <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
                                    </div>
                                    <a  class="btn btn-primary" href="AddToCartController?productID=${a.productID}">Add To Cart</a>
                                </div>

                            </div>
                        </c:forEach>

                    </div>
                    <!-- /.row -->

                </div>
                <!-- /.col-lg-9 -->

            </div>
            <!-- /.row -->
            <nav aria-label="..." class="d-flex justify-content-center">
                <ul class="pagination pagination-lg">
                    <c:forEach begin="1" end="${totalPage}" var="i"> 
                        <c:choose>
                            <c:when test="${PageIndex == i}">
                                <li class="page-item active" aria-current="page">
                                    <span class="page-link">
                                        ${i}
                                        <span class="sr-only">(current)</span>
                                    </span>
                                </li>
                            </c:when>
                            <c:otherwise>
                                <li class="page-item"><a class="page-link" href="HomeController?pageIndex=${i}">${i}</a></li>
                                </c:otherwise>
                            </c:choose>

                    </c:forEach>
                </ul>
            </nav>
        </div>
        <!-- /.container -->

        <!-- Footer -->
        <footer class="py-5 bg-dark">
            <div class="container">
                <p class="m-0 text-center text-white">Copyright &copy; Your Website 2021</p>
            </div>
            <!-- /.container -->
        </footer>

        <!-- Bootstrap core JavaScript -->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    </body>

</html>
