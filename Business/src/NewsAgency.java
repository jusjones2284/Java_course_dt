import business.Company;


class NewsAgency {
   Company company;
   String name;

   public void accessMethod(){
      Person person = new Person();
      person.firstName = "Justin";
      System.out.println(person.firstName);


   }

   public static void main(String[] args) {

      NewsAgency vibe = new NewsAgency();
      vibe.accessMethod();
   }

}
