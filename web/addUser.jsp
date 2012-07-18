<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html><body>

<s:form commandName="addUserParameters" method="POST" >
    <p><s:errors path="*" cssClass="error"/></p>
    <table class="formTable">
        <tr>
            <td class="header" colspan="3"><h4>Add User Details</h4></td>
        </tr>
        <tr>
            <td >First Name (*)</td>
            <td><s:input path="userFirstName"/></td>
        </tr>
        <tr>
            <td >Last Name</td>
            <td><s:input path="userLastname" /></td>
        </tr>
        <tr>
            <td >Age</td>
            <td><s:input path="userAge" /></td>
        </tr>
        <tr>
            <td >Phone</td>
            <td>
                <s:input path="userPhone"/></td>
        </tr>
        <tr>
            <td >Email</td>
            <td><s:input path="userEmailId" /></td>
        </tr>
        <tr>
            <td colspan="3" style="text-align:center;"><input type="submit" value="Add User"/></td>
        </tr>
    </table>

</s:form>

<c:if test="${pageContext.request.method=='POST'}">
    <c:choose>
        <c:when test="${not empty manualTransactions}">
            <table class="grid">
                <tr class="header">
                    <td>User Name</td>
                    <td>Age</td>
                    <td>Phone Number</td>
                    <td>Email Id</td>
                </tr>
                <c:forEach items="${userList}" var="user">
                 <tr>
                       <td>${user.userFirstName} ${user.userLastName}</td>
                       <td>${user.userAge}</td>
                       <td>${user.userPhone}</td>
                       <td>${user.userEmailId}</td>
                 </tr>
                </c:forEach>
            </table>
            <p> The User successfully Added.<p/>
        </c:when>
    </c:choose>
</c:if>

 </body></html>