package InheritanceExample;

//class B extends A {
//
//	// 3 Variables inherited + 2 variables = 5
//	private String address;
//	private int phone;
//
//	public B() {
//	// local variables
//	this.address= "";
//	this.phone = 0;
//	// inherited variables
//	super.setName("");
//	super.setAge(0);
//	super.setID(0);
//	}
//
//	public B(String address, int phone) {
//	this.address = address;
//	this.phone = phone;
//	} 
//	public String getAddress() {
//	return address;
//	} 
//	public void setAddress(String address) {
//	this.address = address;
//	} 
//	public int getPhone() {
//	return phone;
//	} public void setPhone(int phone) {
//	this.phone = phone;
//	}


	public class B extends A {

		// 3 Variables inherited + 2 variables = 5
		private String address;
		private int phone;


		// the job of the constructor is to initialize the variables of the class
		// we know that we have 2 local variables and we inherit 3 variables
		public B() {
		super();

		// local variables
		this.address= "";
		this.phone = 0; }

		public B(String address) {
		this();
		this.address = address;
		}

		public B(String name, int age, int id, String address, int phone) {
		this(address);
		// super(name, age, id);
		this.address = address;
		this.phone = phone;
		super.setName(name);
		super.setAge(age);
		super.setID(id);


		}
		public String getAddress() {
		return address;
		} public void setAddress(String address) {
		this.address = address;
		} public int getPhone() {
		return phone;
		} public void setPhone(int phone) {
		this.phone = phone;
		}




	//	}


	}
