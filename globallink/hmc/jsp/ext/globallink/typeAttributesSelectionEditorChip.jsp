<%@include file="../../head.inc"%>
<%@page import="
	org.gs4tr.projectdirector.adaptors.hybris.hmc.webchips.TypeAttributesSelectionEditorChip
"%>
<%
TypeAttributesSelectionEditorChip theChip = (TypeAttributesSelectionEditorChip) request.getAttribute(AbstractChip.CHIP_KEY);
	String style = "style=\"width:" + theChip.getWidth() + "px;\" ";
	
	String attributeCheckboxName = theChip.getEventID(TypeAttributesSelectionEditorChip.EVENT_SELECT);
%>
<input type="hidden" name="<%= theChip.getEventID("update") %>" /><%-- make sure processEvents is called even without any checkboxes selected --%>
<table cellspacing="0" cellpadding="0" class="typeAttributesSelectionEditorChip listtable">
	<tbody>
		<tr>
			<th class="checkbox">
				<input type="checkbox" id="allAttributesCheckbox" style="visibility: visible;" value="true" class="header"
					onchange="onSelectAll(this, '<%= attributeCheckboxName %>');"
					<%= (theChip.isAllSelected() ? "checked=\"checked\"" : "") %>/>
			</th>
			<th>
				<div class="header"><%= theChip.getAttributeLabel() %></div>
			</th>
		</tr>
<%
	for( int i = 0; i < theChip.getCount(); i++) {
%>
		<tr>
			<td class="column">
				<input type="checkbox" onchange="onSelectAttribute(this,'<%= attributeCheckboxName %>');" class="column checkbox"
					name="<%= theChip.getEventID(TypeAttributesSelectionEditorChip.EVENT_SELECT) %>"
					value="<%= theChip.getValue(i) %>"
					<%= (theChip.isSelected(i) ? "checked=\"checked\"" : "") %>
				/>
			</td>
			<td class="column">
				<div class="column">
					<%= theChip.getAttributeName(i) %>
				</div>
			</td>
		</tr>
<%
	}
%>
	</tbody>
</table>
