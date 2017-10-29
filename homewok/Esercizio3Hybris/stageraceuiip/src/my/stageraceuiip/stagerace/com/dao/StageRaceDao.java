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
package my.stageraceuiip.stagerace.com.dao;

import java.util.List;

import my.stageraceuiip.model.StageRaceModel;


public interface StageRaceDao
{
	public List<StageRaceModel> findStageRaceByid(String idStageRace);
}
