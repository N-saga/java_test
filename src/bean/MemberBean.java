package bean;

public class MemberBean {
	private String firstName;
	private String lastName;
	private String mail;
	private int age;
	private int gender;		//0:男、1:女
	private String id;
	private String pw;

	public MemberBean(){

	}

	public MemberBean(String fn , String ln , String mail , int age ,
						int gen , String id , String pw){
		this.firstName = fn;
		this.lastName = ln;
		this.mail = mail;
		this.age = age;
		this.gender = gen;
		this.id = id;
		this.pw = pw;
	}


	//自分の持っている値をすべて表示するメソッド
	public String showMyData(){
		StringBuilder s = new StringBuilder();

		s.append("名前は" + lastName + firstName + "<br>");
		s.append("メアドは" + mail + "<br>");
		s.append("年齢は" + age + "才<br>");
		s.append("性別は");
		if(gender == 0 ){
			s.append("男です");
		}else {
			s.append("女です");
		}
		s.append("<br>");
		s.append("ログインIDは" + id + "<br>");
		s.append("パスワードは" + pw + "<br>");

		return s.toString();
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}




}
