public class Lecture4 {
    public static void main(String[] args) {
        boolean itMoves = true;
        boolean shouldMove = false;

        if (itMoves == shouldMove) {
            System.out.println("no problem");
        } else if (itMoves) {
            System.out.println("use ducktape");
        } else {
            System.out.println("use WD40");
        }
//    ниже написан сложный вариант, выше написан вариант короче
//        if(itMoves){
//            if(shouldMove){
//                System.out.println("no problem");
//            }else {
//                System.out.println("use ducktape");
//            }
//        }else{
//            if(shouldMove){
//                System.out.println("use WD40");
//            }else {
//                System.out.println("no problem");
//            }
//        }
        }

    }

