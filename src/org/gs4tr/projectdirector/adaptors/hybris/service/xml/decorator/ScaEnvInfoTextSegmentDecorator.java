package org.gs4tr.projectdirector.adaptors.hybris.service.xml.decorator;

import org.gs4tr.projectdirector.adaptors.hybris.service.LocalizableItem;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.sca.pim.model.EnvInfoTextSegmentModel;


/**
 * @author sseibold
 *
 */
public class ScaEnvInfoTextSegmentDecorator extends ScaMetadataDecorator
{
	private static final String ATTR_METADATA_HEADERLEVEL = "headerLevel";



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
		return (item.getItem() instanceof EnvInfoTextSegmentModel);
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
		final EnvInfoTextSegmentModel segment = (EnvInfoTextSegmentModel) localizableItem.getItem();
		if (segment.getHeaderLevel() != null)
		{
			element.setAttribute(ATTR_METADATA_HEADERLEVEL, segment.getHeaderLevel().getType());
		}

	}
}
