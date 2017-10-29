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
package my.stageraceuiip.interceptor.com.imp;

import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import my.stageraceuiip.model.StageModel;


public class MyInitInterception implements InitDefaultsInterceptor<StageModel>
{

	@Override
	public void onInitDefaults(final StageModel stage, final InterceptorContext ctx) throws InterceptorException
	{
		final Date someDate = new Date();
		final Date daybefore = new Date(someDate.getTime() - TimeUnit.DAYS.toMillis(1));
		stage.setDate(daybefore);
	}

}
