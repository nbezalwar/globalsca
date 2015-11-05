package org.gs4tr.projectdirector.adaptors.hybris.service.handlers;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.type.AttributeDescriptorModel;

import java.util.ArrayList;
import java.util.Collection;

import com.sca.pim.model.IncoProductModel;
import com.sca.pim.model.ScaCelumAssetModel;
import com.sca.pim.model.SegmentizedTextModel;


/**
 * @author sseibold
 * 
 */
public class ScaIncoProductHandler extends ProductHandler
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.gs4tr.projectdirector.adaptors.hybris.service.handlers.ProductHandler#getSupportedModelClass()
	 */
	@Override
	protected Class<? extends ItemModel> getSupportedModelClass()
	{
		return IncoProductModel.class;
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
		if (attribute.getQualifier().equals(IncoProductModel.DESCRIPTIONHEADLINE))
		{
			return true;
		}
		if (attribute.getQualifier().equals(IncoProductModel.SEGMENTDESCRIPTION))
		{
			return true;
		}
		if (attribute.getQualifier().equals(IncoProductModel.PAGETITLE))
		{
			return true;
		}
		if (attribute.getQualifier().equals(IncoProductModel.PAGEDESCRIPTION))
		{
			return true;
		}
		if (attribute.getQualifier().equals(IncoProductModel.PRODUCTIMAGES))
		{
			return true;
		}
		if (attribute.getQualifier().equals(IncoProductModel.PACKSHOTSB2B))
		{
			return true;
		}
		if (attribute.getQualifier().equals(IncoProductModel.PACKSHOTSB2C))
		{
			return true;
		}
		if (attribute.getQualifier().equals(IncoProductModel.USAGEINSTRUCTIONVIDEOS))
		{
			return true;
		}
		if (attribute.getQualifier().equals(IncoProductModel.USAGEINSTRUCTIONIMAGES))
		{
			return true;
		}
		if (attribute.getQualifier().equals(IncoProductModel.PRODUCTVIDEOS))
		{
			return true;
		}
		if (attribute.getQualifier().equals(IncoProductModel.PRODUCTIMAGERELATIVESIZE))
		{
			return true;
		}
		if (attribute.getQualifier().equals(IncoProductModel.PRODUCTIMAGECONTEXT))
		{
			return true;
		}
		if (attribute.getQualifier().equals(IncoProductModel.PRODUCTSTICKER))
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
		if (attribute.getQualifier().equals(IncoProductModel.DESCRIPTIONHEADLINE))
		{
			return getDescriptionHeadline((IncoProductModel) item);
		}
		if (attribute.getQualifier().equals(IncoProductModel.SEGMENTDESCRIPTION))
		{
			return getSegmentDescription((IncoProductModel) item);
		}
		if (attribute.getQualifier().equals(IncoProductModel.PAGETITLE))
		{
			return getPageTitle((IncoProductModel) item);
		}
		if (attribute.getQualifier().equals(IncoProductModel.PAGEDESCRIPTION))
		{
			return getPageDescription((IncoProductModel) item);
		}
		if (attribute.getQualifier().equals(IncoProductModel.PRODUCTIMAGES))
		{
			return getProductImages((IncoProductModel) item);
		}
		if (attribute.getQualifier().equals(IncoProductModel.PACKSHOTSB2B))
		{
			return getPackShotsB2B((IncoProductModel) item);
		}
		if (attribute.getQualifier().equals(IncoProductModel.PACKSHOTSB2C))
		{
			return getPackShotsB2C((IncoProductModel) item);
		}
		if (attribute.getQualifier().equals(IncoProductModel.USAGEINSTRUCTIONVIDEOS))
		{
			return getUsageInstructionVideos((IncoProductModel) item);
		}
		if (attribute.getQualifier().equals(IncoProductModel.USAGEINSTRUCTIONIMAGES))
		{
			return getUsageInstructionImages((IncoProductModel) item);
		}
		if (attribute.getQualifier().equals(IncoProductModel.PRODUCTVIDEOS))
		{
			return getProductVideos((IncoProductModel) item);
		}
		if (attribute.getQualifier().equals(IncoProductModel.PRODUCTIMAGERELATIVESIZE))
		{
			return getProductImageRelativeSize((IncoProductModel) item);
		}
		if (attribute.getQualifier().equals(IncoProductModel.PRODUCTIMAGECONTEXT))
		{
			return getProductImageContext((IncoProductModel) item);
		}
		if (attribute.getQualifier().equals(IncoProductModel.PRODUCTSTICKER))
		{
			return getProductSticker((IncoProductModel) item);
		}

		return super.getChildValue(item, attribute);
	}

	private Collection<SegmentizedTextModel> getDescriptionHeadline(final IncoProductModel incoProduct)
	{
		final Collection<SegmentizedTextModel> segments = new ArrayList<SegmentizedTextModel>();
		segments.addAll(incoProduct.getDescriptionHeadline());
		return segments;
	}

	private Collection<SegmentizedTextModel> getSegmentDescription(final IncoProductModel incoProduct)
	{
		final Collection<SegmentizedTextModel> segments = new ArrayList<SegmentizedTextModel>();
		segments.addAll(incoProduct.getSegmentDescription());
		return segments;
	}

	private Collection<SegmentizedTextModel> getPageTitle(final IncoProductModel incoProduct)
	{
		final Collection<SegmentizedTextModel> segments = new ArrayList<SegmentizedTextModel>();
		segments.addAll(incoProduct.getPageTitle());
		return segments;
	}

	private Collection<SegmentizedTextModel> getPageDescription(final IncoProductModel incoProduct)
	{
		final Collection<SegmentizedTextModel> segments = new ArrayList<SegmentizedTextModel>();
		segments.addAll(incoProduct.getPageDescription());
		return segments;
	}

	private Collection<ScaCelumAssetModel> getProductImages(final IncoProductModel incoProduct)
	{
		final Collection<ScaCelumAssetModel> images = new ArrayList<ScaCelumAssetModel>();
		images.addAll(incoProduct.getProductImages());
		return images;
	}

	private Collection<ScaCelumAssetModel> getPackShotsB2B(final IncoProductModel incoProduct)
	{
		final Collection<ScaCelumAssetModel> shots = new ArrayList<ScaCelumAssetModel>();
		shots.addAll(incoProduct.getPackShotsB2B());
		return shots;
	}

	private Collection<ScaCelumAssetModel> getPackShotsB2C(final IncoProductModel incoProduct)
	{
		final Collection<ScaCelumAssetModel> shots = new ArrayList<ScaCelumAssetModel>();
		shots.addAll(incoProduct.getPackShotsB2C());
		return shots;
	}

	private Collection<ScaCelumAssetModel> getUsageInstructionVideos(final IncoProductModel incoProduct)
	{
		final Collection<ScaCelumAssetModel> videos = new ArrayList<ScaCelumAssetModel>();
		videos.addAll(incoProduct.getUsageInstructionVideos());
		return videos;
	}

	private Collection<ScaCelumAssetModel> getUsageInstructionImages(final IncoProductModel incoProduct)
	{
		final Collection<ScaCelumAssetModel> images = new ArrayList<ScaCelumAssetModel>();
		images.addAll(incoProduct.getUsageInstructionImages());
		return images;
	}

	private Collection<ScaCelumAssetModel> getProductVideos(final IncoProductModel incoProduct)
	{
		final Collection<ScaCelumAssetModel> videos = new ArrayList<ScaCelumAssetModel>();
		videos.addAll(incoProduct.getProductVideos());
		return videos;
	}

	private ScaCelumAssetModel getProductImageRelativeSize(final IncoProductModel incoProduct)
	{
		return incoProduct.getProductImageRelativeSize();
	}

	private ScaCelumAssetModel getProductImageContext(final IncoProductModel incoProduct)
	{
		return incoProduct.getProductImageContext();
	}

	private ScaCelumAssetModel getProductSticker(final IncoProductModel incoProduct)
	{
		return incoProduct.getProductSticker();
	}

}
