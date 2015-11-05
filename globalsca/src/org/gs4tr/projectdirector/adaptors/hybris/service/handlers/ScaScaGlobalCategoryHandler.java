package org.gs4tr.projectdirector.adaptors.hybris.service.handlers;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.type.AttributeDescriptorModel;
import de.hybris.platform.mam.model.CelumAssetModel;

import com.sca.pim.model.ScaGlobalCategoryModel;


/**
 * @author sseibold
 * 
 */
public class ScaScaGlobalCategoryHandler extends CategoryHandler
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.gs4tr.projectdirector.adaptors.hybris.service.handlers.ProductHandler#getSupportedModelClass()
	 */
	@Override
	protected Class<? extends ItemModel> getSupportedModelClass()
	{
		return ScaGlobalCategoryModel.class;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.gs4tr.projectdirector.adaptors.hybris.service.handlers.ProductHandler#holdsLocalizableChild(de.hybris.platform
	 * .core.model.type.AttributeDescriptorModel)
	 */
	@Override
	protected boolean holdsLocalizableChild(final AttributeDescriptorModel attribute)
	{
		if (attribute.getQualifier().equals(ScaGlobalCategoryModel.ICON))
		{
			return true;
		}

		return super.holdsLocalizableChild(attribute);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.gs4tr.projectdirector.adaptors.hybris.service.handlers.ProductHandler#getChildValue(de.hybris.platform.core
	 * .model.ItemModel, de.hybris.platform.core.model.type.AttributeDescriptorModel)
	 */
	@Override
	protected Object getChildValue(final ItemModel item, final AttributeDescriptorModel attribute)
	{
		if (attribute.getQualifier().equals(ScaGlobalCategoryModel.ICON))
		{
			return getIcon((ScaGlobalCategoryModel) item);
		}

		return super.getChildValue(item, attribute);
	}

	private CelumAssetModel getIcon(final ScaGlobalCategoryModel scaGlobalCategory)
	{
		return scaGlobalCategory.getIcon();
	}

}
