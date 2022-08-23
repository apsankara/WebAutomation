package reUseFunctions;

import java.io.IOException;

import commonConfig.StartBrowser;
import webDriverCmd.ActionDriver;
import webPageObjectRepository.ApplyFilters;

public class ApplyFiltersBtn {

ActionDriver aDriver=new ActionDriver();
	
	public void Filters() throws IOException {
		StartBrowser.childTest=StartBrowser.parentTest.createNode("Clicked ApplyFiltersButton");
		aDriver.click(ApplyFilters.applyfilters, "ApplyFiltersButton");
		
	}
}
