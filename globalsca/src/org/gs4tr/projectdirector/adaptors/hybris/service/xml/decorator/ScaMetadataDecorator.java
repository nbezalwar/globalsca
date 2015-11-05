package org.gs4tr.projectdirector.adaptors.hybris.service.xml.decorator;

import de.hybris.platform.core.model.type.AttributeDescriptorModel;

import org.gs4tr.projectdirector.adaptors.hybris.service.LocalizableItem;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


/**
 * @author sseibold
 * 
 */
public abstract class ScaMetadataDecorator extends AbstractXmlDecorator
{
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
		// Copy all metadata to the attribute elements
		this.decorateItemElement(localizableItem, element, document);
	}

}
