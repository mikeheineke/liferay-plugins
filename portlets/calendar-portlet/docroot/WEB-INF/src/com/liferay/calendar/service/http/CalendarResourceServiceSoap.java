/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.calendar.service.http;

import com.liferay.calendar.service.CalendarResourceServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;

import java.rmi.RemoteException;

import java.util.Locale;
import java.util.Map;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.liferay.calendar.service.CalendarResourceServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.liferay.calendar.model.CalendarResourceSoap}.
 * If the method in the service utility returns a
 * {@link com.liferay.calendar.model.CalendarResource}, that is translated to a
 * {@link com.liferay.calendar.model.CalendarResourceSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author    Eduardo Lundgren
 * @see       CalendarResourceServiceHttp
 * @see       com.liferay.calendar.model.CalendarResourceSoap
 * @see       com.liferay.calendar.service.CalendarResourceServiceUtil
 * @generated
 */
public class CalendarResourceServiceSoap {
	public static com.liferay.calendar.model.CalendarResourceSoap addCalendarResource(
		long groupId, java.lang.String className, long classPK,
		java.lang.String classUuid, java.lang.String code,
		java.lang.String[] nameMapLanguageIds,
		java.lang.String[] nameMapValues,
		java.lang.String[] descriptionMapLanguageIds,
		java.lang.String[] descriptionMapValues, java.lang.String type,
		boolean active, com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			Map<Locale, String> nameMap = LocalizationUtil.getLocalizationMap(nameMapLanguageIds,
					nameMapValues);
			Map<Locale, String> descriptionMap = LocalizationUtil.getLocalizationMap(descriptionMapLanguageIds,
					descriptionMapValues);

			com.liferay.calendar.model.CalendarResource returnValue = CalendarResourceServiceUtil.addCalendarResource(groupId,
					className, classPK, classUuid, code, nameMap,
					descriptionMap, type, active, serviceContext);

			return com.liferay.calendar.model.CalendarResourceSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.calendar.model.CalendarResourceSoap deleteCalendarResource(
		long calendarResourceId) throws RemoteException {
		try {
			com.liferay.calendar.model.CalendarResource returnValue = CalendarResourceServiceUtil.deleteCalendarResource(calendarResourceId);

			return com.liferay.calendar.model.CalendarResourceSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.calendar.model.CalendarResourceSoap fetchCalendarResource(
		long classNameId, long classPK) throws RemoteException {
		try {
			com.liferay.calendar.model.CalendarResource returnValue = CalendarResourceServiceUtil.fetchCalendarResource(classNameId,
					classPK);

			return com.liferay.calendar.model.CalendarResourceSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.calendar.model.CalendarResourceSoap getCalendarResource(
		long calendarResourceId) throws RemoteException {
		try {
			com.liferay.calendar.model.CalendarResource returnValue = CalendarResourceServiceUtil.getCalendarResource(calendarResourceId);

			return com.liferay.calendar.model.CalendarResourceSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.calendar.model.CalendarResourceSoap[] search(
		long companyId, long[] groupIds, long[] classNameIds,
		java.lang.String keywords, boolean active, boolean andOperator,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws RemoteException {
		try {
			java.util.List<com.liferay.calendar.model.CalendarResource> returnValue =
				CalendarResourceServiceUtil.search(companyId, groupIds,
					classNameIds, keywords, active, andOperator, start, end,
					orderByComparator);

			return com.liferay.calendar.model.CalendarResourceSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.calendar.model.CalendarResourceSoap[] search(
		long companyId, long[] groupIds, long[] classNameIds,
		java.lang.String code, java.lang.String name,
		java.lang.String description, java.lang.String type, boolean active,
		boolean andOperator, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws RemoteException {
		try {
			java.util.List<com.liferay.calendar.model.CalendarResource> returnValue =
				CalendarResourceServiceUtil.search(companyId, groupIds,
					classNameIds, code, name, description, type, active,
					andOperator, start, end, orderByComparator);

			return com.liferay.calendar.model.CalendarResourceSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int searchCount(long companyId, long[] groupIds,
		long[] classNameIds, java.lang.String keywords, boolean active)
		throws RemoteException {
		try {
			int returnValue = CalendarResourceServiceUtil.searchCount(companyId,
					groupIds, classNameIds, keywords, active);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int searchCount(long companyId, long[] groupIds,
		long[] classNameIds, java.lang.String code, java.lang.String name,
		java.lang.String description, java.lang.String type, boolean active,
		boolean andOperator) throws RemoteException {
		try {
			int returnValue = CalendarResourceServiceUtil.searchCount(companyId,
					groupIds, classNameIds, code, name, description, type,
					active, andOperator);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.calendar.model.CalendarResourceSoap updateCalendarResource(
		long calendarResourceId, java.lang.String[] nameMapLanguageIds,
		java.lang.String[] nameMapValues,
		java.lang.String[] descriptionMapLanguageIds,
		java.lang.String[] descriptionMapValues, java.lang.String type,
		boolean active, com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			Map<Locale, String> nameMap = LocalizationUtil.getLocalizationMap(nameMapLanguageIds,
					nameMapValues);
			Map<Locale, String> descriptionMap = LocalizationUtil.getLocalizationMap(descriptionMapLanguageIds,
					descriptionMapValues);

			com.liferay.calendar.model.CalendarResource returnValue = CalendarResourceServiceUtil.updateCalendarResource(calendarResourceId,
					nameMap, descriptionMap, type, active, serviceContext);

			return com.liferay.calendar.model.CalendarResourceSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(CalendarResourceServiceSoap.class);
}