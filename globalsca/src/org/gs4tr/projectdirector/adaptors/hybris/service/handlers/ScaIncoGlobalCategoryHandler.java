package org.gs4tr.projectdirector.adaptors.hybris.service.handlers;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.type.AttributeDescriptorModel;

import java.util.ArrayList;
import java.util.Collection;

import com.sca.pim.model.IncoGlobalCategoryModel;
import com.sca.pim.model.SegmentizedTextModel;


/**
 * @author sseibold
 *
 */
public class ScaIncoGlobalCategoryHandler extends CategoryHandler
{

	/*
	 * (non-Javadoc)
	 *
	 * @see org.gs4tr.projectdirector.adaptors.hybris.service.handlers.ProductHandler#getSupportedModelClass()
	 */
	@Override
	protected Class<? extends ItemModel> getSupportedModelClass()
	{
		return IncoGlobalCategoryModel.class;
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
		if (attribute.getQualifier().equals(IncoGlobalCategoryModel.PAGETITLE))
		{
			return true;
		}
		if (attribute.getQualifier().equals(IncoGlobalCategoryModel.PAGEDESCRIPTION))
		{
			return true;
		}
		if (attribute.getQualifier().equals(IncoGlobalCategoryModel.FAMILYBENEFIT1))
		{
			return true;
		}
		if (attribute.getQualifier().equals(IncoGlobalCategoryModel.FAMILYBENEFIT2))
		{
			return true;
		}
		if (attribute.getQualifier().equals(IncoGlobalCategoryModel.FAMILYBENEFIT3))
		{
			return true;
		}
		if (attribute.getQualifier().equals(IncoGlobalCategoryModel.FAMILYBENEFIT4))
		{
			return true;
		}
		if (attribute.getQualifier().equals(IncoGlobalCategoryModel.ICON))
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
		if (attribute.getQualifier().equals(IncoGlobalCategoryModel.PAGETITLE))
		{
			return getPageTitle((IncoGlobalCategoryModel) item);
		}
		if (attribute.getQualifier().equals(IncoGlobalCategoryModel.PAGEDESCRIPTION))
		{
			return getPageDescription((IncoGlobalCategoryModel) item);
		}
		if (attribute.getQualifier().equals(IncoGlobalCategoryModel.FAMILYBENEFIT1))
		{
			return getFamilyBenefit1((IncoGlobalCategoryModel) item);
		}
		if (attribute.getQualifier().equals(IncoGlobalCategoryModel.FAMILYBENEFIT2))
		{
			return getFamilyBenefit2((IncoGlobalCategoryModel) item);
		}
		if (attribute.getQualifier().equals(IncoGlobalCategoryModel.FAMILYBENEFIT3))
		{
			return getFamilyBenefit3((IncoGlobalCategoryModel) item);
		}
		if (attribute.getQualifier().equals(IncoGlobalCategoryModel.FAMILYBENEFIT4))
		{
			return getFamilyBenefit4((IncoGlobalCategoryModel) item);
		}


		return super.getChildValue(item, attribute);
	}

	private Collection<SegmentizedTextModel> getPageTitle(final IncoGlobalCategoryModel incoGlobalCategory)
	{
		final Collection<SegmentizedTextModel> segments = new ArrayList<SegmentizedTextModel>();
		segments.addAll(incoGlobalCategory.getPageTitle());
		return segments;
	}

	private Collection<SegmentizedTextModel> getPageDescription(final IncoGlobalCategoryModel incoGlobalCategory)
	{
		final Collection<SegmentizedTextModel> segments = new ArrayList<SegmentizedTextModel>();
		segments.addAll(incoGlobalCategory.getPageDescription());
		return segments;
	}

	private Collection<SegmentizedTextModel> getFamilyBenefit1(final IncoGlobalCategoryModel incoGlobalCategory)
	{
		final Collection<SegmentizedTextModel> segments = new ArrayList<SegmentizedTextModel>();
		segments.addAll(incoGlobalCategory.getFamilyBenefit1());
		return segments;
	}

	private Collection<SegmentizedTextModel> getFamilyBenefit2(final IncoGlobalCategoryModel incoGlobalCategory)
	{
		final Collection<SegmentizedTextModel> segments = new ArrayList<SegmentizedTextModel>();
		segments.addAll(incoGlobalCategory.getFamilyBenefit2());
		return segments;
	}

	private Collection<SegmentizedTextModel> getFamilyBenefit3(final IncoGlobalCategoryModel incoGlobalCategory)
	{
		final Collection<SegmentizedTextModel> segments = new ArrayList<SegmentizedTextModel>();
		segments.addAll(incoGlobalCategory.getFamilyBenefit3());
		return segments;
	}

	private Collection<SegmentizedTextModel> getFamilyBenefit4(final IncoGlobalCategoryModel incoGlobalCategory)
	{
		final Collection<SegmentizedTextModel> segments = new ArrayList<SegmentizedTextModel>();
		segments.addAll(incoGlobalCategory.getFamilyBenefit4());
		return segments;
	}



}
