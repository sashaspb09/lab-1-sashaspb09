package ru.avalon.java.dev.j10.labs;
import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.commons.Address;


public class Main {
      /*
         * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
         */
    
    public static void main(String[] args) {
        
        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */
  
       Person ivanov = new Person();
       Passport ivanovPassport = new Passport("Иван", "Иванов", "","Nub");
       ivanov.setPassport(ivanovPassport);
       Address ivanovAddress = new Address("Nevskiy", "88", "24");
       ivanov.setAddress(ivanovAddress);
      
//--------------
     Person john = new Person();
     Passport johnPassport = new Passport("John", "Edward", "Smith");
     john.setPassport(johnPassport);
     Address johnAddress = new Address("Ligovskiy", "12", "24");
     john.setAddress(johnAddress);
     
     //---------------
    


 

      

      //Person ivanov = null;
      



        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */
  //****************
        String ivanovfullname = ivanov.getFullName();
        String ivanovaddress = ivanov.getAddress();
         String johnfullname = john.getFullName();
        String johnaddress = john.getAddress();
        
        
            
      
   
        //*****************

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
        System.out.println("person1: " + ivanovfullname);
        System.out.println("address1: " + ivanovaddress);
        System.out.println("person2: " + johnfullname);
        System.out.println("address2: " + johnaddress);
      

}
}
