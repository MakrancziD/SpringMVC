<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Add user</title>
</head>
<body>
    <h1>Add new user</h1>

    <form:form commandName="user">
        <table>
            <tr>
                <td>Username: </td>
                <td><form:input path="name"/></td>
            </tr>
            <tr>
                <td>Gender: </td>
                <td><form:radiobuttons path="gender" items="${genders}"/></td>
            </tr>
            <tr>
                <td>Education: </td>
                <td>
                    <form:select path="school">
                        <form:option value="">Select school</form:option>
                        <c:forEach items="${schools}" var="school">
                            <form:option value="${school}">${school}</form:option>
                        </c:forEach>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td>Favourite colors: </td>
                <td>
                    <form:checkboxes path="colors" items="${colors}"/>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Add User"/>
                </td>
            </tr>
        </table>
    </form:form>

</body>
</html>
