
    

<%@include file="/WEB-INF/view/template/header.jsp" %>




<div id="container">
<h3>Save Customer</h3> <br/>
<div id="content">

<form:form action="saveCustomer" modelAttribute="customer" method="POST">


<!-- to find id number which we have selected to update -->

<form:hidden path="id"/>


<table class="table table-striped">
  <tbody>
<tr>
<td><label>FirstName</label></td>
<td><form:input path="firstName"/></td>
</tr>
<tr>
<td><label>LastName</label></td>
<td><form:input path="lastName"/></td>
</tr>
<tr>
<td><label>Email</label></td>
<td><form:input path="email"/></td>
    </tr>
    
  </tbody>
</table>

<br/>
<center><form:button class="save">Save</form:button></center>
<br/>
<!-- to redirect to different page -->
<a href="${pageContext.request.contextPath}/customer/list">Back To List</a>
</form:form>




<%@include file="/WEB-INF/view/template/footer.jsp" %>