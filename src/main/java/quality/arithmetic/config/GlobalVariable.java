package quality.arithmetic.config;

/**
 * 	全局变量
 * */
public enum GlobalVariable {
	
	CHECK_DB("checkDb"),
	TABLE_NAME("checkTable"),
	COLUMN_NAME("checkMeta");
	
	private String variable;
	
	private GlobalVariable(String variable) {
		this.variable = variable;
	}

	public String getVariable() {
		return variable;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}
}
