package org.gs4tr.projectdirector.adaptors.hybris.service.handlers;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.type.AttributeDescriptorModel;

import com.sca.pim.model.ScaCelumAssetModel;
import com.sca.pim.model.TargetGroupQuestionnaireTextModel;


/**
 * @author sseibold
 *
 */
public class ScaTargetGroupQuestionnaireTextHandler extends ItemModelHandler
{

	/*
	 * (non-Javadoc)
	 *
	 * @see org.gs4tr.projectdirector.adaptors.hybris.service.handlers.ProductHandler#getSupportedModelClass()
	 */
	@Override
	protected Class<? extends ItemModel> getSupportedModelClass()
	{
		return TargetGroupQuestionnaireTextModel.class;
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
		if (attribute.getQualifier().equals(TargetGroupQuestionnaireTextModel.ICON))
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
		if (attribute.getQualifier().equals(TargetGroupQuestionnaireTextModel.ICON))
		{
			return getIcon((TargetGroupQuestionnaireTextModel) item);
		}

		return super.getChildValue(item, attribute);
	}

	private ScaCelumAssetModel getIcon(final TargetGroupQuestionnaireTextModel TargetGroupQuestionnaireText)
	{
		return TargetGroupQuestionnaireText.getIcon();
	}

}
