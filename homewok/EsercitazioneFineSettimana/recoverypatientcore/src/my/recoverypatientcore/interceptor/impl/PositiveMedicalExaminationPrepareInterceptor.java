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
package my.recoverypatientcore.interceptor.impl;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.recoverypatientcore.medicalExamination.service.MedicalExaminationService;
import my.recoverypatientcore.model.MedicalExaminationModel;


public class PositiveMedicalExaminationPrepareInterceptor implements PrepareInterceptor<MedicalExaminationModel>
{

	private MedicalExaminationService medicalExaminationService;

	@Override
	public void onPrepare(final MedicalExaminationModel medicalExamination, final InterceptorContext arg1)
			throws InterceptorException
	{
		final List<MedicalExaminationModel> exams = medicalExaminationService.getMedicalExamination(medicalExamination.getId());

		for (final MedicalExaminationModel exam : exams)
		{
			exam.setResult("POSITIVE");
		}

	}

	public MedicalExaminationService getMedicalExaminationService()
	{
		return medicalExaminationService;
	}

	@Required
	public void setMedicalExaminationService(final MedicalExaminationService medicalExaminationService)
	{
		this.medicalExaminationService = medicalExaminationService;
	}

}
