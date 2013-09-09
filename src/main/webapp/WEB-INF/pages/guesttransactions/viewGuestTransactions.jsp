<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.guesttransactions-resources"/>
<html>
<head>
<title>View <fmt:message key="guesttransactions.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="guesttransactions.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexGuestTransactions"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guesttransactions.id.title"/>:
						</td>
						<td>
							${guesttransactions.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guesttransactions.transactiondate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${guesttransactions.transactionDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guesttransactions.description.title"/>:
						</td>
						<td>
							${guesttransactions.description}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guesttransactions.referencenumber.title"/>:
						</td>
						<td>
							${guesttransactions.referenceNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guesttransactions.transactionid.title"/>:
						</td>
						<td>
							${guesttransactions.transactionId}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="guesttransactions.charges.title"/>:
						</td>
						<td>
							${guesttransactions.charges}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="gueststayinfo.title"/></h1>
					
						<c:if test='${guesttransactions.guestStayInfo != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="gueststayinfo.id.title"/>:
						</td>
						<td>
							${guesttransactions.guestStayInfo.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="gueststayinfo.roomnumber.title"/>:
						</td>
						<td>
							${guesttransactions.guestStayInfo.roomNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="gueststayinfo.floornumber.title"/>:
						</td>
						<td>
							${guesttransactions.guestStayInfo.floorNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="gueststayinfo.arrivaldate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${guesttransactions.guestStayInfo.arrivalDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="gueststayinfo.departuredate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${guesttransactions.guestStayInfo.departureDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="gueststayinfo.folionumber.title"/>:
						</td>
						<td>
							${guesttransactions.guestStayInfo.folioNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="gueststayinfo.totalbill.title"/>:
						</td>
						<td>
							${guesttransactions.guestStayInfo.totalBill}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="gueststayinfo.paymenttype.title"/>:
						</td>
						<td>
							${guesttransactions.guestStayInfo.paymentType}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="gueststayinfo.creditamount.title"/>:
						</td>
						<td>
							${guesttransactions.guestStayInfo.creditAmount}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="gueststayinfo.cardtype.title"/>:
						</td>
						<td>
							${guesttransactions.guestStayInfo.cardType}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="gueststayinfo.cardnumber.title"/>:
						</td>
						<td>
							${guesttransactions.guestStayInfo.cardNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="gueststayinfo.balanceamount.title"/>:
						</td>
						<td>
							${guesttransactions.guestStayInfo.balanceAmount}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="gueststayinfo.roomtype.title"/>:
						</td>
						<td>
							${guesttransactions.guestStayInfo.roomType}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="gueststayinfo.numberofchildren.title"/>:
						</td>
						<td>
							${guesttransactions.guestStayInfo.numberOfChildren}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="gueststayinfo.numberofadult.title"/>:
						</td>
						<td>
							${guesttransactions.guestStayInfo.numberOfAdult}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="gueststayinfo.roomrate.title"/>:
						</td>
						<td>
							${guesttransactions.guestStayInfo.roomRate}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="gueststayinfo.creditcardexpirationdate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${guesttransactions.guestStayInfo.creditcardExpirationDate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="gueststayinfo.ratecode.title"/>:
						</td>
						<td>
							${guesttransactions.guestStayInfo.rateCode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="gueststayinfo.reservationtype.title"/>:
						</td>
						<td>
							${guesttransactions.guestStayInfo.reservationType}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editGuestTransactionsGuestStayInfo?guesttransactions_id=${guesttransactions.id}&gueststayinfo_id=${guesttransactions.guestStayInfo.id}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteGuestTransactionsGuestStayInfo?guesttransactions_id=${guesttransactions.id}&related_gueststayinfo_id=${guesttransactions.guestStayInfo.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${guesttransactions.guestStayInfo == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newGuestTransactionsGuestStayInfo?guesttransactions_id=${guesttransactions.id}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="gueststayinfo.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>