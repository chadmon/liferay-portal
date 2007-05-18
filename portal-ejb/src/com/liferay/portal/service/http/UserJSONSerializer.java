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

package com.liferay.portal.service.http;

import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.User;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Date;
import java.util.List;

/**
 * <a href="UserJSONSerializer.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be overwritten
 * the next time is generated.
 * </p>
 *
 * <p>
 * This class is used by <code>com.liferay.portal.service.http.UserServiceJSON</code>
 * to translate objects.
 * </p>
 *
 * @author Brian Wing Shun Chan
 *
 * @see com.liferay.portal.service.http.UserServiceJSON
 *
 */
public class UserJSONSerializer {
	public static JSONObject toJSONObject(User model) {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("userId", model.getUserId());
		jsonObj.put("companyId", model.getCompanyId());

		Date createDate = model.getCreateDate();

		if (createDate == null) {
			jsonObj.put("createDate", StringPool.BLANK);
		}
		else {
			jsonObj.put("createDate", createDate.toString());
		}

		Date modifiedDate = model.getModifiedDate();

		if (modifiedDate == null) {
			jsonObj.put("modifiedDate", StringPool.BLANK);
		}
		else {
			jsonObj.put("modifiedDate", modifiedDate.toString());
		}

		jsonObj.put("defaultUser", model.isDefaultUser());
		jsonObj.put("contactId", model.getContactId());

		String password = model.getPassword();

		if (password == null) {
			jsonObj.put("password", StringPool.BLANK);
		}
		else {
			jsonObj.put("password", password.toString());
		}

		jsonObj.put("passwordEncrypted", model.isPasswordEncrypted());

		Date passwordExpirationDate = model.getPasswordExpirationDate();

		if (passwordExpirationDate == null) {
			jsonObj.put("passwordExpirationDate", StringPool.BLANK);
		}
		else {
			jsonObj.put("passwordExpirationDate",
				passwordExpirationDate.toString());
		}

		jsonObj.put("passwordReset", model.isPasswordReset());

		Date passwordModifiedDate = model.getPasswordModifiedDate();

		if (passwordModifiedDate == null) {
			jsonObj.put("passwordModifiedDate", StringPool.BLANK);
		}
		else {
			jsonObj.put("passwordModifiedDate", passwordModifiedDate.toString());
		}

		jsonObj.put("graceLoginCount", model.getGraceLoginCount());

		String screenName = model.getScreenName();

		if (screenName == null) {
			jsonObj.put("screenName", StringPool.BLANK);
		}
		else {
			jsonObj.put("screenName", screenName.toString());
		}

		String emailAddress = model.getEmailAddress();

		if (emailAddress == null) {
			jsonObj.put("emailAddress", StringPool.BLANK);
		}
		else {
			jsonObj.put("emailAddress", emailAddress.toString());
		}

		jsonObj.put("portraitId", model.getPortraitId());

		String languageId = model.getLanguageId();

		if (languageId == null) {
			jsonObj.put("languageId", StringPool.BLANK);
		}
		else {
			jsonObj.put("languageId", languageId.toString());
		}

		String timeZoneId = model.getTimeZoneId();

		if (timeZoneId == null) {
			jsonObj.put("timeZoneId", StringPool.BLANK);
		}
		else {
			jsonObj.put("timeZoneId", timeZoneId.toString());
		}

		String greeting = model.getGreeting();

		if (greeting == null) {
			jsonObj.put("greeting", StringPool.BLANK);
		}
		else {
			jsonObj.put("greeting", greeting.toString());
		}

		String comments = model.getComments();

		if (comments == null) {
			jsonObj.put("comments", StringPool.BLANK);
		}
		else {
			jsonObj.put("comments", comments.toString());
		}

		Date loginDate = model.getLoginDate();

		if (loginDate == null) {
			jsonObj.put("loginDate", StringPool.BLANK);
		}
		else {
			jsonObj.put("loginDate", loginDate.toString());
		}

		String loginIP = model.getLoginIP();

		if (loginIP == null) {
			jsonObj.put("loginIP", StringPool.BLANK);
		}
		else {
			jsonObj.put("loginIP", loginIP.toString());
		}

		Date lastLoginDate = model.getLastLoginDate();

		if (lastLoginDate == null) {
			jsonObj.put("lastLoginDate", StringPool.BLANK);
		}
		else {
			jsonObj.put("lastLoginDate", lastLoginDate.toString());
		}

		String lastLoginIP = model.getLastLoginIP();

		if (lastLoginIP == null) {
			jsonObj.put("lastLoginIP", StringPool.BLANK);
		}
		else {
			jsonObj.put("lastLoginIP", lastLoginIP.toString());
		}

		Date lastFailedLoginDate = model.getLastFailedLoginDate();

		if (lastFailedLoginDate == null) {
			jsonObj.put("lastFailedLoginDate", StringPool.BLANK);
		}
		else {
			jsonObj.put("lastFailedLoginDate", lastFailedLoginDate.toString());
		}

		jsonObj.put("failedLoginAttempts", model.getFailedLoginAttempts());
		jsonObj.put("lockout", model.isLockout());

		Date lockoutDate = model.getLockoutDate();

		if (lockoutDate == null) {
			jsonObj.put("lockoutDate", StringPool.BLANK);
		}
		else {
			jsonObj.put("lockoutDate", lockoutDate.toString());
		}

		jsonObj.put("agreedToTermsOfUse", model.isAgreedToTermsOfUse());
		jsonObj.put("active", model.isActive());

		return jsonObj;
	}

	public static JSONArray toJSONArray(List models) {
		JSONArray jsonArray = new JSONArray();

		for (int i = 0; i < models.size(); i++) {
			User model = (User)models.get(i);
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}
}