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
package my.recoverypatientcore.handler.impl;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;

import java.util.Date;

import my.recoverypatientcore.model.RecoveryModel;


/**
 *
 */
public class RecoveryDaysHandler implements DynamicAttributeHandler<Integer, RecoveryModel>
{

	private Integer days;
	private Date begin;
	private Date end;
	private long millisDiff;

	@Override
	public Integer get(final RecoveryModel model)
	{
		if (model.getEndDate() != null)
		{
			begin = model.getBeginDate();
			end = model.getEndDate();
			millisDiff = end.getTime() - begin.getTime();//calculates the difference in milliseconds
			days = new Integer((int) (millisDiff / 86400000));
			return days;
		}
		else
		{
			return new Integer(0);
		}
	}

	@Override
	public void set(final RecoveryModel model, final Integer days)
	{
		this.days = days;

	}

}
