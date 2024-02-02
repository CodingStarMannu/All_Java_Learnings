package hashmap;

// important asked in interviews
import java.util.ArrayList;

public class Map<K,V> {
	
	ArrayList<MapNode<K,V>> buckets;
	int count;
	int numBuckets;
	
	
	public Map() {
		
		buckets = new ArrayList<>();
		numBuckets = 20;
		for(int i = 0; i< numBuckets; i++) {
			buckets.add(null);
		}
	}
	
	public double loadFactor() {
		return (1.0 * count)/ numBuckets;
	}
	
	//Rehashing
	private void reHash() {
		
		ArrayList<MapNode<K,V>> temp = buckets;
		buckets = new ArrayList<>();
		for( int i =0;i< 2* numBuckets; i++) {
			buckets.add(null);
		}
		count = 0;
		numBuckets = numBuckets * 2;
		for( int i = 0; i< temp.size(); i++) {
			MapNode < K,V > head = temp.get(i);
			while(head != null) {
				K key = head.key;
				V value = head.value; 
				insert(key, value);
				head = head.next;
			}
		}
	}
	
	//Insert
	private int getBucketIndex(K key) {
		int hc = key.hashCode();
		int index = hc % numBuckets;
		return index;
	}
	public void insert( K key, V value) {
		
		int bucketIndex = getBucketIndex(key);
		MapNode<K,V> head = buckets.get(bucketIndex);
		
		// if element is already there? just update its value;
		while(head != null) {
			if(head.key.equals(key)) {
				head.value = value;
			}
			head = head.next;
			
		}
		//if element is not there, insert at the 0th position of the linked list.
		head = buckets.get(bucketIndex);
		MapNode<K, V > newNode = new MapNode<>(key,value);
		newNode.next = head;
		buckets.set(bucketIndex, newNode);
		count++;
		double loadfactor = (1.0 * count)/ numBuckets;
		if(loadfactor > 0.7) {
			reHash();
		}
	}
	
	//size
	public int size() {
		return count;
	}
	
	//Get value
	public V getValue(K key) {
		int bucketIndex = getBucketIndex(key);
		MapNode<K,V> head = buckets.get(bucketIndex);
		
		// if element is already there? just update its value;
		while(head != null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head = head.next;
			
		}
		return null;
	}
	
	//remove
	
	public V removeKey( K key) {
		int bucketIndex = getBucketIndex(key);
		MapNode<K,V> head = buckets.get(bucketIndex);
		MapNode<K,V> prev = null;
		// if element is already there? just update its value;
		while(head != null) {
			if(head.key.equals(key)) {
				if( prev != null) {
				prev.next = head.next;
			}else {
				buckets.set(bucketIndex, head.next);
				}
				count--;
				return head.value;
			}
			prev = head;
			head = head.next;
			}
			return null;
	}
	
	
}
