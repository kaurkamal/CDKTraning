class Company1 {
	
   	@Company(name = "CDK" , location = "Pune")
	public void companyStrategies() {
		System.out.println("Stratigies are : xyz");
	}
	public void companyBranch() {
		System.out.println("location of company is : yerwada,pune");
	}
	public static void main(String[] args){
		Company1 c = new Company1();
		c.companyStrategies();
		c.companyBranch();
	}
}