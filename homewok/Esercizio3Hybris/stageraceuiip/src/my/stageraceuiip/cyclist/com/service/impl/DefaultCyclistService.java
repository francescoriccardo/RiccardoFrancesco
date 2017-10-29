/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2017 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package my.stageraceuiip.cyclist.com.service.impl;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import my.stageraceuiip.cyclist.com.dao.CyclistDao;
import my.stageraceuiip.cyclist.com.service.CyclistService;
import my.stageraceuiip.model.CyclistModel;


/**
 *
 */
public class DefaultCyclistService implements CyclistService
{
	private CyclistDao cyclistDao;

	@Override
	public CyclistModel getCyclistForid(final String id)
	{
		final List<CyclistModel> cyclist = cyclistDao.findCyclistBycf(id);

		if (CollectionUtils.isEmpty(cyclist))
		{
			return null;
		}
		else if (cyclist.size() > 1)
		{
			throw new AmbiguousIdentifierException("Two cyclist were found for code fiscal " + id);
		}
		else
		{
			return cyclist.get(0);
		}
	}

	public CyclistDao getCyclistDao()
	{
		return cyclistDao;
	}

	public void setCyclistDao(final CyclistDao cyclistDao)
	{
		this.cyclistDao = cyclistDao;
	}

}
