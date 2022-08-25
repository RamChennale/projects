package dataProvider;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pojo.TestData;
import utilities.EnvConfig;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.List;

public class JsonDataReader {

    static final Logger LOGGER= LoggerFactory.getLogger(JsonDataReader.class);
    private static  final String testDataServicePath = "src/test/resources/TestData"+ EnvConfig.getEnv()+ "/";
    private List<TestData> dataList;


    public JsonDataReader(String testDataServiceFile) {
        dataList = getServiceData(testDataServiceFile);
    }

    public List<TestData> getServiceData(String testDataServiceFile){
        LOGGER.info("Reading data file: '{}' ", testDataServiceFile, testDataServicePath);
        Gson gson = new Gson();
        BufferedReader bufferedReader = null ;

    }
}

