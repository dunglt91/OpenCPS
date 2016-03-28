/**
 * OpenCPS is the open source Core Public Services software
 * Copyright (C) 2016-present OpenCPS community

 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>
 */

package org.opencps.util;

import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.util.portlet.PortletProps;

/**
 * @author trungnt
 */
public class PortletPropsValues {

	// Data Management Validate
	public static final int DATAMGT_DICTCOLLECTION_CODE_LENGHT = GetterUtil
			.getInteger(
					PortletProps
							.get(PortletPropsKeys.DATAMGT_DICTCOLLECTION_CODE_LENGHT),
					100);
	public static final int DATAMGT_DICTCOLLECTION_NAME_LENGHT = GetterUtil
			.getInteger(
					PortletProps
							.get(PortletPropsKeys.DATAMGT_DICTCOLLECTION_NAME_LENGHT),
					255);
	public static final int DATAMGT_DICTITEM_CODE_LENGHT = GetterUtil
			.getInteger(
					PortletProps
							.get(PortletPropsKeys.DATAMGT_DICTITEM_CODE_LENGHT),
					100);
	public static final int DATAMGT_DICTITEM_NAME_LENGHT = GetterUtil
			.getInteger(
					PortletProps
							.get(PortletPropsKeys.DATAMGT_DICTITEM_NAME_LENGHT),
					255);

	// Data Management Master data
	public static final String[] DATAMGT_MASTERDATA_CODE = GetterUtil
			.getStringValues(
					PortletProps.get(PortletPropsKeys.DATAMGT_MASTERDATA_CODE),
					new String[0]);

	// User Management
	public static final int[] USERMGT_JOBPOS_LEADER = GetterUtil
			.getIntegerValues(
					PortletProps
							.getArray(PortletPropsKeys.USERMGT_JOBPOS_LEADER),
					new int[0]);

	public static final String USERMGT_USERGROUP_NAME_EMPLOYEE = GetterUtil
			.getString(PortletProps
					.get(PortletPropsKeys.USERMGT_USERGROUP_NAME_EMPLOYEE));

	public static final String USERMGT_USERGROUP_NAME_BUSINESS = GetterUtil
			.getString(PortletProps
					.get(PortletPropsKeys.USERMGT_USERGROUP_NAME_BUSINESS));

	public static final String USERMGT_USERGROUP_NAME_CITIZEN = GetterUtil
			.getString(PortletProps
					.get(PortletPropsKeys.USERMGT_USERGROUP_NAME_CITIZEN));
	
	public static final String USERMGT_JOBPOS_NOMAL = GetterUtil
					.getString(PortletProps
						.get(PortletPropsKeys.JOBPOS_NOMAL));
	public static final String USERMGT_JOBPOS_BOSS = GetterUtil
					.getString(PortletProps
						.get(PortletPropsKeys.JOBPOS_LEADER));
	public static final String USERMGT_JOBPOS_DEPUTY = GetterUtil
					.getString(PortletProps
						.get(PortletPropsKeys.JOBPOS_DEPUTY));
	

	public static final int[] USERMGT_GENDER_VALUES = GetterUtil
			.getIntegerValues(
					PortletProps
							.getArray(PortletPropsKeys.USERMGT_GENDER_VALUES),
					new int[0]);

	// User Management Validate
	public static final int USERMGT_EMPLOYEE_FULLNAME_LENGTH = GetterUtil
			.getInteger(PortletProps
					.get(PortletPropsKeys.USERMGT_EMPLOYEE_FULLNAME_LENGTH));
	public static final int USERMGT_EMPLOYEE_EMAIL_LENGTH = GetterUtil
			.getInteger(PortletProps
					.get(PortletPropsKeys.USERMGT_EMPLOYEE_EMAIL_LENGTH));
	public static final int USERMGT_EMPLOYEE_EMPLOYEENO_LENGTH = GetterUtil
			.getInteger(PortletProps
					.get(PortletPropsKeys.USERMGT_EMPLOYEE_EMPLOYEENO_LENGTH));
	public static final int USERMGT_EMPLOYEE_TELNO_LENGTH = GetterUtil
			.getInteger(PortletProps
					.get(PortletPropsKeys.USERMGT_EMPLOYEE_TELNO_LENGTH));
	public static final int USERMGT_EMPLOYEE_MOBILE_LENGTH = GetterUtil
			.getInteger(PortletProps
					.get(PortletPropsKeys.USERMGT_EMPLOYEE_MOBILE_LENGTH));
	// working unit
	
	public static final int USERMGT_WORKINGUNIT_NAME_LENGTH = GetterUtil
					.getInteger(PortletProps
							.get(PortletPropsKeys.USERMGT_WORKINGUNIT_NAME_LENGTH));
	
	public static final int USERMGT_WORKINGUNIT_ADRESS_LENGTH = GetterUtil
					.getInteger(PortletProps
							.get(PortletPropsKeys.USERMGT_WORKINGUNIT_ADRESS_LENGTH));

	public static final int USERMGT_WORKINGUNIT_FAXNO_LENGTH = GetterUtil
					.getInteger(PortletProps
							.get(PortletPropsKeys.USERMGT_WORKINGUNIT_FAXNO_LENGTH));

	public static final int USERMGT_WORKINGUNIT_EMAIL_LENGTH = GetterUtil
					.getInteger(PortletProps
							.get(PortletPropsKeys.USERMGT_WORKINGUNIT_EMAIL_LENGTH));
	
	public static final int USERMGT_WORKINGUNIT_WEBSITE_LENGTH = GetterUtil
					.getInteger(PortletProps
							.get(PortletPropsKeys.USERMGT_WORKINGUNIT_WEBSITE_LENGTH));
	
	public static final int USERMGT_WORKINGUNIT_ENNAME_LENGTH = GetterUtil
					.getInteger(PortletProps
							.get(PortletPropsKeys.USERMGT_WORKINGUNIT_ENNAME_LENGTH));
	
	//resource action
	
	public static final String USERMGT_WORKINGUNIT_RESOURCE = GetterUtil
					.getString(PortletProps
						.get(PortletPropsKeys.USERMGT_WORKINGUNIT_RESOURCE));
	public static final String USERMGT_JOBPOS_RESOURCE = GetterUtil
					.getString(PortletProps
						.get(PortletPropsKeys.USERMGT_JOBPOS_RESOURCE));
	public static final String USERMGT_EMPLOYEE_RESOURCE = GetterUtil
					.getString(PortletProps
						.get(PortletPropsKeys.USERMGT_EMPLOYEE_RESOURCE));
	
}
