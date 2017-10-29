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
package my.stageraceuiip.stagerace.com.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.stageraceuiip.model.StageRaceModel;
import my.stageraceuiip.stagerace.com.dao.StageRaceDao;


public class DefaultStageRaceDao extends AbstractItemDao implements StageRaceDao
{

	@Override
	public List<StageRaceModel> findStageRaceByid(final String idStageRace)
	{
		final String queryStr = "SELECT {PK} FROM {StageRace} WHERE {idStageRace} = ?idStageRace ";

		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);

		fsq.addQueryParameter("idStageRace", idStageRace);

		final SearchResult<StageRaceModel> result = getFlexibleSearchService().search(fsq);

		final List<StageRaceModel> stagesrace = result.getResult();

		return stagesrace;
	}

}
