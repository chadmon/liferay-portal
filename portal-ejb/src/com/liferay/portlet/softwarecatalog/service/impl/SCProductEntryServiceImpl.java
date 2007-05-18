/**
 * Copyright (c) 2000-2007 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portlet.softwarecatalog.service.impl;

import com.liferay.portal.PortalException;
import com.liferay.portal.SystemException;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.service.impl.PrincipalBean;
import com.liferay.portal.service.permission.PortletPermission;
import com.liferay.portal.util.PortletKeys;
import com.liferay.portlet.softwarecatalog.model.SCProductEntry;
import com.liferay.portlet.softwarecatalog.service.SCProductEntryLocalServiceUtil;
import com.liferay.portlet.softwarecatalog.service.SCProductEntryService;
import com.liferay.portlet.softwarecatalog.service.permission.SCProductEntryPermission;

/**
 * <a href="SCProductEntryServiceImpl.java.html"><b><i>View Source</i></b></a>
 *
 * @author Jorge Ferrer
 * @author Brian Wing Shun Chan
 *
 */
public class SCProductEntryServiceImpl extends PrincipalBean
	implements SCProductEntryService {

	public SCProductEntry addProductEntry(
			long plid, String name, String type, String shortDescription,
			String longDescription, String pageURL, String repoGroupId,
			String repoArtifactId, long[] licenseIds,
			boolean addCommunityPermissions, boolean addGuestPermissions)
		throws PortalException, SystemException {

		PortletPermission.check(
			getPermissionChecker(), plid, PortletKeys.SOFTWARE_CATALOG,
			ActionKeys.ADD_PRODUCT_ENTRY);

		return SCProductEntryLocalServiceUtil.addProductEntry(
			getUserId(), plid, name, type, shortDescription, longDescription,
			pageURL, repoGroupId, repoArtifactId, licenseIds,
			addCommunityPermissions, addGuestPermissions);
	}

	public SCProductEntry addProductEntry(
			long plid, String name, String type, String shortDescription,
			String longDescription, String pageURL, String repoGroupId,
			String repoArtifactId, long[] licenseIds,
			String[] communityPermissions, String[] guestPermissions)
		throws PortalException, SystemException {

		PortletPermission.check(
			getPermissionChecker(), plid, PortletKeys.SOFTWARE_CATALOG,
			ActionKeys.ADD_PRODUCT_ENTRY);

		return SCProductEntryLocalServiceUtil.addProductEntry(
			getUserId(), plid, name, type, shortDescription, longDescription,
			pageURL, repoGroupId, repoArtifactId, licenseIds,
			communityPermissions, guestPermissions);
	}

	public void deleteProductEntry(long productEntryId)
		throws PortalException, SystemException {

		SCProductEntryPermission.check(
			getPermissionChecker(), productEntryId, ActionKeys.DELETE);

		SCProductEntryLocalServiceUtil.deleteProductEntry(productEntryId);
	}

	public SCProductEntry getProductEntry(long productEntryId)
		throws PortalException, SystemException {

		SCProductEntryPermission.check(
			getPermissionChecker(), productEntryId, ActionKeys.VIEW);

		return SCProductEntryLocalServiceUtil.getProductEntry(productEntryId);
	}

	public SCProductEntry updateProductEntry(
			long productEntryId, String name, String type,
			String shortDescription, String longDescription, String pageURL,
			String repoGroupId, String repoArtifactId, long[] licenseIds)
		throws PortalException, SystemException {

		SCProductEntryPermission.check(
			getPermissionChecker(), productEntryId, ActionKeys.UPDATE);

		return SCProductEntryLocalServiceUtil.updateProductEntry(
			productEntryId, name, type, shortDescription, longDescription,
			pageURL, repoGroupId, repoArtifactId, licenseIds);
	}

}