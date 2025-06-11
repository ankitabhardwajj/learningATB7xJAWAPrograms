package ex_11062025.ex_interface;

public class lab146 {
    public static void main(String[] args) {
        // i i = new i ();

    }
}

interface i{}
class a{}// cpmplete
class b{}
abstract class c{}// not complete
class test1 extends a{}
class test2 extends b{}
// class test3 extends a,b{} - multiple inheritance
class test0 implements i{ }
interface  i1{ }
interface i2{}
class test4 implements i1,i2{}// multiple inheritance with interface
class test5 extends a implements i1,i2{}// can not do reverse
// first has to be extends
interface i3 extends i2{}
// interface can extend another interface but not class