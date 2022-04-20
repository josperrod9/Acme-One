<%--
- form.jsp
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

<acme:form>
	<acme:input-textbox code="authenticated.announcement.form.label.title" path="title" readonly="true"/>
	<acme:input-textbox code="authenticated.announcement.form.label.creationMoment" path="creationMoment" readonly="true"/>
	<acme:input-textbox code="authenticated.announcement.form.label.body" path="body" readonly="true"/>
	<acme:input-textbox code="authenticated.announcement.form.label.critical" path="critical" readonly="true"/>
	<acme:input-url code="authenticated.announcement.form.label.info" path="info" readonly="true"/>
</acme:form>
