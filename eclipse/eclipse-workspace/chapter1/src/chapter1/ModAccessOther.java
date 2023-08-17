package chapter1;

public class ModAccessOther {
	public static void main(String[] args) {
		
		// ModAccessクラスのインスタンスを作成
		ModAccess my = new ModAccess();
		
		// public変数なのでアクセス可能
		System.out.println(my.pub_var);
		// protected以下のメンバーにはアクセス不可
        // System.out.println(my.prot_var);
        // System.out.println(my.pack_var);
        // System.out.println(my.pri_var);
	}
}
