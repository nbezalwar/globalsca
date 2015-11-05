<%@include file="../../head.inc"%>
<%@page import="
	org.gs4tr.projectdirector.adaptors.hybris.hmc.webchips.ProjectSelectionEditorChip
"%>
<%
	ProjectSelectionEditorChip theChip = (ProjectSelectionEditorChip) request.getAttribute(AbstractChip.CHIP_KEY);
	String style = "style=\"width:" + theChip.getWidth() + "px;\" ";
%>
<div class="projectSelectionEditorChip">
<%
	for( int i = 0; i < theChip.getCount(); i++) {
%>
	<div id="<%= theChip.getUniqueName() %>" <%= style %>>
		<input type="radio"
			name="<%= theChip.getEventID(ProjectSelectionEditorChip.EVENT_SET_VALUE) %>"
			class="<%= (theChip.isEditable() ? "enabled" : "disabled") %>"
			<%= (theChip.isEditable() ? "" : "disabled=\"disabled\"") %>
			value="<%= theChip.getValue(i) %>"
			<%= (theChip.getValue(i).equals(theChip.getValue()) ? "checked=\"checked\"" : "") %>
			onchange="setScrollAndSubmit();">
			<%= theChip.getDisplayValue(i) %>
	</div>
<%
	}
%>
</div>
