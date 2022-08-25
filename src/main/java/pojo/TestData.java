package pojo;

import java.util.List;

public class TestData {
    public String testId;
    public List<QueryParam> queryParam;
    public List<PathParam> pathParam;
    public List<Headers> header;
    public String body;
    public Long responseTime = Long.valueOf(30);
    public  String subject;
    }

