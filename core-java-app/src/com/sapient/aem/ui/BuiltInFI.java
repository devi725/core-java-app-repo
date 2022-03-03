package com.sapient.aem.ui;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Supplier;

public class BuiltInFI {

	public static void main(String[] args) {
		/*
		 * Supplier<T> : T get()
		 * Consumer<T>: void accept(T t);
		 * BiConsumer<T,U>: void accept(T t, U u);
		 * Predicate<T>: boolean test(T t);
		 * BiPredicate<T,u>: boolean test(T t, U u);
		 * Function<T,R>:  R apply(T t);
		 * BiFunction<T,U,R>:   R apply(T t, U u);
		 */
				System.out.println("Supplier Example");
				Supplier<String> s1= ()->"Hi,Welcome";
				System.out.println(s1.get());
				System.out.println("Consumer Example");
				Consumer<String> c1= (s)->System.out.println(s);
				c1.accept("Hi, Welcome");
				System.out.println("BiConsumer Example");
				BiConsumer<String,String> c2= (fn,ln)-> System.out.println(fn+" "+ln);
				c2.accept("Ravi", "Kumar");
				/*
				 * Method receives userid and password, return false if
				 * both are same else returns true.
				 * 
				 * Use BiPredicate
				 */
				System.out.println("BiPredicate Example");
//				BiPredicate<String,String> p1 = (ui,pa)-> {
//						if(ui.equals(pa)) {
//							return false;
//						}else {
//							return true;
//						}
//				};
				
				BiPredicate<String,String> p1 = (ui,pa)-> (ui.equals(pa))?false:true;
				
				System.out.println(p1.test("admin","admin"));
				System.out.println(p1.test("admin","admin@123"));
				
				System.out.println("Function Example");
				Function<Integer,Long> f1 = (n)->{
						Long fact=	1L;
						while(n>0) {
							fact=fact*n--;
						}
						return fact;
				};
				
				System.out.println("Factorial of 5 = "+ f1.apply(5));
				
				System.out.println("BiFunction Example");
				//Long power(Integer,Integer);
				BiFunction<Integer,Integer,Long> f2 = (a,b)->{
					Long result=1L;
					while(b>0) {
						result=result*a;
						b--;
					}
					return result;
				};
				
				System.out.println("2 to the power of 5 is "+ f2.apply(2, 5));
				
				System.out.println("IntConsumer Example");
				Consumer<Integer> c3= (n)->System.out.println(n*n);
				c3.accept(4);
				//same as
				IntConsumer c4 = (m)->System.out.println(m*m);
				c4.accept(4);

				System.out.println("Method Reference Example");
//				Consumer<Integer> c5 = (o)->System.out.println(o);
				Consumer<Integer> c5 = System.out::println;
				c5.accept(10);


	}

}
