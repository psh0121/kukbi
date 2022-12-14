
public class NodeData {
	private int intValue;
	private String strValue;
	
	// 기본생성자
	public NodeData()
	{
		intValue = 0;
		strValue = null;
	}
	
	// 오버로딩된 생성자
	public NodeData(int intValue, String strValue)
	{
		this.intValue = intValue;
		this.strValue = strValue;
	}
	
	// Getter, Setter
	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

	public String getStrValue() {
		return strValue;
	}

	public void setStrValue(String strValue) {
		this.strValue = strValue;
	}

	// 재정의 
	@Override
	public String toString() {
		return "NodeData [intValue=" + intValue + ", strValue=" + strValue + "]";
	}	
	
	
}
