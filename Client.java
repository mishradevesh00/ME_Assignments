package project1;

// Here we are writing our main method.

public class Client {

	public static void main(String[] args) {
		// Object Construction
		
		Employee e= new Employee();
		e.setEid(101);
		e.setName("Devesh");
		e.setAddress("Varanasi");
		System.out.println("Employee Details: "+e); 
		
		
		
		//When I will print this 'e' it's gonna call toString() method and we get the details as shown in toString().
// In console we can see the employee details.
// Who created object now? So the object creation was done by us(developer)
		
// Now we want to do it in Spring Way:		
		// Spring
		// IOC: you do not create objects.
		// Objects shall be configured in an XML file by the developer.
		// Spring container: Responsible to construct the java objects by parsing XML file.
		// Benefit of having such object is that XML file is not part of your source code,
		//So you can configure in any time manipulating the values and objects will be constructed accordingly.
		
		Resource resource=new ClassPathResource("employeebean.xml");
		BeanFactory factory= new XmlBeanFactory(resource);
		
		// Resource and BeanFactory are interface in spring framework 
		// This is spring core container which shall parse the XML file and construct the objects.
		
		Employee e1=(Employee)factory.getBean("emp1");
		Employee e2=(Employee)factory.getBean("emp2");
		
		//Now objects are created by the container and we are just giving the reference to the objects.
		
		
		System.out.println(e1);
		System.out.println(e2);

	}

}
