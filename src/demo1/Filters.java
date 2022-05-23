package demo1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Filters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,10,20,25,30,35,1,2,3,4,5};
		List<Integer> l=Arrays.stream(a).boxed().collect(Collectors.toList());
		
		//l.stream().filter(s->s%2==0).forEach(s->System.out.println(s));
		
		l.stream().filter(s->s%2==0).forEach(System.out::print);
		
		System.out.println();
		l.stream().map(s->s*s).forEach(s->System.out.print(s+","));
		System.out.println();
		l.stream().limit(4).forEach(s->System.out.print(s+","));
		System.out.println();
		l.stream().distinct().forEach(s->System.out.print(s+","));
		System.out.println();
		long lo=l.stream().count();
		System.out.println(lo);
		System.out.println();
		
		Optional<Integer> min= l.stream().min((v1,v2)->{
			return v1.compareTo(v2);
					});
		System.out.println(min.get());
		
		System.out.println();
		Optional<Integer> max=l.stream().max((v1,v2)->{
			return v1.compareTo(v2);
		});
		
		System.out.println(max.get());
		
		
		
	}

}
