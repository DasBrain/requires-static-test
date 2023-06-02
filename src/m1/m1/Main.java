package m1;

import java.util.Arrays;
import m2.M2Ann;

@M1Ann
@M2Ann
public class Main {
	public static void main(String[] args) throws Throwable {
        System.out.println(Arrays.toString(Main.class.getAnnotations()));
	}
}
