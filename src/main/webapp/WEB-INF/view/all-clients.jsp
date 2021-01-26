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
        <th>Operations</th>

    </tr>


    <c:forEach var="emp" items="${AllClns}">

    <c:url var="deleteButton" value="/deleteClient">
    <c:param name="clientId" value="${emp.id}"/>
    </c:url>

     <c:url var="updateButton" value="/updateInfo">
        <c:param name="clientId" value="${emp.id}"/>
        </c:url>

    <tr>
        <td>${emp.name}</td>
        <td>${emp.phoneNumber}</td>
        <td>${emp.master}</td>
        <td>
         <input type="button" value="Update"
         onclick="window.location.href = '${updateButton}'"/>

                 <input type="button" value="Delete"
                 onclick="window.location.href = '${deleteButton}'"/>
        </td>



    </tr>

    </c:forEach>

    </table>
    <br>

    <input type="button" value="Add"
    onclick="window.location.href = 'addNewClient'"/>


</body>

</html>


