package org.gs4tr.projectdirector.adaptors.hybris.service.monitor.provider;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.HashSet;
import java.util.Set;

import org.gs4tr.projectdirector.adaptors.hybris.service.monitor.CatalogContentProvider;
import org.gs4tr.projectdirector.adaptors.hybris.util.FlexibleSearchQueryUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.sca.pim.model.IncoProductBenefitModel;


/**
 * @author sseibold
 * 
 */
public class ScaIncoProductBenefitProvider implements CatalogContentProvider
{
	@Autowired
	protected FlexibleSearchService flexibleSearchService;

	private static final String FSEARCH_PARAM_CATALOG_VERSION = "catalogVersion";

	private static final String FSEARCH_QUERY_PRODUCTS = FlexibleSearchQueryUtils.query("SELECT {0} FROM {1} WHERE {2}=?{3}",
			IncoProductBenefitModel.PK, IncoProductBenefitModel._TYPECODE, IncoProductBenefitModel.CATALOGVERSION,
			FSEARCH_PARAM_CATALOG_VERSION);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.gs4tr.projectdirector.adaptors.hybris.service.monitor.CatalogContentProvider#getContent(de.hybris.platform
	 * .catalog.model.CatalogVersionModel)
	 */
	@Override
	public Set<ItemModel> getContent(final CatalogVersionModel catalog)
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(FSEARCH_QUERY_PRODUCTS);
		query.addQueryParameter(FSEARCH_PARAM_CATALOG_VERSION, catalog);

		final Set<ItemModel> benefits = new HashSet<ItemModel>();
		benefits.addAll(flexibleSearchService.<IncoProductBenefitModel> search(query).getResult());

		return benefits;
	}

}
