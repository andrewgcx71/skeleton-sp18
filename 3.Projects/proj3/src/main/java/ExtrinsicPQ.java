
public interface ExtrinsicPQ<T> {
    void insert(T var1, double var2);

    T peek();

    T removeMin();

    void changePriority(T var1, double var2);

    int size();
}