<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.gueststayinfo-resources"/>
<html>
<head>
<title>View <fmt:message key="gueststayinfo.title"/> <fmt:message key="guestinfo.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="guestinfo.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectGuestStayInfo?idKey=${gueststayinfo_id}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
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
							<fmt:message key="guestinfo.namePrefix.title"/>:
						</td>
						<td>
							${guestinfo.namePrefix}
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
							<fmt:message key="guestinfo.loyaltyNumber.title"/>:
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
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
