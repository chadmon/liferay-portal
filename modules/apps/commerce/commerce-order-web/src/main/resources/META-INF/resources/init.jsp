<%--
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/clay" prefix="clay" %><%@
taglib uri="http://liferay.com/tld/commerce-ui" prefix="commerce-ui" %><%@
taglib uri="http://liferay.com/tld/expando" prefix="liferay-expando" %><%@
taglib uri="http://liferay.com/tld/frontend" prefix="liferay-frontend" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="com.liferay.commerce.constants.CommerceOrderPaymentConstants" %><%@
page import="com.liferay.commerce.constants.CommerceShipmentDataSetConstants" %><%@
page import="com.liferay.commerce.currency.model.CommerceCurrency" %><%@
page import="com.liferay.commerce.exception.CommerceOrderBillingAddressException" %><%@
page import="com.liferay.commerce.exception.CommerceOrderItemRequestedDeliveryDateException" %><%@
page import="com.liferay.commerce.exception.CommerceOrderNoteContentException" %><%@
page import="com.liferay.commerce.exception.CommerceOrderPaymentMethodException" %><%@
page import="com.liferay.commerce.exception.CommerceOrderPurchaseOrderNumberException" %><%@
page import="com.liferay.commerce.exception.CommerceOrderRequestedDeliveryDateException" %><%@
page import="com.liferay.commerce.exception.CommerceOrderShippingAddressException" %><%@
page import="com.liferay.commerce.exception.CommerceOrderShippingMethodException" %><%@
page import="com.liferay.commerce.exception.CommerceOrderStatusException" %><%@
page import="com.liferay.commerce.exception.CommerceOrderTypeExpirationDateException" %><%@
page import="com.liferay.commerce.exception.CommerceOrderValidatorException" %><%@
page import="com.liferay.commerce.exception.NoSuchOrderException" %><%@
page import="com.liferay.commerce.exception.NoSuchOrderNoteException" %><%@
page import="com.liferay.commerce.model.CommerceAddress" %><%@
page import="com.liferay.commerce.model.CommerceOrder" %><%@
page import="com.liferay.commerce.model.CommerceOrderItem" %><%@
page import="com.liferay.commerce.model.CommerceOrderNote" %><%@
page import="com.liferay.commerce.model.CommerceOrderType" %><%@
page import="com.liferay.commerce.model.CommerceShipment" %><%@
page import="com.liferay.commerce.notification.model.CommerceNotificationQueueEntry" %><%@
page import="com.liferay.commerce.order.CommerceOrderValidatorResult" %><%@
page import="com.liferay.commerce.order.web.internal.display.context.CommerceOrderEditDisplayContext" %><%@
page import="com.liferay.commerce.order.web.internal.display.context.CommerceOrderListDisplayContext" %><%@
page import="com.liferay.commerce.order.web.internal.display.context.CommerceOrderNoteEditDisplayContext" %><%@
page import="com.liferay.commerce.order.web.internal.display.context.CommerceOrderTypeDisplayContext" %><%@
page import="com.liferay.commerce.order.web.internal.display.context.CommerceOrderTypeQualifiersDisplayContext" %><%@
page import="com.liferay.commerce.order.web.internal.frontend.constants.CommerceOrderDataSetConstants" %><%@
page import="com.liferay.commerce.order.web.internal.security.permission.resource.CommerceOrderPermission" %><%@
page import="com.liferay.commerce.order.web.internal.servlet.taglib.ui.constants.CommerceOrderScreenNavigationConstants" %><%@
page import="com.liferay.commerce.order.web.internal.servlet.taglib.ui.constants.CommerceOrderTypeScreenNavigationConstants" %><%@
page import="com.liferay.commerce.product.model.CPMeasurementUnit" %><%@
page import="com.liferay.petra.string.StringBundler" %><%@
page import="com.liferay.petra.string.StringPool" %><%@
page import="com.liferay.portal.kernel.bean.BeanParamUtil" %><%@
page import="com.liferay.portal.kernel.dao.search.ResultRow" %><%@
page import="com.liferay.portal.kernel.language.LanguageUtil" %><%@
page import="com.liferay.portal.kernel.model.User" %><%@
page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %><%@
page import="com.liferay.portal.kernel.security.permission.ActionKeys" %><%@
page import="com.liferay.portal.kernel.util.CalendarFactoryUtil" %><%@
page import="com.liferay.portal.kernel.util.Constants" %><%@
page import="com.liferay.portal.kernel.util.FastDateFormatFactoryUtil" %><%@
page import="com.liferay.portal.kernel.util.HashMapBuilder" %><%@
page import="com.liferay.portal.kernel.util.HtmlUtil" %><%@
page import="com.liferay.portal.kernel.util.ParamUtil" %><%@
page import="com.liferay.portal.kernel.util.Validator" %><%@
page import="com.liferay.portal.kernel.util.WebKeys" %><%@
page import="com.liferay.portal.kernel.workflow.WorkflowConstants" %>

<%@ page import="java.text.Format" %>

<%@ page import="java.util.Calendar" %><%@
page import="java.util.Collections" %><%@
page import="java.util.Date" %><%@
page import="java.util.Objects" %>

<%@ page import="javax.portlet.PortletURL" %>

<liferay-frontend:defineObjects />

<liferay-theme:defineObjects />

<portlet:defineObjects />

<%
String redirect = ParamUtil.getString(request, "redirect");
%>