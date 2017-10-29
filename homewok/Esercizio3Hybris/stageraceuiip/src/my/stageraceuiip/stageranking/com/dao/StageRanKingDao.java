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
package my.stageraceuiip.stageranking.com.dao;

import java.util.List;

import my.stageraceuiip.model.StageRanKingModel;


public interface StageRanKingDao
{
	public List<StageRanKingModel> findStageRanKingByid(String id);
}
