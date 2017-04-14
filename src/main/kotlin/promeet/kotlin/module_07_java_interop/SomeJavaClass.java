package promeet.kotlin.module_07_java_interop;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SomeJavaClass {
	public String platformMethod() {
		return null;
	}
	
	@Nullable
	public String annotatedMethod(@NotNull String param1, @Nullable String param2) {
		return param2 != null ? param1 : null;
	}
}
