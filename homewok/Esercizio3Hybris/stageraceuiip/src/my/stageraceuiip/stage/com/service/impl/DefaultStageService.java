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
package my.stageraceuiip.stage.com.service.impl;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import my.stageraceuiip.model.StageModel;
import my.stageraceuiip.stage.com.service.StageService;
import my.stagereaceuiip.stage.com.dao.StageDao;


public class DefaultStageService implements StageService
{
	private StageDao stageDao;

	@Override
	public StageModel getStageForname(final String name)
	{
		final List<StageModel> stage = stageDao.findStageByname(name);

		if (CollectionUtils.isEmpty(stage))
		{
			return null;
		}
		else if (stage.size() > 1)
		{
			throw new AmbiguousIdentifierException("Two stage were found for name " + name);
		}
		else
		{
			return stage.get(0);
		}
	}

	public StageDao getStageDao()
	{
		return stageDao;
	}

	public void setStageDao(final StageDao stageDao)
	{
		this.stageDao = stageDao;
	}

}
