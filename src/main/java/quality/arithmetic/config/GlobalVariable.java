package quality.arithmetic.config;

/**
 * 	全局变量
 * */
public enum GlobalVariable {
	
	CHECK_DB("db"),
	TABLE_NAME("table"),
	COLUMN_NAME("column");
	
	private String variable;
	
	GlobalVariable(String variable) {
		this.variable = variable;
	}

	public String getVariable() {
		return variable;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}
}
