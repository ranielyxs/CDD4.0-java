package fundamentos;
import java.util.StringTokenizer;

public class String8 {
	public static void main(String[] args) {
		StringTokenizer exemplo = new StringTokenizer("O mundo não é mais o mesmo mas não iremos desistir nunca");
		System.out.println(exemplo.countTokens());
	}
}
