package org.gs4tr.projectdirector.adaptors.hybris.service.xml.decorator;

import de.hybris.platform.core.model.type.AttributeDescriptorModel;

import org.gs4tr.projectdirector.adaptors.hybris.service.LocalizableItem;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


/**
 * @author sseibold
 * 
 */
public class ScaItemDecorator extends AbstractXmlDecorator
{
	private static final String ATTR_TYPE = "type";

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
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.gs4tr.projectdirector.adaptors.hybris.service.xml.decorator.AbstractXmlDecorator#decorateAttributeElement(
	 * org.gs4tr.projectdirector.adaptors.hybris.service.LocalizableItem,
	 * de.hybris.platform.core.model.type.AttributeDescriptorModel, org.w3c.dom.Element, org.w3c.dom.Document)
	 */
	@Override
	public void decorateAttributeElement(final LocalizableItem localizableItem, final AttributeDescriptorModel attribute,
			final Element element, final Document document)
	{
		// Decorate each attribute element with type information of the owning item
		element.setAttribute(ATTR_TYPE, localizableItem.getItem().getItemtype());
	}

}
