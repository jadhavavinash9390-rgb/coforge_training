<table border="1">

<tr>

<th>ID</th>

<th>Name</th>

<th>Price</th>

<th>Quantity</th>

</tr>

<c:forEach items="${products}" var="p">

<tr>

<td>${p.pid}</td>

<td>${p.pname}</td>

<td>${p.price}</td>

<td>${p.quantity}</td>

</tr>

</c:forEach>

</table>