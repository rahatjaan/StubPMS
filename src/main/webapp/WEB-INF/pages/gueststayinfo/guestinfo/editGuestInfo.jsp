<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.gueststayinfo-resources"/>
<html>
<head>
<title>Edit <fmt:message key="gueststayinfo.title"/> <fmt:message key="guestinfo.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="guestinfo.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectGuestStayInfo?idKey=${gueststayinfo_id}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveGuestStayInfoGuestInfo" method="POST" modelAttribute="guestinfo">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guestinfo.id.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="guestinfo_id" path="id" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "guestinfo_id",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="guestinfo.id.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${guestinfo.id}
						&nbsp;
									<form:hidden id="guestinfo_id" path="id"/>
								</c:otherwise>
							</c:choose>
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
							<form:input id="guestinfo_hhNumber" path="hhNumber" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "guestinfo_hhNumber",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="guestinfo.hhnumber.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guestinfo.al.title"/>:
						</td>
						<td>
							<form:input id="guestinfo_al" path="al" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "guestinfo_al",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="guestinfo.al.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guestinfo.bonusal.title"/>:
						</td>
						<td>
							<form:input id="guestinfo_bonusAl" path="bonusAl" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "guestinfo_bonusAl",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="guestinfo.bonusal.help"/>"}})); </script>
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
				<input type="hidden" name="gueststayinfo_id" value="${gueststayinfo_id}" >
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>