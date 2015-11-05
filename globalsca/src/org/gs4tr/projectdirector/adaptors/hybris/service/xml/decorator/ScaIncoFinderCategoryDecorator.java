package org.gs4tr.projectdirector.adaptors.hybris.service.xml.decorator;

import org.gs4tr.projectdirector.adaptors.hybris.service.LocalizableItem;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.sca.pim.model.IncoFinderCategoryModel;


/**
 * @author sseibold
 *
 */
public class ScaIncoFinderCategoryDecorator extends ScaMetadataDecorator
{
	private static final String ATTR_METADATA_CODE = "meta_code";

	private static final String ATTR_METADATA_NAME = "meta_name";

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
		return (item.getItem() instanceof IncoFinderCategoryModel);
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
		final IncoFinderCategoryModel category = (IncoFinderCategoryModel) localizableItem.getItem();
		if (category.getCode() != null)
		{
			element.setAttribute(ATTR_METADATA_CODE, category.getCode());
		}
		if (category.getName() != null)
		{
			element.setAttribute(ATTR_METADATA_NAME, category.getName());
		}
	}

}
