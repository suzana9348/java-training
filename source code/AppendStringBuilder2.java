class AppendStringBuilder2 {

        public static void main (String args[]) {
            StringBuilder sb1 = new StringBuilder();
            sb1.append("Java");
            sb1.append(new Person2("Suzanne"));
            System.out.println(sb1);
         }
}
class Person2 {
   
        String name;
        Person2(String str) { name = str; } 
}