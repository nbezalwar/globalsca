package org.gs4tr.projectdirector.adaptors.hybris.service.handlers;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.type.AttributeDescriptorModel;

import java.util.ArrayList;
import java.util.Collection;

import com.sca.pim.model.EnvInfoTextBlockModel;
import com.sca.pim.model.EnvInfoTextSegmentModel;


/**
 * @author sseibold
 * 
 */
public class ScaEnvInfoTextBlockHandler extends ItemModelHandler
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.gs4tr.projectdirector.adaptors.hybris.service.handlers.ProductHandler#getSupportedModelClass()
	 */
	@Override
	protected Class<? extends ItemModel> getSupportedModelClass()
	{
		return EnvInfoTextBlockModel.class;
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
		if (attribute.getQualifier().equals(EnvInfoTextBlockModel.ENVINFOTEXTSEGMENT))
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
		if (attribute.getQualifier().equals(EnvInfoTextBlockModel.ENVINFOTEXTSEGMENT))
		{
			return getEnvInfoTextSegment((EnvInfoTextBlockModel) item);
		}

		return super.getChildValue(item, attribute);
	}

	private Collection<EnvInfoTextSegmentModel> getEnvInfoTextSegment(final EnvInfoTextBlockModel envInfoTextBlock)
	{
		final Collection<EnvInfoTextSegmentModel> segments = new ArrayList<EnvInfoTextSegmentModel>();
		segments.addAll(envInfoTextBlock.getEnvInfoTextSegment());
		return segments;
	}

}
