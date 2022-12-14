class Apple
{
	@Override
	public String toString()
	{
		return "πππππ";
	}
}

class Orange
{
	@Override
	public String toString()
	{
		return "πππππ";
	}
}

class Box <T>
{
	private T obj;
	
	// κΈ°λ³Έμμ±μ
	public Box()
	{
		obj = null;
	}
	
	// μ€λ²λ‘λ©λ μμ±μ
	public Box(T obj)
	{
		this.obj = obj;
	}
	//////////////////////////////
	
	public void set(T obj)
	{
		this.obj = obj;
	}
	
	public T get()
	{
		return obj;
	}
	
	@Override
	public String toString()
	{
		return "Box[" + obj.toString() + "]";
	}
}


class DoubleBox <L, R>
{
	private L left;		
	private R right;	
	
	// κΈ°λ³Έμμ±μ
	public DoubleBox()
	{
		left = null;
		right = null;
	}
	
	// μ€λ²λ‘λ©λ μμ±μ
	public DoubleBox(L left, R right)
	{
		this.left = left;
		this.right = right;
	}
	
	//////////////////////////////////////////
	
	public void set(L left, R right)
	{
		this.left = left;
		this.right = right;
	}
	
	public L getLeft()
	{
		return left;
	}
	
	public R getRight()
	{
		return right;
	}
	
	public void setLeft(L left)
	{
		this.left = left;
	}
	
	public void setRight(R right)
	{
		this.right = right;
	}
	
	@Override
	public String toString()
	{
		return "DoubleBox[" + left.toString() + " : " + right.toString() + "]";
	}
}

public class Main {

	public static void main(String[] args) 
	{
		// STEP01> κ³ΌμΌ κ°μ²΄ μμ±
		Orange orange = new Orange();
		Apple apple = new Apple();
		
//		System.out.println(orange);
//		System.out.println(apple);
//		System.out.println("=============================================");
		
		// STEP02> κ° κ³ΌμΌμ λν λ°μ€κ°μ²΄ μμ±
		Box<Orange> orgBox = new Box<Orange>();
		Box<Apple> appleBox = new Box<Apple>();
		
		// λ°μ€μμ κ°κ°μ κ³ΌμΌ λ£μ΄μ£ΌκΈ°
		orgBox.set(orange);
		appleBox.set(apple);
		
//		System.out.println(orgBox);
//		System.out.println(appleBox);
//		System.out.println("=============================================");
		
		// STEP03> λλΈλ°μ€μ λν κ°μ²΄ μμ±
		DoubleBox<Box<Orange>, Box<Apple>> doubleBox = new DoubleBox<Box<Orange>, Box<Apple>>();
		
		// λλΈλ°μ€μμ λ°μ€λ€ λ£μ΄μ£ΌκΈ°
		doubleBox.set(orgBox, appleBox);
		
		// toString()
		System.out.println(doubleBox);
		
		///////////////////////////////////////////////////////////////////////
		
		// 1-1. AppleBoxλ₯Ό λμ§μ΄λΈλ€.
		Box<Apple> outAppleBox = doubleBox.getRight();
		System.out.println("μ¬κ³Όλ°μ€λ₯Ό λμ§μ΄λ΄μ : " + outAppleBox);
		
		// 1-2. Appleμ λμ§μ΄λΈλ€.
		Apple outApple = outAppleBox.get();
		System.out.println("μ¬κ³Όλ₯Ό λμ§μ΄λ΄μ : " + outApple);
		
		// 2-1. OrangeBoxλ₯Ό λμ§μ΄λΈλ€.
		Box<Orange> outOrangeBox = doubleBox.getLeft();
		System.out.println("μ€λ μ§λ°μ€λ₯Ό λμ§μ΄λ΄μ : " + outOrangeBox);
		
		// 2-2. Orangeλ₯Ό λμ§μ΄λΈλ€.
		Orange outOrange = outOrangeBox.get();
		System.out.println("μ€λ μ§λ₯Ό λμ§μ΄λ΄μ : " + outOrange);
	}

}
