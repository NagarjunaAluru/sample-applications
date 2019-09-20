/*package com.glx.practice.mahendrafrnd;

import java.util.*;

import net.suresby.util.Utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class UsersManagementRestController {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/getAllUsers", method = RequestMethod.GET, produces = "application/json", consumes = "application/json")
	public List<Map> getAllUsers(String userid) {
		List<Map> usersList = new ArrayList<>();
		ObjectMapper mapper = new ObjectMapper();
		try {
			String url = "https://satapi.suresby.net/AssetTracker/GetUsers";

			// First set headers
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);

			// create one map for input params: json format means key value pair
			// , so for us map is equal to json
			LinkedMultiValueMap<String, String> jsonMap = new LinkedMultiValueMap<String, String>();
			jsonMap.add("userId", userid);

			HashMap<Object, Object> inputJsonMap = new HashMap<>();
			inputJsonMap.put("UserId", userid);

			JSONObject jsonObject = new JSONObject(inputJsonMap);

			String responseOutput = Utility.httpClinetPostEvent(
					jsonObject.toString(), url);

			Map<String, String> map = mapper.readValue(responseOutput,
					Map.class);

			if (map.get("Status").equals("200")
					|| map.get("Status").toString().equalsIgnoreCase("success")) {
				Object userList = map.get("Result");
				List<?> convertObjectToList = convertObjectToList(userList);

				for (Object obj : convertObjectToList) {
					if (obj instanceof Map) {

						HashMap userMap = (HashMap) obj;
						usersList.add(userMap);
						System.out.println(userMap);
					}
				}
			}

			// Gson gson = new Gson();
			// JsonElement jsonElement = gson.toJsonTree(userMap);
			// Users pojo = gson.fromJson(jsonElement, Users.class);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return usersList;

	}

	public static List<?> convertObjectToList(Object obj) {
		List<?> list = new ArrayList<>();
		if (obj.getClass().isArray()) {
			list = Arrays.asList((Object[]) obj);
		} else if (obj instanceof Collection) {
			list = new ArrayList<>((Collection<?>) obj);
		}
		return list;
	}

}
*/