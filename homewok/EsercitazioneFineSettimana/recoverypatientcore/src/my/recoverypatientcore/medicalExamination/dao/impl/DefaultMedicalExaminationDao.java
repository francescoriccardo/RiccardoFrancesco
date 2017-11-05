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
package my.recoverypatientcore.medicalExamination.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.recoverypatientcore.medicalExamination.dao.MedicalExaminationDao;
import my.recoverypatientcore.model.MedicalExaminationModel;


public class DefaultMedicalExaminationDao extends AbstractItemDao implements MedicalExaminationDao
{

	@Override
	public List<MedicalExaminationModel> findMedicalExamination(final String examid)
	{
		final String queryStr = "SELECT {m.PK} FROM {MedicalExamination as m} WHERE {m.id} = ?examid ";

		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);

		fsq.addQueryParameter("examid", examid);

		final SearchResult<MedicalExaminationModel> result = getFlexibleSearchService().search(fsq);

		final List<MedicalExaminationModel> exams = result.getResult();

		return exams;
	}

}
