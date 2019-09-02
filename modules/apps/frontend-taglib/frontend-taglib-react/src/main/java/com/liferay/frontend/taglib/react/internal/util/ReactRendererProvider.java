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

package com.liferay.frontend.taglib.react.internal.util;

import com.liferay.portal.template.react.renderer.ReactRenderer;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Chema Balsas
 */
@Component(service = {})
public class ReactRendererProvider {

	public static ReactRenderer getReactRenderer() {
		if (_reactRendererProvider == null) {
			return null;
		}

		return _reactRendererProvider._reactRenderer;
	}

	public ReactRendererProvider() {
		_reactRendererProvider = this;
	}

	private static ReactRendererProvider _reactRendererProvider;

	@Reference
	private ReactRenderer _reactRenderer;

}