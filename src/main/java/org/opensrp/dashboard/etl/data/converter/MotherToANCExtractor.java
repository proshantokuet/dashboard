/**
 * 
 */
package org.opensrp.dashboard.etl.data.converter;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author sohel
 */
public class MotherToANCExtractor {
	
	public void ancVisitSplitter(JSONObject mdoc) throws JSONException {
		JSONObject ancVisitOne = new JSONObject(mdoc.getString("ancVisitOne"));
		if (ancVisitOne.equals(null)) {
			System.out.println("ancVisitOne does not exist");
		}
		
	}
	
}
