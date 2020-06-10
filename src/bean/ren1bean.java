package bean;

public class ren1bean {
	private String gakuseki;
	private String name;

	public ren1bean(){

	}

	public ren1bean(String ga , String na){
		this.gakuseki = ga;
		this.name = na;
	}


	//自分の持っている値をすべて表示するメソッド
	public String showMyData(){
		StringBuilder s = new StringBuilder();

		s.append("学籍番号は" + gakuseki +"<br>");
		s.append("名前は" + name + "<br>");
		return s.toString();
	}

	public String gakuseki() {
		return gakuseki;
	}
	public void setgakuseki(String gakuseki) {
		this.gakuseki = gakuseki;
	}
	public String name() {
		return name;
	}
	public void name(String name) {
		this.name = name;
	}

	public String getGakuseki() {
		return gakuseki;
	}

	public void setGakuseki(String gakuseki) {
		this.gakuseki = gakuseki;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}