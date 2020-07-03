package quality.arithmetic.config;

/**
 * @author 王诚沣
 * @version 1.0
 */
public enum GlobalDataSource {
	
	BreakAfterAcquireFailure(true),
	ConnectionErrorRetryAttempts(0),
	MaxWait(500),
	FETCH_SIZE(500),
	MAX_ROWS(100);
	
	private Object param;
	
	GlobalDataSource(Object param) {
		this.param = param;
	}

	public Object getParam() {
		return param;
	}

	public void setParam(Object param) {
		this.param = param;
	}

}
