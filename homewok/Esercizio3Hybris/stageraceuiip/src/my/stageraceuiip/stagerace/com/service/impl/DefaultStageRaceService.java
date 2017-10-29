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
package my.stageraceuiip.stagerace.com.service.impl;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import my.stageraceuiip.model.StageRaceModel;
import my.stageraceuiip.stagerace.com.dao.StageRaceDao;
import my.stageraceuiip.stagerace.com.service.StageRaceService;


public class DefaultStageRaceService implements StageRaceService
{
	private StageRaceDao stageraceDao;

	@Override
	public StageRaceModel getStageraceForid(final String id)
	{
		final List<StageRaceModel> stagerace = stageraceDao.findStageRaceByid(id);

		if (CollectionUtils.isEmpty(stagerace))
		{
			return null;
		}
		else if (stagerace.size() > 1)
		{
			throw new AmbiguousIdentifierException("Two stagerace were found for id " + id);
		}
		else
		{
			return stagerace.get(0);
		}
	}

	public StageRaceDao getStageraceDao()
	{
		return stageraceDao;
	}

	public void setStageraceDao(final StageRaceDao stageraceDao)
	{
		this.stageraceDao = stageraceDao;
	}

}
