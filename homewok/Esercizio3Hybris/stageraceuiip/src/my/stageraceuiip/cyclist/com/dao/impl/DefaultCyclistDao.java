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
package my.stageraceuiip.cyclist.com.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.stageraceuiip.cyclist.com.dao.CyclistDao;
import my.stageraceuiip.model.CyclistModel;



public class DefaultCyclistDao extends AbstractItemDao implements CyclistDao
{

	@Override
	public List<CyclistModel> findCyclistBycf(final String cf)
	{
		final String queryStr = "SELECT {PK} FROM {Cyclist} WHERE {cf} = ?cf ";

		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);

		fsq.addQueryParameter("cf", cf);

		final SearchResult<CyclistModel> result = getFlexibleSearchService().search(fsq);

		final List<CyclistModel> cyclists = result.getResult();

		return cyclists;

	}

}
