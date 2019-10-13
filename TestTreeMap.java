package cn.test.collection;

import java.util.Map;
import java.util.TreeMap;

/**
 * TreeMap是红黑二叉树的典型实现，在需要排序时才实现TreeMap
 * @author dell
 *
 */

public class TestTreeMap {
	public static void main(String[] args) {
		Map<Integer,String> map=new TreeMap<>();
		map.put(1, "3");
		map.put(4, "5");
		map.put(2, "3");
		map.put(7, "5");
		map.put(5, "3");
		map.put(9, "5");
		
		for(Integer key:map.keySet()) {
			System.out.print(key+"---"+map.get(key));
		}
		System.out.println();
		Map<Emp,String> treemap=new TreeMap<>();
		treemap.put(new Emp(103,"aaa",6003), "1");
		treemap.put(new Emp(101,"aa",60),  "1");
		treemap.put(new Emp(105,"a",600307),  "1");
		treemap.put(new Emp(100,"oaaa",6007), "1");
		for(Emp key:treemap.keySet()) {
			System.out.println(key+"---"+treemap.get(key));
		}
		
	}

}
class Emp implements Comparable<Emp>{
	int id;
	String name;
	double salay;
	 public Emp(int id, String name, double salay) {
		super();
		this.id = id;
		this.name = name;
		this.salay = salay;
	}
	 
	 public Emp() {
		 
	 }
	//比较引用类型的大小
	public int compareTo(Emp e) {//负数：< 正数：>  0：=
		if(this.salay>e.salay) {
			return 1;
		}else if(this.salay<e.salay) {
			return -1;
		}else{
			if(this.id>e.id) {
				return 1;
			}else if(this.id<e.id) {
				return -1;
			}
		}
	return 0;
	}
	public String toString() {
		return "id:"+id+" name:"+name+" salay:"+salay;
		
	}
}
	
