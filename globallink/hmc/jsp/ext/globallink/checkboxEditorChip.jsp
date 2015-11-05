<%@include file="../../head.inc"%>
<%@page import="
	org.gs4tr.projectdirector.adaptors.hybris.hmc.webchips.CheckboxEditorChip
"%>
<%
	final CheckboxEditorChip theChip = (CheckboxEditorChip) request.getAttribute(AbstractChip.CHIP_KEY);

	String style = "style=\"width:" + theChip.getWidth() + ";\"";
	
	final String name = theChip.getEventID(CheckboxEditorChip.SET_VALUE);
	final boolean checked = Boolean.TRUE.equals(theChip.getBooleanValue());
	final boolean editable = theChip.isEditable();
	final String label = theChip.getLabel();
%>
<div class="booleanEditorChip" <%= style %>>
	<input type="hidden" name="<%= name %>" value="<%= checked ? Boolean.TRUE.toString() : Boolean.FALSE.toString() %>"/>
	<input type="checkbox"
		class="<%= editable ? "enabled" : "disabled" %>"
        value=""
        id="<%= theChip.getUniqueName() %>_checkbox"
        onclick="document.editorForm.elements['<%= name %>'].value=this.checked;"
        <%= checked ? " checked" : "" %>
        <%= editable ? "" : "disabled" %>>
		<span><%= label %></span>
	</input>
</div>
