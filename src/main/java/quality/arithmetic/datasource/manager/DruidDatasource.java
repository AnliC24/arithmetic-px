package quality.arithmetic.datasource.manager;

import org.apache.commons.lang.StringUtils;
import quality.arithmetic.config.GlobalConstants;

/**
 * @author cfwang
 * @version 1.1 质量包 -- 数据源配置
 * dataSourceEnName 数据源英文名
 * dataSourceCnName 数据源中文名
 * dataSourceType   数据源类型
 * url              连接路径
 * host             ip地址
 * port             端口号
 * user             用户名
 * password         用户密码
 * driverClass      默认驱动
 * */
public class DruidDatasource {

    private String dataSourceEnName;
    private String url;
    private String host;
    private String port;
    private String user;
    private String password;
    private String dataSourceCnName;
    private String dataSourceType;
    private String driverClass;

    public String getDataSourceEnName() {
        return dataSourceEnName;
    }

    public void setDataSourceEnName(String dataSourceEnName) {
        this.dataSourceEnName = dataSourceEnName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDataSourceCnName() {
        return dataSourceCnName;
    }

    public void setDataSourceCnName(String dataSourceCnName) {
        this.dataSourceCnName = dataSourceCnName;
    }

    public String getDataSourceType() {
        return dataSourceType;
    }

    public void setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getDriverClass() {
        if(StringUtils.isEmpty(driverClass)){
            switch (dataSourceType){
                case GlobalConstants.MYSQL:
                    setDriverClass(GlobalConstants.MYSQL_DRIVER);
                    break;
                case GlobalConstants.ORACLE:
                    setDriverClass(GlobalConstants.ORACLE_DRIVER);
                    break;
                case GlobalConstants.HIVE:
                    setDriverClass(GlobalConstants.HIVE_DRIVER);
                    break;
                case GlobalConstants.TERADATA:
                    setDriverClass(GlobalConstants.TERADATA_DRIVER);
                    break;
                default:
                    throw new DataSourceException("暂时不支持"+dataSourceType+"类型的数据库");
            }
        }
        return driverClass;
    }

    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }
}
