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
package my.stageraceuiip.stageranking.com.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.stageraceuiip.model.StageRanKingModel;
import my.stageraceuiip.stageranking.com.dao.StageRanKingDao;


public class DefaultStageRanKingDao extends AbstractItemDao implements StageRanKingDao
{

	@Override
	public List<StageRanKingModel> findStageRanKingByid(final String id)
	{
		final String queryStr = "SELECT {PK} FROM {StageRanKing} WHERE {id} = ?id ";

		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);

		fsq.addQueryParameter("id", id);

		final SearchResult<StageRanKingModel> result = getFlexibleSearchService().search(fsq);

		final List<StageRanKingModel> stagesranking = result.getResult();

		return stagesranking;
	}

}
