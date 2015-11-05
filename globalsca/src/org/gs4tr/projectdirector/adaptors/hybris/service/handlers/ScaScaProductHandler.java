package org.gs4tr.projectdirector.adaptors.hybris.service.handlers;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.type.AttributeDescriptorModel;
import de.hybris.platform.mam.model.CelumAssetModel;

import com.sca.pim.model.ScaProductModel;


/**
 * @author sseibold
 * 
 */
public class ScaScaProductHandler extends ProductHandler
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.gs4tr.projectdirector.adaptors.hybris.service.handlers.ProductHandler#getSupportedModelClass()
	 */
	@Override
	protected Class<? extends ItemModel> getSupportedModelClass()
	{
		return ScaProductModel.class;
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
		if (attribute.getQualifier().equals(ScaProductModel.RAWASSET))
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
		if (attribute.getQualifier().equals(ScaProductModel.RAWASSET))
		{
			return getRawAsset((ScaProductModel) item);
		}

		return super.getChildValue(item, attribute);
	}

	private CelumAssetModel getRawAsset(final ScaProductModel scaProduct)
	{
		return scaProduct.getRawAsset();
	}

}
