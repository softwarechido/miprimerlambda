package miprimerlambda;
import com.amazonaws.services.lambda.runtime.Context;
import java.util.Map;

public final class MiPrimerLambda {
	public static String handleRequest(Map<String,String> event, Context context) {
		return event.toString();
	}
}
