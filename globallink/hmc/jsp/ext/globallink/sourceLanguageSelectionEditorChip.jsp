<%@include file="../../head.inc"%>
<%@page import="
	org.gs4tr.projectdirector.adaptors.hybris.hmc.webchips.SourceLanguageSelectionEditorChip
"%>
<%
	SourceLanguageSelectionEditorChip theChip = (SourceLanguageSelectionEditorChip) request.getAttribute(AbstractChip.CHIP_KEY);
	String style = "style=\"width:" + theChip.getWidth() + "px;\" ";
%>
<div class="sourceLanguageSelectionEditorChip">
	<select name="<%= theChip.getEventID(SourceLanguageSelectionEditorChip.EVENT_SET_VALUE) %>"
			class="<%= (theChip.isEditable() ? "enabled" : "disabled") %>"
			<%= style %>"
			<%= (theChip.isEditable() ? "" : "disabled=\"disabled\"") %>
			onchange="setScrollAndSubmit();">
<%
	for( int i = 0; i < theChip.getCount(); i++) {
%>
		<option value="<%= theChip.getValue(i) %>"
			<%= (i == theChip.getSelectedIndex() ? "selected=\"selected\"" : "") %>
		>
		<%= theChip.getDisplayValue(i) %>
		</option>
<%
	}
%>
	</select>
</div>
