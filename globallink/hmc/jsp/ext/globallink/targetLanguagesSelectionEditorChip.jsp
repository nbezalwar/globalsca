<%@include file="../../head.inc"%>
<%@page import="
	org.gs4tr.projectdirector.adaptors.hybris.hmc.webchips.TargetLanguagesSelectionEditorChip
"%>
<%
	TargetLanguagesSelectionEditorChip theChip = (TargetLanguagesSelectionEditorChip) request.getAttribute(AbstractChip.CHIP_KEY);
	String style = "style=\"width:" + theChip.getWidth() + "px;\" ";
	
	String languageCheckboxName = theChip.getEventID(TargetLanguagesSelectionEditorChip.EVENT_SELECT);
%>
<input type="hidden" name="<%= theChip.getEventID("update") %>" /><%-- make sure processEvents is called even without any checkboxes selected --%>
<table cellspacing="0" cellpadding="0" class="targetLanguagesSelectionEditorChip listtable">
	<tbody>
		<tr>
			<th class="checkbox">
				<input type="checkbox" id="allLanguagesCheckbox" style="visibility: visible;" value="true" class="header"
					onchange="onSelectAll(this, '<%= languageCheckboxName %>');"
					<%= (theChip.isAllSelected() ? "checked=\"checked\"" : "") %>/>
			</th>
			<th>
				<div class="header"><%= theChip.getLanguageLabel() %></div>
			</th>
		</tr>
<%
	for( int i = 0; i < theChip.getCount(); i++) {
%>
		<tr>
			<td class="column">
				<input type="checkbox" onchange="onSelectLanguage(this,'<%= languageCheckboxName %>');" class="column checkbox"
					name="<%= theChip.getEventID(TargetLanguagesSelectionEditorChip.EVENT_SELECT) %>"
					value="<%= theChip.getValue(i) %>"
					<%= (theChip.isSelected(i) ? "checked=\"checked\"" : "") %>
				/>
			</td>
			<td class="column">
				<div class="column">
					<%= theChip.getLanguageName(i) %>
				</div>
			</td>
		</tr>
<%
	}
%>
	</tbody>
</table>
