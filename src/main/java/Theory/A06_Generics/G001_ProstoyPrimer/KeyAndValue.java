package Theory.A06_Generics.G001_ProstoyPrimer;

public class KeyAndValue<K, V> {
    private K key;
    private V value;

    public KeyAndValue(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
    @Override
    public String toString() {
        return key + " : " + value;
    }
}
