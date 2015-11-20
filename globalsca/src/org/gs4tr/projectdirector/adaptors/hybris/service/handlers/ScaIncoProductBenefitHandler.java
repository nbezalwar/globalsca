package org.gs4tr.projectdirector.adaptors.hybris.service.handlers;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.type.AttributeDescriptorModel;

import java.util.ArrayList;
import java.util.Collection;

import com.sca.pim.model.IncoProductBenefitModel;
import com.sca.pim.model.ScaCelumAssetModel;
import com.sca.pim.model.SegmentizedTextModel;


/**
 * @author sseibold
 *
 */
public class ScaIncoProductBenefitHandler extends ProductHandler
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.gs4tr.projectdirector.adaptors.hybris.service.handlers.ProductHandler#getSupportedModelClass()
	 */
	@Override
	protected Class<? extends ItemModel> getSupportedModelClass()
	{
		return IncoProductBenefitModel.class;
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
		if (attribute.getQualifier().equals(IncoProductBenefitModel.HEADLINE))
		{
			return true;
		}
		if (attribute.getQualifier().equals(IncoProductBenefitModel.DESCRIPTION))
		{
			return true;
		}

		if (attribute.getQualifier().equals(IncoProductBenefitModel.IMAGE))
		{
			return true;
		}
		if (attribute.getQualifier().equals(IncoProductBenefitModel.VIDEO))
		{
			return true;
		}
		if (attribute.getQualifier().equals(IncoProductBenefitModel.ICON))
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
		if (attribute.getQualifier().equals(IncoProductBenefitModel.HEADLINE))
		{
			return getHeadline((IncoProductBenefitModel) item);
		}
		if (attribute.getQualifier().equals(IncoProductBenefitModel.DESCRIPTION))
		{
			return getDescription((IncoProductBenefitModel) item);
		}
		if (attribute.getQualifier().equals(IncoProductBenefitModel.IMAGE))
		{
			return getImage((IncoProductBenefitModel) item);
		}
		if (attribute.getQualifier().equals(IncoProductBenefitModel.VIDEO))
		{
			return getVideo((IncoProductBenefitModel) item);
		}
		if (attribute.getQualifier().equals(IncoProductBenefitModel.ICON))
		{
			return getIcon((IncoProductBenefitModel) item);
		}
		return super.getChildValue(item, attribute);
	}

	private Collection<SegmentizedTextModel> getHeadline(final IncoProductBenefitModel incoProductBenefit)
	{
		final Collection<SegmentizedTextModel> segments = new ArrayList<SegmentizedTextModel>();
		segments.addAll(incoProductBenefit.getHeadline());
		return segments;
	}

	private Collection<SegmentizedTextModel> getDescription(final IncoProductBenefitModel incoProductBenefit)
	{
		final Collection<SegmentizedTextModel> segments = new ArrayList<SegmentizedTextModel>();
		segments.addAll(incoProductBenefit.getDescription());
		return segments;
	}

	private ScaCelumAssetModel getImage(final IncoProductBenefitModel incoProductBenefit)
	{
		return incoProductBenefit.getImage();
	}

	private ScaCelumAssetModel getVideo(final IncoProductBenefitModel incoProductBenefit)
	{
		return incoProductBenefit.getVideo();
	}

	private ScaCelumAssetModel getIcon(final IncoProductBenefitModel incoProductBenefit)
	{
		return incoProductBenefit.getIcon();
	}
}
