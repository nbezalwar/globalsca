package org.gs4tr.projectdirector.adaptors.hybris.service.xml.decorator;

import de.hybris.platform.core.model.type.AttributeDescriptorModel;

import org.gs4tr.projectdirector.adaptors.hybris.service.LocalizableItem;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.sca.pim.model.ScaProductModel;


/**
 * @author sseibold
 *
 */
public class ScaScaProductDecorator extends ScaMetadataDecorator
{
	private static final String ATTR_METADATA_CODE = "code";

	private static final String ATTR_METADATA_LONG_NAME = "longName";

	private static final String ATTR_METADATA_BASE_NUMBER = "baseNumber";

	private static final String ATTR_METADATA_VARIANT_NUMBER = "variantNumber";

	private static final String ATTR_METADATA_SAP_MATERIAL_GROUP_ID = "sapMaterialGroupId";

	private static final String ATTR_METADATA_SAP_MATERIAL_GROUP_NAME = "sapMaterialGroupName";

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
		return (item.getItem() instanceof ScaProductModel);
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
		final ScaProductModel product = (ScaProductModel) localizableItem.getItem();
		element.setAttribute(ATTR_METADATA_CODE, product.getCode());
		element.setAttribute(ATTR_METADATA_LONG_NAME, product.getLongName());
		element.setAttribute(ATTR_METADATA_BASE_NUMBER, product.getBaseNumber());
		element.setAttribute(ATTR_METADATA_VARIANT_NUMBER, product.getVariantNumber());
		element.setAttribute(ATTR_METADATA_SAP_MATERIAL_GROUP_ID, product.getSapMaterialGroupId());
		element.setAttribute(ATTR_METADATA_SAP_MATERIAL_GROUP_NAME, product.getSapMaterialGroupName());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.gs4tr.projectdirector.adaptors.hybris.service.xml.decorator.ScaMetadataDecorator#decorateAttributeElement(
	 * org.gs4tr.projectdirector.adaptors.hybris.service.LocalizableItem,
	 * de.hybris.platform.core.model.type.AttributeDescriptorModel, org.w3c.dom.Element, org.w3c.dom.Document)
	 */
	@Override
	public void decorateAttributeElement(final LocalizableItem localizableItem, final AttributeDescriptorModel attribute,
			final Element element, final Document document)
	{
		super.decorateAttributeElement(localizableItem, attribute, element, document);
		element.setAttribute(ATTR_METADATA_TRP_METADATA, attribute.getQualifier());
	}

}
