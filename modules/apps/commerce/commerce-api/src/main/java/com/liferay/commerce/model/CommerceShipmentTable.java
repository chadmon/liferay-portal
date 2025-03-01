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

package com.liferay.commerce.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Clob;
import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;CommerceShipment&quot; database table.
 *
 * @author Alessio Antonio Rendina
 * @see CommerceShipment
 * @generated
 */
public class CommerceShipmentTable extends BaseTable<CommerceShipmentTable> {

	public static final CommerceShipmentTable INSTANCE =
		new CommerceShipmentTable();

	public final Column<CommerceShipmentTable, Long> mvccVersion = createColumn(
		"mvccVersion", Long.class, Types.BIGINT, Column.FLAG_NULLITY);
	public final Column<CommerceShipmentTable, Long> commerceShipmentId =
		createColumn(
			"commerceShipmentId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CommerceShipmentTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CommerceShipmentTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CommerceShipmentTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CommerceShipmentTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CommerceShipmentTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CommerceShipmentTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CommerceShipmentTable, Long> commerceAccountId =
		createColumn(
			"commerceAccountId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CommerceShipmentTable, Long> commerceAddressId =
		createColumn(
			"commerceAddressId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CommerceShipmentTable, Long> commerceShippingMethodId =
		createColumn(
			"commerceShippingMethodId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<CommerceShipmentTable, Clob> shippingOptionName =
		createColumn(
			"shippingOptionName", Clob.class, Types.CLOB, Column.FLAG_DEFAULT);
	public final Column<CommerceShipmentTable, String> carrier = createColumn(
		"carrier", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CommerceShipmentTable, String> trackingNumber =
		createColumn(
			"trackingNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CommerceShipmentTable, Date> shippingDate =
		createColumn(
			"shippingDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CommerceShipmentTable, Date> expectedDate =
		createColumn(
			"expectedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CommerceShipmentTable, Integer> status = createColumn(
		"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);

	private CommerceShipmentTable() {
		super("CommerceShipment", CommerceShipmentTable::new);
	}

}