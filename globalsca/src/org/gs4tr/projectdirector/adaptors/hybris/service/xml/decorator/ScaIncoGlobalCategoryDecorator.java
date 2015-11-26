package org.gs4tr.projectdirector.adaptors.hybris.service.xml.decorator;

import org.gs4tr.projectdirector.adaptors.hybris.service.LocalizableItem;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.sca.pim.model.IncoGlobalCategoryModel;


/**
 * @author sseibold
 *
 */
public class ScaIncoGlobalCategoryDecorator extends ScaMetadataDecorator
{
	private static final String ATTR_METADATA_CODE = "code";

	private static final String ATTR_METADATA_NAME = "name";

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
		return (item.getItem() instanceof IncoGlobalCategoryModel);
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
		final IncoGlobalCategoryModel category = (IncoGlobalCategoryModel) localizableItem.getItem();
		element.setAttribute(ATTR_METADATA_CODE, category.getCode());
		element.setAttribute(ATTR_METADATA_NAME, category.getName());
		element.setAttribute("meta", element.getAttribute("key")); // Copy Key to Meta
	}

}
