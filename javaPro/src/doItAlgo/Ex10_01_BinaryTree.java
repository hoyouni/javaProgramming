package doItAlgo;

import java.util.Comparator;

public class Ex10_01_BinaryTree<K, V> {
	static class Node<K, V> {
		private K key;
		private V data;
		private Node<K, V> left;
		private Node<K, V> right;
		
		Node(K key, V data, Node<K, V> left, Node<K, V> right) {
			this.key = key;
			this.data = data;
			this.left = left;
			this.right = right;
		}
		
		K getKey() {
			return key;
		}
		
		V getValue() {
			return data;
		}
		
		void print() {
			System.out.println(data);
		}
		
	} // Node
	
	private Node<K, V> root;
	private Comparator<? super K> comparator = null;
	
	public Ex10_01_BinaryTree() {
		root = null;
	}
	
	public Ex10_01_BinaryTree(Comparator<? super K> c) {
		this();
		comparator = c;
	}
	
	// 두 키 값을 비교 
	private int comp(K key1, K key2) {
		return (comparator == null) ? ((Comparable<K>)key1).compareTo(key2) : comparator.compare(key1, key2);
	}
	
	// 노드 검색
	public V search(K key) {
		Node<K, V> p = root;
		
		while(true) {
			if(p == null) {
				return null;
			}
			int cond = comp(key, p.getKey());
			
			if(cond == 0) {
				return p.getValue();
			}
			else if(cond < 0) {
				p = p.left;
			}
			else {
				p = p.right;
			}
		}
	}
	
	
} // BinaryTree Class







































