/*
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package my.recoverypatientcore.setup;

import static my.recoverypatientcore.constants.RecoverypatientcoreConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.recoverypatientcore.constants.RecoverypatientcoreConstants;
import my.recoverypatientcore.service.RecoverypatientcoreService;


@SystemSetup(extension = RecoverypatientcoreConstants.EXTENSIONNAME)
public class RecoverypatientcoreSystemSetup
{
	private final RecoverypatientcoreService recoverypatientcoreService;

	public RecoverypatientcoreSystemSetup(final RecoverypatientcoreService recoverypatientcoreService)
	{
		this.recoverypatientcoreService = recoverypatientcoreService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		recoverypatientcoreService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return RecoverypatientcoreSystemSetup.class.getResourceAsStream("/recoverypatientcore/sap-hybris-platform.png");
	}
}
