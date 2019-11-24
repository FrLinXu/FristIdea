/**
 * This is a superclass.
 * @version1.0, 2018-10-19
 * @author He Yongqiang.
 *
 */
public class Dog 
{
	private String name="noname";
	private String color="unknown";
	private double age=0.0;
	////////////////////
	public static void info()
	{
		System.out.println("Dog类描述狗这种动物。");
	}
	public Dog(String name, String color)
	{
		this.name=name;
		this.color=color;
		this.age=0;
	}
	public Dog(String name, String color, double age)
	{
		this( name, color);
		this.age=age;
	}
	
	public  Dog()
	{
//		this.name="noname";
//		this.color="not know";
//		this.age=0;
	}
	
	public void setDog(String name, String color, double age)
	{
		this.name=name;
		this.color=color;
		this.age=age;		
	}
	public void show()
	{
		System.out.println("name:"+name);
		System.out.println("color:"+color);
		System.out.println("age:"+age);
	}
	public void run()
	{
		System.out.println("我可以跑。");
	}

	@Override
	public String toString() {
		System.out.println("my name is "+name);
		System.out.println("my color is " +color);
		return super.toString()+"my name is "+name+"my color is " +color;
	}


	public boolean equals(Dog dog) {
		boolean flag = false ;
		if (dog.color.equals(this.color) && dog.name.equals(this.name) && dog.age == this.age){
			flag = true;
		}
		return  flag;
	}

	@Override
	public int hashCode() {
		return name.hashCode(); //使用名字的哈希值判断
	}
}
class  LargeDog extends Dog {

}
