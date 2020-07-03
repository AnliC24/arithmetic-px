package quality.arithmetic.config;

/**
 * @author 王诚沣
 * @下午5:27:37
 * @description	
 * @version
 */
public enum GlobalDataSource {
	
	BreakAfterAcquireFailure(true),
	ConnectionErrorRetryAttempts(0),
	MaxWait(500);
	
	private Object param;
	
	private GlobalDataSource(Object param) {
		this.param = param;
	}

	public Object getParam() {
		return param;
	}

	public void setParam(Object param) {
		this.param = param;
	}

}
