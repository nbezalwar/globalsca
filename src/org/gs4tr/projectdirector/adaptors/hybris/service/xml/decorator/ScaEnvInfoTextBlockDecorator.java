package org.gs4tr.projectdirector.adaptors.hybris.service.xml.decorator;

import org.gs4tr.projectdirector.adaptors.hybris.service.LocalizableItem;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.sca.pim.model.EnvInfoTextBlockModel;


/**
 * @author sseibold
 *
 */
public class ScaEnvInfoTextBlockDecorator extends ScaMetadataDecorator
{
	private static final String ATTR_METADATA_TEXT_BLOCK_TYPE = "textBlockType";

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.gs4tr.projectdirector.adaptors.hybris.service.xml.XMLDecorator#supports(org.gs4tr.projectdirector.adaptors
	 * .hybris.service.LocalizableItem)
	 */
	@Override
	public boolean supports(final LocalizableItem item)
	{
		return (item.getItem() instanceof EnvInfoTextBlockModel);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.gs4tr.projectdirector.adaptors.hybris.service.xml.decorator.AbstractXmlDecorator#decorateItemElement(org.gs4tr
	 * .projectdirector.adaptors.hybris.service.LocalizableItem, org.w3c.dom.Element, org.w3c.dom.Document)
	 */
	@Override
	public void decorateItemElement(final LocalizableItem localizableItem, final Element element, final Document document)
	{
		final EnvInfoTextBlockModel textBlock = (EnvInfoTextBlockModel) localizableItem.getItem();
		if (textBlock.getTextBlockType() != null)
		{
			element.setAttribute(ATTR_METADATA_TEXT_BLOCK_TYPE, textBlock.getTextBlockType().name());
		}
	}

}
