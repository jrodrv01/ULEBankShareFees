<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
  <head><title><fmt:message key="Share Fees"/></title></head>
  <body>
    <h1><fmt:message key="heading"/></h1>
   <p><fmt:message key="greeting"/> <c:out value="${model.now}"/></p>
    <h3>Fees applies on Client's Investment Account</h3>
    <c:forEach items="${model.feeArray}" var="bfee">
      <c:out value="${bfee.description}"/> <c:out value="${bfee.feePercentage}"/><br>
    </c:forEach>
    <br>
    <a href="<c:url value="changefee.htm"/>">Decrease Fees</a>
    <br>
  </body>
</html>