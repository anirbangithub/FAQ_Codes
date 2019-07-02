package puzzle_revisitd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;

import puzzle_revisitd.Person;
public class LambdaSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Person> persons = Arrays.asList(
		new Person("bablu","ghosh",23),
		new Person("vombol","ghosh",21),
		new Person("montu","hasda",29),
		new Person("hodol","mandi",32)
		);

HashMap<Integer, String> hm = new HashMap<>();
hm.put(1, "tenida");
hm.put(2, "kabla");
hm.put(3, "palaram");
hm.put(4, "habul");


hm.keySet().stream().forEachOrdered(k ->System.out.println(hm.get(k)));



ArrayList<String> arr = new ArrayList<>();

hm.values().stream().forEach(k-> arr.add(k));

System.out.println("arraylist"+arr);

/*Collections.sort(persons, ( p1,  p2)-> p1.getFirstName().compareTo(p2.getFirstName()));
//printAll(persons, p->true);
//printAll(persons, p-> p.getLastName().startsWith("g"));
persons.forEach(System.out ::println);


System.out.println("names ends with u");
persons.stream().filter(p-> p.getFirstName().endsWith("u")).forEach(System.out::println);;*/
}

/*public static void printAll(List<Person> persons,Predicate<Person> predicate) {
	
	for(Person p : persons) {
		if(predicate.test(p)) {
		System.out.println(p);
		}
	}
}*/
}