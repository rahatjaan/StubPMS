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
							<fmt:message key="gueststayinfo.numberOfDays.title"/>:
						</td>
						<td>
							${gueststayinfo.numberOfDays}
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
					<tr>
						<td class="label" valign="top">
							<fmt:message key="gueststayinfo.currencyCode.title"/>:
						</td>
						<td>
							${gueststayinfo.currencyCode}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/deleteGuestStayInfo?idKey=${gueststayinfo.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>