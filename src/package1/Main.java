package package1;

import package2.*; // * импортирует все классы из пакета

public class Main extends Parent{
    public static void main (String[] args) {
        ExampleInPackage1 e1 = new ExampleInPackage1 ();
//      System.out.println (e1.name1); //private
        System.out.println (e1.name2); //package
        System.out.println (e1.name3); //protected
        System.out.println (e1.name4); //public

        ExampleInPackage2 e2 = new ExampleInPackage2 ();
//      System.out.println (e2.name1); //private
//      System.out.println (e2.name2); //package
//      System.out.println (e2.name3); //protected
        System.out.println (e2.name4); //public

        Main p = new Main ();  //нужно создавать объект не родителя а наследника!!!!
//        System.out.println (p.name1); //private
//        System.out.println (p.name2); //package
        System.out.println (p.name3); //protected
        System.out.println (p.name4); //public
    }
}
