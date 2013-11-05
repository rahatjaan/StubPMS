<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.gueststayinfo-resources"/>
<html>
<head>
<title>List <fmt:message key="gueststayinfo.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="gueststayinfo.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newGuestStayInfo"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="gueststayinfo.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="gueststayinfo.id.title"/></th>
					<th class="thead"><fmt:message key="gueststayinfo.roomnumber.title"/></th>
					<th class="thead"><fmt:message key="gueststayinfo.floornumber.title"/></th>
					<th class="thead"><fmt:message key="gueststayinfo.arrivaldate.title"/></th>
					<th class="thead"><fmt:message key="gueststayinfo.numberOfDays.title"/></th>
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
					<th class="thead"><fmt:message key="gueststayinfo.currencyCode.title"/></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${gueststayinfos}" var="current" varStatus="i">
					<c:choose>
						<c:when test="${(i.count) % 2 == 0}">
		    				<c:set var="rowclass" value="rowtwo"/>
						</c:when>
						<c:otherwise>
		    				<c:set var="rowclass" value="rowone"/>
						</c:otherwise>
					</c:choose>	
				<tr class="${rowclass}">
					<td nowrap="nowrap" class="tabletd">
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectGuestStayInfo?idKey=${current.id}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editGuestStayInfo?idKey=${current.id}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteGuestStayInfo?idKey=${current.id}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.id}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.roomNumber}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.floorNumber}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.arrivalDate.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.numberOfDays}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.departureDate.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.folioNumber}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.totalBill}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.paymentType}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.creditAmount}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.cardType}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.cardNumber}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.balanceAmount}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.roomType}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.numberOfChildren}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.numberOfAdult}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.roomRate}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.creditcardExpirationDate.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.rateCode}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.reservationType}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.currencyCode}
						&nbsp;
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>