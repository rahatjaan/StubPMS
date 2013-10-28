<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.guestinfo-resources"/>
<html>
<head>
<title>View <fmt:message key="guestinfo.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="guestinfo.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexGuestInfo"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guestinfo.id.title"/>:
						</td>
						<td>
							${guestinfo.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guestinfo.firstname.title"/>:
						</td>
						<td>
							${guestinfo.firstName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guestinfo.lastname.title"/>:
						</td>
						<td>
							${guestinfo.lastName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guestinfo.fulladdress.title"/>:
						</td>
						<td>
							${guestinfo.fullAddress}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guestinfo.mobilenumber.title"/>:
						</td>
						<td>
							${guestinfo.mobileNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guestinfo.rateplan.title"/>:
						</td>
						<td>
							${guestinfo.ratePlan}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guestinfo.hhnumber.title"/>:
						</td>
						<td>
							${guestinfo.loyaltyNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guestinfo.confirmationnumber.title"/>:
						</td>
						<td>
							${guestinfo.confirmationNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guestinfo.membershipnumber.title"/>:
						</td>
						<td>
							${guestinfo.membershipNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guestinfo.bonuscode.title"/>:
						</td>
						<td>
							${guestinfo.bonusCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guestinfo.groupname.title"/>:
						</td>
						<td>
							${guestinfo.groupName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guestinfo.email.title"/>:
						</td>
						<td>
							${guestinfo.email}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="gueststayinfo.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newGuestInfoGuestStayInfos?guestinfo_id=${guestinfo.id}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="gueststayinfo.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="gueststayinfo.id.title"/></th>
						<th class="thead"><fmt:message key="gueststayinfo.roomnumber.title"/></th>
						<th class="thead"><fmt:message key="gueststayinfo.floornumber.title"/></th>
						<th class="thead"><fmt:message key="gueststayinfo.arrivaldate.title"/></th>
						<th class="thead"><fmt:message key="gueststayinfo.departuredate.title"/></th>
						<th class="thead"><fmt:message key="gueststayinfo.folionumber.title"/></th>
						<th class="thead"><fmt:message key="gueststayinfo.totalbill.title"/></th>
						<th class="thead"><fmt:message key="gueststayinfo.paymenttype.title"/></th>
						<th class="thead"><fmt:message key="gueststayinfo.creditamount.title"/></th>
						<th class="thead"><fmt:message key="gueststayinfo.cardtype.title"/></th>
						<th class="thead"><fmt:message key="gueststayinfo.cardnumber.title"/></th>
						<th class="thead"><fmt:message key="gueststayinfo.balanceamount.title"/></th>
						<th class="thead"><fmt:message key="gueststayinfo.roomtype.title"/></th>
						<th class="thead"><fmt:message key="gueststayinfo.numberofchildren.title"/></th>
						<th class="thead"><fmt:message key="gueststayinfo.numberofadult.title"/></th>
						<th class="thead"><fmt:message key="gueststayinfo.roomrate.title"/></th>
						<th class="thead"><fmt:message key="gueststayinfo.creditcardexpirationdate.title"/></th>
						<th class="thead"><fmt:message key="gueststayinfo.ratecode.title"/></th>
						<th class="thead"><fmt:message key="gueststayinfo.reservationtype.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${guestinfo.guestStayInfos}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectGuestInfoGuestStayInfos?guestinfo_id=${guestinfo.id}&gueststayinfos_id=${current.id}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editGuestInfoGuestStayInfos?guestinfo_id=${guestinfo.id}&gueststayinfos_id=${current.id}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteGuestInfoGuestStayInfos?guestinfo_id=${guestinfo.id}&related_gueststayinfos_id=${current.id}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.id}
						&nbsp;
						</td>
						<td>
							${current.roomNumber}
						&nbsp;
						</td>
						<td>
							${current.floorNumber}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.arrivalDate.time}"/>
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.departureDate.time}"/>
						&nbsp;
						</td>
						<td>
							${current.folioNumber}
						&nbsp;
						</td>
						<td>
							${current.totalBill}
						&nbsp;
						</td>
						<td>
							${current.paymentType}
						&nbsp;
						</td>
						<td>
							${current.creditAmount}
						&nbsp;
						</td>
						<td>
							${current.cardType}
						&nbsp;
						</td>
						<td>
							${current.cardNumber}
						&nbsp;
						</td>
						<td>
							${current.balanceAmount}
						&nbsp;
						</td>
						<td>
							${current.roomType}
						&nbsp;
						</td>
						<td>
							${current.numberOfChildren}
						&nbsp;
						</td>
						<td>
							${current.numberOfAdult}
						&nbsp;
						</td>
						<td>
							${current.roomRate}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.creditcardExpirationDate.time}"/>
						&nbsp;
						</td>
						<td>
							${current.rateCode}
						&nbsp;
						</td>
						<td>
							${current.reservationType}
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