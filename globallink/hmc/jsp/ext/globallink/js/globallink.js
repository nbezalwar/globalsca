function onSelectAll(selectAllCheckbox, checkboxName) {
	var checkboxes = document.getElementsByName(checkboxName),
		i;
	
	for (i = 0; i < checkboxes.length; i++) {
		checkboxes[i].checked = selectAllCheckbox.checked;
	}
}

function onSelectLanguage(languageCheckbox, languageCheckboxName) {
	onSelect(languageCheckbox, 'allLanguagesCheckbox', languageCheckboxName );
}

function onSelectAttribute(attributeCheckbox, attributeCheckboxName) {
	onSelect(attributeCheckbox, 'allAttributesCheckbox', attributeCheckboxName );
}

function onSelect(checkbox, selectAllCheckboxName, checkboxName) {
	var selectAllCheckbox = document.getElementById(selectAllCheckboxName),
		checkboxes = document.getElementsByName(checkboxName),
		i;
	
	// Language deselected - deselect "All"
	if (checkbox.checked === false) {
		selectAllCheckbox.checked = false;
	} else {
		// Language selected - check if all are selected now
		for (i = 0; i < checkboxes.length; i++) {
			if (checkboxes[i].checked === false) {
				return;	// nothing to do
			}
		}
		// All are selected - select "All"
		selectAllCheckbox.checked = true;
	}
}
