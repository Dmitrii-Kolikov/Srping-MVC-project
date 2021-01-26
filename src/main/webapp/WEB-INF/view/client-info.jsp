<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2> Client info </h2>
<br>

<form:form action="saveClient" modelAttribute="client">
    Name <form:input path="name"/>
    <br><br>
    Phone Number <form:input path="phoneNumber"/>
        <br><br>

     Master <form:select path = "master" >
            <form:option value = "Nina" label = "Nina" />
            <form:option value = "Natasha" label = "Natasha" />
            <form:option value = "Anna" label = "Anna" />
            </form:select>
            <br>
    <input type="submit" value="OK"/>

</form:form>


</body>

</html>
