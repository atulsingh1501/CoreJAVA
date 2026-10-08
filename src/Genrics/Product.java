package Genrics;

public class Product<K , V> {
    K key;
    V value;

    Product(K key , V value){
        this.key = key;
        this.value = value;
    }
    public K getKey(){
        return this.key;
    }
    public V getValue(){
        return this.value;
    }

    static void main() {
        Product<String,Double> product = new Product<>("Apple",0.50);
        System.out.println(product.getKey());
    }
}
