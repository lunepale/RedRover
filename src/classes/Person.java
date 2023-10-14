package classes;/* Необходимо создать класс classes.Person с полями: имя, возраст, пол. Класс должен иметь метод - getName,
  метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.*/

public class Person {
        public String name;
       public String gender;
       public int age;

        public static String getName(String name, String gender, int age){
        if (gender == "male"){
            return "Mr. "+name;}else{
            return "Mrs. "+name;
        }
        }





}