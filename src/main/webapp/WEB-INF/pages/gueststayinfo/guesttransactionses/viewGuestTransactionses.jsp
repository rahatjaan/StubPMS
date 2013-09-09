<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.gueststayinfo-resources"/>
<html>
<head>
<title>View <fmt:message key="gueststayinfo.title"/> <fmt:message key="guesttransactions.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="guesttransactions.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectGuestStayInfo?idKey=${gueststayinfo_id}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
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
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
