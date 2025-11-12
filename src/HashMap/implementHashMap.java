package HashMap;

import java.util.ArrayList;
import java.util.LinkedList;

public class implementHashMap {
    static class HashMap<K,V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V val) {
                this.key = key;
                this.value = val;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> bucket[];

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.bucket = new LinkedList[4];
            for (int i=0; i<4; i++) {
                this.bucket[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }
        private int SearchInLL(K key, int bi) {
            LinkedList<Node> ll = bucket[bi];

            int di = 0;
            for(int i=0; i<ll.size(); i++) {
                Node curr = ll.get(i);
                if (curr.key == key) {
                    return di;
                }
                di++;
            }

            return -1;
        }

        @SuppressWarnings("unchecked")
        private void reHash() {
            LinkedList<Node> oldBuck[] = bucket;
            bucket = new LinkedList[N*2];
            N = N*2;

            for(int i =0; i< bucket.length; i++) {
                bucket[i] = new LinkedList<>();
            }

            for(int i=0;i<oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                for (int j=0; j< ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }
        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if (di != -1) {
                Node node = bucket[bi].get(di);
                node.value = value;
            } else {
                bucket[bi].add(new Node(key, value));
                n++;
            }
            double lambda = (double) n/N;

            if (lambda > 2.0) {
                reHash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if (bi == -1) {
                return false;
            } else {
                return true;
            }         
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if (di != -1) {
                Node node = bucket[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if (di != -1) {
                Node node = bucket[bi].remove(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0; i<bucket.length; i++) {
                LinkedList<Node> ll = bucket[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n==0;
        }
    }

    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("Bangladesh", 900);
        hm.put("US", 900);
 
        ArrayList<String> keys = hm.keySet();

        for (String key : keys) {
            System.out.println(key);
        }
        System.out.println(hm.get("India"));
                System.out.println(hm.remove("India"));
            System.out.println(hm.get("India"));


    }
}
