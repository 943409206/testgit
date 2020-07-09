
public enum SeasonInfo {
    
	Spring("春天","一年之计在于春"),
	Sunmmer("夏天","映日荷花别样红");
	private final String name;
	private final String desc;
	private SeasonInfo(String name,String desc) {
		this.name=name;
		this.desc=desc;
	}
}
