package org.gs4tr.projectdirector.adaptors.hybris.service.impl;

import de.hybris.platform.core.model.c2l.LanguageModel;

import org.apache.commons.lang.StringUtils;
import org.gs4tr.projectdirector.adaptors.hybris.model.GlobalLinkJobItemModel;
import org.gs4tr.projectdirector.adaptors.hybris.service.LocalizableItem;
import org.gs4tr.projectdirector.adaptors.hybris.service.ws.DocumentUtil;

import com.sca.pim.model.DestructionTextBlockModel;
import com.sca.pim.model.EnvInfoTextBlockModel;
import com.sca.pim.model.EnvironmentalLabelTextBlockModel;
import com.sca.pim.model.FiberTypeTextBlockModel;
import com.sca.pim.model.IncoFinderCategoryModel;
import com.sca.pim.model.IncoGlobalCategoryModel;
import com.sca.pim.model.IncoProductBenefitModel;
import com.sca.pim.model.IncoProductModel;
import com.sca.pim.model.ScaGlobalCategoryModel;
import com.sca.pim.model.ScaProductModel;
import com.sca.pim.model.TargetGroupQuestionnaireTextModel;


/**
 * @author sseibold
 * 
 */
public class ScaDocumentNameGenerator extends DefaultGlobalLinkDocumentNameGenerator
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.gs4tr.projectdirector.adaptors.hybris.service.GlobalLinkDocumentNameGenerator#getDocumentName(org.gs4tr.
	 * projectdirector.adaptors.hybris.model.GlobalLinkJobItemModel,
	 * org.gs4tr.projectdirector.adaptors.hybris.service.LocalizableItem,
	 * de.hybris.platform.core.model.c2l.LanguageModel)
	 */
	@Override
	public String getDocumentName(final GlobalLinkJobItemModel jobItem, final LocalizableItem localizableItem,
			final LanguageModel targetLanguage)
	{
		if (jobItem.getItem() instanceof IncoProductModel)
		{
			final IncoProductModel product = (IncoProductModel) jobItem.getItem();
			return getDocumentName(jobItem, product.getCode(), product.getName());
		}
		else if (jobItem.getItem() instanceof IncoProductBenefitModel)
		{
			final IncoProductBenefitModel benefit = (IncoProductBenefitModel) jobItem.getItem();
			return getDocumentName(jobItem, benefit.getCode(), benefit.getName());
		}
		else if (jobItem.getItem() instanceof IncoGlobalCategoryModel)
		{
			final IncoGlobalCategoryModel category = (IncoGlobalCategoryModel) jobItem.getItem();
			return getDocumentName(jobItem, category.getCode());
		}
		else if (jobItem.getItem() instanceof TargetGroupQuestionnaireTextModel)
		{
			final TargetGroupQuestionnaireTextModel text = (TargetGroupQuestionnaireTextModel) jobItem.getItem();
			return getDocumentName(jobItem, text.getCode());
		}
		else if (jobItem.getItem() instanceof IncoFinderCategoryModel)
		{
			final IncoFinderCategoryModel category = (IncoFinderCategoryModel) jobItem.getItem();
			return getDocumentName(jobItem, category.getCode(), category.getName());
		}
		else if (jobItem.getItem() instanceof ScaProductModel)
		{
			final ScaProductModel product = (ScaProductModel) jobItem.getItem();
			return getDocumentName(jobItem, product.getCode(), product.getName());
		}
		else if (jobItem.getItem() instanceof ScaGlobalCategoryModel)
		{
			final ScaGlobalCategoryModel category = (ScaGlobalCategoryModel) jobItem.getItem();
			return getDocumentName(jobItem, category.getCode(), category.getName());
		}
		else if (jobItem.getItem() instanceof EnvInfoTextBlockModel)
		{
			final EnvInfoTextBlockModel textBlock = (EnvInfoTextBlockModel) jobItem.getItem();
			return getDocumentName(jobItem, textBlock.getTextBlockType().name());
		}
		else if (jobItem.getItem() instanceof FiberTypeTextBlockModel)
		{
			final FiberTypeTextBlockModel textBlock = (FiberTypeTextBlockModel) jobItem.getItem();
			return getDocumentName(jobItem, textBlock.getTextBlockType().name());
		}
		else if (jobItem.getItem() instanceof EnvironmentalLabelTextBlockModel)
		{
			final EnvironmentalLabelTextBlockModel textBlock = (EnvironmentalLabelTextBlockModel) jobItem.getItem();
			return getDocumentName(jobItem, textBlock.getTextBlockType().name());
		}
		else if (jobItem.getItem() instanceof DestructionTextBlockModel)
		{
			final DestructionTextBlockModel textBlock = (DestructionTextBlockModel) jobItem.getItem();
			return getDocumentName(jobItem, textBlock.getTextBlockType().name());
		}

		// Fallback
		return super.getDocumentName(jobItem, localizableItem, targetLanguage);
	}

	/**
	 * Helper method to build the filename from all given parts
	 */
	private String getDocumentName(final GlobalLinkJobItemModel jobItem, final String... parts)
	{
		final StringBuilder sb = new StringBuilder();
		for (int i = 0; i < parts.length; i++)
		{
			if (StringUtils.isNotBlank(parts[i]))
			{
				sb.append(DocumentUtil.getSafeDocumentName(parts[i]));
				sb.append('_');
			}
		}

		// Append JobItem PK to make sure document names are unique
		sb.append(jobItem.getPk().getLongValueAsString());

		return sb.toString();
	}

}
