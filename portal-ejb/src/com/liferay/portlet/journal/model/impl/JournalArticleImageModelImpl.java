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

package com.liferay.portlet.journal.model.impl;

import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PropsUtil;

import com.liferay.util.GetterUtil;
import com.liferay.util.XSSUtil;

import java.sql.Types;

/**
 * <a href="JournalArticleImageModelImpl.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be overwritten
 * the next time is generated.
 * </p>
 *
 * <p>
 * This class is a model that represents the <code>JournalArticleImage</code> table
 * in the database.
 * </p>
 *
 * @author Brian Wing Shun Chan
 *
 * @see com.liferay.portlet.journal.service.model.JournalArticleImage
 * @see com.liferay.portlet.journal.service.model.JournalArticleImageModel
 * @see com.liferay.portlet.journal.service.model.impl.JournalArticleImageImpl
 *
 */
public class JournalArticleImageModelImpl extends BaseModelImpl {
	public static String TABLE_NAME = "JournalArticleImage";
	public static Object[][] TABLE_COLUMNS = {
			{ "articleImageId", new Integer(Types.BIGINT) },
			{ "groupId", new Integer(Types.BIGINT) },
			{ "articleId", new Integer(Types.VARCHAR) },
			{ "version", new Integer(Types.DOUBLE) },
			{ "elName", new Integer(Types.VARCHAR) },
			{ "languageId", new Integer(Types.VARCHAR) },
			{ "tempImage", new Integer(Types.BOOLEAN) }
		};
	public static boolean XSS_ALLOW_BY_MODEL = GetterUtil.getBoolean(PropsUtil.get(
				"xss.allow.com.liferay.portlet.journal.model.JournalArticleImage"),
			XSS_ALLOW);
	public static boolean XSS_ALLOW_ARTICLEID = GetterUtil.getBoolean(PropsUtil.get(
				"xss.allow.com.liferay.portlet.journal.model.JournalArticleImage.articleId"),
			XSS_ALLOW_BY_MODEL);
	public static boolean XSS_ALLOW_ELNAME = GetterUtil.getBoolean(PropsUtil.get(
				"xss.allow.com.liferay.portlet.journal.model.JournalArticleImage.elName"),
			XSS_ALLOW_BY_MODEL);
	public static boolean XSS_ALLOW_LANGUAGEID = GetterUtil.getBoolean(PropsUtil.get(
				"xss.allow.com.liferay.portlet.journal.model.JournalArticleImage.languageId"),
			XSS_ALLOW_BY_MODEL);
	public static long LOCK_EXPIRATION_TIME = GetterUtil.getLong(PropsUtil.get(
				"lock.expiration.time.com.liferay.portlet.journal.model.JournalArticleImageModel"));

	public JournalArticleImageModelImpl() {
	}

	public long getPrimaryKey() {
		return _articleImageId;
	}

	public void setPrimaryKey(long pk) {
		setArticleImageId(pk);
	}

	public long getArticleImageId() {
		return _articleImageId;
	}

	public void setArticleImageId(long articleImageId) {
		if (articleImageId != _articleImageId) {
			_articleImageId = articleImageId;
		}
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		if (groupId != _groupId) {
			_groupId = groupId;
		}
	}

	public String getArticleId() {
		return GetterUtil.getString(_articleId);
	}

	public void setArticleId(String articleId) {
		if (((articleId == null) && (_articleId != null)) ||
				((articleId != null) && (_articleId == null)) ||
				((articleId != null) && (_articleId != null) &&
				!articleId.equals(_articleId))) {
			if (!XSS_ALLOW_ARTICLEID) {
				articleId = XSSUtil.strip(articleId);
			}

			_articleId = articleId;
		}
	}

	public double getVersion() {
		return _version;
	}

	public void setVersion(double version) {
		if (version != _version) {
			_version = version;
		}
	}

	public String getElName() {
		return GetterUtil.getString(_elName);
	}

	public void setElName(String elName) {
		if (((elName == null) && (_elName != null)) ||
				((elName != null) && (_elName == null)) ||
				((elName != null) && (_elName != null) &&
				!elName.equals(_elName))) {
			if (!XSS_ALLOW_ELNAME) {
				elName = XSSUtil.strip(elName);
			}

			_elName = elName;
		}
	}

	public String getLanguageId() {
		return GetterUtil.getString(_languageId);
	}

	public void setLanguageId(String languageId) {
		if (((languageId == null) && (_languageId != null)) ||
				((languageId != null) && (_languageId == null)) ||
				((languageId != null) && (_languageId != null) &&
				!languageId.equals(_languageId))) {
			if (!XSS_ALLOW_LANGUAGEID) {
				languageId = XSSUtil.strip(languageId);
			}

			_languageId = languageId;
		}
	}

	public boolean getTempImage() {
		return _tempImage;
	}

	public boolean isTempImage() {
		return _tempImage;
	}

	public void setTempImage(boolean tempImage) {
		if (tempImage != _tempImage) {
			_tempImage = tempImage;
		}
	}

	public Object clone() {
		JournalArticleImageImpl clone = new JournalArticleImageImpl();
		clone.setArticleImageId(getArticleImageId());
		clone.setGroupId(getGroupId());
		clone.setArticleId(getArticleId());
		clone.setVersion(getVersion());
		clone.setElName(getElName());
		clone.setLanguageId(getLanguageId());
		clone.setTempImage(getTempImage());

		return clone;
	}

	public int compareTo(Object obj) {
		if (obj == null) {
			return -1;
		}

		JournalArticleImageImpl journalArticleImage = (JournalArticleImageImpl)obj;
		long pk = journalArticleImage.getPrimaryKey();

		if (getPrimaryKey() < pk) {
			return -1;
		}
		else if (getPrimaryKey() > pk) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		JournalArticleImageImpl journalArticleImage = null;

		try {
			journalArticleImage = (JournalArticleImageImpl)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = journalArticleImage.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	private long _articleImageId;
	private long _groupId;
	private String _articleId;
	private double _version;
	private String _elName;
	private String _languageId;
	private boolean _tempImage;
}