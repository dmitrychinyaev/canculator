import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> y > 0 ? x / y : 0;


    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;


}

//  Ошибка заключалась в том, что в переменной devide не было учтено деление на ноль.
//  Это можно исправить, либо с помощью тернарного оператора, либо прописать блок.


//     {
//       if (y == 0){
//           System.out.println("На ноль делить нельзя");
//        }else {
//            return x / y;
//        }
//        return 0;
//    };


//     y > 0 ? x / y : 99999999;