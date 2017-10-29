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
package my.stagereaceuiip.stage.com.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.stageraceuiip.model.StageModel;
import my.stagereaceuiip.stage.com.dao.StageDao;


public class DefaultStageDao extends AbstractItemDao implements StageDao
{

	@Override
	public List<StageModel> findStageByname(final String name)
	{
		final String queryStr = "SELECT {PK} FROM {Stage} WHERE {stageName} = ?name ";

		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);

		fsq.addQueryParameter("name", name);

		final SearchResult<StageModel> result = getFlexibleSearchService().search(fsq);

		final List<StageModel> stages = result.getResult();

		return stages;
	}

}
