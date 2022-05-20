<%--
- list.jsp
-
- Copyright (C) 2012-2022 Rafael Corchuelo.
-
- In keeping with the traditional purpose of furthering education and research, it is
- the policy of the copyright owner to permit non-commercial use and redistribution of
- this software. It has been tested carefully, but it is not guaranteed for any particular
- purposes.  The copyright owner does not offer any warranties or representations, nor do
- they accept any liabilities with respect to them.
--%>

<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" uri="urn:jsptagdir:/WEB-INF/tags"%>

<acme:list>
	<acme:list-column code="patron.patronage.list.label.status" path="status"
		width="14%" />
	<acme:list-column code="patron.patronage.list.label.code" path="code"
		width="14%" />
	<acme:list-column code="patron.patronage.list.label.legalStuff" path="legalStuff"
		width="14%" />
	<acme:list-column code="patron.patronage.list.label.creationDate" path="creationDate" 
		width="14%" />
	<acme:list-column code="patron.patronage.list.label.startDate" path="startDate"
		width="14%" />
	<acme:list-column code="patron.patronage.list.label.endDate" path="endDate"
		width="14%" />
	<acme:list-column code="patron.patronage.list.label.money" path="money" 
		width="14%" />
</acme:list>
<acme:button code="patron.patronage.list.button.create" action="/patron/patronage/create"/>
