package org.gs4tr.projectdirector.adaptors.hybris.service.voting;

import de.hybris.platform.core.model.ItemModel;

import com.sca.pim.model.IncoGlobalCategoryModel;


/**
 * @author sseibold
 * 
 */
public class ScaIncoGlobalCategoryLocalizabilityVoter extends AbstractLocalizabilityVoter
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
		if (!(item instanceof IncoGlobalCategoryModel))
		{
			return Vote.ABSTAIN;
		}

		final IncoGlobalCategoryModel category = (IncoGlobalCategoryModel) item;

		switch (category.getApprovalStatus())
		{
			case UNAPPROVED:
			case REMOVED:
				return Vote.NOT_LOCALIZABLE;
			default:
				return Vote.LOCALIZABLE;
		}
	}
}
