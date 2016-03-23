<%
/**
 * OpenCPS is the open source Core Public Services software
 * Copyright (C) 2016-present OpenCPS community
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
%>

<%@page import="com.liferay.portal.kernel.dao.search.RowChecker"%>
<%@page import="com.liferay.taglib.aui.RowTag"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchEntry"%>
<%@page import="org.opencps.usermgt.service.WorkingUnitLocalServiceUtil"%>
<%@page import="org.opencps.usermgt.search.WorkingUnitSearchTerms"%>
<%@page import="org.opencps.usermgt.search.WorkingUnitSearch"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.opencps.usermgt.model.WorkingUnit"%>
<%@page import="java.util.List"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ include file="../init.jsp"%>

<liferay-util:include page="/html/portlets/usermgt/admin/toptabs.jsp" servletContext="<%=application %>" />

<liferay-util:include page="/html/portlets/usermgt/admin/toolbar.jsp" servletContext="<%=application %>" />

<%
	PortletURL iteratorURL = renderResponse.createRenderURL();
	iteratorURL.setParameter("mvcPath", templatePath + "workingunits.jsp");
	
	List<WorkingUnit> workingUnits = new ArrayList<WorkingUnit>();
	int totalCount = 0;
%>


<liferay-ui:search-container searchContainer="<%= new WorkingUnitSearch(renderRequest ,SearchContainer.DEFAULT_DELTA, iteratorURL) %>">
	<liferay-ui:search-container-results>
		<%
			WorkingUnitSearchTerms searchTerms = (WorkingUnitSearchTerms) searchContainer.getSearchTerms();
			
			workingUnits = WorkingUnitLocalServiceUtil.getWorkingUnit(searchContainer.getStart(), searchContainer.getEnd(), searchContainer.getOrderByComparator());
			
			totalCount = WorkingUnitLocalServiceUtil.countAll();
			total = totalCount;
			results = workingUnits;
			pageContext.setAttribute("results", results);
			pageContext.setAttribute("total", total);
		%>
	
	</liferay-ui:search-container-results>
	
	<liferay-ui:search-container-row 
		className="org.opencps.usermgt.model.WorkingUnit" 
		modelVar="workingUnit" 
		keyProperty="workingunitId"
	>
		<%
			row.addText(workingUnit.getName());
			row.addText(workingUnit.getAddress());
			row.addText(workingUnit.getTelNo());
			row.addText(workingUnit.getEmail());
			row.addText(workingUnit.getAddress());
			row.addJSP("center", SearchEntry.DEFAULT_VALIGN,  templatePath + "workingunit-action.jsp", config.getServletContext(), request, response);
		%>
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator/>
</liferay-ui:search-container>

