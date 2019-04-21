//Textual Representation of the object will look like in the memory
// Whatever we write in the class represents the property of the object 
// If you want anything which should belong to class make it static
class Product{

	int pid ; 
	String name;
	int price;

	//Constructor
	Product(){

		System.out.println(">>>>> Product Object Constructed >>>>>>");
	}

	//Method (Behaviour)
	//To write data in the prduct object


	void AddProduct(int pid , String name , int price){
		this.pid = pid;
		this.name = name;
		this.price = price;
		System.out.println(">>Data written in the Product Object>>>");
	}

	//To read data from the object

	void ShowProduct(){
		System.out.println("----------------Product Id : " + pid + "----------");
		System.out.println("Product Name : " + name  );
		System.out.println("Product Price : " + price  );
		System.out.println("---------------------------------------------------");
	}

	//Setter
	void setPid(int pid){
		this.pid = pid;  //this means refernrce to the current object 
		//LHS belong to the object and RHS belong to the methods
	}

	//Getter
	int getPid(){
		return pid;
	}


}


class Mobile extends Product{
	//Is A relationship

	//Mobile is a Child and Product is a Parent

	//Additional attributes other than the Product attributes
	String os;
	int ram;
	int sdcard;

	Mobile(){
		System.out.println(">>>>>> Object Mobile Constructed >>>>>");
	}

	//we have redefined the same method from the parent to the child with the different inputs
	//we have now 2 methods in the child , 1 from parent and other from  the child
	//both are deffernt on the based on inputs even the name is same
	//METHOD OVERLOADING : Same method with different inputs
	//METHOD OVERLOADING also known as Compiletime Polymorphism or Static Polymorphism , where the Compiler will decide which method to execute
	/*
		Rules for Compile time Polymorphism
		1. Overloaded method must have different argumented list
		2. It can have different return types if argument list is different
		3. It can throw different exceptions 
		4. It can have different access modifiers
	*/ 

	void AddProduct(int pid , String name , int price , String os , int ram , int sdcard){
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.os = os;
		this.ram = ram;
		this.sdcard = sdcard;
		System.out.println(">>Data written in the Product Object>>>");
	}

	//Redefining the show method as well
	//But here we have same inputs 
	// 2 methods 1 in child and 1 in from parent , now we have same signatures
	// child methods will be exected not the parent method
	// METHOD OVERRIDING : Same method name with same inputs in Parent Child Relationships
	// The best example of Dymanic or Runtime Polymorphism is METHOD OVERIDING ,because the runtime polymorphism is resolved during the runtime
	/*
		Rules for Overriding

		1.Overriden method argument list must match the overriden method 
		2.The return type must be same or the subtype of overriden method 
		3.Access level cannot be more restrictive than overriden method

	*/

	void ShowProduct(){
		System.out.println("----------------Product Id : " + pid + "----------");
		System.out.println("Product Name : " + name  );
		System.out.println("Product Price : " + price+".rs"  );
		System.out.println("Product os : " + os  );
		System.out.println("Product ram : " + ram + "GB"  );
		System.out.println("Product memory : " + sdcard + "GB" );
		System.out.println("---------------------------------------------------");
	}

}

public class Inheritanceapp{
			//main is executed by JVM when my program will run 
		public static void main(String[] args){

			//Create an object product
/*
			Product product  = new Product();

			//product is not an object it is a reference variable which holds the hashcode of the object in the hexacecimal code

			System.out.println("product " + product); //we get 6d06d69c as hash code of the class Product

			product.AddProduct(100 , "Nokia" , 120000);
			product.ShowProduct();
			product.AddProduct(100 , "Samsung" , 130000);
			product.ShowProduct();
			product.ShowProduct();

			Product product1 = new Product();

			product1.setPid(201);
			product1.name = "OPPO";
			product1.price = 23000;

			product1.ShowProduct();*/

			//Requesting the object constructed
			Mobile mobile = new Mobile();

			//Product object gets constructed before the Mobile Object gets constructed || --> Rule to Inheritance (object to object)
			mobile.AddProduct(2012 , "VIVO" , 250000);
			mobile.ShowProduct();
			mobile.AddProduct(2013 , "MI" , 2630000 , "COLOR" , 4 , 64);
			mobile.ShowProduct();


	}
}


/* Syntax class SubClass extends SuperClass
{
	//methods and fields
}

Advantages
----Code Reusability
----Extensibility
----Overiding
----Data Hiding
*/