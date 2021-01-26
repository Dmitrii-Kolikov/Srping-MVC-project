<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>

<h2> All employees </h2>
<br>

<table>
 <tr>
        <th>Name</th>
        <th>Phone number</th>
        <th>Master</th>

    </tr>


    <c:forEach var="emp" items="${AllClns}">
    <tr>
        <td>${emp.name}</td>
        <td>${emp.phoneNumber}</td>
        <td>${emp.master}</td>



    </tr>

    </c:forEach>

    </table>
    <br>

    <input type="button" value="Add"
    onclick="window.location.href = 'addNewClient'"/>


</body>

</html>


