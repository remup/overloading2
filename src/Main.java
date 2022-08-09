import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hii");
		Parent p = new Child();
		p.printMessage();
		p.get().printMessage();
		MethodOverloadingExample moe = new MethodOverloadingExample();
		moe.methodTest(12);

		B bb = new B();
		try {
			bb.method();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		HashSet<String> hashset = new HashSet<>();
		
		hashset.add(null);
		hashset.add(null);
		hashset.add("remya");
		hashset.add("remya");
		
		System.out.println(hashset);
		
		HashMap<String,String> hashMap =new HashMap<>();
		System.out.println(hashMap.put("remya", "value1"));
		System.out.println(hashMap.put("remya", "value2"));
		System.out.println(hashMap.put(null, "value1"));
		System.out.println(hashMap.put(null, "value2"));
		System.out.println(hashMap);

		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();
		list.add(1);
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		//
		// List<Integer> modifiedList =
		// list.stream().map(i->i+10).collect(Collectors.toList());
		// System.out.println(modifiedList);
		//
		List<Integer> modifiedList2 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(modifiedList2);
		// int number =
		// list.stream().filter(i->i%2==0).collect(Collectors.toList()).size();
		// System.out.println("no of even numbers "+number);
		// long number2 = list.stream().filter(i->i%2==0).count();
		//
		// System.out.println("count of even numbers "+number2);
		 Iterator<Integer> iterator = list.iterator();
		
		 while(iterator.hasNext())
		 {
		 Integer i = 0;
		 i=iterator.next();
		 if(i%2==0)
		 {
		
		 list2.add(i);
		 }
		 }
		 System.out.println("filter list "+list2);
		
		//
		// Iterator<Integer> iterator2 = list.iterator();
		// while(iterator2.hasNext())
		// {
		// Integer i = 0;
		// i=iterator2.next();
		// i=i+10;
		//
		//
		// list3.add(i);
		//
		// }
		//
		//
		// System.out.println("add value list "+list3);
		//
		//
		// List<Integer> list4 = new ArrayList<Integer>();
		// list4.add(1);
		// list4.add(10);
		// list4.add(20);
		// list4.add(20);
		// System.out.println(list4.add(30));
		// Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		// Iterator<Integer> iterator3 = list4.iterator();
		// int i = 1;
		// while(iterator3.hasNext())
		// {
		//
		//
		// System.out.println(map.put(iterator3.next(),i));
		// i++;
		//
		//
		// }
		// System.out.println("list4 "+list4);
		// Set<Entry<Integer, Integer>> mapSet= map.entrySet();
		// System.out.println(mapSet);
		// list4.clear();
		// for (Entry<Integer, Integer> entry : mapSet) {
		// list4.add(entry.getKey());
		//
		// }
		//
		// System.out.println(list4);
		//
		//
		// List<Integer> newList =
		// list4.stream().distinct().collect(Collectors.toList());
		// System.out.println("distinct java 8 "+newList);
		//
		//
		//// Collections.sort(list4);
		//// System.out.println("sorted list4 "+list4);
		//
		// Collections.sort(list4, new Comparator<Object>()
		// {
		//
		// @SuppressWarnings("static-access")
		// @Override
		// public int compare(Object arg0, Object arg1) {
		// // TODO Auto-generated method stub
		// Integer a =(Integer)arg0;
		// Integer b =(Integer)arg1;
		// return -Integer.compare(a,b);
		// }
		//
		// }
		// );
		//
		// System.out.println("sorted list4 "+list4);
		//
		// List<Integer> list5 =
		// list4.stream().sorted((i1,j)->(i1<j)?1:(i1>j)?-1:0).collect(Collectors.toList());
		// System.out.println("sorted list by stream "+list5);
		//
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "remya", 12));
		empList.add(new Employee(2, "reshmi", 10));
		//
		List<Employee> empListSorted = empList.stream()
				.sorted((a, b) -> (a.getAge() < b.getAge()) ? 1 : (a.getAge() > b.getAge()) ? -1 : 0)
				.collect(Collectors.toList());
		for (Employee e : empListSorted) {
			System.out.println(e.getId() + " " + e.getName() + "  " + e.getAge());
		}
		// List<Employee> empListSorted2 =
		// empList.stream().sorted((a,b)->(-Integer.valueOf(a.getAge()).compareTo(Integer.valueOf(b.getAge())))).collect(Collectors.toList());
		// for(Employee e2 : empListSorted2){
		// System.out.println(e2.getId()+" "+e2.getName()+" "+e2.getAge());
		// }
		//
		// List<Employee> empListSorted3 =
		// empList.stream().sorted((a,b)->(Integer.valueOf(a.getName().length()).compareTo(Integer.valueOf(b.getName().length())))).collect(Collectors.toList());
		// for(Employee e3 : empListSorted3){
		// System.out.println("sorting on emp name length "+e3.getId()+"
		// "+e3.getName()+" "+e3.getAge());
		// }
		//
		// Comparator<Employee> c =
		// (a,b)->(-Integer.valueOf(a.getName().length()).compareTo(Integer.valueOf(b.getName().length())));
		// List<Employee> empListSorted4 =
		// empList.stream().sorted(c).collect(Collectors.toList());
		// for(Employee e4 : empListSorted4){
		// System.out.println("sorting on emp name length2 "+e4.getId()+"
		// "+e4.getName()+" "+e4.getAge());
		// }
		//
		//
		// Employee minEmployee =
		// empList.stream().max((a,b)->(Integer.valueOf(a.getName().length()).compareTo(Integer.valueOf(b.getName().length())))).get();
		//
		// System.out.println("max employee based on employee name length
		// "+minEmployee.getId()+" "+minEmployee.getName()+" "+minEmployee.getAge());
		//
		// Consumer<Employee> e =k->{
		// System.out.println("employee name is "+k.getName());
		// };
		// empListSorted4.stream().forEach(e);
		// List<Employee> l = new ArrayList<Employee>();
		// l.add(new Employee(3,"ff",3));
		// l.add(new Employee(4,"ggg",5));
		//
		// Employee[] intArr = l.stream().toArray(Employee[]::new);
		// //Employee[] intArr = {new Employee(3,"ff",3),new Employee(4,"ggg",5)};
		// for (Employee num:intArr){
		// System.out.println(num.getName());
		// }
		//
		// Set<Integer> set = new HashSet<Integer>();
		// set.add(1);
		// set.add(2);
		//
		// Integer[] arr = set.stream().toArray(Integer[]::new);
		// for (Integer num:arr){
		// System.out.println(num);
		// }
		//
		// System.out.println(Stream.of(arr).count());
		// List<Integer> li
		// =Stream.of(arr).filter(m->m%2==0).collect(Collectors.toList());
		// System.out.println(li);
		//
		// String s ="g"+8;
		// System.out.println(s);
		//
		//

		List<Map<Integer, Integer>> alist = new ArrayList<>();
		List<Map<Integer, Integer>> blist = new ArrayList<>();

		Map<Integer, Integer> amap = new HashMap<>();

		amap.put(1, 3000);
		amap.put(2, 5000);
		amap.put(3, 7000);
		amap.put(4, 10000);

		alist.add(amap);

		Map<Integer, Integer> bmap = new HashMap<>();

		bmap.put(1, 2000);
		bmap.put(2, 3000);
		bmap.put(3, 4000);
		bmap.put(4, 5000);

		blist.add(bmap);

		Iterator<Map<Integer, Integer>> aiterator = alist.iterator();

		Iterator<Map<Integer, Integer>> biterator = blist.iterator();

		List<Map<Integer, Integer>> anslist = new ArrayList<>();

		Map<Integer, Integer> ansmap = new HashMap<>();

		while (aiterator.hasNext()) {

			for (Map.Entry<Integer, Integer> aset : aiterator.next().entrySet()) {

				for (Map.Entry<Integer, Integer> bset : blist.get(0).entrySet()) {

					int sumVal = aset.getValue() + bset.getValue();
					int totalVal = 10000;

					if (sumVal == totalVal) {

						ansmap.put(aset.getKey(), bset.getKey());
					}

				}
			}

		}

		anslist.add(ansmap);
		System.out.println("final route" + anslist);
		try {
			Employee e1 = new Employee(1, "remya", 2);
			Employee e2 = new Employee(1, "remya", 2);
			int i = 20 / 0;
			System.out.println(e1.equals(e2));

		} catch (ArithmeticException e) {
			System.out.println("ctch ArithmeticException hi");
			// throw new ArrayIndexOutOfBoundsException();
			// System.out.println("ctch ArithmeticException hi");
		} catch (ArrayIndexOutOfBoundsException e) {
			// throw new ArithmeticException();
			System.out.println("ctch ArrayIndexOutOfBoundsException hi");
		} catch (Exception e) {
			// throw new ArrayIndexOutOfBoundsException();
			// System.out.println("ctch hi");
		}

		System.out.println("hi");

		ArrayList<String> listt = new ArrayList<String>();// Creating arraylist
		listt.add("Mango");// Adding object in arraylist
		listt.add("mango");
		listt.add("Banana");
		listt.add("Grapes");
		// Printing the arraylist object
		System.out.println(listt);
  
		HashSet<Employee> s = new HashSet<>();
		
		s.add(new Employee(1,"remya",23));
		s.add(new Employee(1,"remya",23));
		
		s.forEach(d->{System.out.println(d.getAge()+d.getName()+d.getId());});
	}

}
