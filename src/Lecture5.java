public class Lecture5 {
  /*  public static void main (String[] args) {
        String s = "Перестановочный алгоритм быстрого действия";


       for( int i=0; i<s.length (); i++){
           if (s.charAt(i) =='о'){
               System.out.println('o');
           }

       }

    }*/

   /* public static void main (String[] args) {
        String s = "Перевыобры выбранного президента";
int count=0;
        for (int i=0; i<s.length (); i++){
            if(s.charAt(i) == 'е'){
                count++;

            }
        }System.out.println (count);
    }*/

    public static void main (String[] args) {
        String s = "Посмотрите как Рите нравится ритм";

        for (int i =0; i < s.length ()-3; i++){
            if (s.substring (i, i+3 ).equalsIgnoreCase ("рит")){
                System.out.println (i);
            }
        }
    }


}
