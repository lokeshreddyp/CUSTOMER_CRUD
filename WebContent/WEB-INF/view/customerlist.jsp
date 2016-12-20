
<%@include file="/WEB-INF/view/template/header.jsp" %>


<!-- add customer button -->
<div>
<input type="button" value="Add Customer"
onclick="window.location.href='showFormToAdd'; return false;"/>
</div>

<br/>

<div id="container">

<div id="content">


<table class="table table-striped">
  <thead>
  <tr class = "success">
    
    
      <th >First Name</th>
      <th >Last Name</th>
      <th >Email</th>
        <th >Action</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach  var="tempcustomers"    items="${customers}">

<!-- construct a variable  updateLink with customerId-->
<c:url var="updateLink" value="/customer/showFormToUpdate">

<c:param name="customerId" value="${tempcustomers.id}"/>

</c:url>

<!-- construct a variable  deleteLink with customerId-->
<c:url var ="deleteLink" value="/customer/delete">

<c:param name="customerId" value="${tempcustomers.id}"/>

</c:url>


<tr>
<td>${tempcustomers.firstName}</td>

<td>${tempcustomers.lastName}</td>

<td>${tempcustomers.email}</td>

<td><a href="${updateLink}">Update</a>

|

<a href="${deleteLink}" onclick="if(!(confirm('Are sure to delete this?'))) return false">Delete</a>

</td>

</tr>


</c:forEach>
    
    
  </tbody>
</table>

<%@include file="/WEB-INF/view/template/footer.jsp" %>