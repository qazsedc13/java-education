package ru.qazsedc13.home;

public class Operators {
	public static void display(int value){
		System.out.println("Binary="+Integer.toBinaryString(value)+" Decimal="+value);
	}

	public static void main(String[] args) {
		
		/************Битовые (поразрядные) операторы Java********/
		// ~ Ударное отрицание (NOT)
		
//		int b1 = 0b10101010101010101010101101010101;
//		int b2=~b1;
//		display(b1);
//		display(b2);
		
		// & Поразрядное И (AND)
		
//		b1=0b101010;
//		b2=0b111101;
//		int b3=b1&b2;
//		display(b1);
//		display(b2);
//		display(b3);
		
		// | Поразрядное ИЛИ (OR)
		
//		b1=0b101010;
//		b2=0b111001;
//		int b3=b1|b2;
//		display(b1);
//		display(b2);
//		display(b3);
		
		// ^ Поразрядное исключающее ИЛИ (XOR)
		
//		b1=0b101010;
//		b2=0b111001;
//		int b3=b1^b2;
//		display(b1);
//		display(b2);
//		display(b3);
		
		// << Сдвиг битов влево
		
//		b1 = 0b0101010101010101010101011010101;
//		display(b1);
//		display(b1<<1);
		
		// << Сдвиг битов вправо
		
//		b1 = 11;
//		display(b1);
//		display(b1>>1);
		
		// >>> Сдвиг битов вправо с заполнением старшего бита нулем
		
//		b1 = -576389;
//		display(b1);
//		for(int i=1;i<=32;i++)
//			display(b1>>>i);
		
		// &=, | =, ^=, <<=, >>=, >>>= Присвоение с аналогичной операцией
//		int b=0b101;
//		display(b);
//		b&=0b110; //По сути это короткая форма, b1&=b2   b1=b1&b2 с другими аналогично
//		display(b);
		
		/************Арифметические операторы Java***********/
		
		// +, -, *, /, %
//		int i=1+2;
//		System.out.println(i);
//		i=3-5;
//		System.out.println(i);
//		i=3*5;
//		System.out.println(i);
//		i=5/2; // целочисленное деление, т.е. остаток отбрасывается
//		System.out.println(i);
//		i=15%10; // получени остатка
//		System.out.println(i);
		
		
		// ++ инкремент
		
//		int i=5;
//		i++; // прибавляет 1 
//		System.out.println(i);
//		System.out.println(++i);// сначала производится вычисление, потом добавляем 1 и выводим на экран
//		System.out.println(i++);// сначала используем(выводим на экран)потом добавляем 1
		
		// -- декремент
		
//		int g=10;
//		g--; // отнимает 1
//		System.out.println(g);
		
		// += присваивание со сложением
		
//		int i = 2;
//		i+=5;
//		System.out.println(i);
		
		// -= присваивание с вычитанием
		
//		int i = 2;
//		i-=5;
//		System.out.println(i);
		
		// *= присваивание с умножением (см. выше)
		// /= присваивание с делением
		// %= присваивание с вычислением остатка
		
//		int p = 9;
//		p%=7;
//		System.out.println(p);
		
		/************Операторы сравнения Java***********/
		
		// == равно
		
//		boolean b = 3==4; // ложь
//		System.out.println(b);
		
		// != не равно
//		b = 3!=34; // ложь
//		System.out.println(b);
		
		// > больше
//		System.out.println(5>3); // правда
		
		// < меньше
		// >= больше или равно
		// <= меньше или равно
		
		
		/************Булевские логические операторы***********/
		// http://www.youtube.com/watch?v=ZQ3I9KpX4y0&list=PLwcDaxeEINae8sn4rSFEIJRc6X6x03TMn&index=12
		
		// & Логическое И (AND)
		boolean b= true&false;
//		System.out.println(b);
		
		// | Логическое ИЛИ (OR)
		
		b = true|false;
//		System.out.println(b);
		
		// ^ Логическое XOR (исключающее ИЛИ)
		
		b = true^true;
//		System.out.println(b);
		
		// ! Логическое унарное NOT (НЕ)
		
		b=true;
		boolean c=!b;
//		System.out.println(c);
		
		// &= AND с присвоением
		
		b=true;
		b&=false;
//		System.out.println(b);
		
		// |= OR с присваиванием
		b=true;
		b|=false; // b= b|false
//		System.out.println(b);
		
		// ^= XOR с присваиванием
		
		b=false;
		b^=false;
//		System.out.println(b); // будет истиной когда один истина другой лож, во всех остальных ложь

		// == равно
		
		b=true;
		c=false;
		boolean d = b==c;
//		System.out.println(d);
		
		// != не равно
		b=true;
		c=false;
		d=b!=c;
//		System.out.println(d);
		
		// || замыкающее или (OR)
		b=false;
		c=false;
		d=b||c;
//		System.out.println(d);// второй (с) не будт вычисляться если b истина
		int i=0;
		if(i==0||i++==0)
		{}
//		System.out.println(i);
		
		// && замыкающее и (AND)
		b=true;
		c=true;
		d=b&&c;
//		System.out.println(d);
		
		i=5;
		if(i==0&&i++==0)// если первая часть ложь, вторая не выполняется
		{}
//		System.out.println(i); 
		
	}

}
