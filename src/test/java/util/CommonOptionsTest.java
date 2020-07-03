package util;

import org.junit.Test;
import quality.arithmetic.datasource.manager.DruidDatasource;
import quality.arithmetic.util.CommonOptions;

public class CommonOptionsTest{

    @Test
    public void testJsonSerializer(){
        DruidDatasource druidDatasource = new DruidDatasource();
        druidDatasource.setDataSourceEnName("TEST");
        druidDatasource.setDataSourceCnName("测试序列化");
        druidDatasource.setDataSourceType("mysql");
        druidDatasource.setUrl("123");
        druidDatasource.setHost("127.0.0.1");
        druidDatasource.setPassword("321");
        druidDatasource.setUser("user");
        CommonOptions.toJSONObject(druidDatasource);
    }


}
