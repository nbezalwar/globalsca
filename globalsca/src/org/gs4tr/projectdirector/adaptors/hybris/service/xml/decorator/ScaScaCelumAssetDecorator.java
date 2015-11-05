package org.gs4tr.projectdirector.adaptors.hybris.service.xml.decorator;

import org.gs4tr.projectdirector.adaptors.hybris.service.LocalizableItem;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.sca.pim.model.ScaCelumAssetModel;


/**
 * @author sseibold
 *
 */
public class ScaScaCelumAssetDecorator extends ScaMetadataDecorator
{
	private static final String ATTR_METADATA_FILENAME = "filename";
	private static final String ATTR_METADATA_TEXT = "text";
	private static final String ATTR_METADATA_TITLE = "media-title";



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
		return (item.getItem() instanceof ScaCelumAssetModel);
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
		final ScaCelumAssetModel scaCelumAsset = (ScaCelumAssetModel) localizableItem.getItem();
		element.setAttribute(ATTR_METADATA_FILENAME, scaCelumAsset.getRealFileName());
		element.setAttribute(ATTR_METADATA_TEXT, scaCelumAsset.getAltText());
		element.setAttribute(ATTR_METADATA_TITLE, scaCelumAsset.getMediaTitle());

	}
}
