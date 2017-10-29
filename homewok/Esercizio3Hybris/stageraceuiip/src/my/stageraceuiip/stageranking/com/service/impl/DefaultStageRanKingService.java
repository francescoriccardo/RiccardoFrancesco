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
package my.stageraceuiip.stageranking.com.service.impl;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import my.stageraceuiip.model.StageRanKingModel;
import my.stageraceuiip.stageranking.com.dao.StageRanKingDao;
import my.stageraceuiip.stageranking.com.service.StageRanKingService;


public class DefaultStageRanKingService implements StageRanKingService
{
	private StageRanKingDao stagerankingDao;

	@Override
	public StageRanKingModel getStageRanKingByid(final String id)
	{
		final List<StageRanKingModel> stageranking = stagerankingDao.findStageRanKingByid(id);

		if (CollectionUtils.isEmpty(stageranking))
		{
			return null;
		}
		else if (stageranking.size() > 1)
		{
			throw new AmbiguousIdentifierException("Two stageranking were found for id " + id);
		}
		else
		{
			return stageranking.get(0);
		}
	}

	public StageRanKingDao getStagerankingDao()
	{
		return stagerankingDao;
	}

	public void setStagerankingDao(final StageRanKingDao stagerankingDao)
	{
		this.stagerankingDao = stagerankingDao;
	}

}
