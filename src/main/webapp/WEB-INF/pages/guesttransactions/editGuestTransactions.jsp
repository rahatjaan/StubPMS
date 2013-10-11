<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.guesttransactions-resources"/>
<html>
<head>
<title>Edit <fmt:message key="guesttransactions.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="guesttransactions.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexGuestTransactions"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveGuestTransactions" method="POST" modelAttribute="guesttransactions">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
				<tr>
						<td>
							<form:hidden id="guesttransactions_id" path="id" value=""/>
						</td>
					</tr>
					
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guesttransactions.transactiondate.title"/>:
						</td>
						<td>
							<input id="guesttransactions_transactionDate" name="transactionDate" type="text" value="<fmt:formatDate value="${guesttransactions.transactionDate.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "guesttransactions_transactionDate",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guesttransactions.description.title"/>:
						</td>
						<td>
							<form:input id="guesttransactions_description" path="description" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "guesttransactions_description",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="guesttransactions.description.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guesttransactions.referencenumber.title"/>:
						</td>
						<td>
							<form:input id="guesttransactions_referenceNumber" path="referenceNumber" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "guesttransactions_referenceNumber",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="guesttransactions.referencenumber.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guesttransactions.transactionid.title"/>:
						</td>
						<td>
							<form:input id="guesttransactions_transactionId" path="transactionId" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "guesttransactions_transactionId",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="guesttransactions.transactionid.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guesttransactions.charges.title"/>:
						</td>
						<td>
							<form:input id="guesttransactions_charges" path="charges" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "guesttransactions_charges",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="guesttransactions.charges.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guesttransactions.gueststayinfo.title"/>:
						</td>
						<td>
							<form:input id="guesttransactions_guestStayInfo" path="guestStayInfo.id" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "guesttransactions_guestStayInfo",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="guesttransactions.gueststayinfo.help"/>"}})); </script>
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