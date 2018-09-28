class hospital{
	void name(){
		System.out.println("hospital name is Columbia Asia");
	}
}
class Manipal extends hospital{
	void name(){
		System.out.println("hospital name is Manipal");
}}

class hospitals extends hospital{
	void name(){
		System.out.println("hospital name is Sagar Appolo");
	}
	public static void main(String[] args){
		hospital obj_1 = new hospital();
		Manipal obj_2 = new Manipal();
		hospitals obj_3 = new hospitals();

		obj_1.name();
		obj_2.name();
		obj_3.name();
	}
}