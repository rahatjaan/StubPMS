<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.guestinfo-resources"/>
<html>
<head>
<title>Edit <fmt:message key="guestinfo.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="guestinfo.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexGuestInfo"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveGuestInfo" method="POST" modelAttribute="guestinfo">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					
					<tr>
						<td>
							<form:hidden id="guestinfo_id" path="id" value=""/>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guestinfo.namePrefix.title"/>:
						</td>
						<td>
							<form:input id="guestinfo_namePrefix" path="namePrefix" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "guestinfo_namePrefix",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="guestinfo.namePrefix.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guestinfo.firstname.title"/>:
						</td>
						<td>
							<form:input id="guestinfo_firstName" path="firstName" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "guestinfo_firstName",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="guestinfo.firstname.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guestinfo.lastname.title"/>:
						</td>
						<td>
							<form:input id="guestinfo_lastName" path="lastName" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "guestinfo_lastName",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="guestinfo.lastname.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guestinfo.fulladdress.title"/>:
						</td>
						<td>
							<form:input id="guestinfo_fullAddress" path="fullAddress" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "guestinfo_fullAddress",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="guestinfo.fulladdress.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guestinfo.mobilenumber.title"/>:
						</td>
						<td>
							<form:input id="guestinfo_mobileNumber" path="mobileNumber" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "guestinfo_mobileNumber",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="guestinfo.mobilenumber.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guestinfo.email.title"/>:
						</td>
						<td>
							<form:input id="guestinfo_email" path="email" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "guestinfo_email",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="guestinfo.email.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guestinfo.rateplan.title"/>:
						</td>
						<td>
							<form:input id="guestinfo_ratePlan" path="ratePlan" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "guestinfo_ratePlan",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="guestinfo.rateplan.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guestinfo.hhnumber.title"/>:
						</td>
						<td>
							<form:input id="guestinfo_hhNumber" path="loyaltyNumber" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "guestinfo_hhNumber",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="guestinfo.hhnumber.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guestinfo.confirmationnumber.title"/>:
						</td>
						<td>
							<form:input id="guestinfo_confirmationNumber" path="confirmationNumber" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "guestinfo_confirmationNumber",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="guestinfo.confirmationnumber.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guestinfo.membershipnumber.title"/>:
						</td>
						<td>
							<form:input id="guestinfo_membershipNumber" path="membershipNumber" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "guestinfo_membershipNumber",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="guestinfo.membershipnumber.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guestinfo.bonuscode.title"/>:
						</td>
						<td>
							<form:input id="guestinfo_bonusCode" path="bonusCode" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "guestinfo_bonusCode",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="guestinfo.bonuscode.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guestinfo.groupname.title"/>:
						</td>
						<td>
							<form:input id="guestinfo_groupName" path="groupName" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "guestinfo_groupName",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="guestinfo.groupname.help"/>"}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>