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
package my.recoverypatientcore.medicalExamination.service.impl;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Required;

import my.recoverypatientcore.medicalExamination.dao.MedicalExaminationDao;
import my.recoverypatientcore.medicalExamination.service.MedicalExaminationService;
import my.recoverypatientcore.model.MedicalExaminationModel;


/**
 *
 */
public class DefaultMedicalExaminationService implements MedicalExaminationService
{
	private MedicalExaminationDao medicalExaminatonDao;

	@Override
	public List<MedicalExaminationModel> getMedicalExamination(final String examid)
	{
		final List<MedicalExaminationModel> exams = medicalExaminatonDao.findMedicalExamination(examid);
		if (CollectionUtils.isEmpty(exams))
		{
			return null;
		}
		return exams;
	}

	public MedicalExaminationDao getMedicalExaminatonDao()
	{
		return medicalExaminatonDao;
	}

	@Required
	public void setMedicalExaminatonDao(final MedicalExaminationDao medicalExaminatonDao)
	{
		this.medicalExaminatonDao = medicalExaminatonDao;
	}
}
