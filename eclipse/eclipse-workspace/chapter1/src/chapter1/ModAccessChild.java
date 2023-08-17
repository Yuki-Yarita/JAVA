package chapter1;

public class ModAccessChild extends ModAccess {
	public void test() {
		System.out.println(this.pub_var);
		System.out.println(this.prot_var);
		System.out.println(this.pack_var);
//		System.out.println(this.pri_var);
	}

	public static void main(String[] args) {
		ModAccess mc = new ModAccessChild();
		mc.test();
	}

}
