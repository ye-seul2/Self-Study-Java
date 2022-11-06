package sec01.exam07.pack2;
import sec01.exam07.pack1.A;

public class D extends A {
	public D() {
		// 접근 가능
		super();
		this.field = "value";
		this.method();
	}
}
