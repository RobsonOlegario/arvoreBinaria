package one.digital.innovation.modulo;

public abstract class ObjArvore<T> implements Comparable<T> {

    public abstract boolean equals(Object o);
    public abstract int hashCode();
    public abstract  int comparableTo(T outro);
    public abstract  String toString();

}
