package LInkedList;

public class Main {
    public static void main(String[] args) {
//        LL list=new LL();
//        list.AddElementFirst(10);
//        list.AddElementFirst(20);
//        list.AddElementFirst(30);
//        list.AddLast(50);
//        list.AddLast(40);
//        list.display();
//        System.out.println(list.tail.value);
//        list.Insert(12,3);
//        list.display();
//        System.out.println(list.tail.value);
//        System.out.println(list.DeleteFirst());
//        list.display();
//        System.out.println(list.DeleteLast());
//
//        list.display();
//        System.out.println(list.Delete(3));
//        list.display();
//        System.out.println(list.size);
//
//        list.display();
//        System.out.println(list.FindNode(10));
//
//        System.out.println(list.tail.next);
//

        DLL list=new DLL();
        list.AddElementFirst(10);
        list.AddElementFirst(20);
        list.AddElementFirst(30);

        list.Display();
        list.AddLast(40);
        list.Display();

        list.Insert(5,3);
        list.Display();




//        list.AddLast(1);
//        list.Insert(12,3);
//
//        list.display();
////        System.out.println(list.tail.value);
////        System.out.println(list.DeleteLast());
//        list.display();


    }
}
