package chapter2.filterAppleByLambda;

public interface Predicate<T> {
    Boolean test(T t);
}
