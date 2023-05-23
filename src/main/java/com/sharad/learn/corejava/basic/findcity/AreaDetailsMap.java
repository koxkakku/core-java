package com.sharad.learn.corejava.basic.findcity;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.opencsv.bean.CsvToBeanBuilder;

public class AreaDetailsMap {

	private AreaDetailsMap() {
	}

	private static List<Area> areaMasterList = createMasterList();

	private static Map<String, List<Area>> getAreaMap(AreaSearchType type) {
		Map<String, List<Area>> areaDetailsMap;
		switch (type) {
		case REGION:
			areaDetailsMap = getAreaMapByRegion();
			break;
		case DIVISION:
			areaDetailsMap = getAreaMapByDivision();
			break;
		case CIRCLE:
			areaDetailsMap = getAreaMapByCircle();
			break;
		case DISTRICT:
			areaDetailsMap = getAreaMapByDistrict();
			break;
		case ZIP:areaDetailsMap = getAreaMapByZipcode();
		break;
		case STATE:
		default:
			areaDetailsMap = getAreaMapByState();
		}
		return Collections.unmodifiableMap(areaDetailsMap);
	}

	private static Map<String, List<Area>> getAreaMapByZipcode() {
		return areaMasterList.stream().collect(Collectors.groupingBy(Area::getPincode));
	}

	private static Map<String, List<Area>> getAreaMapByDistrict() {
		return areaMasterList.stream().collect(Collectors.groupingBy(area -> area.getDistrict().toLowerCase()));
	}

	private static Map<String, List<Area>> getAreaMapByCircle() {
		return areaMasterList.stream().collect(Collectors.groupingBy(area -> area.getCircleName().toLowerCase()));
	}

	private static Map<String, List<Area>> getAreaMapByDivision() {
		return areaMasterList.stream().collect(Collectors.groupingBy(area -> area.getDivisionName().toLowerCase()));
	}

	private static Map<String, List<Area>> getAreaMapByRegion() {
		return areaMasterList.stream().collect(Collectors.groupingBy(area -> area.getRegionName().toLowerCase()));
	}

	private static Map<String, List<Area>> getAreaMapByState() {
		return areaMasterList.stream().collect(Collectors.groupingBy(area -> area.getStateName().toLowerCase()));
	}

	private static List<Area> createMasterList() {
		try {
			return Collections.unmodifiableList(new CsvToBeanBuilder<Area>(new FileReader(
					"D:\\xy57013_WS\\Java-Practice\\core-java\\src\\main\\resources\\Pincode_30052019.csv"))
					.withType(Area.class).build().parse());
		} catch (IllegalStateException | FileNotFoundException e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	public static List<Area> getSearchResultsByType(AreaSearchType type, String searchKey)
			throws CityNotFoundException {
		Map<String, List<Area>> searchMasterByType = getAreaMap(type);
		if (null == searchMasterByType || searchMasterByType.isEmpty())
			throw new CityNotFoundException(searchKey + " not found");
		return searchMasterByType.get(searchKey.toLowerCase());
	}

}
