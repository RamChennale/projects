package com.qa.util;

import org.json.JSONArray;
import org.json.JSONObject;

public class TestUtil {

	public static String getValueByJpath(JSONObject responseJson, String jpath) {
		Object object = responseJson;
		for (String s : jpath.split("/"))
			if (!s.isEmpty())
				if (!(s.contains("[") || s.contains("]")))
					object = ((JSONObject) object).get(s);
				else if (s.contains("[") || s.contains("]"))
					object = ((JSONArray) ((JSONObject) object).get(s.split("\\[")[0]))
							.get(Integer.parseInt(s.split("\\[")[1].replace("]", "")));
		return object.toString();

	}
}
