package demos.ex5;

public interface DataProvider<T extends Number> {
    T sum(T a, T b);
}
