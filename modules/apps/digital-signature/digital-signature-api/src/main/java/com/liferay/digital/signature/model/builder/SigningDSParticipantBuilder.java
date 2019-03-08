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

package com.liferay.digital.signature.model.builder;

import aQute.bnd.annotation.ProviderType;

import com.liferay.digital.signature.model.field.DSField;

import java.util.Collection;

/**
 * @author Michael C. Han
 */
@ProviderType
public interface SigningDSParticipantBuilder {

	public <S extends DSParticipantBuilder> S addDSField(DSField<?> dsField);

	public <S extends DSParticipantBuilder> S addDSFields(
		Collection<DSField<?>> dsFields);

	public <S extends DSParticipantBuilder> S addDSFields(DSField<?>... dsFields);

	public <S extends DSParticipantBuilder> S setAutoNavigation(
		Boolean autoNavigation);

	public <S extends DSParticipantBuilder> S setDefaultParticipant(
		Boolean defaultParticipant);

	public <S extends DSParticipantBuilder> S setSignatureInfo(
		String signatureFont, String signatureInitials, String signatureName);

	public <S extends DSParticipantBuilder> S setSignInEachLocation(
		Boolean signInEachLocation);

}