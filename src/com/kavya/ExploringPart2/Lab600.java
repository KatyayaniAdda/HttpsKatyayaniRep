package com.kavya.ExploringPart2;

public class Lab600 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Object obj = new Object();
		Student stu = new Student(5,"fdf");
		Person per = new Person(4,
				"jhj");
		// Class cls =obj.getClass();
		Class cls = per.getClass();
		System.out.println(cls.getName()+cls.getPackageName()+"\t"+cls.getClassLoader());
		System.out.println(cls.getSuperclass()+cls.getTypeName());
		System.out.println(cls.getCanonicalName());
		
		System.out.println(cls.getCanonicalName()+"\t"+cls.getModifiers());
		System.out.println(stu.hashCode());
		System.out.println(per.getClass().getName());
		System.out.println(per);
		Person p1 = new Person(1, "AA");
		Person p2 = new Person(2, "BB");
		Person p3 =(Person) p2.clone();
		System.out.println("\n"+(p1==p2));
		System.out.println(p3==p2);
		System.out.println(p2.equals(p3));
		System.out.println(p1.equals(p2));
		
		Runtime rt =Runtime.getRuntime();
		System.out.println(rt.availableProcessors());
		System.out.println(rt.maxMemory());
		System.out.println(rt.totalMemory());
		System.out.println(rt.version());
		rt.runFinalization();
	}

}

class Person implements Cloneable{
	int id;
	String name;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public Person(int id, String name) {
		this.id=id;
		this.name=name;
	}
}

class Student extends Person {

	public Student(int id, String name) {
		super(id, name);
	}
	
}