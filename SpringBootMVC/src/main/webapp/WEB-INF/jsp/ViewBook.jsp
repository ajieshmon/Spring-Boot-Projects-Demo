<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Book Details..</h2>
  <table class="table">
    <thead>
      <tr>
        <th>Book Id</th>
        <th>Book Name</th>
        <th>Author</th>
        <th>Amount</th>
        <th>Action</th>
      </tr>
    </thead>
    <tbody>
    <%int i=1; %>
   <c:forEach var="book" items="${allBook}">
      <tr>
        <td><%=i++ %></td>
        <td>${book.bookName}</td>
        <td>${book.author}</td>
        <td>${book.amount}</td>
        <td><a href=<c:url value='/deleteBook/${book.bookId}'/>><span class="glyphicon glyphicon-trash"></span></a>
        <a href=<c:url value='/editBook/${book.bookId}'/>><span class="glyphicon glyphicon-pencil"></span></a></td>
      </tr> 
      </c:forEach> 
    </tbody>
  </table>
  <br/>
  <center><a href="/addBook">Add New Book</a>  </center>
</div>

</body>
</html>

