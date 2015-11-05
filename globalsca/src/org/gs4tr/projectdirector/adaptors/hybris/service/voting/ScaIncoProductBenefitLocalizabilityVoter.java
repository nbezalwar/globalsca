package org.gs4tr.projectdirector.adaptors.hybris.service.voting;

import de.hybris.platform.core.model.ItemModel;

import com.sca.pim.model.IncoProductBenefitModel;


/**
 * @author sseibold
 * 
 */
public class ScaIncoProductBenefitLocalizabilityVoter extends AbstractLocalizabilityVoter
{
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.gs4tr.projectdirector.adaptors.hybris.service.LocalizabilityVoter#isLocalizable(de.hybris.platform.core.model
	 * .ItemModel)
	 */
	@Override
	public Vote isLocalizable(final ItemModel item)
	{
		// We only vote for Products
		if (!(item instanceof IncoProductBenefitModel))
		{
			return Vote.ABSTAIN;
		}

		final IncoProductBenefitModel benefit = (IncoProductBenefitModel) item;

		switch (benefit.getApprovalStatus())
		{
			case UNAPPROVED:
			case REMOVED:
				return Vote.NOT_LOCALIZABLE;
			default:
				return Vote.LOCALIZABLE;
		}
	}
}
