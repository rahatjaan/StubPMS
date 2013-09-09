<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.guestinfo-resources"/>
<html>
<head>
<title>List <fmt:message key="guestinfo.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="guestinfo.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newGuestInfo"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="guestinfo.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="guestinfo.id.title"/></th>
					<th class="thead"><fmt:message key="guestinfo.firstname.title"/></th>
					<th class="thead"><fmt:message key="guestinfo.lastname.title"/></th>
					<th class="thead"><fmt:message key="guestinfo.fulladdress.title"/></th>
					<th class="thead"><fmt:message key="guestinfo.mobilenumber.title"/></th>
					<th class="thead"><fmt:message key="guestinfo.rateplan.title"/></th>
					<th class="thead"><fmt:message key="guestinfo.hhnumber.title"/></th>
					<th class="thead"><fmt:message key="guestinfo.al.title"/></th>
					<th class="thead"><fmt:message key="guestinfo.bonusal.title"/></th>
					<th class="thead"><fmt:message key="guestinfo.confirmationnumber.title"/></th>
					<th class="thead"><fmt:message key="guestinfo.membershipnumber.title"/></th>
					<th class="thead"><fmt:message key="guestinfo.bonuscode.title"/></th>
					<th class="thead"><fmt:message key="guestinfo.groupname.title"/></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${guestinfos}" var="current" varStatus="i">
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
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectGuestInfo?idKey=${current.id}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editGuestInfo?idKey=${current.id}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteGuestInfo?idKey=${current.id}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.id}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.firstName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.lastName}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.fullAddress}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.mobileNumber}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.ratePlan}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.hhNumber}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.al}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.bonusAl}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.confirmationNumber}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.membershipNumber}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.bonusCode}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.groupName}
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