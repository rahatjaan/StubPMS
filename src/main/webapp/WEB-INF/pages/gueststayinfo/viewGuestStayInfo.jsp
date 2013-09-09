<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.gueststayinfo-resources"/>
<html>
<head>
<title>View <fmt:message key="gueststayinfo.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="gueststayinfo.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexGuestStayInfo"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.id.title"/>:
						</td>
						<td>
							${gueststayinfo.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.roomnumber.title"/>:
						</td>
						<td>
							${gueststayinfo.roomNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.floornumber.title"/>:
						</td>
						<td>
							${gueststayinfo.floorNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.arrivaldate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${gueststayinfo.arrivalDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.departuredate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${gueststayinfo.departureDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.folionumber.title"/>:
						</td>
						<td>
							${gueststayinfo.folioNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.totalbill.title"/>:
						</td>
						<td>
							${gueststayinfo.totalBill}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.paymenttype.title"/>:
						</td>
						<td>
							${gueststayinfo.paymentType}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.creditamount.title"/>:
						</td>
						<td>
							${gueststayinfo.creditAmount}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.cardtype.title"/>:
						</td>
						<td>
							${gueststayinfo.cardType}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.cardnumber.title"/>:
						</td>
						<td>
							${gueststayinfo.cardNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.balanceamount.title"/>:
						</td>
						<td>
							${gueststayinfo.balanceAmount}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.roomtype.title"/>:
						</td>
						<td>
							${gueststayinfo.roomType}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.numberofchildren.title"/>:
						</td>
						<td>
							${gueststayinfo.numberOfChildren}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.numberofadult.title"/>:
						</td>
						<td>
							${gueststayinfo.numberOfAdult}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.roomrate.title"/>:
						</td>
						<td>
							${gueststayinfo.roomRate}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.creditcardexpirationdate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${gueststayinfo.creditcardExpirationDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.ratecode.title"/>:
						</td>
						<td>
							${gueststayinfo.rateCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.reservationtype.title"/>:
						</td>
						<td>
							${gueststayinfo.reservationType}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="guestinfo.title"/></h1>
					
						<c:if test='${gueststayinfo.guestInfo != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="guestinfo.id.title"/>:
						</td>
						<td>
							${gueststayinfo.guestInfo.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="guestinfo.firstname.title"/>:
						</td>
						<td>
							${gueststayinfo.guestInfo.firstName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="guestinfo.lastname.title"/>:
						</td>
						<td>
							${gueststayinfo.guestInfo.lastName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="guestinfo.fulladdress.title"/>:
						</td>
						<td>
							${gueststayinfo.guestInfo.fullAddress}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="guestinfo.mobilenumber.title"/>:
						</td>
						<td>
							${gueststayinfo.guestInfo.mobileNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="guestinfo.rateplan.title"/>:
						</td>
						<td>
							${gueststayinfo.guestInfo.ratePlan}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="guestinfo.hhnumber.title"/>:
						</td>
						<td>
							${gueststayinfo.guestInfo.hhNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="guestinfo.al.title"/>:
						</td>
						<td>
							${gueststayinfo.guestInfo.al}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="guestinfo.bonusal.title"/>:
						</td>
						<td>
							${gueststayinfo.guestInfo.bonusAl}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="guestinfo.confirmationnumber.title"/>:
						</td>
						<td>
							${gueststayinfo.guestInfo.confirmationNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="guestinfo.membershipnumber.title"/>:
						</td>
						<td>
							${gueststayinfo.guestInfo.membershipNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="guestinfo.bonuscode.title"/>:
						</td>
						<td>
							${gueststayinfo.guestInfo.bonusCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="guestinfo.groupname.title"/>:
						</td>
						<td>
							${gueststayinfo.guestInfo.groupName}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editGuestStayInfoGuestInfo?gueststayinfo_id=${gueststayinfo.id}&guestinfo_id=${gueststayinfo.guestInfo.id}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteGuestStayInfoGuestInfo?gueststayinfo_id=${gueststayinfo.id}&related_guestinfo_id=${gueststayinfo.guestInfo.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${gueststayinfo.guestInfo == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newGuestStayInfoGuestInfo?gueststayinfo_id=${gueststayinfo.id}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="guestinfo.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="guesttransactions.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newGuestStayInfoGuestTransactionses?gueststayinfo_id=${gueststayinfo.id}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="guesttransactions.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="guesttransactions.id.title"/></th>
						<th class="thead"><fmt:message key="guesttransactions.transactiondate.title"/></th>
						<th class="thead"><fmt:message key="guesttransactions.description.title"/></th>
						<th class="thead"><fmt:message key="guesttransactions.referencenumber.title"/></th>
						<th class="thead"><fmt:message key="guesttransactions.transactionid.title"/></th>
						<th class="thead"><fmt:message key="guesttransactions.charges.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${gueststayinfo.guestTransactionses}" var="current"  varStatus="i">	
						<c:choose>
							<c:when test="${(i.count) % 2 == 0}">
					    		<c:set var="rowclass" value="rowtwo"/>
							</c:when>
							<c:otherwise>
					    		<c:set var="rowclass" value="rowone"/>
							</c:otherwise>
						</c:choose>
					<tr class="${rowclass}">
						<td nowrap="nowrap">
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectGuestStayInfoGuestTransactionses?gueststayinfo_id=${gueststayinfo.id}&guesttransactionses_id=${current.id}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editGuestStayInfoGuestTransactionses?gueststayinfo_id=${gueststayinfo.id}&guesttransactionses_id=${current.id}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteGuestStayInfoGuestTransactionses?gueststayinfo_id=${gueststayinfo.id}&related_guesttransactionses_id=${current.id}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.id}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.transactionDate.time}"/>
						&nbsp;
						</td>
						<td>
							${current.description}
						&nbsp;
						</td>
						<td>
							${current.referenceNumber}
						&nbsp;
						</td>
						<td>
							${current.transactionId}
						&nbsp;
						</td>
						<td>
							${current.charges}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>