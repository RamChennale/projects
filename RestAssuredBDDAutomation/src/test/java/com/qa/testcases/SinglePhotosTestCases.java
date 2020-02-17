package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.businesslayer.SinglePhotoBusinessLogic;
import com.qa.data.DataProviderClass;
import com.qa.pojo.SinglePhoto;
import com.qa.yamldata.YamlTestDataForAPI1;


/**
 * This class contains all the test cases related to API1 i.e. SinglePhoto API
 * We are separating test cases so that they will be easy to manage
 * 
 */
public class SinglePhotosTestCases {

	//private static final Logger LOGGER = Logger.getLogger(SinglePhotosTestCases.class);

	@Test(dataProvider = "common_test_data_provider", dataProviderClass = DataProviderClass.class)
	public void testSinglePhotoCase1(YamlTestDataForAPI1 apitestdata) {
		String id = apitestdata.getPhotoId();
		SinglePhoto singlePhotoActualData = SinglePhotoBusinessLogic.getSinglePhotoDataFor(id);
	//	LOGGER.info(singlePhotoActualData);

		Assert.assertEquals(singlePhotoActualData.getId(), id);
		Assert.assertEquals(singlePhotoActualData.getAlbumId(), "1");
		Assert.assertTrue(singlePhotoActualData.getUrl().startsWith("https://via.placeholder.com/600/"));
		Assert.assertTrue(singlePhotoActualData.getThumbnailUrl().startsWith("https://via.placeholder.com/150/"));
	}

	
	
	
	@Test(dataProvider = "common_test_data_provider", dataProviderClass = DataProviderClass.class)
	public void testSinglePhotoCase2(YamlTestDataForAPI1 apitestdata) {
		String id = apitestdata.getPhotoId();
		SinglePhoto singlePhotoActualData = SinglePhotoBusinessLogic.getSinglePhotoDataFor(id);
		//LOGGER.info(singlePhotoActualData);

		Assert.assertEquals(singlePhotoActualData.getId(), id);
		Assert.assertEquals(singlePhotoActualData.getAlbumId(), "7");
		Assert.assertTrue(singlePhotoActualData.getUrl().startsWith("https://via.placeholder.com/600/"));
		Assert.assertTrue(singlePhotoActualData.getThumbnailUrl().startsWith("https://via.placeholder.com/150/"));
	}
}
