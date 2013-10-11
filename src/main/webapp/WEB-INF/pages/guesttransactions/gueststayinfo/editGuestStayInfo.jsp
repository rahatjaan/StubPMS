<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.guesttransactions-resources"/>
<html>
<head>
<title>Edit <fmt:message key="guesttransactions.title"/> <fmt:message key="gueststayinfo.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="gueststayinfo.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectGuestTransactions?idKey=${guesttransactions_id}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveGuestTransactionsGuestStayInfo" method="POST" modelAttribute="gueststayinfo">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
				<tr>
						<td>
							<form:hidden id="gueststayinfo_id" path="id" value=""/>
						</td>
					</tr>
					
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.roomnumber.title"/>:
						</td>
						<td>
							<form:input id="gueststayinfo_roomNumber" path="roomNumber" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "gueststayinfo_roomNumber",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="gueststayinfo.roomnumber.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.floornumber.title"/>:
						</td>
						<td>
							<form:input id="gueststayinfo_floorNumber" path="floorNumber" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "gueststayinfo_floorNumber",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="gueststayinfo.floornumber.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.arrivaldate.title"/>:
						</td>
						<td>
							<input id="gueststayinfo_arrivalDate" name="arrivalDate" type="text" value="<fmt:formatDate value="${gueststayinfo.arrivalDate.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "gueststayinfo_arrivalDate",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.numberOfDays.title"/>:
						</td>
						<td>
							<input id="gueststayinfo_numberOfDays" name="numberOfDays" type="text" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "gueststayinfo_numberOfDays",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="gueststayinfo.numberOfDays.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.departuredate.title"/>:
						</td>
						<td>
							<input id="gueststayinfo_departureDate" name="departureDate" type="text" value="<fmt:formatDate value="${gueststayinfo.departureDate.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "gueststayinfo_departureDate",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.folionumber.title"/>:
						</td>
						<td>
							<form:input id="gueststayinfo_folioNumber" path="folioNumber" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "gueststayinfo_folioNumber",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="gueststayinfo.folionumber.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.totalbill.title"/>:
						</td>
						<td>
							<form:input id="gueststayinfo_totalBill" path="totalBill" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "gueststayinfo_totalBill",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="gueststayinfo.totalbill.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.paymenttype.title"/>:
						</td>
						<td>
							<form:input id="gueststayinfo_paymentType" path="paymentType" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "gueststayinfo_paymentType",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="gueststayinfo.paymenttype.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.creditamount.title"/>:
						</td>
						<td>
							<form:input id="gueststayinfo_creditAmount" path="creditAmount" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "gueststayinfo_creditAmount",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="gueststayinfo.creditamount.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.cardtype.title"/>:
						</td>
						<td>
							<form:input id="gueststayinfo_cardType" path="cardType" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "gueststayinfo_cardType",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="gueststayinfo.cardtype.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.cardnumber.title"/>:
						</td>
						<td>
							<form:input id="gueststayinfo_cardNumber" path="cardNumber" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "gueststayinfo_cardNumber",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="gueststayinfo.cardnumber.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.balanceamount.title"/>:
						</td>
						<td>
							<form:input id="gueststayinfo_balanceAmount" path="balanceAmount" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "gueststayinfo_balanceAmount",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="gueststayinfo.balanceamount.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.roomtype.title"/>:
						</td>
						<td>
							<form:input id="gueststayinfo_roomType" path="roomType" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "gueststayinfo_roomType",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="gueststayinfo.roomtype.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.numberofchildren.title"/>:
						</td>
						<td>
							<form:input id="gueststayinfo_numberOfChildren" path="numberOfChildren" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "gueststayinfo_numberOfChildren",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="gueststayinfo.numberofchildren.help"/>", constraints : {places:0}}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.numberofadult.title"/>:
						</td>
						<td>
							<form:input id="gueststayinfo_numberOfAdult" path="numberOfAdult" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "gueststayinfo_numberOfAdult",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="gueststayinfo.numberofadult.help"/>", constraints : {places:0}}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.roomrate.title"/>:
						</td>
						<td>
							<form:input id="gueststayinfo_roomRate" path="roomRate" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "gueststayinfo_roomRate",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="gueststayinfo.roomrate.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.creditcardexpirationdate.title"/>:
						</td>
						<td>
							<input id="gueststayinfo_creditcardExpirationDate" name="creditcardExpirationDate" type="text" value="<fmt:formatDate value="${gueststayinfo.creditcardExpirationDate.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "gueststayinfo_creditcardExpirationDate",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.ratecode.title"/>:
						</td>
						<td>
							<form:input id="gueststayinfo_rateCode" path="rateCode" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "gueststayinfo_rateCode",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="gueststayinfo.ratecode.help"/>", constraints : {places:0}}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.reservationtype.title"/>:
						</td>
						<td>
							<form:input id="gueststayinfo_reservationType" path="reservationType" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "gueststayinfo_reservationType",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="gueststayinfo.reservationtype.help"/>", constraints : {places:0}}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
				<input type="hidden" name="guesttransactions_id" value="${guesttransactions_id}" >
				
				
				
				
				
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
